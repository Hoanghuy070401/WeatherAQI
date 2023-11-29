package vn.techres.android.weather.model.entity.modelAirWeather

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
class Rain {
    @SerializedName("1h")
    var OneOclock = 0.0

    @SerializedName("3h")
    var threeOclock = 0.0
}