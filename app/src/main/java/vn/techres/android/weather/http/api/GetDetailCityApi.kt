package vn.techres.android.weather.http.api

import com.hjq.http.annotation.HttpRename
import vn.techres.android.weather.router.ApiApplicationRouters

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
class GetDetailCityApi:BaseApi() {
    @HttpRename("id")
    var idCity = ""

    @HttpRename("apiKey")
    var keyApi = ApiApplicationRouters.keyApiCity

    override fun getApi(): String {
        return ""
    }

    override fun getHost(): String {
        return ApiApplicationRouters.API_GET_PLACES_DETAIL()
    }
    companion object{
        fun params(idCity:String):BaseApi{
            val data = GetDetailCityApi()
            data.idCity=idCity
            return data
        }
    }


}