package vn.techres.android.weather.ui.widget

import android.app.IntentService
import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Intent
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import timber.log.Timber
import vn.techres.android.weather.R
import vn.techres.android.weather.cache.DataWeatherWidgetCache
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.model.entity.modelWeatherDays.WeatherDays

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 12/13/2023.
 */
class WeatherFetchService:IntentService(".WeatherFetchService") {
    @Deprecated("Deprecated in Java")
    override fun onHandleIntent(intent: Intent?) {
        val apiUrl = intent?.getStringExtra(AppConstants.API_URL)
        Timber.tag("CheckedServiceUrl").i("$apiUrl")
        apiUrl?.let {
            val queue = Volley.newRequestQueue(this)
            val stringRequest = StringRequest(
                Request.Method.GET, it,
                { response ->
                    Timber.tag("CheckedService").i("successService+${GsonBuilder().setPrettyPrinting().create().toJson(response)}")
                    // Xử lý dữ liệu khi nhận được response thành công
                    val data = Gson().fromJson(response,WeatherDays::class.java)
                    DataWeatherWidgetCache.saveData(data)
                    val appWidgetManager = AppWidgetManager.getInstance(this)
                    val appWidgetIds = appWidgetManager.getAppWidgetIds(ComponentName(this, StackRemoteViewsFactory::class.java))
                    appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetIds, R.id.lvWeather) // ID của ListView trong widget
                    val intents = Intent("vn.techres.android.appwidget.action.APPWIDGET_UPDATE")
                    sendBroadcast(intents)
                },
                { error ->
                    Timber.tag("CheckedService").i("failService+${error.message}")
                })
            queue.add(stringRequest)

        }
    }
}