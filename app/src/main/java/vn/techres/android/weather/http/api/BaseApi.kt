package vn.techres.android.weather.http.api

import com.hjq.http.annotation.HttpHeader
import com.hjq.http.annotation.HttpRename
import com.hjq.http.config.IRequestApi
import com.hjq.http.config.IRequestHost
import com.hjq.http.config.IRequestType
import com.hjq.http.model.BodyType
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.other.AppConfig
import vn.techres.android.weather.router.ApiApplicationRouters


/**
 * @Author: Bùi Hửu Thắng
 * @Date: 03/10/2022
 */
open class BaseApi : IRequestApi, IRequestType,IRequestHost {

    @HttpHeader
    @HttpRename("appid")
    var appid = AppConstants.KEY_OPEN_WEATHER

    override fun getBodyType(): BodyType {
        return BodyType.JSON
    }

    override fun getApi(): String {
        return ""
    }

    override fun getHost(): String {
        return AppConfig.getHostUrl()
    }
}