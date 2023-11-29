package vn.techres.android.weather.model.entity.modelAirWeather

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
class Coord {
    @SerializedName("lat")
    var lat = 0.0

    @SerializedName("lon")
    var lon = 0.0
}