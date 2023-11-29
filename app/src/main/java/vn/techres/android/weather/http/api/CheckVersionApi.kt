package vn.techres.android.weather.http.api

import vn.techres.android.weather.BuildConfig
import vn.techres.android.weather.router.ApiOauthRouters

/**
 * @Author: NGUYEN THE DAT
 * @Date: 4/8/2023
 */
class CheckVersionApi : BaseApi() {

    override fun getApi(): String {
        return ApiOauthRouters.API_GET_VERSION()
    }

    companion object {
        fun params(): BaseApi {
            val data = CheckVersionApi()
            return data
        }
    }
}