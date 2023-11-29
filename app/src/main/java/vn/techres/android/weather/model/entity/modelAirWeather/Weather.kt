package vn.techres.android.weather.model.entity.modelAirWeather

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
class Weather {
    @SerializedName("id")
    var id = 0L

    @SerializedName("main")
    var main = ""

    @SerializedName("description")
    var description =""

    @SerializedName("icon")
    var icon = ""

}