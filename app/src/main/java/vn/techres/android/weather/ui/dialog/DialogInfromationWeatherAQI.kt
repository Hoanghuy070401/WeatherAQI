import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.view.Gravity
import android.view.LayoutInflater
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.lifecycle.LifecycleOwner
import com.bumptech.glide.manager.Lifecycle
import com.github.tianma8023.model.Time
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.hjq.http.EasyHttp
import com.hjq.http.listener.HttpCallback
import com.hjq.http.listener.OnHttpListener
import com.luck.picture.lib.utils.ToastUtils
import timber.log.Timber
import vn.techres.android.weather.R
import vn.techres.android.weather.databinding.DialogNotificationBinding
import vn.techres.android.weather.databinding.InformationDialogBinding
import vn.techres.android.weather.http.api.CurrentAirApi
import vn.techres.android.weather.http.api.CurrentWeatherApi
import vn.techres.android.weather.http.api.GetListAirHours
import vn.techres.android.weather.http.api.GetListWeatherHours
import vn.techres.android.weather.http.model.HttpData
import vn.techres.android.weather.model.entity.modelAirWeather.AirNow
import vn.techres.android.weather.model.entity.modelAirWeather.ListAir
import vn.techres.android.weather.model.entity.modelAirWeather.ListAirWeatherHours
import vn.techres.android.weather.model.entity.modelAirWeather.WeatherNow
import vn.techres.android.weather.model.entity.modelWeatherDays.List
import vn.techres.android.weather.model.entity.modelWeatherDays.WeatherDays
import vn.techres.android.weather.ui.adapter.ListHoursWeatherAirAdapter
import vn.techres.android.weather.utils.AppUtils
import vn.techres.android.weather.utils.PhotoShowUtils
import vn.techres.base.BaseDialog
import vn.techres.base.action.AnimAction
import java.lang.Exception

