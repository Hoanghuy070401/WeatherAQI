package vn.techres.android.weather.ui.fragment.map

import android.Manifest
import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ProgressBar
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
import com.google.android.libraries.places.api.model.AutocompletePrediction
import com.google.android.libraries.places.api.model.AutocompleteSessionToken
import com.google.android.libraries.places.api.model.LocationBias
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.api.model.RectangularBounds
import com.google.android.libraries.places.api.model.TypeFilter
import com.google.android.libraries.places.api.net.FetchPlaceRequest
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
import com.google.android.libraries.places.api.net.PlacesClient
import com.hjq.http.EasyHttp
import com.hjq.http.listener.HttpCallback
import timber.log.Timber
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppFragment
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.constants.AppConstants.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION
import vn.techres.android.weather.databinding.FragmentAirBinding
import vn.techres.android.weather.http.api.CurrentAirApi
import vn.techres.android.weather.http.api.GetDetailCityApi
import vn.techres.android.weather.http.api.GetListCityApi
import vn.techres.android.weather.model.entity.modelAirWeather.AirNow
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
import vn.techres.android.weather.utils.AppUtils.calculateAQI_China
import vn.techres.android.weather.utils.AppUtils.hide
import vn.techres.android.weather.utils.AppUtils.show


class AirMapsFragment : AppFragment<HomeActivity>(), OnMapReadyCallback, ImageClick {
    companion object {
        private val TAG = AirMapsFragment::class.java.simpleName
        private const val DEFAULT_ZOOM = 15
        private const val KEY_CAMERA_POSITION = "camera_position"
        private const val KEY_LOCATION = "location"
    }

    private lateinit var mMap: GoogleMap
    private lateinit var binding: FragmentAirBinding
    private lateinit var placesClient: PlacesClient
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    private var lastKnownLocation: Location? = null
    private val defaultLocation = LatLng(10.8307035, 106.6325555)
    private var listControlAir = ArrayList<String>()
    private var listStyleAir = ArrayList<String>()
    private var listCity = ArrayList<ItemSearch>()
    private var textSearch: String = String()
    private var tileType: String = String()
    private var date = 0L
    private var tileOver: TileOverlay? = null
    val markerList: MutableList<Marker> = mutableListOf()
    private lateinit var adapterCity: ListCityAdapter


    override fun getLayoutView(): View {
        binding = FragmentAirBinding.inflate(layoutInflater)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        Places.initialize(requireContext(), ApiApplicationRouters.keyApi)
        placesClient = Places.createClient(requireContext())

        fusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(requireContext())
        return binding.root

    }

    override fun initData() {
        binding.acSearchAIR.onActionViewCollapsed()
        AppConstants.WEATHER_DATA = false
        listControlAir = arrayListOf("AQI", "PM-2.5", "O3", "NO2", "SO2", "CO", "ASEAN_PM-10")
        binding.imvControlMap.clickWithDebounce(100) {
            binding.spnStyleMapAir.performClick()
        }
        binding.imvControlWeather.clickWithDebounce(100) {
            binding.spnModeAir.performClick()
        }
        binding.acSearchAIR.doOnQueryTextListener(500) {
            if (!isCloseSearchView) {
                if (it.isNotEmpty()) {
                    searchPlaces(binding.mProgressBar,binding.acSearchAIR.query.toString(),listCity,adapterCity)
                }
            }
        }
        getLocationPermission()
        controlSpinnerAQI()
        setFilterSearch()
        adapterCity = ListCityAdapter(requireContext())
        adapterCity.imageClickListener = this
        adapterCity.setData(listCity)
        AppUtils.initRecyclerViewVertical(binding.rvDataCity, adapterCity)


    }


    private fun controlSpinnerStyleMap() {
        listStyleAir = arrayListOf("Cổ điển ", "Vệ tinh", "Địa hình")
        val adapterCategoryStyle = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_item,
            listStyleAir
        )
        adapterCategoryStyle.setDropDownViewResource(android.R.layout.simple_list_item_activated_1)
        binding.spnStyleMapAir.adapter = adapterCategoryStyle
        binding.spnStyleMapAir.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
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

