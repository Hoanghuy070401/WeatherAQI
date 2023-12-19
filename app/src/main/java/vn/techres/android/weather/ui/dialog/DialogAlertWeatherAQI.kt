import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.view.Gravity
import android.view.LayoutInflater
import vn.techres.android.weather.databinding.DialogNotificationBinding
import vn.techres.android.weather.model.entity.modelAirWeather.ListAir
import vn.techres.android.weather.model.entity.modelAirWeather.WeatherNow
import vn.techres.android.weather.utils.AppUtils
import vn.techres.android.weather.utils.PhotoShowUtils
import vn.techres.base.BaseDialog
import vn.techres.base.action.AnimAction

class DialogAlertWeatherAQI {
    @SuppressLint("SuspiciousIndentation")
    class Builder constructor(
        context: Context,
        listWeather: WeatherNow,
        listAQI: ListAir
    ) :
        BaseDialog.Builder<Builder>(context) {

        private var binding: DialogNotificationBinding =
            DialogNotificationBinding.inflate(LayoutInflater.from(context))
        private var onActionDone: OnActionDone? = null

        fun onActionDone(onActionDone: OnActionDone): Builder = apply {
            this.onActionDone = onActionDone
        }

        init {
            setAnimStyle(AnimAction.ANIM_SCALE)
            setGravity(Gravity.CENTER)
            setContentView(binding.root)
            setWidth(Resources.getSystem().displayMetrics.widthPixels * 5 / 6)

            // Thiết lập thông tin thời tiết và chất lượng không khí
            binding.tvWeather.text = AppUtils.checkWeather(listWeather)
            val aQI = mapOf(
                "PM2.5" to listAQI.components.pm25,
                "PM10" to listAQI.components.pm10,
                "CO" to listAQI.components.co,
                "O3" to listAQI.components.o3,
                "SO2" to listAQI.components.so2,
                "NO2" to listAQI.components.no2
            )
            AppUtils.checkImageAQi(binding.imvAQI, listAQI.main.AQI)
            binding.tvAQI.text = AppUtils.chatGayOnhiem(aQI)
            PhotoShowUtils.loadImage(listWeather.weather[0].icon,binding.imvWeather)
            AppUtils.checkWeatherItem(listWeather.weather[0].id,binding.llStyleWeather,context)

            onActionDone?.onActionDone()
        }

        interface OnActionDone {
            fun onActionDone()
        }
    }
}
