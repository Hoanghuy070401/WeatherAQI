package vn.techres.android.weather.model.entity.modelAirWeather

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
class Clouds : Serializable {
    @SerializedName("all")
    var all = 0.0
}