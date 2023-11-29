package vn.techres.android.weather.model.entity

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 10/11/2023.
 */
class LocationDevice {
    @SerializedName("lat")
    var lat =0.0

    @SerializedName("lon")
    var lon = 0.0

    @SerializedName("name_place")
    var namePlace = ""

    constructor(lat: Double,lon: Double) {
        this.lat = lat
        this.lon = lon
    }

    constructor()

}