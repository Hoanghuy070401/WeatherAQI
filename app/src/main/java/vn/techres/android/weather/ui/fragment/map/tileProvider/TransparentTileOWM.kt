package vn.techres.android.weather.ui.fragment.map.tileProvider

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Build
import androidx.annotation.RequiresApi
import com.google.android.gms.maps.model.Tile
import com.google.android.gms.maps.model.TileProvider
import timber.log.Timber
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.manager.TileLoadManager
import vn.techres.android.weather.model.interfaces.TileLoadListener
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.net.MalformedURLException
import java.net.URL
import java.util.Timer

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 9/7/2023.
 */
class TransparentTileOWM(tileType: String, date: Long) : TileProvider {
    private val opacityPaint = Paint()
    private var tileType: String = String()
    private var dated = 0L


    @SuppressLint("SimpleDateFormat")
    @RequiresApi(Build.VERSION_CODES.N)
    private val OWM_TILE_URL =
        "http://maps.openweathermap.org/maps/2.0/weather/%s/%d/%d/%d?fill_bound=true&use_norm=true&arrow_step=16&appid=9de243494c0b295cca9337e1e96b00e2"
//        "http://tile.openweathermap.org/map/%s/%d/%d/%d.png?appid=8bb7583761a8e203e2065433efe37142"
//    "https://a.sat.owm.io/vane/2.0/weather/%s/%d/%d/%d?appid=9de243494c0b295cca9337e1e96b00e2"

    private val AQI_TILE_URL =
        "https://tiles.aqicn.org/tiles/%s/%d/%d/%d.png?token=33cf0f00-7e2a-45e8-9f7a-5e31a3e573d2"//22551114624a3e914ecc6200d782801848274d68

    private val WEATHER_MAP_SOS =
        "http://maps.openweathermap.org/maps/2.0/relief/%d/%d/%d?appid=9de243494c0b295cca9337e1e96b00e2"

    init {
        this.dated = date / 1000
        this.tileType = tileType
        if (AppConstants.WEATHER_DATA) {
            setOpacity(50)
        } else {
            setOpacity(100)
        }
    }

    private var OWM_TILE_URL_DATE =
        "https://maps.openweathermap.org/maps/2.0/weather/%s/%d/%d/%d?fill_bound=true&use_norm=true&date=${dated}&arrow_step=16&appid=9de243494c0b295cca9337e1e96b00e2"


    @RequiresApi(Build.VERSION_CODES.O)
    override fun getTile(x: Int, y: Int, zoom: Int): Tile? {
        var tileUrl: URL? = null
        try {
            tileUrl = getTileUrl(x, y, zoom)
        } catch (e: IOException) {
            Timber.tag("failURL").e(e)
        }

        var tile: Tile? = null
        var stream: ByteArrayOutputStream? = null
        try {
            val image = BitmapFactory.decodeStream(tileUrl?.openConnection()?.getInputStream() )
            val adjustedImage = adjustOpacity(image)

            stream = ByteArrayOutputStream()
            adjustedImage.compress(Bitmap.CompressFormat.PNG, 100, stream)

            val byteArray = stream.toByteArray()
            tile = Tile(256, 256, byteArray)
        } catch (e: IOException) {
            e.printStackTrace()
        } finally {
            stream?.close()
        }
        return tile
    }

    private fun setOpacity(opacity: Int) {
        val alpha = (opacity * 2.55).toInt() // 2.55 = 255 * 0.01
        opacityPaint.alpha = alpha
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun adjustOpacity(bitmap: Bitmap): Bitmap {
        val adjustedBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.RGBA_F16)
        val canvas = Canvas(adjustedBitmap)
        canvas.drawBitmap(bitmap, 0f, 0f, opacityPaint)
        return adjustedBitmap
    }

    @SuppressLint("SuspiciousIndentation")
    @RequiresApi(Build.VERSION_CODES.N)
    private fun getTileUrl(x: Int, y: Int, zoom: Int): URL {
        val tileUrl: String = if (AppConstants.WEATHER_DATA) {
            if (AppConstants.SOS) {
                String.format(WEATHER_MAP_SOS, zoom, x, y)
            } else if (AppConstants.DATE) {
                String.format(OWM_TILE_URL_DATE, tileType, zoom, x, y)
            } else {
                String.format(OWM_TILE_URL, tileType, zoom, x, y)
            }
        } else {
            String.format(AQI_TILE_URL, tileType, zoom, x, y)
        }
        return try {
            URL(tileUrl)
        } catch (e: MalformedURLException) {
            throw AssertionError(e)
        }
    }
}

