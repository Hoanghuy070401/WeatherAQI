package vn.techres.android.weather.model.entity.modelAirWeather

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
class MainWeather {
    @SerializedName("temp")
    var temp = 0.0

    @SerializedName("feels_like")
    var feelsLike = 0.0

    @SerializedName("temp_min")
    var tempMin = 0.0

    @SerializedName("temp_max")
    var tempMax =0.0

    @SerializedName("pressure")
    var pressure = 0.0//áp suất khí quyển trên mực nước biển

    @SerializedName("humidity")
    var humidity = 0.0//độ ẩm

    @SerializedName("sea_level")
    var seaLevel =0.0//áp suất khí quyển

    @SerializedName("grnd_level")
    var grndLevel = 0.0//áp suất khí quyển trên mặt đất


}