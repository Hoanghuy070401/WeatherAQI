package vn.techres.android.weather.model.entity.modelAirWeather

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
class AirNow {
    @SerializedName("coord")
    var coord = Coord()

    @SerializedName("list")
    var list = ArrayList<ListAir>()
}