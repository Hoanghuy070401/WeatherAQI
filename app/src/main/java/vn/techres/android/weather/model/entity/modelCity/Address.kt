package vn.techres.android.weather.model.entity.modelCity

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
class Address {
    @SerializedName("label")
    var label = ""

    @SerializedName("countryCode")
    var countryCode = ""

    @SerializedName("countryName")
    var countryName = ""

    @SerializedName("county")
    var county = ""

    @SerializedName("city")
    var city = ""

    @SerializedName("state")
    var state = ""
}