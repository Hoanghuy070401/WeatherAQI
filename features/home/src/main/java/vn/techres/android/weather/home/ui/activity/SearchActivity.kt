package vn.techres.android.weather.home.ui.activity

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.net.PlacesClient
import com.google.gson.Gson
import com.hjq.http.EasyHttp
import com.hjq.http.listener.HttpCallback
import org.greenrobot.eventbus.EventBus
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppActivity
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.home.databinding.ActivitySearchBinding
import vn.techres.android.weather.home.model.interfaces.ItemSuggestClickView
import vn.techres.android.weather.home.ui.adapter.ListDaysWeatherAdapter
import vn.techres.android.weather.home.ui.adapter.ListSuggestAdapter
import vn.techres.android.weather.http.api.GetDetailCityApi
import vn.techres.android.weather.http.api.GetListCityApi
import vn.techres.android.weather.http.api.GetWeatherDaysApi
import vn.techres.android.weather.model.entity.AddressCity
import vn.techres.android.weather.model.entity.modelCity.Item
import vn.techres.android.weather.model.entity.modelCity.ItemSearch
import vn.techres.android.weather.model.entity.modelCity.ListCity
import vn.techres.android.weather.model.entity.modelWeatherDays.List
import vn.techres.android.weather.model.entity.modelWeatherDays.WeatherDays
import vn.techres.android.weather.model.eventbus.AddListSuggestEvenBus
import vn.techres.android.weather.model.interfaces.ImageClick
import vn.techres.android.weather.model.titles
import vn.techres.android.weather.other.doAfterTextChanged
import vn.techres.android.weather.other.doOnQueryTextListener
import vn.techres.android.weather.router.ApiApplicationRouters
import vn.techres.android.weather.ui.activity.HomeActivity
import vn.techres.android.weather.ui.adapter.ListCityAdapter
import vn.techres.android.weather.utils.AppUtils

class SearchActivity : AppActivity(), ItemSuggestClickView, ImageClick {
    private lateinit var binding: ActivitySearchBinding
    private lateinit var adapterListSuggest: ListSuggestAdapter
    private lateinit var adapterListLocation: ListCityAdapter
    private lateinit var adapterListFindLocation: ListDaysWeatherAdapter
    private lateinit var placesClient: PlacesClient
    private var listCity = ArrayList<ItemSearch>()
    private var listSuggest = ArrayList<AddressCity>()
    private var listLocationFind = Item()
    private var listDaysWeather = ArrayList<List>()
    private var searchText = false
    private var textSearch = ""
    var locationAddressName = ""
    var locationAddressLat = 0.0
    var locationAddressLon = 0.0
    override fun getLayoutView(): View {
        binding = ActivitySearchBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        setRecycleView()
        binding.acSearch.requestFocus()
        binding.acSearch.setOnQueryTextFocusChangeListener { _, forcus ->
            searchText = !forcus
        }
    }

    override fun initData() {
        setData()
    }

