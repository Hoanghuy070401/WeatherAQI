package vn.techres.android.weather.http.api

import com.google.gson.annotations.SerializedName
import com.hjq.http.annotation.HttpRename
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.router.ApiApplicationRouters

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 10/9/2023.
 */
class CurrentAirApi : BaseApi() {
    @HttpRename("lat")
    var lat = 0.0

    @HttpRename("lon")
    var lon = 0.0

    @HttpRename("lang")
    var lang = "vi"

    @HttpRename("appid")
    var keyApi = AppConstants.KEY_OPEN_WEATHER

    override fun getApi(): String {
        return ApiApplicationRouters.GET_HOST_API_AIR()
    }

    companion object {
        fun param(lat: Double,lon:Double): BaseApi {
            val data = CurrentAirApi()
            data.lat=lat
            data.lon=lon
            return data
        }
    }
}