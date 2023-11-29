package vn.techres.android.weather.utils

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import com.google.gson.Gson
import vn.techres.android.weather.R
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.ui.activity.MediaActivity
import java.io.File

object PhotoShowUtils {
    //Tải hình ảnh banner
    fun loadSignatureImage(url: String, view: ImageView) {
        if (url != "") {
            Glide.with(view).load(getLinkPhoto(url)).diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop().transform(MultiTransformation(CenterCrop())).into(view)
        }
    }

    fun getLinkPhoto(photo: String?): String {
        return String.format("%s%s", photo)
    }

    fun loadPhotoImage(url: String, view: ImageView) {
        if (url.contains("/")) {
            Glide.with(view)
                .asBitmap()
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .apply(
                    RequestOptions().placeholder(R.drawable.ic_default)
                        .error(R.drawable.ic_default)
                )
                .centerCrop()
                .into(view)
        } else {
            Glide.with(view)
                .asBitmap()
                .load(
                    String.format(
                        "%s%s",
                        url
                    )
                )
                .diskCacheStrategy(DiskCacheStrategy.ALL).centerCrop().apply(
                    RequestOptions().placeholder(R.drawable.ic_default)
                        .error(R.drawable.ic_default)
                ).into(view)
        }
    }

    fun loadImage(url: String, view: ImageView) {
        val urlImage = "https://openweathermap.org/img/wn/${url}.png"
        Glide.with(view)
            .asBitmap()
            .load(urlImage)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.ic_default)
                    .error(R.drawable.ic_default)
//                    .override(R.dimen.dp_32, R.dimen.dp_32)
            )
            .centerCrop()
            .into(view)
    }

    fun loadFoodImage(url: String, view: ImageView) {
        if (url.contains("/")) {
            Glide.with(view)
                .asBitmap()
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .apply(
                    RequestOptions().placeholder(R.drawable.food_default)
                        .error(R.drawable.food_default)
                )
                .centerCrop()
                .into(view)
        } else {
            Glide.with(view)
                .asBitmap()
                .load(
                    java.lang.String.format(
                        "%s%s",

                        url
                    )
                )
                .diskCacheStrategy(DiskCacheStrategy.ALL).centerCrop().apply(
                    RequestOptions().placeholder(R.drawable.food_default)
                        .error(R.drawable.food_default)
                ).into(view)
        }
    }


    fun loadAvatarImage(url: String, view: ImageView) {
        if (url.contains("/")) {
            Glide.with(view)
                .asBitmap()
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .apply(
                    RequestOptions().placeholder(R.drawable.ic_user_default)
                        .error(R.drawable.ic_user_default)
                )
                .centerCrop()
                .transform(MultiTransformation(CenterCrop(), CircleCrop()))
                .into(view)
        } else {
            Glide.with(view)
                .asBitmap()
                .load(
                    String.format(
                        "%s%s",

                        url
                    )
                )
                .diskCacheStrategy(DiskCacheStrategy.ALL).centerCrop().apply(
                    RequestOptions().placeholder(R.drawable.ic_user_default)
                        .error(R.drawable.ic_user_default)
                ).transform(MultiTransformation(CenterCrop(), CircleCrop())).into(view)
        }
    }

    private fun getListMedia(photo: String): ArrayList<String> {
        val arrayList: ArrayList<String> = ArrayList()
        if (!photo.contains("/"))
            arrayList.add(getLinkPhoto(photo)) else arrayList.add(
            photo
        )
        return arrayList
    }

    private fun getListMedia(photo: ArrayList<String>): ArrayList<String> {
        val arrayList: ArrayList<String> = ArrayList()
        for (i in photo.indices) {
            if (!photo[i].contains("/")) {
                arrayList.add(getLinkPhoto(photo[i]))
            }else
                arrayList.add(photo[i])
        }
        return arrayList
    }


    fun showImageMediaSlider(photo: String, position: Int, context: Context) {
        val json = Gson().toJson(getListMedia(photo))
        val mediaIntent =
            Intent(context, MediaActivity::class.java)
        mediaIntent.putExtra(AppConstants.MEDIA_DATA, json)
        mediaIntent.putExtra(AppConstants.MEDIA_POSITION, position)
        context.startActivity(mediaIntent)
    }

    fun showImageMediaSlider(photo: ArrayList<String>, position: Int, context: Context) {
        val json = Gson().toJson(getListMedia(photo))
        val mediaIntent =
            Intent(context, MediaActivity::class.java)
        mediaIntent.putExtra(AppConstants.MEDIA_DATA, json)
        mediaIntent.putExtra(AppConstants.MEDIA_POSITION, position)
        context.startActivity(mediaIntent)
    }
    fun showImageMediaSlider(photo: ArrayList<String>,type: ArrayList<String>, position: Int, context: Context) {
        val json = Gson().toJson(getListMedia(photo))
        val mediaIntent =
            Intent(context, MediaActivity::class.java)
        mediaIntent.putExtra(AppConstants.MEDIA_DATA, json)
        mediaIntent.putExtra(AppConstants.MEDIA_POSITION, position)
        mediaIntent.putExtra(AppConstants.MEDIA_DATA_TYPE,Gson().toJson(type))
        context.startActivity(mediaIntent)
    }

    fun loadGroupAvatar(url: String, view: ImageView) {
        Glide.with(view)
            .load(if (!url.contains("/")) getLinkPhoto(url) else Uri.fromFile(File(url)))
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .centerCrop().apply(
                RequestOptions().placeholder(R.drawable.ic_group)
                    .error(R.drawable.ic_group)
            ).transform(MultiTransformation(CenterCrop(), CircleCrop())).into(view)
    }
}