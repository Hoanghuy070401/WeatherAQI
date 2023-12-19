package vn.techres.android.weather.http.api

import com.hjq.http.annotation.HttpRename
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.router.ApiApplicationRouters

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
class GetWeatherDaysApi:BaseApi() {

    @HttpRename("lat")
    var lat = 0.0

    @HttpRename("lon")
    var lon = 0.0

    @HttpRename("lang")
    var lang = "vi"

    @HttpRename("cnt")
    var cnt = 0///so ngay tra ve tu 1 - 16

    @HttpRename("units")
    var units = ""

    @HttpRename("appid")
    var keyApi = AppConstants.KEY_OPEN_WEATHER

    override fun getApi(): String {
        return ApiApplicationRouters.API_GET_DATA_WEATHER_DAYS_16()
    }
    companion object{
        fun param(lat:Double,lon:Double,cnt:Int,units:String):BaseApi{
            val data=GetWeatherDaysApi()
            data.lat=lat
            data.lon=lon
            data.cnt=cnt
            data.units=units
            return data
        }
    }
}