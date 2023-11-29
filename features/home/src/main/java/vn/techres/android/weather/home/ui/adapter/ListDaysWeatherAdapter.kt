package vn.techres.android.weather.home.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppAdapter
import vn.techres.android.weather.home.databinding.ItemFiveDayBinding
import vn.techres.android.weather.home.databinding.ItemWeatherDaysBinding
import vn.techres.android.weather.model.entity.modelWeatherDays.List
import vn.techres.android.weather.other.AppConfig
import vn.techres.android.weather.utils.AppUtils
import vn.techres.android.weather.utils.AppUtils.hide
import vn.techres.android.weather.utils.AppUtils.show
import vn.techres.android.weather.utils.PhotoShowUtils

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/24/2023.
 */
class ListDaysWeatherAdapter(context: Context):AppAdapter<List>(context) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding = ItemFiveDayBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }
    inner class ViewHolder(private val binding: ItemFiveDayBinding):AppViewHolder(binding.root){
        @SuppressLint("SetTextI18n")
        @RequiresApi(Build.VERSION_CODES.O)
        override fun onBindView(position: Int) {
            val item = getItem(position)
            val day = AppUtils.getDayDetails(item.dt,false)
            binding.tvDay.text= AppUtils.convertDateToCustomString(day)
            binding.tvSunRise.text = AppUtils.getDayDetailsHours(item.sunrise,true)
            binding.tvSunSet.text = AppUtils.getDayDetailsHours(item.sunset,true)
            binding.tvTemperatureDay.text= AppUtils.roundBigDecimal(item.temp.day.toBigDecimal()).toString()+getString(R.string.oC)
            binding.tvTemperatureNight.text= AppUtils.roundBigDecimal(item.temp.night.toBigDecimal()).toString()+getString(R.string.oC)
            if (item.snow!=-1.0){
                binding.llSnow.show()
                binding.tvSnow.text=item.snow.toString()+"m/m"
                binding.tvRain.text = AppUtils.convertRainPercent(item.pop)
                binding.imvRainAndSnow.setImageResource(R.drawable.ic_cloud_snow)
            }else{
                binding.llSnow.hide()
                binding.tvRain.text = AppUtils.convertRainPercent(item.pop)
                binding.imvRainAndSnow.setImageResource(R.drawable.ic_rain_forecast)
            }

            binding.tvWind.text = item.speed.toString()+"m/s"
            PhotoShowUtils.loadImage(item.weather[0].icon,binding.imvIconWeather)

        }

    }
}