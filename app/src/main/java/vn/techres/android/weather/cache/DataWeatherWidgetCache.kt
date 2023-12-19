package vn.techres.android.weather.cache

import com.google.gson.Gson
import com.tencent.mmkv.MMKV
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.model.entity.LocationDevice
import vn.techres.android.weather.model.entity.modelWeatherDays.WeatherDays

object DataWeatherWidgetCache {
    private var dataWeather = WeatherDays()
    private val mmkv: MMKV = MMKV.mmkvWithID("cache_data_weather")
    fun saveData(location: WeatherDays) {
        try {
            mmkv.remove(AppConstants.CACHE_DATA_WEATHER_WIDGET)
         mmkv.putString(AppConstants.CACHE_DATA_WEATHER_WIDGET, Gson().toJson(location)).commit()
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }

    fun getData(): WeatherDays {
        try {
            dataWeather =
                Gson().fromJson(mmkv.getString(AppConstants.CACHE_DATA_WEATHER_WIDGET, ""), WeatherDays::class.java)
        } catch (e: Exception) {
            e.stackTrace
        }
        return dataWeather
    }

}