package vn.techres.android.weather.app.helper

import android.view.View
import androidx.viewpager2.widget.ViewPager2
import kotlin.math.abs

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/7/2023.
 */
class FadePageTransformerViewPage2: ViewPager2.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        val absPosition = abs(position)
        page.alpha = 1 - absPosition
    }
}