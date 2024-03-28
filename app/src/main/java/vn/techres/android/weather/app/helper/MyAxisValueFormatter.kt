package vn.techres.android.weather.app.helper

import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.formatter.ValueFormatter
import vn.techres.android.weather.utils.AppUtils

 open class MyAxisValueFormatter : ValueFormatter() {
    var s: String? = null

    override fun getFormattedValue(value: Float, axis: AxisBase?): String {
        return AppUtils.getDecimalFormattedString(value.toLong().toString())
    }

    override fun getFormattedValue(value: Float): String {
        return AppUtils.getDecimalFormattedString(value.toLong().toString())
    }


}