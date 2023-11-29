package vn.techres.android.weather.model.entity

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/7/2023.
 */
class AddressCity {
    var id = 0L
     var nameCity = ""
     var lon = 0.0
    var lat = 0.0

    constructor(id: Long, nameCity: String, lon: Double, lat: Double) {
        this.id = id
        this.nameCity = nameCity
        this.lon = lon
        this.lat = lat
    }

    constructor()

}