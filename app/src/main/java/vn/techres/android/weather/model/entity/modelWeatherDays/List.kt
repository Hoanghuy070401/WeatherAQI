package vn.techres.android.weather.model.entity.modelWeatherDays

import com.google.gson.annotations.SerializedName
import vn.techres.android.weather.model.entity.modelAirWeather.MainWeather
import vn.techres.android.weather.model.entity.modelAirWeather.Weather

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
class List {
    @SerializedName("dt")
    var dt = 0L

    @SerializedName("sunrise")
    var sunrise = 0L//mặt trời mọc

    @SerializedName("sunset")
    var sunset = 0L//mặt trời lặn

    @SerializedName("temp")
    var temp = Temp()

    @SerializedName("main")
    var main = MainWeather()

    @SerializedName("feels_like")
    var feelsLike = FeelsLike()

    @SerializedName("pressure")
    var pressure = 0.0//Áp suất khí quyển trên mực nước biển

    @SerializedName("humidity")
    var humidity = 0//Độ ẩm, %

    @SerializedName("weather")
    var weather = ArrayList<Weather>()

    @SerializedName("speed")
    var speed = 0.0//tốc độ gió

    @SerializedName("deg")
    var deg = 0.0//hướng gió

    @SerializedName("clouds")
    var clouds = 0.0// độ bao phủ

    @SerializedName("rain")
    var rain = -1.0//lượng mưa

    @SerializedName("gust")
    var gust = 0.0//gió mạnh

    @SerializedName("snow")
    var snow = -1.0//khối lượng tuyết rơi

    @SerializedName("pop")
    var pop = -1.0//xác xuất mưa

     @SerializedName("dt_txt")
    var dtTxt = ""//thời gian dự đoán
}