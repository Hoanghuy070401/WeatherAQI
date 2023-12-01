package vn.techres.android.weather.home.ui.fragment

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.View
import com.hjq.http.EasyHttp
import com.hjq.http.listener.HttpCallback
import org.greenrobot.eventbus.Subscribe
import timber.log.Timber
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppFragment
import vn.techres.android.weather.home.databinding.LayoutDataWeatherBinding
import vn.techres.android.weather.home.ui.adapter.DynamicViewPagerAdapter
import vn.techres.android.weather.home.ui.fragment.WeatherFragment.Companion.activityViewPagerAdapter
import vn.techres.android.weather.http.api.CurrentWeatherApi
import vn.techres.android.weather.model.MY_LOG
import vn.techres.android.weather.model.entity.AddressCity
import vn.techres.android.weather.model.entity.modelAirWeather.WeatherNow
import vn.techres.android.weather.model.eventbus.UpdateDataEventBus
import vn.techres.android.weather.model.titles
import vn.techres.android.weather.model.titlesOrdinals
import vn.techres.android.weather.ui.activity.HomeActivity
import vn.techres.android.weather.utils.AppUtils

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/6/2023.
 */
class WeatherDetailFragment : AppFragment<HomeActivity>() {
    private var fragmentViewPagerAdapter: DynamicViewPagerAdapter? = null
    private var titleToDisplay = titles[0]

    companion object {
        fun getInstance(titleId: Int): WeatherDetailFragment {
            val thisDynamicFragment = WeatherDetailFragment()
            val titleToDisplay = titles[titleId]
            Timber.tag("title1").e(titles[titleId].nameCity)
            thisDynamicFragment.titleToDisplay = titleToDisplay
            return thisDynamicFragment
        }
    }

    private lateinit var binding: LayoutDataWeatherBinding
    override fun getLayoutView(): View {
        binding = LayoutDataWeatherBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun initData() {

        fragmentViewPagerAdapter = activityViewPagerAdapter
        if (titleToDisplay.lat==0.0 && titleToDisplay.lon==0.0){
            binding.tvTemperature.text =getString(R.string.zero)+getString(R.string.oC)
            binding.tvTemperatureName.text = titleToDisplay.nameCity
        }else{
            setData(titleToDisplay)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.tag(MY_LOG + "destroyed").d("\t" + "\t" + "\t" + " " + titles)
        Timber.tag(MY_LOG + "destroyed").d("\t" + "\t" + "\t" + " " + titlesOrdinals)
    }

    private fun setData(nameAddress: AddressCity) {
        Log.e("title2", "${nameAddress}")
        getDataWeather(nameAddress.nameCity,nameAddress.lat, nameAddress.lon, AppUtils.returnUnits(2))
    }
    private fun getDataWeather(name:String,lat: Double, lon: Double, units: String) {
        EasyHttp.get(this).api(CurrentWeatherApi.param(lat, lon, units))
            .request(object : HttpCallback<WeatherNow>(this) {
                @SuppressLint("SetTextI18n")
                override fun onSucceed(result: WeatherNow) {
                    if (result.cod == 200) {
                        checkIfFragmentAttached{
                            binding.tvTemperature.text =
                                AppUtils.roundBigDecimal(result.main.temp.toBigDecimal()).toString()+getString(R.string.oC)
                            binding.tvTemperatureName.text = name
                            AppUtils.checkWeather(result.weather[0].id,binding.rlBgStyle,binding.weatherView,this)
                        }

                    } else {
                        toast(getString(R.string.no_connect1))
                    }
                }
            })
    }

    @Subscribe(sticky = true)
    fun updateDataFistLocation(isUpdate: UpdateDataEventBus) {
        if (isUpdate.isUpdate) {
            if (titleToDisplay.id==0L){
                setData(isUpdate.data)
            }else{
                //
            }

        }
    }


    fun checkIfFragmentAttached(operation: Context.() -> Unit) {
        if (isAdded && context != null) {
            operation(requireContext())
        }
    }


}