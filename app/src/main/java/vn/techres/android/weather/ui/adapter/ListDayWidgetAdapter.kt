package vn.techres.android.weather.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppAdapter
import vn.techres.android.weather.databinding.ItemListWidgetBinding
import vn.techres.android.weather.model.entity.modelWeatherDays.List
import vn.techres.android.weather.model.entity.modelWeatherDays.WeatherDays
import vn.techres.android.weather.utils.AppUtils
import vn.techres.android.weather.utils.PhotoShowUtils

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 12/12/2023.
 */
class ListDayWidgetAdapter(context:Context):AppAdapter<List>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding = ItemListWidgetBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }
    inner class ViewHolder(private var binding: ItemListWidgetBinding):AppViewHolder(binding.root){
        @SuppressLint("SetTextI18n")
        override fun onBindView(position: Int) {
            val data = getItem(position)
            binding.tvDate.text = AppUtils.getDayDetails(data.dt)
            binding.tvDeceptionTemperature.text=AppUtils.roundBigDecimal(data.temp.day.toBigDecimal()).toString()+getString(
                R.string.oC)+" / "+AppUtils.roundBigDecimal(data.temp.night.toBigDecimal())+getString(
                R.string.oC)
            PhotoShowUtils.loadImage(data.weather[0].icon,binding.imvIcon)
        }

    }

}