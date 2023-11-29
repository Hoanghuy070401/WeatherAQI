package vn.techres.android.weather.http.model


/**
 * @Author: Bùi Hửu Thắng
 * @Date: 03/10/2022
 */
open class HttpData<T> {

    private val code: String? = null

    private val message: String? = null

    private val list: T? = null

    fun getCode(): String? {
        return code
    }

    fun getMessage(): String? {
        return message
    }

    fun getData(): T? {
        return list
    }


    fun isRequestSucceed(): Boolean {
        return code == "200"
    }

    fun isRequestUnauthorized(): Boolean {
        return code == "401"
    }

    fun isTokenFailure(): Boolean {
        return code == "410"
    }

}