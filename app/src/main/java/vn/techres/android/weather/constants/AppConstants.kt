package vn.techres.android.weather.constants

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 03/10/2022
 */
object
AppConstants {
    //trạng thái thời tiết
    const val SUN = 0 //trạng thái nắng ít mây
    const val RAIN = 1 // trạng thái mưa
    const val SNOW = 2 // trạng thái tuyết
    const val MURKY = 3 //trạng thái âm u
    const val CLOUD = 4 //trạng thái mây nhiều
    const val CLOUD_LITE = 5 //trạng thái mây ít
    const val THUNDERSTORM  = 6 //trạng thái dông mưa nhỏ
    const val DIZ  = 7 //trạng thái sương mù
    const val DUST  = 8 //trạng thái bụi
    const val SQUALL  = 9 //trạng thái mưa đá
    const val TORNADO  =10 //trạng thái lốc xoáy

    var ISLOCATION   =false //check vị trí hiện tại

    //Config call api
    const val ANDROID_SUPPLIER = 5
    const val APP_OS_NAME = "tms_supplier_android"
    const val HTTP_METHOD_POST = 1
    const val HTTP_METHOD_GET = 0
    const val PROJECT_ID = "net.techres.supplier.api"
    const val CACHE_HTTP_LOG = "CACHE_HTTP_LOG"

    const val METHOD_POST = "POST"
    const val METHOD_GET = "GET"

    const val SECOND_INSTALL = "SECOND_INSTALL"
    const val CACHE_USER = "CACHE_USER"
    const val CACHE_SETTING = "CACHES_SETTING"
    const val CACHE_BRANCH = "CACHES_BRANCH"
    const val CACHE_LOCATION = "CACHE_LOCATION"
    const val DATA_LIST = "DATA_LIST"

    const val FIST_LOCATION = "Đang lấy vị trí "


    const val PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1
    var LOCATION_PERMISSION_GRANTED = false
    var WEATHER_DATA = false
    var WEATHER = false
    var DATE = false
    var FINISH = false
    var SOS = false
    var FORMAT_DATE_HOURS = "dd/MM/yyyy HH:mm"
    var FORMAT_DATE = "dd/MM/yyyy"
    var FORMAT_DATE_NOT_YEAR = "dd/MM"
    var FORMAT_HOURS = "HH:mm"

    const val MEDIA_DATA = "MEDIA_DATA"
    const val MEDIA_DATA_TYPE = "MEDIA_DATA_TYPE"
    const val MEDIA_POSITION = "MEDIA_POSITION"



    const val FOLDER_APP = "app/weather"//folder lưu file của App

    const val KEY_OPEN_WEATHER = "9de243494c0b295cca9337e1e96b00e2"
}