package vn.techres.android.weather.other

import android.annotation.SuppressLint
import android.content.Context
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.github.mikephil.charting.components.MarkerView
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.highlight.Highlight
import com.github.mikephil.charting.utils.MPPointF
import vn.techres.android.weather.R
import vn.techres.android.weather.utils.AppUtils

/**
 * @Author: NGUYEN HOANG HUY
 * @Date: 4/29/2023
 */
class CustomLineMarkerView(
    context: Context,
    layoutResource: Int

) :
    MarkerView(context, layoutResource) {
    private val tvContent: TextView = findViewById(R.id.tvContent)
    private val rlTag: RelativeLayout = findViewById(R.id.tvBgTag)

    @SuppressLint("SetTextI18n", "DefaultLocale")
    override fun refreshContent(e: Entry, highlight: Highlight) {
        tvContent.text = AppUtils.getMoneyFormatted(
            e.y.toLong().toBigDecimal()
        )
        // set the entry-value as the display text

        super.refreshContent(e, highlight)
    }

    override fun getOffset(): MPPointF {
        return MPPointF(
            -(width / 2).toFloat(),
            -height.toFloat()
        )
    }

    init {
        rlTag.background =
            ContextCompat.getDrawable(
                context, R.drawable.bg_blue_transparent
            )

    }
}