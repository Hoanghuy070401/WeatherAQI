package vn.techres.android.weather.ui.widget

import android.R
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.RemoteViews
import android.widget.RemoteViewsService
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import vn.techres.android.weather.cache.DataWeatherWidgetCache
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.model.entity.modelWeatherDays.List
import vn.techres.android.weather.utils.AppUtils


/**
 * @author:Nguyễn Hoàng Huy
 * @date: 12/13/2023.
 */
class WidgetService : RemoteViewsService() {
    override fun onGetViewFactory(p0: Intent?): RemoteViewsFactory {
        return StackRemoteViewsFactory(this.applicationContext, p0!!)
    }
}

class StackRemoteViewsFactory(
    private val context: Context,
    intent: Intent,
) : RemoteViewsService.RemoteViewsFactory {
    private val data: ArrayList<List> = ArrayList()

    override fun onCreate() {
        val dataCache =DataWeatherWidgetCache.getData()
        data.addAll(dataCache.list)
    }

    override fun onDataSetChanged() {
    }

    override fun onDestroy() {
        data.clear()
    }

    override fun getCount(): Int {
        // Trả về số lượng phần tử trong data.
        return data.size
    }

    @SuppressLint("RemoteViewLayout")
    override fun getViewAt(position: Int): RemoteViews {
        // Trả về RemoteViews cho phần tử tại vị trí position trong data.
        val remoteViews = RemoteViews(context.packageName, vn.techres.android.weather.R.layout.item_list_widget).also {
            Glide.with(context)
                .asBitmap()
                .load("https://openweathermap.org/img/wn/${data[position].weather[0].icon}.png" )
                .into(object : CustomTarget<Bitmap>() {
                    override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                        // Đặt Bitmap vào ImageView trong RemoteViews
                        it.setImageViewBitmap(vn.techres.android.weather.R.id.imvIcon, resource)
                    }

                    override fun onLoadCleared(placeholder: Drawable?) {
                        // Code xử lý khi tải ảnh bị hủy
                    }
                })

            it.setTextViewText(vn.techres.android.weather.R.id.tvDate, AppUtils.getDayDetails(data[position].dt, false))
            it.setTextViewText(
                vn.techres.android.weather.R.id.tvDeceptionTemperature,
                data[position].weather[0].description
            )
        }
        return remoteViews
    }

    @SuppressLint("RemoteViewLayout")
    override fun getLoadingView(): RemoteViews? {
        return null
    }

    override fun getViewTypeCount(): Int {
        return 1
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun hasStableIds(): Boolean {
        return true
    }

}