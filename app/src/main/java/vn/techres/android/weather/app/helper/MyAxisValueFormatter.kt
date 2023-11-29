package vn.techres.android.weather.app.helper

import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.formatter.IAxisValueFormatter
import vn.techres.android.weather.utils.AppUtils

class MyAxisValueFormatter : IAxisValueFormatter {
    var s: String? = null

    override fun getFormattedValue(value: Float, axis: AxisBase?): String {
        return AppUtils.getDecimalFormattedString(value.toLong().toString())
    }


}