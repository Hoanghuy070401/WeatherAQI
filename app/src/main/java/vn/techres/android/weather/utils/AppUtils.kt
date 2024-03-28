package vn.techres.android.weather.utils

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.*
import android.graphics.drawable.Drawable
import android.location.Address
import android.location.Geocoder
import android.os.Build
import android.os.Environment
import android.os.SystemClock
import android.provider.Settings
import android.text.Html
import android.text.InputFilter
import android.text.Spanned
import android.util.Base64
import android.util.TypedValue
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.*
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.LottieAnimationView
import com.github.matteobattilana.weather.PrecipType
import com.github.matteobattilana.weather.WeatherView
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.zxing.BarcodeFormat
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import com.google.zxing.qrcode.QRCodeWriter
import timber.log.Timber
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppApplication
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.model.entity.modelAirWeather.WeatherNow
import vn.techres.android.weather.other.CenterLayoutManager
import vn.techres.android.weather.other.PreCachingLayoutManager
import vn.techres.android.weather.widget.AppEditText
import java.io.File
import java.math.BigDecimal
import java.math.RoundingMode
import java.net.NetworkInterface
import java.nio.charset.StandardCharsets
import java.security.SecureRandom
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.text.Normalizer
import java.text.ParseException
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import java.util.regex.Pattern


