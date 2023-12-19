package vn.techres.android.weather.home.ui.adapter

import android.annotation.SuppressLint
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import timber.log.Timber
import vn.techres.android.weather.model.MY_LOG
import vn.techres.android.weather.home.ui.fragment.WeatherDetailFragment
import vn.techres.android.weather.model.titles
import vn.techres.android.weather.model.titlesOrdinals
import vn.techres.android.weather.model.entity.AddressCity

class DynamicViewPagerAdapter(fragmentActivity: FragmentManager,lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentActivity,lifecycle) {
    //    private val theActivity = DynamicViewPagerActivity()
//    val pageIds = titles.map { it.hashCode().toLong() }.toMutableList()
    override fun createFragment(position: Int): Fragment {
        // Đã sử dụng tính năng này để thay đổi văn bản bên trong mỗi đoạn
        return WeatherDetailFragment.getInstance(position)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun getItemId(position: Int): Long {
        Timber.tag("log").i("${titlesOrdinals[titles[position].nameCity]}")
        return position.toLong()
    }

    // được gọi khi một tab bị xóa
    override fun containsItem(itemId: Long): Boolean {
        val index = itemId.toInt()
        if (index >= 0 && index < titles.size) {
            var thisTitle = "No Title"
            titlesOrdinals.forEach { (k, v) ->
                if (v == index) {
                    thisTitle = k
                }
            }
            return titles[index].nameCity == thisTitle
        }
        return false
    }

    fun addTab(ordinal: Int, data: AddressCity) {
        titles.add(data)
        // không viết lại thứ tự
        if (!titlesOrdinals.containsKey(data.nameCity)) {
            titlesOrdinals[data.nameCity] = ordinal
        }
        notifyItemInserted(ordinal)
        Log.d("${MY_LOG}created", "\t\t\t $titles")
        Log.d("${MY_LOG}created", "\t\t\t $titlesOrdinals")
    }

    @SuppressLint("NotifyDataSetChanged")
    fun removeTab(name: String) {
        val iterator = titles.iterator()
        while (iterator.hasNext()) {
            val item = iterator.next()
            if (item.nameCity == name) {
                iterator.remove()
                titlesOrdinals.remove(name) // Cập nhật titlesOrdinals
            }
        }
        notifyDataSetChanged()
        Timber.tag(MY_LOG + "removeTab").d("----------------")
    }





    @SuppressLint("NotifyDataSetChanged")
    fun removeTab(index: Int) {
        titles.removeAt(index)
        notifyDataSetChanged()
    }
    @SuppressLint("NotifyDataSetChanged")
    fun updateTab(index: Int, data: AddressCity) {
        val oldName = titles[index].nameCity
        titles[index] = data

        if (oldName != data.nameCity) {
            titlesOrdinals.remove(oldName)
            titlesOrdinals[data.nameCity] = index
        }

        notifyItemChanged(index)
    }

}
