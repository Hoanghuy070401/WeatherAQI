package vn.techres.android.weather.home.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.luck.picture.lib.adapter.PictureAlbumAdapter.ViewHolder
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppAdapter
import vn.techres.android.weather.home.databinding.ItemWeatherSevenDayBinding
import vn.techres.android.weather.model.entity.modelWeatherDays.List
import vn.techres.android.weather.utils.AppUtils
import vn.techres.android.weather.utils.PhotoShowUtils

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 12/8/2023.
 */
class ListDaysSevenAdapter(context: Context):AppAdapter<List>(context) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding = ItemWeatherSevenDayBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }
    inner class ViewHolder(private var binding: ItemWeatherSevenDayBinding):AppViewHolder(binding.root){
        @SuppressLint("SetTextI18n")
        @RequiresApi(Build.VERSION_CODES.O)
        override fun onBindView(position: Int) {
            val item = getItem(position)
            val day = AppUtils.getDayDetails(item.dt,false)
            binding.tvDay.text= AppUtils.convertDateToCustomString(day)
            binding.tvTemperatureDay.text= AppUtils.roundBigDecimal(item.temp.day.toBigDecimal()).toString()+getString(
                R.string.oC)
            binding.tvTemperatureNight.text= AppUtils.roundBigDecimal(item.temp.night.toBigDecimal()).toString()+getString(
                R.string.oC)
            binding.tvDeceptionWeather.text= item.weather[0].description
            PhotoShowUtils.loadImage(item.weather[0].icon,binding.imvIconWeather)
            AppUtils.checkWeatherItem(item.weather[0].id,binding.llBgStyleItem,getContext())

        }

    }
}