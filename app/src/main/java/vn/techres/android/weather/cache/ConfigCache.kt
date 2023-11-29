package vn.techres.android.weather.cache

import com.google.gson.Gson
import com.tencent.mmkv.MMKV
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.model.entity.LocationDevice

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 03/10/2022
 */
object ConfigCache {


    private var mLocationDevice = LocationDevice()
    private val mmkv: MMKV = MMKV.mmkvWithID("cache_location")
    fun saveLocation(location: LocationDevice) {
        try {
            mmkv.remove(AppConstants.CACHE_LOCATION)
            mmkv.putString(AppConstants.CACHE_LOCATION, Gson().toJson(location)).commit()
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }

    fun getLocation(): LocationDevice {
        try {
            mLocationDevice =
                Gson().fromJson(mmkv.getString(AppConstants.CACHE_LOCATION, ""), LocationDevice::class.java)
        } catch (e: Exception) {
            e.stackTrace
        }
        return mLocationDevice
    }

}
//
//    fun saveConfig(config: Config?) {
//        try {
//            mmkv.remove(AppConstants.CACHE_CONFIG)
//            mmkv.putString(AppConstants.CACHE_CONFIG, Gson().toJson(config)).commit()
//        } catch (e: java.lang.Exception) {
//            e.printStackTrace()
//        }
//    }
//
//    fun getConfig(): Config {
//        try {
//            mConfig =
//                Gson().fromJson(mmkv.getString(AppConstants.CACHE_CONFIG, ""), Config::class.java)
//        } catch (e: Exception) {
//            e.stackTrace
//        }
//        return mConfig
//    }
//    fun getSessionToken(): String {
//        val config = getConfig()
//        return "${config.type} ${config.sessionToken}:${config.apiKey}"
//    }
