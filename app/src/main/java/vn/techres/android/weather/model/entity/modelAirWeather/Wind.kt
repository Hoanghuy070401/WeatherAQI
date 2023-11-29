package vn.techres.android.weather.model.entity.modelAirWeather

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
class Wind : Serializable {
    @SerializedName("speed")
    var speed  = 0.0

  @SerializedName("deg")
    var deg  = 0.0//hướng gió độ

  @SerializedName("gust")
    var gust  = 0.0// tốc độ gió mạnh m/s


}