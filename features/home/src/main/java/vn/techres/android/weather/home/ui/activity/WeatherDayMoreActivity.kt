package vn.techres.android.weather.home.ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.view.View
import androidx.core.content.ContentProviderCompat.requireContext
import com.github.sundeepk.compactcalendarview.CompactCalendarView
import com.github.sundeepk.compactcalendarview.CompactCalendarView.CompactCalendarAnimationListener
import com.hjq.http.EasyHttp
import com.hjq.http.listener.HttpCallback
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppActivity
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.home.databinding.ActivityWeatherDayMoreBinding
import vn.techres.android.weather.home.ui.adapter.ListDaysSevenAdapter
import vn.techres.android.weather.home.ui.adapter.ListDaysWeatherAdapter
import vn.techres.android.weather.http.api.GetWeatherDays30Api
import vn.techres.android.weather.http.api.GetWeatherDaysApi
import vn.techres.android.weather.model.entity.modelWeatherDays.List
import vn.techres.android.weather.model.entity.modelWeatherDays.WeatherDays
import vn.techres.android.weather.utils.AppUtils
import java.util.Calendar
import java.util.Date

class WeatherDayMoreActivity : AppActivity() {
    private lateinit var  binding :ActivityWeatherDayMoreBinding
    private lateinit var adapterListFindLocation: ListDaysWeatherAdapter
    private var listDaysWeather = ArrayList<List>()
    override fun getLayoutView(): View {
        binding = ActivityWeatherDayMoreBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        ///
        adapterListFindLocation = ListDaysWeatherAdapter(this)
        adapterListFindLocation.setData(listDaysWeather)
        adapterListFindLocation.checkApi=false
        AppUtils.initRecyclerViewHorizontal(
            binding.rcvListWeatherFiveDay,
            adapterListFindLocation
        )
    }

    override fun initData() {
        //
        val lat = intent.getDoubleExtra(AppConstants.DETAILS_LOCATION_FIND_LAT,0.0)
        val lon = intent.getDoubleExtra(AppConstants.DETAILS_LOCATION_FIND_LON,0.0)
        val name = intent.getStringExtra(AppConstants.DETAILS_LOCATION_FIND_NAME)
        if (name!!.isNotBlank()){
            binding.tvCityName.text=name
        }
        getDaysWeather(lat,lon,30,AppUtils.returnUnits(2))
    }
    private fun getDaysWeather(lat: Double, lon: Double, cnt: Int, units: String) {
        EasyHttp.get(this).api(GetWeatherDays30Api.param(lat, lon, cnt, units))
            .request(object : HttpCallback<WeatherDays>(this) {
                @SuppressLint("NotifyDataSetChanged", "SetTextI18n")
                override fun onSucceed(result: WeatherDays) {
                    listDaysWeather.clear()
                    if (result.code == 200) {
                        listDaysWeather.addAll(result.list)
                        adapterListFindLocation.notifyDataSetChanged()
                    } else {
                        toast(getString(R.string.load_fail))
                    }
                }
            })

    }

}