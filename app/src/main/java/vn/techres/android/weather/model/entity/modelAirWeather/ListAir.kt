package vn.techres.android.weather.model.entity.modelAirWeather

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
class ListAir {
    @SerializedName("main")
    var main = Main()
    @SerializedName("components")
    var components = Components()

    @SerializedName("dt")
    var dt = 0.0


}