package vn.techres.android.weather.http.api

import com.hjq.http.annotation.HttpRename
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.router.ApiApplicationRouters

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 12/8/2023.
 */
class GetListWeatherHours:BaseApi() {
    @HttpRename("lat")
    var lat = 0.0

    @HttpRename("lon")
    var lon = 0.0

    @HttpRename("units")
    var units = ""

    @HttpRename("apiKey")
    var keyApi = AppConstants.KEY_OPEN_WEATHER

    override fun getApi(): String {
        return ""
    }
    override fun getHost(): String {
        return ApiApplicationRouters.API_GET_WEATHER_HOURS()
    }
    companion object{
        fun params(lat:Double,lon:Double,units:String):BaseApi{
            val data = GetListWeatherHours()
            data.lat=lat
            data.lon=lon
            data.units=units
            return data
        }
    }
}