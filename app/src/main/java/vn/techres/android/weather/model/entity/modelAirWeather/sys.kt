package vn.techres.android.weather.model.entity.modelAirWeather

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
class sys: Serializable
{
    @SerializedName("type")
    var type = 0

    @SerializedName("id")
    var id = 0L

    @SerializedName("country")
    var country = ""

    @SerializedName("sunrise")
    var sunrise =0.0

    @SerializedName("sunset")
    var sunset = 0.0

}