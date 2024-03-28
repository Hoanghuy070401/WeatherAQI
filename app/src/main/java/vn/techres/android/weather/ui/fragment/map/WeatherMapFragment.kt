package vn.techres.android.weather.ui.fragment.map


import DialogInfromationWeatherAQI
import android.Manifest
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.content.res.Resources
import android.location.Geocoder
import android.location.Location
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.net.PlacesClient
import com.google.android.material.slider.Slider
import com.hjq.http.EasyHttp
import com.hjq.http.listener.HttpCallback
import timber.log.Timber
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppFragment
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.constants.AppConstants.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION
import vn.techres.android.weather.databinding.FragmentWeatherMapBinding
import vn.techres.android.weather.http.api.GetDetailCityApi
import vn.techres.android.weather.http.api.GetListCityApi
import vn.techres.android.weather.model.entity.modelCity.Item
import vn.techres.android.weather.model.entity.modelCity.ItemSearch
import vn.techres.android.weather.model.entity.modelCity.ListCity
import vn.techres.android.weather.model.interfaces.ImageClick
import vn.techres.android.weather.other.doOnQueryTextListener
import vn.techres.android.weather.router.ApiApplicationRouters
import vn.techres.android.weather.ui.activity.HomeActivity
import vn.techres.android.weather.ui.adapter.ListCityAdapter
import vn.techres.android.weather.ui.fragment.map.tileProvider.TransparentTileOWM
import vn.techres.android.weather.utils.AppUtils
import vn.techres.android.weather.utils.AppUtils.hide
import vn.techres.android.weather.utils.AppUtils.show
import java.util.Locale


class WeatherMapFragment : AppFragment<HomeActivity>(), OnMapReadyCallback, ImageClick {
    companion object {
        private val TAG = AirMapsFragment::class.java.simpleName
        private const val DEFAULT_ZOOM = 15
        private const val KEY_CAMERA_POSITION = "camera_position"
        private const val KEY_LOCATION = "location"
    }

    private val handler = Handler(Looper.getMainLooper())
    private lateinit var runnable: Runnable
    private lateinit var mMap: GoogleMap
    private lateinit var binding: FragmentWeatherMapBinding
    private lateinit var placesClient: PlacesClient
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    private var lastKnownLocation: Location? = null
    private val defaultLocation = LatLng(10.8307035, 106.6325555)
    private var listControl = ArrayList<String>()
    private var listStyle = ArrayList<String>()
    private var tileType: String = String()
    private var listCity = ArrayList<ItemSearch>()
    var date = 0L
    private var tileOverOld: TileOverlay? = null
    private lateinit var adapterCity: ListCityAdapter
    private var isHidden = true
    val markerList: MutableList<Marker> = mutableListOf()
    private var textSearch: String = String()
    var play = true
    var process = 10800 // 3h/


    override fun getLayoutView(): View {
        binding = FragmentWeatherMapBinding.inflate(layoutInflater)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        Places.initialize(requireContext(), ApiApplicationRouters.keyApi)
        placesClient = Places.createClient(requireContext())


        fusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(requireContext())
        return binding.root
    }


    private fun zoomCamera(latLng: LatLng) {
        val topPadding = Resources.getSystem().displayMetrics.heightPixels / 4
        mMap.setPadding(0, 0, 0, topPadding)
        val newLatLng = CameraUpdateFactory.newLatLngZoom(latLng, 12f)
        mMap.animateCamera(newLatLng)
    }


