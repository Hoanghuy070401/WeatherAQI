package vn.techres.android.weather.home.ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.util.Log
import android.view.View
import com.hjq.http.EasyHttp
import com.hjq.http.listener.HttpCallback
import org.greenrobot.eventbus.EventBus
import timber.log.Timber
import vn.techres.android.weather.app.AppActivity
import vn.techres.android.weather.R
import vn.techres.android.weather.cache.ListAddressCache
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.home.databinding.ActivityListAddressBinding
import vn.techres.android.weather.model.entity.modelAirWeather.AirNow
import vn.techres.android.weather.model.entity.modelAirWeather.ListAirWeather
import vn.techres.android.weather.model.entity.modelAirWeather.WeatherNow
import vn.techres.android.weather.home.model.interfaces.ItemClickView
import vn.techres.android.weather.home.ui.adapter.ListMyLocationAdapter
import vn.techres.android.weather.model.titles
import vn.techres.android.weather.http.api.CurrentAirApi
import vn.techres.android.weather.http.api.CurrentWeatherApi
import vn.techres.android.weather.model.entity.AddressCity
import vn.techres.android.weather.model.eventbus.UpLoadDataEvenBus
import vn.techres.android.weather.utils.AppUtils

class ListAddressActivity : AppActivity(), ItemClickView {
    private lateinit var binding: ActivityListAddressBinding
    private lateinit var adapterLocation: ListMyLocationAdapter
    private var listAirWeather = ArrayList<ListAirWeather>()
    override fun getLayoutView(): View {
        binding = ActivityListAddressBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {

        binding.llSearch.clickWithDebounce(500) {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }
        adapterLocation = ListMyLocationAdapter(this)
        adapterLocation.setData(listAirWeather)
        adapterLocation.itemClickListener = this
        AppUtils.initRecyclerViewVertical(binding.rcvListLocation, adapterLocation)

    }

    override fun initData() {
        setUpData()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setUpData() {
        if (titles.isNotEmpty()) {
            titles.forEach { item ->
                if (item.nameCity != AppConstants.FIST_LOCATION && !listAirWeather.any { it.id == item.id }) {
                    getData(item)
                }
            }
        } else {
            Log.d("failsListData", "listLocation :${titles.size}")
        }
    }

    private fun getData(item: AddressCity) {
        EasyHttp.get(this).api(CurrentWeatherApi.param(item.lat, item.lon, AppUtils.returnUnits(2)))
            .request(object : HttpCallback<WeatherNow>(this) {
                override fun onSucceed(result: WeatherNow) {
                    if (result.cod == 200) {
                        val weather = result
                        EasyHttp.get(this@ListAddressActivity)
                            .api(CurrentAirApi.param(item.lat, item.lon))
                            .request(object : HttpCallback<AirNow>(this@ListAddressActivity) {
                                @SuppressLint("NotifyDataSetChanged")
                                override fun onSucceed(result: AirNow) {
                                    val air = result
                                    val combinedModel = ListAirWeather(item.id, air, weather)
                                    listAirWeather.add(combinedModel)
                                    listAirWeather.sortBy { it.id }
                                    adapterLocation.notifyDataSetChanged()
                                }
                            })
                    } else {
                        toast(getString(R.string.no_connect1))
                    }
                }
            })
    }


    @SuppressLint("NotifyDataSetChanged")
    override fun onClickButtonRemove(position: Int) {
        val itemsToRemove =
            ArrayList<AddressCity>() // Danh sách tạm thời chứa các phần tử cần xóa
        for (item in titles) {
            if (listAirWeather[position].id == item.id) {
                itemsToRemove.add(item) // Thêm các phần tử cần xóa vào danh sách tạm thời
            }
        }
        titles.removeAll(itemsToRemove) // Xóa các phần tử trong danh sách tạm thời khỏi danh sách titles
        listAirWeather.removeAt(position)
        adapterLocation.notifyDataSetChanged()
    }

    override fun onClickItem(position: Int) {
        EventBus.getDefault().postSticky(UpLoadDataEvenBus(listAirWeather[position].id))
        finish()
    }


    private var countOnResume=0

    override fun onResume() {
        super.onResume()
        if (countOnResume>0){
            setUpData()
        }
        countOnResume++
        ListAddressCache.saveAllLocations(titles)
        Timber.tag("list0001").e("${titles.size}")
        Timber.tag("list0003").e("${ListAddressCache.getAllLocations().size}")
    }

}