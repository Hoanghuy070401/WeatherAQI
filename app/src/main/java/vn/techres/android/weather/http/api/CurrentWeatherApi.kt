package vn.techres.android.weather.http.api

import com.hjq.http.annotation.HttpRename
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.router.ApiApplicationRouters
import vn.techres.android.weather.utils.AppUtils

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 9/21/2023.
 */
class CurrentWeatherApi:BaseApi() {
    @HttpRename("lat")
    var lat = 0.0

    @HttpRename("lon")
    var lon = 0.0

    @HttpRename("lang")
    var lang = "vi"

    @HttpRename("units")
    var units = ""

    @HttpRename("appid")
    var keyApi = AppConstants.KEY_OPEN_WEATHER


    override fun getApi(): String {
        return ApiApplicationRouters.API_GET_DATA_WEATHER()
    }
    companion object{
        fun param(lat:Double,lon:Double,units:String):BaseApi {
            val data =CurrentWeatherApi()
            data.lat=lat
            data.lon=lon
            data.units=units
            return data
        }
    }


}