package vn.techres.android.weather.model.entity.modelCity

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
class MapView {
    @SerializedName("west")
    var west = 0.0

    @SerializedName("south")
    var south = 0.0

    @SerializedName("east")
    var east = 0.0

    @SerializedName("north")
    var north = 0.0
}