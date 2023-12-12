package vn.techres.android.weather.model.entity.modelAirWeather

import vn.techres.android.weather.model.entity.modelWeatherDays.List

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 12/8/2023.
 */
class ListAirWeatherHours {
    var id = 0L
    var listAir = ListAir()
    var listWeather = List()

    constructor(id: Long, listAir: ListAir, listWeather: List) {
        this.id = id
        this.listAir = listAir
        this.listWeather = listWeather
    }
}