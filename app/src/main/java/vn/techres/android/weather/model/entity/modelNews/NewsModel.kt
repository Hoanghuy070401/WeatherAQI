package vn.techres.android.weather.model.entity.modelNews

import com.google.gson.annotations.SerializedName

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 12/11/2023.
 */
class NewsModel {
    var title = ""
    var link = ""
    var linkPhoto = ""
    var linkPhotoLogo = ""
    var date = ""

    constructor()
    constructor(
        title: String,
        link: String,
        linkPhoto: String,
        linkPhotoLogo: String,
        date: String,
    ) {
        this.title = title
        this.link = link
        this.linkPhoto = linkPhoto
        this.linkPhotoLogo = linkPhotoLogo
        this.date = date
    }


}