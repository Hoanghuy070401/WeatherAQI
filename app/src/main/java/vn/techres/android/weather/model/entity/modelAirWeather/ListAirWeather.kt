package vn.techres.android.weather.model.entity.modelAirWeather

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
class ListAirWeather {
    var id = 0L
//    var name = ""
    var listAir= AirNow()
    var listWeather = WeatherNow()

    constructor(id: Long,  listAir: AirNow, listWeather: WeatherNow) {
        this.id = id
//        this.name = name
        this.listAir = listAir
        this.listWeather = listWeather
    }
}