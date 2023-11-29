package vn.techres.android.weather.model.entity.modelWeatherDays

import com.google.gson.annotations.SerializedName
import vn.techres.android.weather.model.entity.modelAirWeather.Coord

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
class City {
    @SerializedName("id")
    var id = 0L

    @SerializedName("name")
    var name = ""

    @SerializedName("coord")
    var coord =Coord()

    @SerializedName("country")
    var country = ""

    @SerializedName("population")
    var population = 0

    @SerializedName("timezone")
    var timezone = 0L
}