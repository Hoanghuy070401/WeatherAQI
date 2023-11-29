package vn.techres.android.weather.http.api

import com.hjq.http.annotation.HttpRename
import vn.techres.android.weather.router.ApiApplicationRouters

/**
 * @Author: NGUYEN THE DAT
 * @Date: 4/10/2023
 */
class GetListCityApi : BaseApi() {

    @HttpRename("q")
    var countryName =""

    @HttpRename("limit")
    var limit =20


    @HttpRename("lang")
    var lang ="vi"

    @HttpRename("types")
    var types ="area"

    @HttpRename("apiKey")
    var keyApi = ApiApplicationRouters.keyApiCity


    override fun getApi(): String {
        return ""
    }

    override fun getHost(): String {
        return ApiApplicationRouters.API_GET_PLACES()
    }



    companion object {
        fun params(countryName: String): BaseApi {
            val data = GetListCityApi()
            data.countryName = countryName
            return data
        }
    }
}