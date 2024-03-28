package vn.techres.android.weather.home.ui.fragment

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.LocationManager
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.location.LocationManagerCompat.isLocationEnabled
import androidx.fragment.app.Fragment
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.coroutines.runBlocking
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import timber.log.Timber
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppFragment
import vn.techres.android.weather.app.helper.FadePageTransformerViewPage2
import vn.techres.android.weather.cache.ListAddressCache
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.home.databinding.ActivityHomeBinding
import vn.techres.android.weather.home.ui.activity.ListAddressActivity
import vn.techres.android.weather.home.ui.adapter.DynamicViewPagerAdapter
import vn.techres.android.weather.model.entity.AddressCity
import vn.techres.android.weather.model.eventbus.AddListSuggestEvenBus
import vn.techres.android.weather.model.eventbus.UpLoadDataEvenBus
import vn.techres.android.weather.model.eventbus.UpdateDataEventBus
import vn.techres.android.weather.model.titles
import vn.techres.android.weather.model.titlesOrdinals
import vn.techres.android.weather.router.DownLoadNews
import vn.techres.android.weather.ui.activity.HomeActivity
import vn.techres.base.PagerAdapter
import java.util.Locale

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/1/2023.
 */
class HomeFragment : AppFragment<HomeActivity>() {
    private lateinit var binding: ActivityHomeBinding
    companion object {
        var activityViewPagerAdapter: DynamicViewPagerAdapter? = null
    }
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    override fun getLayoutView(): View {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initData() {
        fusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(requireContext())
        getLocation()
        binding.btnLocation.clickWithDebounce(500) {
            if (AppConstants.ISLOCATION){
                binding.Viewpager2.setCurrentItem(0, false)
                toast("vị trí đã được cập nhật thành công")
            }else{
                binding.Viewpager2.setCurrentItem(0, false)
                getLocation()
            }
        }
        setUpTabs()
        binding.imvSettingLocation.clickWithDebounce(1000){
            val intent = Intent(requireActivity(),ListAddressActivity::class.java)
           startActivity(intent)
        }
        getLocationPermission()
    }
    private fun setUpTabs() {
        activityViewPagerAdapter = DynamicViewPagerAdapter(childFragmentManager,lifecycle)
        binding.Viewpager2.adapter = activityViewPagerAdapter
        binding.Viewpager2.setPageTransformer(FadePageTransformerViewPage2())
        binding.clViewPager2.setViewPager(binding.Viewpager2)
//        binding.Viewpager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
//            override fun onPageSelected(position: Int) {
//                if (position == 0) {
//                     binding.Viewpager2.getChildAt(0).setBackgroundResource(R.drawable.ic_location)
//                } else {
//                    binding.Viewpager2.getChildAt(position).setBackgroundResource(R.drawable.bg_indicator)
//                }
//            }
//        })

    }
    private fun getLocation() {
        if (ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            fusedLocationProviderClient.lastLocation.addOnSuccessListener {
                if (it != null) {
                    val firstLocation = AppConstants.FIST_LOCATION
                    val geocoder = Geocoder(requireContext(), Locale.getDefault())
                    val addresses = geocoder.getFromLocation(it.latitude,it.longitude, 1)!!
                    val cityName = if (addresses.firstOrNull()!!.subAdminArea==null){
                        addresses.firstOrNull()!!.adminArea
                    }else{
                        addresses.firstOrNull()!!.subAdminArea
                    }
                    val newLocationAddressCity = AddressCity(0, cityName!!, it.longitude, it.latitude)
                    if (titles.isNotEmpty()) {
                        titles[0] = newLocationAddressCity // Cập nhật phần tử đầu tiên nếu danh sách không rỗng
                    } else {
                        titles.add(newLocationAddressCity) // Nếu danh sách rỗng, thêm vào vị trí đầu tiên
                    }
                    titlesOrdinals[newLocationAddressCity.nameCity] = 0 // Cập nhật titlesOrdinals
                    titlesOrdinals.remove(firstLocation)
                    AppConstants.ISLOCATION=true
                    EventBus.getDefault().postSticky(UpdateDataEventBus(newLocationAddressCity, true))
                } else {
                    toast(getString(R.string.no_search_invalid_address))
                }

            }
            return
        } else {
            getLocationPermission()
        }

    }

    @Subscribe(sticky = true)
    fun updateDataLocation(isUpdate: UpLoadDataEvenBus) {
        val index = titles.indexOfFirst { it.id == isUpdate.id }
        binding.Viewpager2.setCurrentItem(index, false)
    }

    @Subscribe(sticky = true)
    fun addLocationSuggest(isCheck: AddListSuggestEvenBus) {
        if (isCheck.isCheck) {
            titles.forEachIndexed { index, it ->
                if (it.nameCity== isCheck.data.nameCity){
                    binding.Viewpager2.setCurrentItem(index, false)
                    return
                }else{
                    binding.Viewpager2.setCurrentItem(titles.size, false)
                }
            }

        }
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

    @SuppressLint("NotifyDataSetChanged")
    override fun onResume() {
        super.onResume()
        view?.post {
            activityViewPagerAdapter?.notifyDataSetChanged()
            binding.clViewPager2.setViewPager(binding.Viewpager2)
        }
        getLocation()
    }


}