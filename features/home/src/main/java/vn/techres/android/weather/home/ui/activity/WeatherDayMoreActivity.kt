package vn.techres.android.weather.home.ui.activity

import android.view.View
import com.github.sundeepk.compactcalendarview.CompactCalendarView
import com.github.sundeepk.compactcalendarview.CompactCalendarView.CompactCalendarAnimationListener
import vn.techres.android.weather.app.AppActivity
import vn.techres.android.weather.home.databinding.ActivityWeatherDayMoreBinding
import java.util.Calendar
import java.util.Date

class WeatherDayMoreActivity : AppActivity() {
    private lateinit var  binding :ActivityWeatherDayMoreBinding
    override fun getLayoutView(): View {
        binding = ActivityWeatherDayMoreBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        ///
        compactCalendarView()
    }

    override fun initData() {
        //
    }
    private fun compactCalendarView(){

    }

}