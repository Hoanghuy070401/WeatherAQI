package vn.techres.android.weather.home.ui.fragment

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import com.hjq.http.EasyHttp
import com.hjq.http.listener.HttpCallback
import org.greenrobot.eventbus.Subscribe
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppFragment
import vn.techres.android.weather.home.databinding.FragmentWeatherBinding
import vn.techres.android.weather.home.databinding.LayoutDataAirBinding
import vn.techres.android.weather.home.ui.adapter.DynamicViewPagerAdapter
import vn.techres.android.weather.home.ui.adapter.DynamicViewPagerAirAdapter
import vn.techres.android.weather.http.api.CurrentAirApi
import vn.techres.android.weather.http.api.CurrentWeatherApi
import vn.techres.android.weather.model.entity.AddressCity
import vn.techres.android.weather.model.entity.modelAirWeather.AirNow
import vn.techres.android.weather.model.entity.modelAirWeather.WeatherNow
import vn.techres.android.weather.model.eventbus.CheckReloadWeatherEventBus
import vn.techres.android.weather.model.eventbus.UpdateDataEventBus
import vn.techres.android.weather.model.titles
import vn.techres.android.weather.ui.activity.HomeActivity
import vn.techres.android.weather.utils.AppUtils

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/22/2023.
 */
class AirDetailFragment : AppFragment<HomeActivity>() {
    private var fragmentViewPagerAdapter: DynamicViewPagerAirAdapter? = null
    private var titleToDisplay = titles[0]

    companion object {
        fun getInstance(titleId: Int): AirDetailFragment {
            val thisDynamicFragment = AirDetailFragment()
            val titleToDisplay = titles[titleId]
            Log.e("title1", "${titleToDisplay} .... $titleId")
            thisDynamicFragment.titleToDisplay = titleToDisplay
            return thisDynamicFragment
        }
    }

    private lateinit var binding: LayoutDataAirBinding
    override fun getLayoutView(): View {
        binding = LayoutDataAirBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initData() {
        fragmentViewPagerAdapter = AirFragment.activityViewPagerAdapter
        if (titleToDisplay.lat == 0.0 && titleToDisplay.lon == 0.0) {
            binding.tvAQI.text = getString(R.string.zero)
            binding.tvCityName.text = titleToDisplay.nameCity
        } else {
            setData(titleToDisplay)
        }

    }

    private fun setData(data: AddressCity) {
        getDataAir(data.lat, data.lon)
        getDataWeather(data.nameCity,data.lat, data.lon, AppUtils.returnUnits(2))
    }

    private fun getDataAir(lat: Double, lon: Double) {
        EasyHttp.get(this).api(CurrentAirApi.param(lat, lon))
            .request(object : HttpCallback<AirNow>(this) {
                override fun onSucceed(result: AirNow) {
                    val it = result.list[0].components
                    binding.tvAQI.text =
                        AppUtils.calculateAQI_China(it.co, it.no2, it.o3, it.so2, it.pm25, it.pm10)
                            .toString()

                }
            })
    }

    private fun getDataWeather(name:String,lat: Double, lon: Double, units: String) {
        EasyHttp.get(this).api(CurrentWeatherApi.param(lat, lon, units))
            .request(object : HttpCallback<WeatherNow>(this) {
                @SuppressLint("SetTextI18n")
                override fun onSucceed(result: WeatherNow) {
                    if (result.cod == 200) {
                        binding.tvTemperature.text =
                            AppUtils.roundBigDecimal(result.main.temp.toBigDecimal()).toString()
                        binding.tvCityName.text = name
                        AppUtils.checkWeather(
                            result.weather[0].id,
                            binding.rlBgStyle,
                            binding.weatherView,
                            requireActivity()
                        )
                    } else {
                        toast(getString(R.string.no_connect1))
                    }
                }
            })
    }

    @Subscribe(sticky = true)
    fun updateDataFistLocation(isUpdate: CheckReloadWeatherEventBus) {
        if ( titleToDisplay.id == 0L ){
            setData(isUpdate.isLocation)
        }else{
            ///
        }
    }
}