class DialogInfromationWeatherAQI {
    @SuppressLint("SuspiciousIndentation")
    class Builder constructor(
        context: Context,
        val lifecycle: LifecycleOwner,
        name: String, lat: Double, lon: Double,
    ) :
        BaseDialog.Builder<Builder>(context), OnHttpListener<WeatherNow> {

        private var binding: InformationDialogBinding =
            InformationDialogBinding.inflate(LayoutInflater.from(context))
        private var onActionDone: OnActionDone? = null
        private var listHoursWeather = ArrayList<List>()
        private var listHoursAir = ArrayList<ListAir>()
        private var listHoursAirWeather = ArrayList<ListAirWeatherHours>()
        private var adapterWeatherAirHours: ListHoursWeatherAirAdapter

        fun onActionDone(onActionDone: OnActionDone): Builder = apply {
            this.onActionDone = onActionDone
        }

        init {
            setAnimStyle(AnimAction.ANIM_SCALE)
            setGravity(Gravity.BOTTOM)
            setContentView(binding.root)
            setWidth(Resources.getSystem().displayMetrics.widthPixels)
            getDataWeather(name, lat, lon, AppUtils.returnUnits(2))
            getAirDataHours(lat, lon)
            getDataAir(lat,lon)

            adapterWeatherAirHours =
                ListHoursWeatherAirAdapter(getContext())
            adapterWeatherAirHours.setData(listHoursAirWeather)
            AppUtils.initRecyclerViewHorizontal(
                binding.rcvListHourse,
                adapterWeatherAirHours
            )
            onActionDone?.onActionDone()
        }

        interface OnActionDone {
            fun onActionDone()
        }

        private fun getDataWeather(name: String, lat: Double, lon: Double, units: String) {
            EasyHttp.get(lifecycle).api(CurrentWeatherApi.param(lat, lon, units))
                .request(object : HttpCallback<WeatherNow>(this) {
                    @SuppressLint("SetTextI18n")
                    override fun onSucceed(result: WeatherNow) {
                        if (result.cod == 200) {
                            binding.tvTemperatureDayNow.text =
                                AppUtils.roundBigDecimal(result.main.temp.toBigDecimal())
                                    .toString()
                            binding.tvUnitTemperatureDayNow.text = getString(R.string.oC)
                            if (name ==""){
                                binding.tvNameLocation.text = result.name
                            }else{
                                binding.tvNameLocation.text = name
                            }
                            AppUtils.checkWeatherItem(
                                result.weather[0].id,
                                binding.rlBgStyle,
                                getContext()
                            )

                            binding.tvDeceptionWeather.text = result.weather[0].description
                            binding.tvTemperatureDay.text =
                                AppUtils.roundBigDecimal(result.main.tempMax.toBigDecimal())
                                    .toString()
                            binding.tvUnitTemperatureDay.text = getString(R.string.oC)
                            binding.tvTemperatureNight.text =
                                AppUtils.roundBigDecimal(result.main.tempMin.toBigDecimal())
                                    .toString()
                            binding.tvUnitTemperatureNight.text = getString(R.string.oC)
                        } else {
                            ToastUtils.showToast(getContext(), getString(R.string.no_connect1))
                        }
                    }
                })
        }

        private fun getAirDataHours(lat: Double, lon: Double) {
            EasyHttp.get(lifecycle).api(GetListAirHours.param(lat, lon))
                .request(object : HttpCallback<AirNow>(this) {
                    override fun onSucceed(result: AirNow) {
                        val resultAir = result.list
                        EasyHttp.get(lifecycle)
                            .api(GetListWeatherHours.params(lat, lon, AppUtils.returnUnits(2)))
                            .request(object : HttpCallback<WeatherDays>(this) {
                                @SuppressLint("NotifyDataSetChanged")
                                override fun onSucceed(result: WeatherDays) {
                                    listHoursWeather.clear()
                                    listHoursAir.clear()
                                    listHoursAirWeather.clear()
                                    if (result.cod == 200) {
                                        listHoursWeather.addAll(result.list)
                                        listHoursAir.addAll(resultAir)
                                        Timber.tag("listSize11").d(
                                            "${listHoursWeather.size},${listHoursAir.size}"
                                        ) // Giả sử cả hai danh sách có cùng kích thước và bạn muốn kết hợp chúng theo chỉ mục
                                        if (listHoursAir.size > 0 && listHoursWeather.size > 0) {
                                            for (i in 0 until 25) {
                                                val weather =
                                                    listHoursWeather[i] // Nhận dữ liệu thời tiết tại chỉ mục i
                                                val air =
                                                    listHoursAir[i] // Nhận dữ liệu không khí tại chỉ số i
                                                // Tạo một đối tượng mới kết hợp dữ liệu thời tiết và không khí
                                                val airWeather = ListAirWeatherHours(
                                                    i.toLong(),
                                                    air,
                                                    weather
                                                ) // Thêm đối tượng kết hợp vào danh sách mới
                                                listHoursAirWeather.add(airWeather)
                                            }
                                            val numMapQuarter = HashMap<Int, String>()
                                            listHoursAirWeather.mapIndexed { i, data ->
                                                numMapQuarter[i] =
                                                    AppUtils.getDayDetailsHours(
                                                        data.listWeather.dt,
                                                        true
                                                    )
                                            }

                                            adapterWeatherAirHours.notifyDataSetChanged()
                                        }
                                    } else {
                                        ToastUtils.showToast(
                                            getContext(),
                                            getString(R.string.fail_data)
                                        )
                                    }

                                }
                            })
                    }
                })
        }

        private fun getDataAir(lat: Double,lon: Double) {
            EasyHttp.get(lifecycle).api(CurrentAirApi.param(lat,lon))
                .request(object : HttpCallback<AirNow>(this) {
                    override fun onSucceed(result: AirNow) {
                        val data = result.list[0].components
                        binding.tvAQI.text =
                            AppUtils.calculateAQI_China(
                                data.co,
                                data.no2,
                                data.o3,
                                data.so2,
                                data.pm25,
                                data.pm10
                            ).toString()
                        AppUtils.checkImageAQi(binding.imvAQI, result.list[0].main.AQI)
                    }
                })
        }

        override fun onSucceed(result: WeatherNow?) {
            return
        }

        override fun onFail(e: Exception?) {
            return
        }

    }
}