object AppUtils {
    fun formatReportDateTime(
        context: Context, reportTypeSort: Int, inputDateTime: String, position: Int,
    ): String {
        var outputDateTime = ""
        if (inputDateTime == "0000-00-00 00") return "0"
        try {
            val format: SimpleDateFormat
            val time: Date
            when (reportTypeSort) {
                1, 9 -> {
                    format = SimpleDateFormat("yyyy-MM-dd HH", Locale.getDefault())
                    time = format.parse(inputDateTime)!!
                    val timeFormat = SimpleDateFormat("HH", Locale.getDefault())
                    outputDateTime = String.format("%s:00", timeFormat.format(time))
                    return outputDateTime
                }

                2 -> when (position) {

                    0 -> {
                        outputDateTime = context.getString(R.string.monday)
                        return outputDateTime
                    }

                    1 -> {
                        outputDateTime = context.getString(R.string.tuesday)
                        return outputDateTime
                    }

                    2 -> {
                        outputDateTime = context.getString(R.string.wednesday)
                        return outputDateTime
                    }

                    3 -> {
                        outputDateTime = context.getString(R.string.thursday)
                        return outputDateTime
                    }

                    4 -> {
                        outputDateTime = context.getString(R.string.friday)
                        return outputDateTime
                    }

                    5 -> {
                        outputDateTime = context.getString(R.string.saturday)
                        return outputDateTime
                    }

                    6 -> {
                        outputDateTime = context.getString(R.string.sunday)
                        return outputDateTime
                    }
                }

                3, 10, 4 -> {
                    format = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                    time = format.parse(inputDateTime)!!
                    val dayFormat = SimpleDateFormat("dd/MM", Locale.getDefault())
                    outputDateTime = dayFormat.format(time)
                    return outputDateTime
                }

                5, 11, 6, 15 -> {
                    format = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                    time = format.parse(inputDateTime)!!
                    val monthCurrentFormat = SimpleDateFormat("MM/yyyy", Locale.getDefault())
                    outputDateTime = monthCurrentFormat.format(time)
                    return outputDateTime
                }

                8, 16 -> {

                    format = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                    time = format.parse(inputDateTime)!!
                    val yearFormat = SimpleDateFormat("yyyy", Locale.getDefault())
                    outputDateTime = yearFormat.format(time)
                    return outputDateTime
                }

                13 -> {
                    format = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                    time = format.parse(inputDateTime)!!
                    val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                    outputDateTime = dateFormat.format(time)
                    return outputDateTime
                }
            }
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        return outputDateTime
    }

    fun calculateAQI_China(
        co: Double,
        no2: Double,
        o3: Double,
        so2: Double,
        pm25: Double,
        pm10: Double,
    ): Int {
        val coAQI = calculateIndividualAQINow(convertUgMgCO(co), "CO")
        val no2AQI = calculateIndividualAQINow(no2, "NO2")
        val o3AQI = calculateIndividualAQINow(o3, "O3")
        val so2AQI = calculateIndividualAQINow(so2, "SO2")
        val pm25AQI = calculateIndividualAQINow(pm25, "PM25")
        val pm10AQI = calculateIndividualAQINow(pm10, "PM10")
        val aqiList = listOf(coAQI, no2AQI, o3AQI, so2AQI, pm25AQI, pm10AQI)

        // Chọn AQI lớn nhất từ các chỉ số cá nhân
        return aqiList.maxOrNull() ?: 0
    }

    private fun calculateIndividualAQINow(value: Double, pollutant: String): Int {
        val c = when (pollutant) {
            "CO" -> arrayOf(0, 5, 10, 35, 60, 90, 120, 150)
            "NO2" -> arrayOf(0, 100, 200, 700, 1200, 2340, 3090, 3840)
            "O3" -> arrayOf(0, 160, 200, 300, 400, 800, 1000, 1200)
            "SO2" -> arrayOf(0, 150, 500, 650, 800, 1600, 2100, 2620)
            "PM25" -> arrayOf(0, 35, 75, 115, 150, 250, 350, 500)
            "PM10" -> arrayOf(0, 50, 150, 250, 350, 420, 500, 600)
            else -> arrayOf(0)
        }

        val i = when {
            value <= c[1].toDouble() -> linearInterpolation(
                value,
                0,
                50,
                c[0].toDouble(),
                c[1].toDouble()
            )

            value <= c[2].toDouble() -> linearInterpolation(
                value,
                51,
                100,
                c[1].toDouble(),
                c[2].toDouble()
            )

            value <= c[3].toDouble() -> linearInterpolation(
                value,
                101,
                150,
                c[2].toDouble(),
                c[3].toDouble()
            )

            value <= c[4].toDouble() -> linearInterpolation(
                value,
                151,
                200,
                c[3].toDouble(),
                c[4].toDouble()
            )

            value <= c[5].toDouble() -> linearInterpolation(
                value,
                201,
                300,
                c[4].toDouble(),
                c[5].toDouble()
            )

            else -> 300
        }

        return i.toInt()
    }

    private fun linearInterpolation(
        value: Double,
        iLow: Int,
        iHigh: Int,
        cLow: Double,
        cHigh: Double,
    ): Double {
        return (((iHigh - iLow) / (cHigh - cLow)) * (value - cLow)) + iLow
    }


    private fun convertMicrogramsPerCubicMeterToPpb(
        concentrationMicrogramsPerCubicMeter: Double,
        molecularWeight: Double,
    ): Double {
        return (concentrationMicrogramsPerCubicMeter * 1000) / molecularWeight
    }

    private fun convertUgMgCO(co: Double): Double {
        return (co / 1000)
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    var units = ""
    fun returnUnits(status: Int): String {
        when (status) {
            1 -> units = "standard"//Kelvin
            2 -> units = "metric"//độ C
            3 -> units = "imperial"//độ F
        }
        return units
    }


    @SuppressLint("SimpleDateFormat")
    fun getDayDetails(dt: Long, hours: Boolean): String {
//        val tz = TimeZone.getDefault()
        val millis = (dt * 1000) + 25200
        val date = Date(millis) // tạo đối tượng Date từ số miliseconds
        val formatter: SimpleDateFormat = if (hours) {
            SimpleDateFormat(AppConstants.FORMAT_DATE_HOURS)// định dạng ngày tháng năm giờ phút
        } else {
            SimpleDateFormat(AppConstants.FORMAT_DATE)// định dạng ngày tháng năm

        }
        return formatter.format(date)
    }

    @SuppressLint("SimpleDateFormat")
    fun getDayDetails(dt: Long): String {
//        val tz = TimeZone.getDefault()
        val millis = (dt * 1000) + 25200
        val date = Date(millis) // tạo đối tượng Date từ số miliseconds
        val formatter = SimpleDateFormat(AppConstants.FORMAT_DATE_NOT_YEAR)
        return formatter.format(date)
    }

    @SuppressLint("SimpleDateFormat")
    fun getDayDetailsHours(dt: Long, getHours: Boolean): String {
        val millis = dt * 1000
        val date = Date(millis) // tạo đối tượng Date từ số miliseconds
        val formatter =
            SimpleDateFormat(AppConstants.FORMAT_DATE_HOURS)// định dạng ngày tháng năm giờ phút
        return extractTimeFromString(formatter.format(date), getHours)
    }

    private fun extractTimeFromString(dateTimeString: String, getHours: Boolean): String {
        val formatter = SimpleDateFormat(AppConstants.FORMAT_DATE_HOURS, Locale.getDefault())
        val date = formatter.parse(dateTimeString)

        val timeFormatter = if (getHours) {
            SimpleDateFormat(AppConstants.FORMAT_HOURS, Locale.getDefault())
        } else {
            SimpleDateFormat(AppConstants.FORMAT_DATE, Locale.getDefault())
        }

        return timeFormatter.format(date!!)
    }

    fun timeComponents(hours: Boolean, time: String): Int {
        val timeComponents = time.split(":")
        return if (hours) {
            timeComponents[0].toInt() // Trả về giờ nếu tham số hours là true
        } else {
            timeComponents[1].toInt() // Trả về phút nếu tham số hours là false
        }
    }

    fun doiHuongGio(huongGio: Int): String {
        return when (huongGio) {
            in 338..360, in 0..22 -> "Bắc"
            in 23..67 -> "Đông Bắc"
            in 68..112 -> "Đông"
            in 113..157 -> "Đông Nam"
            in 158..202 -> "Nam"
            in 203..247 -> "Tây Nam"
            in 248..292 -> "Tây"
            in 293..337 -> "Tây Bắc"
            else -> "Không hợp lệ"
        }
    }

    fun Int.dpToPx(context: Context): Int {
        val density = context.resources.displayMetrics.density
        return (this * density).toInt()
    }

    fun Float.dpToPx(context: Context): Float {
        val density = context.resources.displayMetrics.density
        return this * density
    }


    fun dateNow(): String {
        val calendar = Calendar.getInstance()
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val month = calendar.get(Calendar.MONTH) + 1
        val year = calendar.get(Calendar.YEAR)
        return "$day/$month/$year"
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun layThoiGianHienTai(): String {
        val thoiGianHienTai =
            LocalDateTime.now().withHour(0).withMinute(0).withSecond(0).withNano(0)
        val dinhDang = DateTimeFormatter.ofPattern(AppConstants.FORMAT_DATE_HOURS)
        return thoiGianHienTai.format(dinhDang)
    }

    fun checkWeather(
        idWeather: Long,
        background: View,
        backgroundWeather: WeatherView,
        context: Context, lottie: LottieAnimationView,
    ) {
        when (idWeather) {
            in 200..232 ->
                setBackGround(
                    AppConstants.THUNDERSTORM,
                    background,
                    backgroundWeather,
                    context, lottie
                )//dông
            in 300..321 -> setBackGround(
                AppConstants.RAIN,
                background,
                backgroundWeather,
                context, lottie
            )//mưa phùn
            in 500..531 -> setBackGround(
                AppConstants.RAIN,
                background,
                backgroundWeather,
                context, lottie
            )//mưa
            in 600..622 -> setBackGround(
                AppConstants.SNOW,
                background,
                backgroundWeather,
                context, lottie
            )//tuyết
            701L, 721L, 741L -> setBackGround(
                AppConstants.DIZ,
                background,
                backgroundWeather,
                context, lottie
            )//sương mù
            711L, 731L, 751L, 761L, 762L -> setBackGround(
                AppConstants.DUST,
                background,
                backgroundWeather,
                context, lottie
            )//bụi
            771L -> setBackGround(
                AppConstants.SQUALL,
                background,
                backgroundWeather,
                context, lottie
            )//mưa đá
            781L -> setBackGround(
                AppConstants.TORNADO,
                background,
                backgroundWeather,
                context, lottie
            )//lốc xoáy
            800L -> setBackGround(
                AppConstants.SUN,
                background,
                backgroundWeather,
                context, lottie
            )//thông thoáng
            801L, 802L -> setBackGround(
                AppConstants.CLOUD_LITE,
                background,
                backgroundWeather,
                context, lottie
            )//mây ít , rải rác
            803L -> setBackGround(
                AppConstants.CLOUD,
                background,
                backgroundWeather,
                context, lottie
            )//mây ít , rải rác
            804L -> setBackGround(
                AppConstants.MURKY,
                background,
                backgroundWeather,
                context, lottie
            )//mây u ám

        }

    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun setBackGround(
        status: Int,
        background: View,
        backgroundWeather: WeatherView,
        context: Context, lottie: LottieAnimationView,
    ) {
        when (status) {
//            AppConstants.RAIN -> {
//                backgroundWeather.setWeatherData(PrecipType.RAIN)
//
////                background.background = context.getDrawable(R.drawable.rain_weather)
//            }
//
//            AppConstants.SNOW -> {
//                backgroundWeather.setWeatherData(PrecipType.SNOW)
//                background.background = context.getDrawable(R.drawable.snow)
//            }
//
//            AppConstants.SUN -> {
//                backgroundWeather.setWeatherData(PrecipType.CLEAR)
//                background.background = context.getDrawable(R.drawable.clear_sky)
//            }
//
//            AppConstants.CLOUD ->//mây nhiều
//            {
//                backgroundWeather.setWeatherData(PrecipType.CLEAR)
//                background.background = context.getDrawable(R.drawable.cloud_more)
//            }
//
//            AppConstants.CLOUD_LITE -> {
//                backgroundWeather.setWeatherData(PrecipType.CLEAR)
//                background.background = context.getDrawable(R.drawable.cloud_cum)
//            }
//
//            AppConstants.MURKY -> {
//                backgroundWeather.setWeatherData(PrecipType.CLEAR)
//                background.background = context.getDrawable(R.drawable.murky)
//            }
//
//            AppConstants.DIZ -> {
//                backgroundWeather.setWeatherData(PrecipType.CLEAR)
//                background.background = context.getDrawable(R.drawable.suong_mu)
//            }
//
//            AppConstants.TORNADO -> {
//                backgroundWeather.setWeatherData(PrecipType.CLEAR)
//                background.background = context.getDrawable(R.drawable.loc_xoay)
//            }
//
//            AppConstants.SQUALL -> {
//                backgroundWeather.setWeatherData(PrecipType.CLEAR)
//                background.background = context.getDrawable(R.drawable.mua_da)
//            }
//
//            AppConstants.DUST -> {
//                backgroundWeather.setWeatherData(PrecipType.CLEAR)
//                background.background = context.getDrawable(R.drawable.bui)
//            }
//
//            AppConstants.THUNDERSTORM -> {
//                backgroundWeather.setWeatherData(PrecipType.CLEAR)
//                background.background = context.getDrawable(R.drawable.dong)
//            }
            AppConstants.RAIN -> {
                backgroundWeather.setWeatherData(PrecipType.RAIN)
                background.background = context.getDrawable(R.drawable.bg_gray_dark_transsarent)
                lottie.setAnimation(R.raw.rain)
            }

            AppConstants.SNOW -> {
                backgroundWeather.setWeatherData(PrecipType.SNOW)
                background.background = context.getDrawable(R.drawable.bg_gray_white_transparent)
                lottie.setAnimation(R.raw.snow)
            }

            AppConstants.SUN -> {
                backgroundWeather.setWeatherData(PrecipType.CLEAR)
                background.background = context.getDrawable(R.drawable.bg_orange_transparent)
                lottie.setAnimation(R.raw.sunclound)
            }

            AppConstants.CLOUD ->//mây nhiều
            {
                backgroundWeather.setWeatherData(PrecipType.CLEAR)
                background.background = context.getDrawable(R.drawable.bg_gray_white_transparent)
                lottie.setAnimation(R.raw.cloudmore)
            }

            AppConstants.CLOUD_LITE -> {
                backgroundWeather.setWeatherData(PrecipType.CLEAR)
                background.background = context.getDrawable(R.drawable.bg_gray_white_transparent)
                lottie.setAnimation(R.raw.sunclound)
            }

            AppConstants.MURKY -> {
                backgroundWeather.setWeatherData(PrecipType.CLEAR)
                background.background = context.getDrawable(R.drawable.bg_gray_dark_transsarent)
                lottie.setAnimation(R.raw.cloudmore)
            }

            AppConstants.DIZ -> {
                backgroundWeather.setWeatherData(PrecipType.CLEAR)
                background.background = context.getDrawable(R.drawable.bg_gray_dark_transsarent)
                lottie.setAnimation(R.raw.cloudmore)
            }

            AppConstants.TORNADO -> {
                backgroundWeather.setWeatherData(PrecipType.CLEAR)
                background.background = context.getDrawable(R.drawable.bg_gray_dark_transsarent)
                lottie.setAnimation(R.raw.tormato)
            }

            AppConstants.SQUALL -> {
                backgroundWeather.setWeatherData(PrecipType.CLEAR)
                background.background = context.getDrawable(R.drawable.bg_gray_dark_transsarent)
                lottie.setAnimation(R.raw.rainice)
            }

            AppConstants.DUST -> {
                backgroundWeather.setWeatherData(PrecipType.CLEAR)
                background.background = context.getDrawable(R.drawable.bg_gray_dark_transsarent)
                lottie.setAnimation(R.raw.cloudmore)
            }

            AppConstants.THUNDERSTORM -> {
                backgroundWeather.setWeatherData(PrecipType.RAIN)
                background.background = context.getDrawable(R.drawable.bg_gray_dark_transsarent)
                lottie.setAnimation(R.raw.thunderstorm)
            }
        }

    }

    fun checkWeatherItem(idWeather: Long, background: View, context: Context) {
        when (idWeather) {
            in 200..232 ->
                setBackGroundItem(AppConstants.THUNDERSTORM, background, context)//dông
            in 300..321 -> setBackGroundItem(AppConstants.RAIN, background, context)//mưa phùn
            in 500..531 -> setBackGroundItem(AppConstants.RAIN, background, context)//mưa
            in 600..622 -> setBackGroundItem(AppConstants.SNOW, background, context)//tuyết
            701L, 721L, 741L -> setBackGroundItem(AppConstants.DIZ, background, context)//sương mù
            711L, 731L, 751L, 761L, 762L -> setBackGroundItem(
                AppConstants.DUST,
                background,
                context
            )//bụi
            771L -> setBackGroundItem(AppConstants.SQUALL, background, context)//mưa đá
            781L -> setBackGroundItem(AppConstants.TORNADO, background, context)//lốc xoáy
            800L -> setBackGroundItem(AppConstants.SUN, background, context)//thông thoáng
            801L, 802L -> setBackGroundItem(
                AppConstants.CLOUD_LITE,
                background,
                context
            )//mây ít , rải rác
            803L -> setBackGroundItem(AppConstants.CLOUD, background, context)//mây ít , rải rác
            804L -> setBackGroundItem(AppConstants.MURKY, background, context)//mây u ám

        }

    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun setBackGroundItem(status: Int, background: View, context: Context) {
        when (status) {
            AppConstants.RAIN -> {
                background.background = context.getDrawable(R.drawable.bg_gray_dark_transsarent)
            }

            AppConstants.SNOW -> {
                background.background = context.getDrawable(R.drawable.bg_gray_white_transparent)
            }

            AppConstants.SUN -> {
                background.background = context.getDrawable(R.drawable.bg_orange_transparent)
            }

            AppConstants.CLOUD ->//mây nhiều
            {
                background.background = context.getDrawable(R.drawable.bg_gray_white_transparent)
            }

            AppConstants.CLOUD_LITE -> {
                background.background = context.getDrawable(R.drawable.bg_gray_white_transparent)
            }

            AppConstants.MURKY -> {
                background.background = context.getDrawable(R.drawable.bg_gray_dark_transsarent)
            }

            AppConstants.DIZ -> {
                background.background = context.getDrawable(R.drawable.bg_gray_dark_transsarent)
            }

            AppConstants.TORNADO -> {
                background.background = context.getDrawable(R.drawable.bg_gray_dark_transsarent)
            }

            AppConstants.SQUALL -> {
                background.background = context.getDrawable(R.drawable.bg_gray_dark_transsarent)
            }

            AppConstants.DUST -> {
                background.background = context.getDrawable(R.drawable.bg_gray_dark_transsarent)
            }

            AppConstants.THUNDERSTORM -> {
                background.background = context.getDrawable(R.drawable.bg_gray_dark_transsarent)
            }
        }

    }

    fun checkImageAQi(imageView: ImageView, AQI: Int) {
        when (AQI) {
            1 -> imageView.setImageResource(R.drawable.face_good)
            2 -> imageView.setImageResource(R.drawable.face_v_good)
            3 -> imageView.setImageResource(R.drawable.face_normal)
            4 -> imageView.setImageResource(R.drawable.face_bad)
            5 -> imageView.setImageResource(R.drawable.face_very_bad)
            else -> {
                imageView.setImageResource(R.drawable.face_die)
            }
        }
    }

    fun chatGayOnhiem(chiSo: Map<String, Double>): String {
        var chatOnhiem = ""
        var maxAQI = 0.0
        var textNotifine = ""
        for ((chat, chiSo) in chiSo) {
            val AQI = when (chat) {
                "PM2.5" -> when {
                    chiSo <= 35 -> chiSo / 35 * 50
                    chiSo <= 75 -> 50 + (chiSo - 35) / (75 - 35) * (100 - 50)
                    chiSo <= 115 -> 100 + (chiSo - 75) / (115 - 75) * (150 - 100)
                    chiSo <= 150 -> 150 + (chiSo - 115) / (150 - 115) * (200 - 150)
                    chiSo <= 250 -> 200 + (chiSo - 150) / (250 - 150) * (300 - 200)
                    else -> 300 + (chiSo - 250) / (350 - 250) * (500 - 300)
                }

                "PM10" -> when {
                    chiSo <= 50 -> chiSo / 50 * 50
                    chiSo <= 150 -> 50 + (chiSo - 50) / (150 - 50) * (100 - 50)
                    chiSo <= 250 -> 100 + (chiSo - 150) / (250 - 150) * (150 - 100)
                    chiSo <= 350 -> 150 + (chiSo - 250) / (350 - 250) * (200 - 150)
                    chiSo <= 420 -> 200 + (chiSo - 350) / (420 - 350) * (300 - 200)
                    else -> 300 + (chiSo - 420) / (500 - 420) * (500 - 300)
                }

                "O3" -> when {
                    chiSo <= 160 -> chiSo / 160 * 50
                    chiSo <= 200 -> 50 + (chiSo - 160) / (200 - 160) * (100 - 50)
                    chiSo <= 300 -> 100 + (chiSo - 200) / (300 - 200) * (150 - 100)
                    chiSo <= 400 -> 150 + (chiSo - 300) / (400 - 300) * (200 - 150)
                    chiSo <= 800 -> 200 + (chiSo - 400) / (800 - 400) * (300 - 200)
                    else -> 300 + (chiSo - 800) / (1000 - 800) * (500 - 300)
                }

                "CO" -> when {
                    chiSo <= 5000 -> chiSo / 5000 * 50
                    chiSo <= 10000 -> 50 + (chiSo - 5000) / (10000 - 5000) * (100 - 50)
                    chiSo <= 30000 -> 100 + (chiSo - 10000) / (30000 - 10000) * (150 - 100)
                    chiSo <= 50000 -> 150 + (chiSo - 30000) / (50000 - 30000) * (200 - 150)
                    chiSo <= 100000 -> 200 + (chiSo - 50000) / (100000 - 50000) * (300 - 200)
                    else -> 300 + (chiSo - 100000) / (150000 - 100000) * (500 - 300)
                }

                "SO2" -> when {
                    chiSo <= 50 -> chiSo / 50 * 50
                    chiSo <= 150 -> 50 + (chiSo - 50) / (150 - 50) * (100 - 50)
                    chiSo <= 475 -> 100 + (chiSo - 150) / (475 - 150) * (150 - 100)
                    chiSo <= 800 -> 150 + (chiSo - 475) / (800 - 475) * (200 - 150)
                    chiSo <= 1600 -> 200 + (chiSo - 800) / (1600 - 800) * (300 - 200)
                    else -> 300 + (chiSo - 1600) / (2100 - 1600) * (500 - 300)
                }

                "NO2" -> when {
                    chiSo <= 40 -> chiSo / 40 * 50
                    chiSo <= 100 -> 50 + (chiSo - 40) / (100 - 40) * (100 - 50)
                    chiSo <= 200 -> 100 + (chiSo - 100) / (200 - 100) * (150 - 100)
                    chiSo <= 700 -> 150 + (chiSo - 200) / (700 - 200) * (200 - 150)
                    chiSo <= 1200 -> 200 + (chiSo - 700) / (1200 - 700) * (300 - 200)
                    else -> 300 + (chiSo - 1200) / (2340 - 1200) * (500 - 300)
                }

                else -> 0.0
            }

            if (AQI > maxAQI) {
                maxAQI = AQI
                chatOnhiem = chat

                textNotifine = when {
                    AQI.toInt() in 151..200 ->
                        "Mọi người, những người mắc bệnh đường hô hấp nên hạn chế hoạt động ngoài trời.\nChất gây ô nhiễm nhất là $chatOnhiem với chỉ số ô nhiễm là $maxAQI"
                    AQI.toInt() in 201..300 ->
                        "Mọi người nên hạn chế hoạt động ngoài trời.\nChất gây ô nhiễm nhất là $chatOnhiem với chỉ số ô nhiễm là $maxAQI"
                    else ->
                        "Mọi người nên tránh mọi hoạt động gắng sức ngoài trời.\nChất gây ô nhiễm nhất là $chatOnhiem với chỉ số ô nhiễm là $maxAQI"
                }
            } else {
                textNotifine = when (AQI.toInt()) {
                    in 0..50 -> "Chất lượng không khí đạt yêu cầu và ô nhiễm không khí gây ra ít hoặc không có rủi ro"
                    in 51..100 -> "Chất lượng không khí ở mức chấp nhận được, tuy nhiên, có thể có mối lo ngại về sức khỏe"
                    in 101..150 -> "Thành viên của các nhóm nhạy cảm có thể bị ảnh hưởng sức khỏe"
                    else -> ""
                }
            }
        }
        return textNotifine
    }

    fun checkWeather(weather: WeatherNow): String {
        if (weather.main.temp < 0) {
            return "Thời tiết rất lạnh!"
        } else if (weather.main.temp > 37) {
            return "Thời tiết rất nóng!"
        } else if (weather.wind.speed > 30) {
            return "Có gió mạnh!"
        } else if (weather.weather[0].id in 200..531) {
            return "Trời có thể có mưa hãy mang theo dù!"
        } else if (weather.weather[0].id in 600..622) {
            return "Có tuyết rơi!"
        } else {
            return weather.weather[0].description
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun getCurrentDate(days: Int): String {
        val currentDate = LocalDate.now().plusDays(days.toLong())
        return currentDate.format(DateTimeFormatter.ofPattern(AppConstants.FORMAT_DATE))
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun formatDateTime(inputDateTime: String): String {
        val offsetDateTime = OffsetDateTime.parse(inputDateTime)
        val formatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy")
        return offsetDateTime.format(formatter)
    }

    @SuppressLint("SimpleDateFormat")
    fun getDateFormat(date: String, hours: Boolean): Long {

        val formatter: SimpleDateFormat = if (hours) {
            SimpleDateFormat(AppConstants.FORMAT_DATE_HOURS)// định dạng ngày tháng năm giờ phút
        } else {
            SimpleDateFormat(AppConstants.FORMAT_DATE)// định dạng ngày tháng năm

        }
        val dateDetails = formatter.parse(date)
        val millis = dateDetails?.time
        return millis!!.toLong()
    }

    fun coordinatesToLatLng(latitude: Double, longitude: Double): LatLng {
        return LatLng(latitude, longitude)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun convertStringToDate(dateString: String): LocalDate {
        val formatter = DateTimeFormatter.ofPattern(AppConstants.FORMAT_DATE)
        return LocalDate.parse(dateString, formatter)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun convertDateToCustomString(dateString: String): String {
        val date = convertStringToDate(dateString)
        val today = LocalDate.now()
        val yesterday = today.minusDays(1)
        val tomorrow = today.plusDays(1)

        return when (date) {
            today -> "Hôm nay"
            yesterday -> "Hôm qua"
            tomorrow -> "Ngày mai"
            else -> date.format(DateTimeFormatter.ofPattern("EEEE")) // Chuyển đổi ngày thành thứ trong tuần
        }
    }

    fun convertMillisToHoursMinutes(milliseconds: Long): String {
        val hours = (milliseconds / (1000 * 60 * 60)).toInt()
        val minutes = ((milliseconds % (1000 * 60 * 60)) / (1000 * 60)).toInt()

        val hoursStr = if (hours < 10) "0$hours" else "$hours"
        val minutesStr = if (minutes < 10) "0$minutes" else "$minutes"

        return "$hoursStr:$minutesStr"
    }

    fun convertRainPercent(pop: Double): String {
        val popPersent = roundNumber(pop * 100.0)
        return "${popPersent} %"
    }
    ////////////////////////////////////////////////////

    /** Trả về tên thiết bị  */
    fun getDeviceName(): String {
        return Build.MANUFACTURER + " - " + Build.MODEL
    }

    fun getLocalIpAddress(): String? {
        try {
            val interfaces: List<NetworkInterface> =
                Collections.list(NetworkInterface.getNetworkInterfaces())
            for (into in interfaces) {
                val addresses = into.inetAddresses
                for (address in addresses) {
                    if (!address.isLoopbackAddress) {
                        val ip = address.hostAddress
                        if (ip.contains(":")) // Kiểm tra xem địa chỉ IP có chứa dấu hai chấm (:) không (IPv6)
                            continue
                        return ip
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }


    fun setFileToStorageDir(fileName: String): File {
        return File(
            Environment.getExternalStorageDirectory(),
            Environment.DIRECTORY_DOWNLOADS + File.separator + AppConstants.FOLDER_APP + File.separator + fileName.replace(
                "%20",
                ""
            )
        )
    }

    fun fromHtml(string: String): Spanned {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(string, Html.FROM_HTML_MODE_LEGACY)
        } else {
            Html.fromHtml(string)
        }
    }

    fun getDecimalFormattedString(value: BigDecimal): String {
        val formatter = DecimalFormat("#,###.##", DecimalFormatSymbols(Locale.US))
        return formatter.format(value)
    }

    fun getMoneyFormatted(value: BigDecimal): String {
        val formatter = DecimalFormat("#,###", DecimalFormatSymbols(Locale.US))
        return formatter.format(value)
    }

    fun getDecimalFormattedString(value: String): String {
        var value = value
        if (value.contains("-")) {
            value = value.substring(1)
            val lst = StringTokenizer(value, ".")
            var str1 = value
            var str2 = ""
            if (lst.countTokens() > 1) {
                str1 = lst.nextToken()
                str2 = lst.nextToken()
            }
            var str3 = StringBuilder()
            var i = 0
            var j = -1 + str1.length
            if (str1[-1 + str1.length] == '.') {
                j--
                str3 = StringBuilder(".")
            }
            var k = j
            while (true) {
                if (k < 0) {
                    if (str2.length > 0) {
                        str3.append(".").append(str2)
                    }
                    return String.format("-%s", str3)
                }
                if (i == 3) {
                    str3.insert(0, ",")
                    i = 0
                }
                str3.insert(0, str1[k])
                i++
                k--
            }
        } else {
            val lst = StringTokenizer(value, ".")
            var str1 = value
            var str2 = ""
            if (lst.countTokens() > 1) {
                str1 = lst.nextToken()
                str2 = lst.nextToken()
            }
            var str3 = StringBuilder()
            var i = 0
            var j = -1 + str1.length
            if (str1[-1 + str1.length] == '.') {
                j--
                str3 = StringBuilder(".")
            }
            var k = j
            while (true) {
                if (k < 0) {
                    if (str2.length > 0) {
                        str3.append(".").append(str2)
                    }
                    return str3.toString()
                }
                if (i == 3) {
                    str3.insert(0, ",")
                    i = 0
                }
                str3.insert(0, str1[k])
                i++
                k--
            }
        }
    }


    fun roundDouble(numberF: Double?, roundTo: Int): Double {
        val mF: Double
        val num = java.lang.StringBuilder("#########.")
        for (count in 0 until roundTo) {
            num.append("0")
        }
        val df = DecimalFormat(num.toString())
        df.roundingMode = RoundingMode.HALF_UP
        val mS = df.format(numberF).replace(",", ".")
        mF = mS.toDouble()
        return mF
    }

    fun initRecyclerView(view: RecyclerView, adapter: RecyclerView.Adapter<*>?) {
        configRecyclerView(
            view,
            LinearLayoutManager(view.context, RecyclerView.VERTICAL, false)
        )
        view.adapter = adapter
    }

    fun configRecyclerView(
        recyclerView: RecyclerView, layoutManager: RecyclerView.LayoutManager?,
    ) {
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        recyclerView.itemAnimator = DefaultItemAnimator()
        (recyclerView.itemAnimator)!!.changeDuration = 0
        ((recyclerView.itemAnimator) as SimpleItemAnimator).supportsChangeAnimations =
            false
        recyclerView.isNestedScrollingEnabled = false
    }

    fun initRecyclerViewVertical(view: RecyclerView, adapter: RecyclerView.Adapter<*>?) {
        configRecyclerView(
            view, PreCachingLayoutManager(
                view.context, RecyclerView.VERTICAL, false
            )
        )
        view.adapter = adapter
    }

    fun initRecyclerViewVerticalWithFlexBoxLayout(
        view: RecyclerView, adapter: RecyclerView.Adapter<*>?,
    ) {
        configRecyclerViewWithFlexBoxLayout(view, FlexboxLayoutManager(view.context))
        view.adapter = adapter
    }

    private fun configRecyclerViewWithFlexBoxLayout(
        recyclerView: RecyclerView, layoutManager: FlexboxLayoutManager?,
    ) {
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        recyclerView.itemAnimator = DefaultItemAnimator()
        (recyclerView.itemAnimator)!!.changeDuration = 0
        ((recyclerView.itemAnimator) as SimpleItemAnimator).supportsChangeAnimations = false
        recyclerView.isNestedScrollingEnabled = false
        layoutManager!!.flexWrap = com.google.android.flexbox.FlexWrap.WRAP
    }

    fun initRecyclerViewVertical(
        view: RecyclerView,
        adapter: RecyclerView.Adapter<*>?,
        count: Int,
    ) {
        configRecyclerView(view, GridLayoutManager(view.context, count))
        view.adapter = adapter
    }


    fun initRecyclerViewHorizontal(view: RecyclerView, adapter: RecyclerView.Adapter<*>?) {
        configRecyclerView(
            view, PreCachingLayoutManager(
                view.context, RecyclerView.HORIZONTAL, false
            )
        )
        view.adapter = adapter
    }

    fun initRecyclerViewHorizontal(
        view: RecyclerView,
        adapter: RecyclerView.Adapter<*>?,
        count: Int,
    ) {
        configRecyclerView(view, GridLayoutManager(view.context, count))
        view.adapter = adapter
    }

    fun initRecyclerViewReverse(view: RecyclerView, adapter: RecyclerView.Adapter<*>?) {
        val preCachingLayoutManager = CenterLayoutManager(
            view.context,
            RecyclerView.VERTICAL,
            true
        )
        configRecyclerView(view, preCachingLayoutManager)
        view.adapter = adapter
    }

    //format điểm đánh giá nhà hàng
    //ví dụ: 5.0 ---> 5, 5.1, 5.2 ---> 5.1/5.2
    fun formatDoubleToString(value: Double): String {
        val s: String = if (value.toInt().toDouble().compareTo(value) == 0) {
            java.lang.String.format(Locale.getDefault(), "%s", value.toInt())
        } else {
            java.lang.String.format(Locale.getDefault(), "%s", value)
        }
        return s
    }

    //Round double to 2 decimal
    fun roundOffDecimal(numInDouble: Double): Double {
        return BigDecimal(numInDouble.toString()).setScale(2, RoundingMode.HALF_UP).toDouble()
    }


    fun encodeBase64(string: String): String? {
        val data: ByteArray = string.toByteArray(StandardCharsets.UTF_8)
        return Base64.encodeToString(data, Base64.NO_WRAP or Base64.URL_SAFE)
    }

    @SuppressLint("HardwareIds")
    fun generateID(context: Context): String {
        val androidId =
            Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
        return if (androidId != null && androidId != "9774d56d682e549c") {
            androidId
        } else {
            UUID.randomUUID().toString()
        }
    }

    fun initRecyclerViewGrid(view: RecyclerView, adapter: RecyclerView.Adapter<*>?) {
        configRecyclerView(view, GridLayoutManager(AppApplication.instance?.applicationContext, 3))
        view.adapter = adapter
    }

    fun getTechresColorList(): List<Int> {
        return arrayListOf(
            Color.rgb(187, 0, 20),
            Color.rgb(255, 139, 0),
            Color.rgb(56, 192, 93),
            Color.rgb(102, 170, 214),
            Color.rgb(0, 98, 5),
            Color.rgb(0, 113, 187),
            Color.rgb(217, 80, 138),
            Color.rgb(254, 149, 7),
            Color.rgb(254, 247, 120),
            Color.rgb(106, 167, 134),
            Color.rgb(53, 194, 209),
            Color.rgb(193, 37, 82),
            Color.rgb(255, 102, 0),
            Color.rgb(245, 199, 0),
            Color.rgb(106, 150, 31),
            Color.rgb(179, 100, 53),
            Color.rgb(207, 248, 246),
            Color.rgb(148, 212, 212),
            Color.rgb(136, 180, 187),
            Color.rgb(118, 174, 175),
            Color.rgb(42, 109, 130)
        )
    }

    var EMOJI_FILTER =
        InputFilter { source, start, end, _, _, _ ->
            for (index in start until end) {
                val type = Character.getType(source[index])
                if (type == Character.SURROGATE.toInt() || type == Character.OTHER_SYMBOL.toInt()) {
                    return@InputFilter ""
                }
            }
            null
        }

    val specialCharacters = InputFilter { source, start, end, _, _, _ ->
        for (i in start until end) {
            if (source[i].toString() == " " || source[i].toString() == "," || source[i].toString() == "." || source[i].toString() == "\n") {
                // Do nothing
            } else if (!Character.isLetterOrDigit(source[i])) {
                return@InputFilter ""
            }
        }
        null
    }


    fun getCompleteAddressString(context: Context, latitude: Double, longitude: Double): String {
        var strAdd = ""
        val geocoder = Geocoder(context, Locale.getDefault())
        try {
            @Suppress("DEPRECATION")
            val addresses = geocoder.getFromLocation(latitude, longitude, 1)
            if (!addresses.isNullOrEmpty()) {
                val returnedAddress: Address = addresses[0]
                val strReturnedAddress = StringBuilder("")
                for (i in 0..returnedAddress.maxAddressLineIndex) {
                    strReturnedAddress.append(returnedAddress.getAddressLine(i)).append("\n")
                }
                strAdd = strReturnedAddress.toString()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return strAdd
    }


    fun bitmapDescriptorFromVector(context: Context, vectorResId: Int): BitmapDescriptor {
        val vectorDrawable: Drawable = ContextCompat.getDrawable(context, vectorResId)!!
        vectorDrawable.setBounds(
            0,
            0,
            vectorDrawable.intrinsicWidth,
            vectorDrawable.intrinsicHeight
        )
        val bitmap = Bitmap.createBitmap(
            vectorDrawable.intrinsicWidth,
            vectorDrawable.intrinsicHeight,
            Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(bitmap)
        vectorDrawable.draw(canvas)
        return BitmapDescriptorFactory.fromBitmap(bitmap)
    }


    fun calculateTotalPage(totalRecord: Int, limit: Int): Int {
        return if (totalRecord % limit == 0) {
            (totalRecord / limit)
        } else {
            (totalRecord / limit) + 1
        }
    }

    fun View.show() {
        visibility = View.VISIBLE
    }

    fun View.hide() {
        visibility = View.GONE
    }

    fun View.invisible() {
        visibility = View.INVISIBLE
    }

    fun formatTwoInt(number: Int): String {
        return if (number <= 0) "00" else if (number < 10) "0$number" else number.toString()
    }

    @SuppressLint("ClickableViewAccessibility")
    fun AppEditText.enableScrollText() {
        overScrollMode = View.OVER_SCROLL_ALWAYS
        scrollBarStyle = View.SCROLLBARS_INSIDE_INSET
        isVerticalScrollBarEnabled = true
        setOnTouchListener { _, event ->
            if (!text.isNullOrEmpty()) {
                parent.requestDisallowInterceptTouchEvent(true)
                when (event.action and MotionEvent.ACTION_MASK) {
                    MotionEvent.ACTION_UP -> parent.requestDisallowInterceptTouchEvent(false)
                }
            }
            false
        }
    }

    fun View.clickWithDebounce(debounceTime: Long = 1000L, action: () -> Unit) {
        this.setOnClickListener(object : View.OnClickListener {
            private var lastClickTime: Long = 0

            override fun onClick(v: View) {
                if (SystemClock.elapsedRealtime() - lastClickTime < debounceTime) return
                else action()
                lastClickTime = SystemClock.elapsedRealtime()
            }
        })
    }

    fun checkMimeTypeVideo(type: Int): Boolean {
        return type == 1
    }

    fun getMimeType(url: String): String {
        try {
            return url.substring(url.lastIndexOf(".") + 1)
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
        return ""
    }

    fun getRandomString(len: Int): String {
        val AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
        val rnd = SecureRandom()
        val sb = java.lang.StringBuilder(len)
        for (i in 0 until len) sb.append(AB[rnd.nextInt(AB.length)])
        return sb.toString()
    }

    fun roundNumber(number: Double): Long {
        val roundedNumber = if (number - number.toLong() >= 0.5) {
            // Nếu phần thập phân lớn hơn hoặc bằng 0.5, làm tròn lên 1
            number.toLong() + 1
        } else {
            // Ngược lại, giữ nguyên phần nguyên
            number.toLong()
        }
        return roundedNumber
    }

    fun roundBigDecimal(number: BigDecimal): BigDecimal {
        val roundedNumber =
            if (number.subtract(number.toBigInteger().toBigDecimal()) >= BigDecimal("0.5")) {
                // Nếu phần thập phân lớn hơn hoặc bằng 0.5, làm tròn lên 1
                number.toBigInteger().toBigDecimal().add(BigDecimal.ONE)
            } else {
                // Ngược lại, giữ nguyên phần nguyên
                number.toBigInteger().toBigDecimal()
            }
        return roundedNumber
    }

    fun getNameFileFormatTime(path: String): String {
        return String.format(
            "%s.%s",
            System.currentTimeMillis()
                .toString() + getRandomString(24),
            getMimeType(path)
        )
    }


    fun getVideo(url: String, context: Context): String? {
        var link: String? = ""
        val a: Int
        val b: Int
        if (url.contains(context.getString(vn.techres.android.weather.R.string.link_youtube_1))) {
            a = url.indexOf(".be/")
            link = url.substring(a + 4)
        } else if (url.contains(context.getString(vn.techres.android.weather.R.string.link_youtube_4))) {
            a = url.indexOf("?v=")
            if (url.contains("&")) {
                b = url.indexOf("&")
                link = url.substring(a + 3, b)
            } else link = url.substring(a + 3)
        } else if (url.contains(context.getString(vn.techres.android.weather.R.string.link_youtube_3))) {
            a = url.indexOf("?")
            b = url.indexOf("shorts/")
            link = url.substring(b + 7, a)
        }
        Timber.d("load link id : ")
        Timber.d(link)
        return link
    }

    fun generateQRCode(idGroup: String): Bitmap? {
        return try {
            val result: BitMatrix = QRCodeWriter().encode(
                String.format(
                    "%s",
                    idGroup
                ), BarcodeFormat.QR_CODE, 1024, 1024
            )
            val bitmap: Bitmap = Bitmap.createBitmap(
                result.width,
                result.height,
                Bitmap.Config.ARGB_8888
            )
            for (y in 0 until result.height) {
                for (x in 0 until result.width) {
                    if (result.get(x, y)) {
                        bitmap.setPixel(x, y, Color.BLACK)
                    }
                }
            }
            bitmap
        } catch (e: WriterException) {
            Bitmap.createBitmap(1024, 1024, Bitmap.Config.ARGB_8888)
        }
    }

    fun removeVietnameseFromString(str: String): String {
        val slug: String = try {
            val temp: String = Normalizer.normalize(str, Normalizer.Form.NFD)
            val pattern: Pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+")
            pattern.matcher(temp).replaceAll("")
        } catch (e: Exception) {
            e.printStackTrace()
            ""
        }
        return slug
    }

    fun getFirstLetterEachWord(string: String): String {
        var result = ""
        val stringText = string.split(" ")
        for (i in stringText.indices) {
            if (stringText[i].isNotEmpty()) { // Kiểm tra độ dài của chuỗi
                result += stringText[i].substring(0, 1).lowercase()
            }
        }
        return result
    }
    fun subAddress(address:String):String{
        val secondCommaIndex = address.indexOf(',', address.indexOf(',') + 1)
        var substringAfterSecondComma =""
        if (secondCommaIndex != -1) {
            substringAfterSecondComma = address.substring(0, secondCommaIndex)
        } else {
            //
        }
        return substringAfterSecondComma
    }


}

