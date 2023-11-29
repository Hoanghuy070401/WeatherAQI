package vn.techres.android.weather.home.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.daimajia.swipe.SwipeLayout
import vn.techres.android.weather.app.AppAdapter
import vn.techres.android.weather.R
import vn.techres.android.weather.home.databinding.ItemLocationBinding
import vn.techres.android.weather.model.entity.modelAirWeather.ListAirWeather
import vn.techres.android.weather.home.model.interfaces.ItemClickView
import vn.techres.android.weather.model.titles
import vn.techres.android.weather.utils.AppUtils
import vn.techres.android.weather.utils.AppUtils.hide
import vn.techres.android.weather.utils.AppUtils.show

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
class ListMyLocationAdapter(context:Context):AppAdapter<ListAirWeather>(context) {
    var itemClickListenerRemove:ItemClickView?=null
    var itemClickListener:ItemClickView?=null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding = ItemLocationBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }
    inner class ViewHolder(private val binding: ItemLocationBinding):AppViewHolder(binding.root){
        @SuppressLint("SetTextI18n")
        override fun onBindView(position: Int) {
            val data = getItem(position)
            binding.swParent.showMode = SwipeLayout.ShowMode.PullOut
            val it = data.listAir.list[0].components
            if (data.id== titles[0].id){
                binding.imvMyLocation.show()
                binding.llDelete.hide()
            }else{
                binding.imvMyLocation.hide()
                binding.llDelete.show()
            }
            binding.swParent.addDrag(SwipeLayout.DragEdge.Right, binding.llDelete)
            AppUtils.checkWeatherItem(data.listWeather.weather[0].id,binding.rlBgItem,getContext())
            val item = titles.find { it.id == data.id }
            if (item != null) {
                binding.tvNameLocation.text = item.nameCity
            }
            binding.tvAQI.text= AppUtils.calculateAQI_China( it.co,it.no2,it.o3, it.so2,it.pm25,it.pm10).toString()
            binding.tvTemperatureDark.text =
                AppUtils.roundBigDecimal(data.listWeather.main.tempMin.toBigDecimal()).toString()+getString(
                    R.string.oC)
            binding.tvTemperatureLight.text = AppUtils.roundBigDecimal(data.listWeather.main.tempMax.toBigDecimal()).toString()+getString(
                R.string.oC)
            binding.tvTemperatureLocation.text = AppUtils.roundBigDecimal(data.listWeather.main.temp.toBigDecimal()).toString()+getString(
                R.string.oC)
            binding.tvFeelLike.text = AppUtils.roundBigDecimal(data.listWeather.main.feelsLike.toBigDecimal()).toString()+getString(
                R.string.oC)
            binding.llDelete.clickWithDebounce(500){
                itemClickListenerRemove?.onClickButtonRemove(position)
            }
            binding.root.clickWithDebounce(500){
                itemClickListener?.onClickItem(position)
            }
        }
    }
}