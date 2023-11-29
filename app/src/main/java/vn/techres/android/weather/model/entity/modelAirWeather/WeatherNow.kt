package vn.techres.android.weather.model.entity.modelAirWeather

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
class WeatherNow {
    @SerializedName("coord")
    var coord = Coord()

    @SerializedName("weather")
    var weather = ArrayList<Weather>()

    @SerializedName("main")
    var main = MainWeather()

    @SerializedName("wind")
    var wind = Wind()

    @SerializedName("clouds")
    var clouds = Clouds()

    @SerializedName("dt")
    var dt = 0.0

    @SerializedName("sys")
    var sys = sys()

    @SerializedName("name")
    var name =""

    @SerializedName("cod")
    var cod =0

    @SerializedName("base")
    var base =""

    @SerializedName("visibility")
    var visibility =0L

    @SerializedName("timezone")
    var timezone =0

    @SerializedName("id")
    var id =0L
}