package vn.techres.android.weather.app.helper

import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.formatter.IValueFormatter
import com.github.mikephil.charting.formatter.ValueFormatter
import com.github.mikephil.charting.utils.ViewPortHandler
import vn.techres.android.weather.utils.AppUtils

open class MyValueFormatter : ValueFormatter() {
    override fun getFormattedValue(
        value: Float,
        entry: Entry?,
        dataSetIndex: Int,
        viewPortHandler: ViewPortHandler?
    ): String? {
        return AppUtils.getDecimalFormattedString(value.toLong().toString())
    }

    override fun getFormattedValue(value: Float): String {

        return AppUtils.getDecimalFormattedString(value.toLong().toString())
    }
}