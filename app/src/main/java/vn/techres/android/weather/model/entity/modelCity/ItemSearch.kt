package vn.techres.android.weather.model.entity.modelCity

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
class ItemSearch {
    @SerializedName("title")
    var title = ""

    @SerializedName("id")
    var id = ""

    @SerializedName("language")
    var language = ""

    @SerializedName("resultType")
    var resultType = ""

    @SerializedName("localityType")
    var localityType = ""

    @SerializedName("address")
    var address = Address()
}