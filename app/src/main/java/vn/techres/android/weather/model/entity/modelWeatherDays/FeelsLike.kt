package vn.techres.android.weather.model.entity.modelWeatherDays

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
class FeelsLike {
    @SerializedName("day")
    var day =0.0//Nhiệt độ ngày

    @SerializedName("night")
    var night = 0.0//Nhiệt độ đêm

    @SerializedName("eve")
    var eve =0.0//Nhiệt độ buổi tối

    @SerializedName("morn")
    var morn = 0.0//Nhiệt độ buổi tối
}