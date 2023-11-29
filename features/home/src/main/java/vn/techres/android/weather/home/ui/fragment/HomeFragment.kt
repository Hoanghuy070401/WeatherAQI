package vn.techres.android.weather.home.ui.fragment

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.LocationManager
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.location.LocationManagerCompat.isLocationEnabled
import androidx.fragment.app.Fragment
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.material.tabs.TabLayoutMediator
import timber.log.Timber
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppFragment
import vn.techres.android.weather.cache.ListAddressCache
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.home.databinding.ActivityHomeBinding
import vn.techres.android.weather.home.ui.activity.ListAddressActivity
import vn.techres.android.weather.model.entity.AddressCity
import vn.techres.android.weather.model.titles
import vn.techres.android.weather.model.titlesOrdinals
import vn.techres.android.weather.ui.activity.HomeActivity
import vn.techres.base.PagerAdapter

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/1/2023.
 */
class HomeFragment : AppFragment<HomeActivity>() {
    private lateinit var binding: ActivityHomeBinding
    override fun getLayoutView(): View {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initData() {

        val fragments: List<Fragment> = listOf(
            AirFragment(), WeatherFragment()
        )
        val adapter = PagerAdapter(requireActivity(), fragments)
        binding.vp2Content.adapter = adapter
        binding.vp2Content.offscreenPageLimit = adapter.itemCount - 1
        binding.vp2Content.setCurrentItem(0, false)
        binding.vp2Content.isUserInputEnabled = false
        TabLayoutMediator(
            binding.tbTab, binding.vp2Content
        ) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = getString(R.string.air)
                }

                1 -> {
                    tab.text = getString(R.string.weather)
                }

            }

        }.attach()
        binding.imvSettingLocation.clickWithDebounce(1000){
            val intent = Intent(requireActivity(),ListAddressActivity::class.java)
           startActivity(intent)
        }
        getLocationPermission()

    }

    private fun getLocationPermission() {
        if (ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            AppConstants.LOCATION_PERMISSION_GRANTED = true
        } else {
            ActivityCompat.requestPermissions(
                this.requireActivity(), arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                AppConstants.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION
            )
        }
    }

}