package vn.techres.android.weather.ui.activity

import android.app.ActivityManager
import android.content.Intent
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import kotlinx.coroutines.runBlocking
import org.greenrobot.eventbus.Subscribe
import timber.log.Timber
import vn.techres.base.PagerAdapter
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppActivity
import vn.techres.android.weather.app.AppFragment
import vn.techres.android.weather.cache.ListAddressCache
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.constants.ModuleClassConstants
import vn.techres.android.weather.databinding.HomeActivityBinding
import vn.techres.android.weather.model.entity.AddressCity
import vn.techres.android.weather.model.eventbus.AddListSuggestEvenBus
import vn.techres.android.weather.model.eventbus.UpdateDataEventBus
import vn.techres.android.weather.model.listNews
import vn.techres.android.weather.model.titles
import vn.techres.android.weather.router.DownLoadNews
import vn.techres.android.weather.ui.widget.WeatherFetchService
import kotlin.system.exitProcess

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 28/09/2022
 */
class HomeActivity : AppActivity() {
    lateinit var binding: HomeActivityBinding

    private var currentPage = 2
    private var twice = false


    companion object {
        var data = AddressCity()
    }


    // You can use this method to check if the activity is currently resumed or not
    override fun getLayoutView(): View {
        binding = HomeActivityBinding.inflate(layoutInflater)
        return binding.root
    }

    @RequiresApi(33)
    override fun initView() {
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (twice) {
                    exitProcess(0)
                }
                twice = true
                toast(getString(R.string.back_confirm))
                postDelayed({ twice = false }, 2000)
            }
        }
        onBackPressedDispatcher.addCallback(this, callback)
    }

    override fun initData() {




        if (ListAddressCache.getAllLocations().size > 0) {
            titles.clear()
        }
        titles.addAll(ListAddressCache.getAllLocations())
        val fragments: List<Fragment>
        fragments = listOf(
            Class.forName(ModuleClassConstants.NEWS).newInstance() as AppFragment<*>,
            Class.forName(ModuleClassConstants.MAP_FRAGMENT).newInstance() as AppFragment<*>,
            Class.forName(ModuleClassConstants.HOME_FRAGMENT).newInstance() as AppFragment<*>,
            Class.forName(ModuleClassConstants.SETTING_FRAGMENT).newInstance() as AppFragment<*>
        )



        val adapter = PagerAdapter(this, fragments)

        //Setup menu
        binding.mBottomNavigationView.itemIconTintList = null
        val menu = binding.mBottomNavigationView.menu
        for (i in 0 until menu.size()) {
            binding.mBottomNavigationView.findViewById<BottomNavigationItemView>(menu.getItem(i).itemId)
                .setOnLongClickListener { true }
        }
        binding.contentView.adapter = adapter
        binding.contentView.offscreenPageLimit = adapter.itemCount - 1
        binding.contentView.setCurrentItem(currentPage, false)
        binding.mBottomNavigationView.selectedItemId = R.id.menu_message

        //Chặn viewpager2 vuốt
        binding.contentView.isUserInputEnabled = false
        binding.mBottomNavigationView.setOnItemSelectedListener { item ->
            // Handle item selection here
            when (item.itemId) {
                R.id.menu_kaizen -> {
                    currentPage = 0
                    binding.contentView.setCurrentItem(currentPage, false)
                    return@setOnItemSelectedListener true
                }

                R.id.menu_work -> {
                    currentPage = 1
                    binding.contentView.setCurrentItem(currentPage, false)

                    return@setOnItemSelectedListener true
                }

                R.id.menu_message -> {
                    currentPage = 2
                    binding.contentView.setCurrentItem(currentPage, false)
                    return@setOnItemSelectedListener true
                }

//                R.id.menu_notification -> {
//                    currentPage = 3
//                    binding.contentView.setCurrentItem(currentPage, false)
//
//                    return@setOnItemSelectedListener true
//                }

                R.id.menu_utility -> {
                    currentPage = 3
                    binding.contentView.setCurrentItem(currentPage, false)

                    return@setOnItemSelectedListener true
                }

                else -> return@setOnItemSelectedListener false
            }
        }
    }
    @Subscribe(sticky = true)
    fun updateDataFistLocation(isUpdate: UpdateDataEventBus) {
        if (isUpdate.isUpdate) {
            Timber.tag("checkServiceWidget").i("${isUpdate.isUpdate}+${isServiceRunning()}")
            if (!isServiceRunning()){
                startServiceA(isUpdate.data.lat,isUpdate.data.lon)
                Timber.tag("checkServiceWidget").i("${isServiceRunning()}")
            }else{
                //
            }

        }
    }

    @Subscribe(sticky = true)
    fun addLocationSuggest(isCheck: AddListSuggestEvenBus) {
        if (isCheck.isCheck) {
            data = Gson().fromJson(
                intent.getStringExtra(AppConstants.DATA_LIST), AddressCity::class.java
            )
            val isDataInList = titles.any { it.nameCity == data.nameCity }
            if (!isDataInList) {
                val addData = AddressCity(titles.size.toLong(), data.nameCity, data.lon, data.lat)
                titles.add(addData)
            } else {
                //
            }
        }
    }
    private fun startServiceA(lat:Double, lon:Double){
        val url=" https://api.openweathermap.org/data/2.5/forecast/daily?appid=9de243494c0b295cca9337e1e96b00e2&cnt=7&lon=${lon}&units=metric&lang=vi&lat=${lat}"
        val serviceWeatherWidget = Intent(this, WeatherFetchService::class.java)
        serviceWeatherWidget.putExtra(AppConstants.API_URL, url)
        startService(serviceWeatherWidget)
    }
    private fun isServiceRunning(): Boolean {
        val activityManager = getSystemService(ACTIVITY_SERVICE) as ActivityManager
        val services = activityManager.getRunningServices(Int.MAX_VALUE)
        for (service in services) {
            if (AppConstants.API_URL == service.service.className) {
                return true
            }
        }
        return false
    }



}