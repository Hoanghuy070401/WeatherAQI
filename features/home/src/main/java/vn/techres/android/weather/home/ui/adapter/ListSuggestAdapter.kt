package vn.techres.android.weather.home.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import vn.techres.android.weather.app.AppAdapter
import vn.techres.android.weather.R
import vn.techres.android.weather.home.databinding.ItemSuggestBinding
import vn.techres.android.weather.home.model.interfaces.ItemSuggestClickView
import vn.techres.android.weather.model.titles
import vn.techres.android.weather.model.entity.AddressCity
import vn.techres.android.weather.utils.AppUtils.hide
import vn.techres.android.weather.utils.AppUtils.show

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/21/2023.
 */
class ListSuggestAdapter(context: Context) : AppAdapter<AddressCity>(context) {
    var imageClick: ItemSuggestClickView? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding = ItemSuggestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    inner class ViewHolder(private var binding: ItemSuggestBinding) : AppViewHolder(binding.root) {
        override fun onBindView(position: Int) {
            val data = getItem(position)
            if (position==0){
                binding.tvName.text = getString(R.string.location)
                binding.imvLocation.show()
            }else{
                binding.tvName.text = data.nameCity
                binding.imvLocation.hide()

            }

            binding.root.clickWithDebounce(100) {
                imageClick?.onClickItem(position)
            }
        }

    }
}