    private fun controlSpinnerAQI() {
        val adapterCategoryAir = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_item,
            listControlAir
        )
        adapterCategoryAir.setDropDownViewResource(android.R.layout.simple_list_item_activated_1)
        binding.spnModeAir.adapter = adapterCategoryAir
        binding.spnModeAir.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long,
            ) {

                when (position) {
                    0 -> {
                        tileType = "usepa-aqi"
                        setUpMap()
                        binding.llLegend.show()
                    }

                    1 -> {
                        tileType = "usepa-pm25"
                        setUpMap()
                        binding.llLegend.show()

                    }

                    2 -> {
                        tileType = "usepa-o3"
                        setUpMap()
                        binding.llLegend.show()
                    }

                    3 -> {
                        tileType = "usepa-no2"
                        setUpMap()
                        binding.llLegend.show()
                    }

                    4 -> {
                        tileType = "usepa-so2"
                        setUpMap()
                        binding.llLegend.show()
                    }

                    5 -> {
                        tileType = "usepa-co"
                        setUpMap()
                        binding.llLegend.show()
                    }

                    6 -> {
                        tileType = "asean-pm10"
                        setUpMap()
                        binding.llLegend.hide()
                    }

                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //
            }

        }
        setUpMap()

    }

    override fun onMapReady(p0: GoogleMap) {
        this.mMap = p0
        mMap.uiSettings.isZoomControlsEnabled = true
        AppConstants.WEATHER_DATA = false

        controlSpinnerAQI()
        controlSpinnerStyleMap()
        // Prompt the user for permission.
        getLocationPermission()

        // Turn on the My Location layer and the related control on the map.
        updateLocationUI()

        // Get the current location of the device and set the position of the map.
        getDeviceLocation()

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

                // If request is cancelled, the result arrays are empty.
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
                mMap.uiSettings.isMyLocationButtonEnabled = true
            } else {
                mMap.isMyLocationEnabled = false
                mMap.uiSettings.isMyLocationButtonEnabled = false
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
                    } else {
                        Timber.tag(TAG).d("Current location is null. Using defaults.")
                        Timber.tag(TAG).e(task.exception, "Exception: %s")
                        mMap.moveCamera(
                            CameraUpdateFactory
                                .newLatLngZoom(defaultLocation, DEFAULT_ZOOM.toFloat())
                        )
                        mMap.uiSettings.isMyLocationButtonEnabled = false
                    }
                }
            }
        } catch (e: SecurityException) {
            Timber.tag("Exception: %s").e(e)
        }
    }

    private fun setUpMap() {
        tileOver?.remove()
        AppConstants.WEATHER_DATA = false
        tileOver =
            mMap.addTileOverlay(TileOverlayOptions().tileProvider(createTransparentTileProvider()))
    }

    private fun createTransparentTileProvider(): TileProvider {
        return TransparentTileOWM(tileType, date)
    }

    private fun setFilterSearch() {

        binding.acSearchAIR.setOnQueryTextFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                if (binding.acSearchAIR.query.toString().isEmpty()) {
                    binding.acSearchAIR.onActionViewCollapsed()
                    binding.rvDataCity.hide()
                }
            } else {
                if (binding.acSearchAIR.query.toString().isNotEmpty()) {
                    checkEmpty()
                } else {
                    binding.rvDataCity.hide()
                }
            }
        }
        binding.acSearchAIR.setOnSearchClickListener {
            // SearchView expanded
            isCloseSearchView = false
            binding.acSearchAIR.setQuery(textSearch, true)
        }

        binding.acSearchAIR.setOnCloseListener {
            // SearchView collapsed
            isCloseSearchView = true
            textSearch = binding.acSearchAIR.query.toString()
            binding.rvDataCity.hide()
            false
        }
    }

    private var isCloseSearchView = false
    private fun checkEmpty() {
        if (listCity.isEmpty()) {
            binding.rvDataCity.hide()
        } else {
            binding.rvDataCity.show()
        }
    }

    override fun onResume() {
        super.onResume()
        AppConstants.WEATHER_DATA = false
    }

    override fun imageClick(position: Int) {
        searchDetailPlaces(listCity[position].id)
    }

    private fun getDataAir(name: String, latLng: LatLng) {
        EasyHttp.get(this).api(CurrentAirApi.param(latLng.latitude, latLng.longitude))
            .request(object : HttpCallback<AirNow>(this) {
                override fun onSucceed(result: AirNow) {
                    val data = result.list[0].components
                    val addMap = mMap.addMarker(
                        MarkerOptions().position(latLng).title(name).snippet(
                            calculateAQI_China(
                                data.co,
                                data.no2,
                                data.o3,
                                data.so2,
                                data.pm25,
                                data.pm10
                            ).toString()
                        )
                    )
                    addMap?.showInfoWindow()
                    markerList.add(addMap!!)
                }
            })
    }
    @SuppressLint("NotifyDataSetChanged")
    private fun searchPlaces(process: ProgressBar, query:String, listCity:ArrayList<ItemSearch>, adapter: ListCityAdapter) {
        process.show()
        EasyHttp.get(this).api(GetListCityApi.params(query.trim())).request(object :HttpCallback<ListCity>(this){
            override fun onSucceed(result: ListCity) {
                process.hide()
                listCity.clear()
                if (result.item.isNotEmpty()){
                    listCity.addAll(result.item)
                    adapter.notifyDataSetChanged()
                }else{
                    toast(getString(R.string.no_search_invalid_address))
                }
                checkEmpty()
            }
        })
    }

    private fun searchDetailPlaces(id: String) {
        EasyHttp.get(this).api(GetDetailCityApi.params(id)).request(object :HttpCallback<Item>(this){
            override fun onSucceed(result: Item) {
                val latLng = AppUtils.coordinatesToLatLng(result.position.lat,result.position.lng)
                val namePlace = result.address.label
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 12f))
                getDataAir(namePlace, latLng)
                binding.rvDataCity.hide()
                binding.acSearchAIR.setQuery("", false)
                binding.mProgressBar.hide()
            }
        })
    }


}