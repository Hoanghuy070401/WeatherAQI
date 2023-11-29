package vn.techres.android.weather.model.entity.modelWeatherDays

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
class WeatherDays {
    @SerializedName("city")
    var city = City()

    @SerializedName("cod")
    var cod = 0

    @SerializedName("code")
    var code = 0

    @SerializedName("message")
    var message =0.0

    @SerializedName("list")
    var list = ArrayList<List>()

    @SerializedName("cnt")
    var cnt = 0 //số ngày trả về
}