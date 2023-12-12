package vn.techres.android.weather.home.ui.drawcanvas

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 12/4/2023.
 */
class WinArrowView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var direction: Float = 0f // Hướng gió

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val width = width.toFloat()
        val height = height.toFloat()
        val centerX = width / 2
        val centerY = height / 2
        val radius = (width.coerceAtMost(height) / 2) - 20



        val textPaint = Paint().apply {
            textSize = 30f
            color = Color.RED
            textAlign = Paint.Align.CENTER
        }

        // Vẽ các điểm đánh dấu hướng
        canvas.drawText("N", centerX, centerY - radius, textPaint)
        canvas.drawText("S", centerX, centerY + radius, textPaint)
        canvas.drawText("W", centerX - radius, centerY, textPaint)
        canvas.drawText("E", centerX + radius, centerY, textPaint)

        // Vẽ mũi tên chỉ hướng gió
        val arrowPaint = Paint().apply {
            style = Paint.Style.FILL
            color = Color.RED // Màu của mũi tên
            isAntiAlias = true
        }

        val arrowPath = Path()
        val arrowLength = radius - 30 // Độ dài của mũi tên

        arrowPath.moveTo(centerX, centerY - arrowLength)
        arrowPath.lineTo(centerX - 15f, centerY)
        arrowPath.lineTo(centerX + 15f, centerY)
        arrowPath.close()

        canvas.rotate(direction, centerX, centerY)
        canvas.drawPath(arrowPath, arrowPaint)
    }

    // Hàm để vẽ các điểm đánh dấu hướng
    private fun drawDirectionMarker(canvas: Canvas, paint: Paint, x: Float, y: Float, text: String) {
        canvas.drawCircle(x, y, 10f, paint)
        canvas.drawText(text, x, y - 20, paint)
    }

    // Hàm để cập nhật hướng gió
    fun updateDirection(direction: Float) {
        this.direction = direction
        invalidate()
    }
}

