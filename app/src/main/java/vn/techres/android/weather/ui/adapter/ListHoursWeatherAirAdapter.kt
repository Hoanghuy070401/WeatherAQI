package vn.techres.android.weather.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppAdapter
import vn.techres.android.weather.databinding.ItemForecastHoursBinding
import vn.techres.android.weather.model.entity.modelAirWeather.ListAirWeatherHours
import vn.techres.android.weather.utils.AppUtils
import vn.techres.android.weather.utils.PhotoShowUtils

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 12/8/2023.
 */
class ListHoursWeatherAirAdapter(context:Context):AppAdapter<ListAirWeatherHours>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding = ItemForecastHoursBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }
    inner class ViewHolder(private var binding: ItemForecastHoursBinding):AppViewHolder(binding.root){
        @SuppressLint("SetTextI18n")
        override fun onBindView(position: Int) {
            val data= getItem(position)
            binding.tvTemperature.text= AppUtils.roundBigDecimal(data.listWeather.main.temp.toBigDecimal()).toString()+getString(
                R.string.oC)
            val it = data.listAir.components
            binding.tvAQI.text = AppUtils.calculateAQI_China(it.co,it.no2,it.o3,it.so2,it.pm25,it.pm10).toString()
            binding.tvHours.text = AppUtils.getDayDetailsHours(data.listWeather.dt,true)
            binding.tvDate.text = AppUtils.getDayDetailsHours(data.listWeather.dt,false)
            binding.tvRain.text = AppUtils.convertRainPercent(data.listWeather.pop)
            PhotoShowUtils.loadImage(data.listWeather.weather[0].icon,binding.imvIcon)
            AppUtils.checkWeatherItem(data.listWeather.weather[0].id,binding.llItemWeatherHours,getContext())
        }

    }
}