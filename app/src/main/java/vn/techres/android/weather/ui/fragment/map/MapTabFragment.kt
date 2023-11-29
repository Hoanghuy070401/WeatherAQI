package vn.techres.android.weather.ui.fragment.map

import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppFragment
import vn.techres.android.weather.databinding.FragmentMapTabBinding
import vn.techres.android.weather.ui.activity.HomeActivity
import vn.techres.base.PagerAdapter


class MapTabFragment : AppFragment<HomeActivity>() {
    private lateinit var binding:FragmentMapTabBinding
    private val currentPage = 0
    override fun getLayoutView(): View {
       binding= FragmentMapTabBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initData() {

        val fragments: List<Fragment> = listOf(
            WeatherMapFragment(), AirMapsFragment()
        )
        val adapter = PagerAdapter(requireActivity(), fragments)
        binding.vp2Content.adapter = adapter
        binding.vp2Content.offscreenPageLimit = adapter.itemCount - 1
        binding.vp2Content.setCurrentItem(currentPage, false)
        binding.vp2Content.isUserInputEnabled = false
        TabLayoutMediator(
            binding.tbTab, binding.vp2Content
        ) { tab, position ->
            if (position == 0) {
                tab.text = getString(R.string.map_weather)
            } else {
                tab.text = getString(R.string.map_air)
            }
        }.attach()

    }

}