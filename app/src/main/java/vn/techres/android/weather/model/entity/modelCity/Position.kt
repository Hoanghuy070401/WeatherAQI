package vn.techres.android.weather.model.entity.modelCity

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
class Position {
    @SerializedName("lat")
    var lat = 0.0

    @SerializedName("lng")
    var lng = 0.0
}