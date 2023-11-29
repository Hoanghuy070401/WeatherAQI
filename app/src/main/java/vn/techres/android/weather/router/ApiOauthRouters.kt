package vn.techres.android.weather.router



@Suppress("FunctionName")
object ApiOauthRouters {
    private const val VERSION = "v3"
    fun API_GET_VERSION(): String {
        return "api/$VERSION/check-version?os_name=seemt_android"
    }

}