    private fun setRecycleView() {
        adapterListLocation = ListCityAdapter(this)
        adapterListLocation.imageClickListener = this
        adapterListLocation.setData(listCity)
        AppUtils.initRecyclerViewVertical(binding.rcvListLocation, adapterListLocation)

        adapterListSuggest = ListSuggestAdapter(this)
        adapterListSuggest.imageClick = this
        adapterListSuggest.setData(listSuggest)
        AppUtils.initRecyclerViewVerticalWithFlexBoxLayout(binding.rcvSuggest, adapterListSuggest)

        adapterListFindLocation = ListDaysWeatherAdapter(this)
        adapterListFindLocation.setData(listDaysWeather)
        AppUtils.initRecyclerViewHorizontal(
            binding.ilLayoutFind.rcvListFiveDays,
            adapterListFindLocation
        )

    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setData() {
        Places.initialize(this, ApiApplicationRouters.keyApi)
        placesClient = Places.createClient(this)
        binding.acSearch.doAfterTextChanged(500) {
            if (!searchText){
                if (it.isNotEmpty()) {
                    binding.rcvSuggest.hide()
                    binding.rcvListLocation.show()
                    if (it!=textSearch){
                        binding.pgbSearch.show()
                        searchPlaces(it, listCity, adapterListLocation)
                    }

                } else {
                    binding.rcvSuggest.show()
                    binding.rcvListLocation.hide()
                    binding.ilLayoutFind.root.hide()
                }
            }

        }

        binding.ilLayoutFind.tvAdd.clickWithDebounce(500) {
            val namePlace = when {
                listLocationFind.address.county.isNotEmpty() -> listLocationFind.address.county
                listLocationFind.address.city.isNotEmpty() -> listLocationFind.address.city
                listLocationFind.address.state.isNotEmpty() -> listLocationFind.address.state
                else -> listLocationFind.address.label
            }
            val idCity = titles.size.toLong()
            val city = AddressCity(
                idCity,
                namePlace,
                listLocationFind.position.lng,
                listLocationFind.position.lat
            )
            val intent = Intent(this, HomeActivity::class.java)//xử lý đóng activity gốc
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
            EventBus.getDefault().postSticky(AddListSuggestEvenBus(true,city))
        }
        binding.tvCancel.clickWithDebounce(100) {
            finish()
        }
        binding.ilLayoutFind.llAdd.clickWithDebounce(500) {
            val namePlace = when {
                listLocationFind.address.county.isNotEmpty() -> listLocationFind.address.county
                listLocationFind.address.city.isNotEmpty() -> listLocationFind.address.city
                listLocationFind.address.state.isNotEmpty() -> listLocationFind.address.state
                else -> listLocationFind.address.label
            }
            val idCity = titles.size.toLong()
            val city = AddressCity(
                idCity,
                namePlace,
                listLocationFind.position.lng,
                listLocationFind.position.lat
            )
            val isExist = titles.any { it.nameCity == city.nameCity }
            if (isExist) {
                binding.ilLayoutFind.tvAdd.show()
                binding.ilLayoutFind.llAdd.hide()
            } else {
                binding.ilLayoutFind.llAdd.hide()
                binding.ilLayoutFind.tvAdd.show()
                titles.add(city)
                val intent = Intent(this, HomeActivity::class.java)//xử lý đóng activity phụ
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                startActivity(intent)
                EventBus.getDefault().postSticky(AddListSuggestEvenBus(true,city))
            }
        }
        binding.ilLayoutFind.btnDetails.clickWithDebounce (500){
            val intent = Intent(this, DetailsWeatherAirActivity::class.java)//xử lý đóng activity gốc
            intent.putExtra(AppConstants.DETAILS_LOCATION_FIND_NAME, locationAddressName)
            intent.putExtra(AppConstants.DETAILS_LOCATION_FIND_LAT, locationAddressLat)
            intent.putExtra(AppConstants.DETAILS_LOCATION_FIND_LON, locationAddressLon)
            startActivity(intent)

        }
        listSuggest.addAll(titles)
        adapterListSuggest.notifyDataSetChanged()

    }


    private fun checkEmpty() {
        if (listCity.isNotEmpty()) {
            binding.rcvListLocation.show()
            binding.noData.hide()
        } else {
            binding.noData.show()
            binding.rcvListLocation.hide()
        }
    }

    private fun getDaysWeather(lat: Double, lon: Double, cnt: Int, units: String) {
        EasyHttp.get(this).api(GetWeatherDaysApi.param(lat, lon, cnt, units))
            .request(object : HttpCallback<WeatherDays>(this) {
                @SuppressLint("NotifyDataSetChanged")
                override fun onSucceed(result: WeatherDays) {
                    listDaysWeather.clear()
                    if (result.cod == 200) {
                        listDaysWeather.addAll(result.list)
                        adapterListFindLocation.notifyDataSetChanged()
                        binding.ilLayoutFind.root.show()
                    } else {
                        toast(getString(R.string.load_fail))
                    }
                }
            })

    }

    @SuppressLint("NotifyDataSetChanged")
    private fun searchPlaces(
        query: String,
        listCity: ArrayList<ItemSearch>,
        adapter: ListCityAdapter,
    ) {
//        process.show()
        binding.ilLayoutFind.root.hide()
        EasyHttp.get(this).api(GetListCityApi.params(query.trim())).request(object :
            HttpCallback<ListCity>(this) {
            override fun onSucceed(result: ListCity) {
//                process.hide()
                textSearch=query
                listCity.clear()
                if (result.item.isNotEmpty()) {
                    listCity.addAll(result.item)
                    binding.pgbSearch.hide()
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
                    val namePlace = when {
                        result.address.county.isNotEmpty() -> result.address.county
                        result.address.city.isNotEmpty() -> result.address.city
                        result.address.state.isNotEmpty() -> result.address.state
                        else -> result.address.label
                    }
                    binding.rcvListLocation.hide()
                    getDaysWeather(
                        result.position.lat,
                        result.position.lng,
                        16,
                        AppUtils.returnUnits(2)
                    )
                    listLocationFind = result
                    binding.ilLayoutFind.tvCityName.text = namePlace
                    binding.ilLayoutFind.tvDetailCity.text = result.address.label
                    binding.acSearch.setQuery(namePlace,false)
                    locationAddressName =namePlace
                    locationAddressLat =result.position.lat
                    locationAddressLon =result.position.lng
                    val isExist = titles.any { it.nameCity == namePlace }
                    if (isExist) {
                        binding.ilLayoutFind.tvAdd.show()
                        binding.ilLayoutFind.llAdd.hide()
                    } else {
                        binding.ilLayoutFind.tvAdd.hide()
                        binding.ilLayoutFind.llAdd.show()
                    }
                    binding.pgbSearch.hide()
                }
            })
    }

    override fun onClickItem(position: Int) {//list de xuat
        val intent = Intent(this, HomeActivity::class.java)//xử lý đóng activity gốc
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
        EventBus.getDefault().postSticky(AddListSuggestEvenBus(true,listSuggest[position]))
    }

    override fun imageClick(position: Int) {//list city
        binding.acSearch.clearFocus()
        searchDetailPlaces(listCity[position].id)
        binding.pgbSearch.show()
        listCity.clear()
    }

}