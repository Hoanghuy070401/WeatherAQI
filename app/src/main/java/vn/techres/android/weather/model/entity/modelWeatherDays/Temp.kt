package vn.techres.android.weather.model.entity.modelWeatherDays

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
class Temp {
    @SerializedName("day")
    var day =0.0//Nhiệt độ ngày

    @SerializedName("min")
    var min = 0.0

    @SerializedName("max")
    var max =0.0

    @SerializedName("night")
    var night = 0.0//Nhiệt độ đêm

    @SerializedName("eve")
    var eve =0.0//Nhiệt độ mặt trời lặn

    @SerializedName("morn")
    var morn = 0.0//Nhiệt độ mặt trời mọc

}