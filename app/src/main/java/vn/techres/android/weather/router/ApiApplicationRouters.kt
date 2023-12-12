package vn.techres.android.weather.router

@Suppress("FunctionName")
object ApiApplicationRouters {
    const val VERSION = "v5"
    fun API_GET_WARD(): String {

        return "api/${VERSION}/administrative-units/wards"
    }

    fun API_GET_DISTRICTS(): String {
        return "api/${VERSION}/administrative-units/districts"
    }



    const val keyApi = "AIzaSyD_UDwWKI0gmjnC87t0ilKt0UljLJY2988"
    const val keyApiCity = "KCh8EqX8SazXmRGXLEq8kbLF9cgygdZ7NNV0e42k67s"
    const val keyApiAir = "22551114624a3e914ecc6200d782801848274d68"


    fun API_GET_ICON(idIcon:String):String{  //lấy URL biểu tượng
        return "img/wn/idIcon@2x.png"
    }

    fun API_GET_PLACES():String{  //lấy URL địa chỉ
        return "https://autocomplete.search.hereapi.com/v1/autocomplete"
    }

    fun API_GET_PLACES_DETAIL():String{  //lấy URL địa chỉ
        return "https://lookup.search.hereapi.com/v1/lookup"
    }

    fun API_GET_WEATHER_HOURS():String{  //lấy URL địa chỉ
        return "https://pro.openweathermap.org/data/2.5/forecast/hourly"
    }



    fun API_GET_DATA_WEATHER_DAYS():String{  //lấy dữ liệu thời tiết 30 ngày không có dự đoán khả năng mưa
        return "data/2.5/forecast/climate"
    }

    fun API_GET_DATA_WEATHER_DAYS_16():String{  //lấy dữ liệu thời tiết 16 ngày có dự đoán khả năng mưa
        return "data/2.5/forecast/daily"
    }

    fun API_GET_DATA_WEATHER():String{  //lấy Data weather My Location Now
        return "data/2.5/weather"
    }

    fun GET_HOST_API_AIR():String{  //get data air My Location Now
        return "data/2.5/air_pollution"
    }

    fun GET_API_AIR_HOURS():String{  //get data air My Location Now
        return "data/2.5/air_pollution/forecast"
    }


}