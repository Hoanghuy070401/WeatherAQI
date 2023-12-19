package vn.techres.android.weather.ui.widget

import android.annotation.SuppressLint
import android.app.PendingIntent
import android.app.PendingIntent.FLAG_IMMUTABLE
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.widget.RemoteViews
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import timber.log.Timber
import vn.techres.android.weather.R
import vn.techres.android.weather.cache.DataWeatherWidgetCache
import vn.techres.android.weather.model.entity.modelWeatherDays.List
import vn.techres.android.weather.ui.activity.HomeActivity
import vn.techres.android.weather.utils.AppUtils

/**
 * Implementation of App Widget functionality.
 */


class AppWidget : AppWidgetProvider() {
    @SuppressLint("RemoteViewLayout")
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray,
    ) {
        appWidgetIds.forEach { appWidgetId ->
            val views = RemoteViews(context.packageName, R.layout.app_widget)
            updateWidgetData(context, views)
            appWidgetManager.updateAppWidget(appWidgetId, views)
        }
    }

    @SuppressLint("RemoteViewLayout")
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == "vn.techres.android.appwidget.action.APPWIDGET_UPDATE") {
            val appWidgetManager = AppWidgetManager.getInstance(context)
            val appWidgetIds = appWidgetManager.getAppWidgetIds(
                ComponentName(context!!, AppWidget::class.java)
            )
            appWidgetIds.forEach { appWidgetId ->
                val views = RemoteViews(context.packageName, R.layout.app_widget)
                views.setRemoteAdapter(R.id.lvWeather,intent)
                updateWidgetData(context, views)
                appWidgetManager.updateAppWidget(appWidgetId, views)
            }
        }
        super.onReceive(context, intent)
    }

    override fun onEnabled(context: Context?) {
        super.onEnabled(context)
    }

    override fun onDeleted(context: Context?, appWidgetIds: IntArray?) {
        super.onDeleted(context, appWidgetIds)
    }

    override fun onDisabled(context: Context?) {
        super.onDisabled(context)
    }

    private fun updateWidgetData(context: Context, views: RemoteViews) {
        val dataCache = DataWeatherWidgetCache.getData()
        val data = dataCache.list

        if (data.isNotEmpty()) {
            views.setTextViewText(
                R.id.tvTemperatureTv,
                AppUtils.roundBigDecimal(data[0].temp.temp.toBigDecimal()).toString()
            )
            views.setTextViewText(R.id.tvDate, AppUtils.getDayDetails(data[0].dt, false))
            views.setTextViewText(R.id.tvDeceptionTv, data[0].weather[0].description)

            Glide.with(context)
                .asBitmap()
                .load("https://openweathermap.org/img/wn/${data[0].weather[0].icon}.png")
                .into(object : CustomTarget<Bitmap>() {
                    override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                        views.setImageViewBitmap(R.id.imvIconAppTv, resource)
                        AppWidgetManager.getInstance(context).updateAppWidget(ComponentName(context, AppWidget::class.java), views)
                    }

                    override fun onLoadCleared(placeholder: Drawable?) {
                        // Code xử lý khi tải ảnh bị hủy
                    }
                })
        } else {
            Timber.tag("dataSetAppWidget").i("${data.size}")
        }
    }
}