    @SuppressLint("NotifyDataSetChanged")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun initData() {
        binding.acSearch.onActionViewCollapsed()
        binding.llDate.hide()
        binding.tvStartDate.text = AppUtils.dateNow()
        binding.tvEndDate.text = AppUtils.getCurrentDate(10)
        AppConstants.WEATHER_DATA = true
        binding.llMyLocation.setOnClickListener {
            getDeviceLocation()
        }
        binding.imvControlMap.clickWithDebounce(100) {
            binding.spnStyleMap.performClick()
        }
        binding.imvControlWeather.clickWithDebounce(100) {
            binding.spnMode.performClick()
        }
        binding.acSearch.doOnQueryTextListener(500) {
            if (!isCloseSearchView) {
                if (it.isNotEmpty()) {
                    searchPlaces(binding.acSearch.query.toString(), listCity, adapterCity)
                }
            }
        }
        binding.llControlFutureWeather.clickWithDebounce(100) {
            isHidden = if (isHidden) {
                binding.llDate.show()
//                binding.rvDataCity.hide()
                false
            } else {
                binding.llDate.hide()
                true
            }

        }
        binding.llRemoveMarker.clickWithDebounce(500) {
            if (markerList.isNotEmpty()) {
                markerList.clear()
                mMap.clear()
            } else {
                toast(getString(R.string.marker_location))
            }
        }
        getLocationPermission()
        val valueTo = AppUtils.getDateFormat(
            binding.tvEndDate.text.toString(),
            false
        ) / 1000 - AppUtils.getDateFormat(binding.tvStartDate.text.toString(), false) / 1000
        binding.sbDate.valueFrom = 0.toFloat()
        binding.sbDate.valueTo = valueTo.toFloat()

        binding.sbDate.stepSize = process.toFloat()
        binding.tvNowDate.text = AppUtils.layThoiGianHienTai()
        listControl = arrayListOf(
            "Lượng mưa đối lưu",
            "Cường độ mưa",
            "Lượng mưa tích lũy",
            "Lượng mưa tích lũy - tuyết",
            "Độ sâu của tuyết",
            "Tốc độ gió ở độ cao 10 mét",
            "Tốc độ và hướng gió theo U và V",
            "Áp suất khí quyển ",
            "Nhiệt độ không khí ở độ cao 2m",
            "Nhiệt độ điểm sương",
            "Nhiệt độ đất 0-10 сm",
            "Nhiệt độ đất >10 сm",
            "Độ ẩm tương đối",
            "Độ che phủ của mây",
            "SOS"
        )

        binding.sbDate.addOnChangeListener(Slider.OnChangeListener { _, value, _ ->
            binding.tvNowDate.text = AppUtils.getDayDetails(
                AppUtils.getDateFormat(
                    binding.tvStartDate.text.toString(),
                    false
                ) / 1000 + value.toLong(), true
            )
        })
        binding.sbDate.addOnSliderTouchListener(object : Slider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: Slider) {
                //
            }

            override fun onStopTrackingTouch(slider: Slider) {
                binding.tvNowDate.text = AppUtils.getDayDetails(
                    AppUtils.getDateFormat(
                        binding.tvStartDate.text.toString(),
                        false
                    ) / 1000 + binding.sbDate.value.toLong(), true
                )
                AppConstants.DATE = true
                date = AppUtils.getDateFormat(binding.tvNowDate.text.toString(), true)
                updateTileOverLay()
            }

        })
        binding.imvBtnPausePlay.setOnClickListener {
            play = if (play) {
                binding.imvBtnPausePlay.setImageResource(R.drawable.ic_pause)
                startTimer()
                false
            } else {
                binding.imvBtnPausePlay.setImageResource(R.drawable.ic_play)
                handler.removeCallbacks(runnable)
                true
            }
        }


        setFilterSearch()
        binding.imvBtnNext.clickWithDebounce(500) {
            nextProgress()
        }

        binding.imvBtnPrevent.clickWithDebounce(500) {
            preventProgress()
        }

        adapterCity = ListCityAdapter(requireContext())
        adapterCity.imageClickListener = this
        adapterCity.setData(listCity)
        AppUtils.initRecyclerViewVertical(binding.rvDataCity, adapterCity)


    }


    private fun setFilterSearch() {

        binding.acSearch.setOnQueryTextFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                if (binding.acSearch.query.toString().isEmpty()) {
                    binding.acSearch.onActionViewCollapsed()
                    binding.rvDataCity.hide()
                }
            } else {
                if (binding.acSearch.query.toString().isNotEmpty()) {
                    checkEmpty()
                } else {
                    binding.rvDataCity.hide()
                }
            }
        }
        binding.acSearch.setOnSearchClickListener {
            // SearchView expanded
            isCloseSearchView = false
            binding.acSearch.setQuery(textSearch, true)
        }

        binding.acSearch.setOnCloseListener {
            // SearchView collapsed
            isCloseSearchView = true
            textSearch = binding.acSearch.query.toString()
            binding.rvDataCity.hide()
            false
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun searchPlaces(
        query: String,
        listCity: ArrayList<ItemSearch>,
        adapter: ListCityAdapter,
    ) {
//        process.show()
        EasyHttp.get(this).api(GetListCityApi.params(query.trim()))
            .request(object : HttpCallback<ListCity>(this) {
                override fun onSucceed(result: ListCity) {
//                process.hide()
                    listCity.clear()
                    if (result.item.isNotEmpty()) {
                        listCity.addAll(result.item)
                        adapter.notifyDataSetChanged()
                    } else {
                        toast(getString(R.string.no_search_invalid_address))
                    }
                    checkEmpty()
                }
            })
    }

    private fun searchDetailPlaces(id: String) {
        EasyHttp.get(this).api(GetDetailCityApi.params(id))
            .request(object : HttpCallback<Item>(this) {
                override fun onSucceed(result: Item) {
                    val latLng =
                        AppUtils.coordinatesToLatLng(result.position.lat, result.position.lng)
                    val namePlace = result.address.label
                    zoomCamera(latLng)
                    openDialog(result.position.lat, result.position.lng)
                    val addMap = mMap.addMarker(
                        MarkerOptions().position(latLng).title(namePlace)
                    )
                    addMap?.showInfoWindow()
                    markerList.add(addMap!!)
                    binding.rvDataCity.hide()
                    binding.acSearch.setQuery("", false)
                }
            })
    }

    private fun startTimer() {
        runnable = object : Runnable {
            override fun run() {
                nextProgress()
                handler.postDelayed(this, 6000) // Update every second
            }
        }
        handler.post(runnable)

    }

    private fun preventProgress() {
        val progress = binding.sbDate.value
        if (progress - process < binding.sbDate.valueFrom) {
            binding.sbDate.value = 0.toFloat()
        } else {
            binding.sbDate.value = progress - process
        }
        binding.tvNowDate.text = AppUtils.getDayDetails(
            AppUtils.getDateFormat(
                binding.tvStartDate.text.toString(),
                false
            ) + binding.sbDate.value.toLong(), true
        )
        AppConstants.DATE = true
        date = AppUtils.getDateFormat(binding.tvNowDate.text.toString(), true)
        updateTileOverLay()

    }

    private fun nextProgress() {
        val progress = binding.sbDate.value
        var nextProcess = 0L
        if (progress + process > binding.sbDate.valueTo) {
            binding.sbDate.value = 0.toFloat()
        } else {
            binding.sbDate.value = progress + process
            nextProcess = binding.sbDate.value.toLong()
        }
        val nowDate =
            AppUtils.getDateFormat(binding.tvStartDate.text.toString(), false) / 1000 + nextProcess
        binding.tvNowDate.text = AppUtils.getDayDetails(nowDate, true)

        Timber.tag("NowDate").i(binding.tvNowDate.text.toString())
        AppConstants.DATE = true
        date = AppUtils.getDateFormat(binding.tvNowDate.text.toString(), true)
        Timber.tag("NowDate").i(date.toString())
        updateTileOverLay()
    }

    private fun controlSpinnerStyleMap() {
        listStyle = arrayListOf("Cổ điển", "Vệ tinh", "Địa hình")
        val adapterCategoryStyle = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_item,
            listStyle
        )
        adapterCategoryStyle.setDropDownViewResource(android.R.layout.simple_list_item_activated_1)
        binding.spnStyleMap.adapter = adapterCategoryStyle
        binding.spnStyleMap.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long,
            ) {
                when (position) {
                    0 -> mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
                    1 -> mMap.mapType = GoogleMap.MAP_TYPE_HYBRID
                    2 -> mMap.mapType = GoogleMap.MAP_TYPE_TERRAIN
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //
            }

        }
    }

    private fun controlSpinnerWeather() {

        val adapterCategoryWeather = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_item,
            listControl
        )
        adapterCategoryWeather.setDropDownViewResource(android.R.layout.simple_list_item_activated_1)
        binding.spnMode.adapter = adapterCategoryWeather
        binding.spnMode.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long,
            ) {
                AppConstants.DATE = false
                when (position) {
                    0 -> {
                        AppConstants.SOS = false
                        tileType = "PAC0"
                        setUpMap()
                        binding.imvNote.setImageResource(R.drawable.cloud)
                    }

                    1 -> {
                        AppConstants.SOS = false
                        tileType = "PR0"
                        setUpMap()
                        binding.imvNote.setImageResource(R.drawable.templete)
                    }

                    2 -> {
                        AppConstants.SOS = false
                        tileType = "PA0"
                        setUpMap()
//                        binding.imvNote.setImageResource(R.drawable.rain)
                    }

                    3 -> {
                        AppConstants.SOS = false
                        tileType = "PAS0"
                        setUpMap()
                        binding.imvNote.setImageResource(R.drawable.pressure)
                    }

                    4 -> {
                        AppConstants.SOS = false
                        tileType = "SD0"
                        setUpMap()
                        binding.imvNote.setImageResource(R.drawable.pressure)
                    }

                    5 -> {
                        AppConstants.SOS = false
                        tileType = "WS10"
                        setUpMap()
                        binding.imvNote.setImageResource(R.drawable.pressure)
                    }

                    6 -> {
                        AppConstants.SOS = false
                        tileType = "WND"
                        setUpMap()
                        binding.imvNote.setImageResource(R.drawable.pressure)
                    }

                    7 -> {
                        AppConstants.SOS = false
                        tileType = "APM"
                        setUpMap()
                        binding.imvNote.setImageResource(R.drawable.pressure)
                    }

                    8 -> {
                        AppConstants.SOS = false
                        tileType = "TA2"
                        setUpMap()
                        binding.imvNote.setImageResource(R.drawable.pressure)
                    }

                    9 -> {
                        AppConstants.SOS = false
                        tileType = "TD2"
                        setUpMap()
                        binding.imvNote.setImageResource(R.drawable.pressure)
                    }

                    10 -> {
                        AppConstants.SOS = false
                        tileType = "TS0"
                        setUpMap()
                        binding.llDate.hide()
                        binding.imvNote.setImageResource(R.drawable.pressure)
                    }

                    11 -> {
                        AppConstants.SOS = false
                        tileType = "TS10"
                        setUpMap()
                        binding.llDate.hide()
                        binding.imvNote.setImageResource(R.drawable.pressure)
                    }

                    12 -> {
                        AppConstants.SOS = false
                        tileType = "HRD0"
                        setUpMap()
                        binding.imvNote.setImageResource(R.drawable.pressure)
                    }

                    13 -> {
                        AppConstants.SOS = false
                        tileType = "CL"
                        setUpMap()
                        binding.imvNote.setImageResource(R.drawable.pressure)
                    }

                    14 -> {
                        AppConstants.SOS = true
                        setUpMap()
                    }

                }

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //
            }

        }
    }

    override fun onMapReady(p0: GoogleMap) {
        this.mMap = p0
        AppConstants.WEATHER_DATA = true
        mMap.uiSettings.isZoomControlsEnabled = false
        mMap.uiSettings.isMyLocationButtonEnabled = false
        mMap.setOnMarkerClickListener { marker ->
            // Xử lý sự kiện click cho marker tại đây
            openDialog(
                marker.position.latitude,
                marker.position.longitude
            )

            // Trả về true để cho biết sự kiện click đã được xử lý
            true
        }
        mMap.setOnMapClickListener { p0 ->
            for (marker in markerList) {
                marker.remove()
            }
            zoomCamera(p0)
            val addMap = mMap.addMarker(
                MarkerOptions().position(p0)
            )
            addMap?.showInfoWindow()
            openDialog(p0.latitude, p0.longitude)
            markerList.add(addMap!!)
        }


        // Prompt the user for permission.
        controlSpinnerStyleMap()
        controlSpinnerWeather()
        getLocationPermission()

        // Turn on the My Location layer and the related control on the map.
        updateLocationUI()

        // Get the current location of the device and set the position of the map.
        getDeviceLocation()


    }

    private fun openDialog(lat: Double, long: Double) {
        val geocoder = Geocoder(requireContext(), Locale.getDefault())
        val addresses = geocoder.getFromLocation(lat, long, 1)!!
        val cityName = addresses.firstOrNull()!!.subAdminArea
        val dialog = DialogInfromationWeatherAQI.Builder(
            requireContext(),
            this@WeatherMapFragment,
            cityName,
            lat,
            long
        )
        dialog.onActionDone(object : DialogInfromationWeatherAQI.Builder.OnActionDone {
            override fun onActionDone() {
                postDelayed({
                    dialog.dismiss()
                }, 1000)

            }
        })
        dialog.show()

    }


    @Deprecated("Deprecated in Java")
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray,
    ) {
        AppConstants.LOCATION_PERMISSION_GRANTED = false
        when (requestCode) {
            PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION -> {
                if (grantResults.isNotEmpty() &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED
                ) {
                    AppConstants.LOCATION_PERMISSION_GRANTED = true
                }
            }

            else -> super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        }
        updateLocationUI()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        mMap.let { map ->
            outState.putParcelable(KEY_CAMERA_POSITION, map.cameraPosition)
            outState.putParcelable(KEY_LOCATION, lastKnownLocation)
        }
        super.onSaveInstanceState(outState)
    }

    @SuppressLint("MissingPermission")
    private fun updateLocationUI() {
        try {
            if (AppConstants.LOCATION_PERMISSION_GRANTED) {
                mMap.isMyLocationEnabled = true
            } else {
                mMap.isMyLocationEnabled = false
                lastKnownLocation = null
                getLocationPermission()
            }
            setUpMap()
        } catch (e: SecurityException) {
            Timber.tag("Exception: %s").e(e)
        }

    }

    private fun getLocationPermission() {
        if (ContextCompat.checkSelfPermission(
                this.requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION
            )
            == PackageManager.PERMISSION_GRANTED
        ) {
            AppConstants.LOCATION_PERMISSION_GRANTED = true
            getDeviceLocation()
        } else {
            ActivityCompat.requestPermissions(
                this.requireActivity(), arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION
            )

        }
    }

    @SuppressLint("TimberArgCount")
    private fun getDeviceLocation() {
        try {
            if (AppConstants.LOCATION_PERMISSION_GRANTED) {
                val locationResult = fusedLocationProviderClient.lastLocation
                locationResult.addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        lastKnownLocation = task.result
                        if (lastKnownLocation != null) {
                            mMap.moveCamera(
                                CameraUpdateFactory.newLatLngZoom(
                                    LatLng(
                                        lastKnownLocation!!.latitude,
                                        lastKnownLocation!!.longitude
                                    ), DEFAULT_ZOOM.toFloat()
                                )
                            )
                        }
                        updateLocationUI()
                    } else {
                        Timber.tag(TAG).d("Current location is null. Using defaults.")
                        Timber.tag(TAG).e(task.exception, "Exception: %s")
                        mMap.moveCamera(
                            CameraUpdateFactory
                                .newLatLngZoom(defaultLocation, DEFAULT_ZOOM.toFloat())
                        )
                    }
                }
            }
        } catch (e: SecurityException) {
            Timber.tag("Exception: %s").e(e)
        }
    }


    private fun setUpMap() {
        AppConstants.WEATHER_DATA = true
        mMap.clear()
        tileOverOld =
            mMap.addTileOverlay(TileOverlayOptions().tileProvider(createTransparentTileProvider()))
    }

    @SuppressLint("SuspiciousIndentation")
    private fun updateTileOverLay() {
        val tileOverNew =
            mMap.addTileOverlay(TileOverlayOptions().tileProvider(createTransparentTileProvider()))
        postDelayed({
            tileOverOld?.transparency = 0f
            tileOverOld?.remove()
            tileOverOld = tileOverNew // Gán lớp mới làm lớp cũ
        }, 4000)
    }

    private fun createTransparentTileProvider(): TileProvider {
        return TransparentTileOWM(tileType, date)
    }

    override fun onResume() {
        super.onResume()
        AppConstants.WEATHER_DATA = true
    }

    override fun imageClick(position: Int) {
        searchDetailPlaces(listCity[position].id)
    }


    private var isCloseSearchView = false
    private fun checkEmpty() {
        if (listCity.isEmpty()) {
            binding.rvDataCity.hide()
        } else {
            binding.rvDataCity.show()
        }
    }


}