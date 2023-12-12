package vn.techres.android.weather.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.location.Address
import android.view.LayoutInflater
import android.view.ViewGroup
import com.google.android.libraries.places.api.model.AutocompletePrediction
import vn.techres.android.weather.app.AppAdapter
import vn.techres.android.weather.databinding.ItemCityBinding
import vn.techres.android.weather.model.entity.modelCity.Item
import vn.techres.android.weather.model.entity.modelCity.ItemSearch
import vn.techres.android.weather.model.entity.modelCity.ListCity
import vn.techres.android.weather.model.interfaces.ImageClick


/**
 * @author:Nguyễn Hoàng Huy
 * @date: 9/21/2023.
 */
class ListCityAdapter(context: Context):AppAdapter<ItemSearch>(context) {
     var imageClickListener: ImageClick?= null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding =ItemCityBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }
    inner class ViewHolder(private val binding: ItemCityBinding):AppViewHolder(binding.root){
        @SuppressLint("SetTextI18n")
        override fun onBindView(position: Int) {
            val item = getItem(position)
            if (item.address.city.isNotEmpty()){
                binding.tvName.text = item.address.city
            }else{
                if (item.address.county.isNotEmpty()){
                    binding.tvName.text = item.address.county
                }else{

                    binding.tvName.text = item.address.state
                }
            }

            binding.tvDetailInformation.text= item.address.label
            binding.root.clickWithDebounce(100){
                imageClickListener?.imageClick(position)
            }
        }
    }
}