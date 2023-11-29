package vn.techres.android.weather.model.entity.modelAirWeather

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
class Components {
    @SerializedName("co")
    var co = 0.0

    @SerializedName("no")
    var n0 = 0.0

    @SerializedName("no2")
    var no2 = 0.0

    @SerializedName("o3")
    var o3 =0.0

    @SerializedName("so2")
    var so2 = 0.0

    @SerializedName("pm2_5")
    var pm25 = 0.0

    @SerializedName("pm10")
    var pm10 = 0.0

    @SerializedName("nh3")
    var nh3 =0.0
}