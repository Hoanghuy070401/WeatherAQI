package vn.techres.android.weather.http.api

import com.hjq.http.annotation.HttpRename
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.router.ApiApplicationRouters

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 12/9/2023.
 */
class GetListAirHours:BaseApi() {
    @HttpRename("lat")
    var lat =0.0

    @HttpRename("lon")
    var lon =0.0

    @HttpRename("appid")
    var keyApi = AppConstants.KEY_OPEN_WEATHER
    override fun getApi(): String {
        return ApiApplicationRouters.GET_API_AIR_HOURS()
    }
    companion object {
        fun param(lat: Double,lon:Double): BaseApi {
            val data = GetListAirHours()
            data.lat=lat
            data.lon=lon
            return data
        }
    }

}