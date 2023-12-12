package vn.techres.android.weather.home.ui.drawcanvas
import android.annotation.SuppressLint
import android.content.Context
import android.graphics.*
import android.graphics.drawable.Drawable
import android.os.Handler
import android.os.Message
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import vn.techres.android.weather.R
import vn.techres.android.weather.constants.AppConstants
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs


class ChartWeather @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : View(context, attrs) {
    companion object{
        private const val DAY_NUM = 5
        private const val PART = 3
        private const val DIVIDE_MARGIN = 10
        private const val PART_MARGIN = 25
        private const val TEMPERATURE_LINE_WIDTH = 2
        private const val TEXT_MARGIN = 6
        private const val TEXT_SIZE = 12.5f
        private const val DIVIDE_WIDTH = 2
        private const val POINT_RADIUS = 2.5f
        private const val MIN_LINE_COLOR = Color.BLACK
        private const val DEGREE = "°"
        private const val TEXT_COLOR = Color.BLACK
        private const val ICON_SPACING  = 20
        private const val ICON_SIZE = 40

    }


    private  val temMax = IntArray(DAY_NUM)
    private val temMin = IntArray(DAY_NUM)
    private val weatherIcon = ArrayList<String?>()
    private val time = arrayOfNulls<String>(DAY_NUM)
    private var mHeight = 0
    private var mWidth = 0
    private var mTextPaint: Paint? = null


    private var maxInMax = 0
    private var minInMax = 0
    private var maxInMin = 0
    private var minInMin = 0
    private var diffInMax = 0
    private var diffInMin = 0
    private var partHeight = 0
    private var dayWidth = 0
    private var firstPointX = 0
    private var diffInMaxHeight = 0
    private var diffInMinHeight = 0
    private var mDayDividePaint: Paint? = null
    private val DIVIDE_COLOR = Color.parseColor("#ff4242")
    private var mPointPaint: Paint? = null
    private val POINT_COLOR = Color.BLACK
    private var mMaxLinePaint: Paint? = null
    private val MAX_LINE_COLOR = Color.BLACK
    private var mMinLintPaint: Paint? = null
    private var animFlag = 0

    init {
        initPaint()
    }

    private fun initPaint() {
        mTextPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        mTextPaint!!.textSize = TEXT_SIZE
        mTextPaint!!.color = TEXT_COLOR
        mDayDividePaint = Paint(Paint.ANTI_ALIAS_FLAG)
        mDayDividePaint!!.strokeWidth = DIVIDE_WIDTH.toFloat()
        mDayDividePaint!!.color = DIVIDE_COLOR
        mPointPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        mPointPaint!!.color = POINT_COLOR
        mPointPaint!!.style = Paint.Style.FILL
        mMaxLinePaint = Paint(Paint.ANTI_ALIAS_FLAG)
        mMaxLinePaint!!.color = MAX_LINE_COLOR
        mMaxLinePaint!!.style = Paint.Style.STROKE
        mMaxLinePaint!!.strokeWidth = TEMPERATURE_LINE_WIDTH.toFloat()
        mMinLintPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        mMinLintPaint!!.color = MIN_LINE_COLOR
        mMinLintPaint!!.style = Paint.Style.STROKE
        mMinLintPaint!!.strokeWidth = TEMPERATURE_LINE_WIDTH.toFloat()
    }

    private fun computer() {
        val currentTime = Calendar.getInstance()
        val currentHour = currentTime.get(Calendar.HOUR_OF_DAY)

        maxInMax = getMax(temMax)
        minInMax = getMin(temMax)
        maxInMin = getMax(temMin)
        minInMin = getMin(temMin)
        diffInMax = maxInMax - minInMax
        diffInMin = maxInMin - minInMin
        diffInMaxHeight = if (diffInMax == 0) 0 else (partHeight - PART_MARGIN * 2) / diffInMax
        diffInMinHeight = if (diffInMin == 0) 0 else (partHeight - PART_MARGIN * 2) / diffInMin

        val calendar = Calendar.getInstance()
        for (i in 0 until DAY_NUM) {
            calendar.set(Calendar.HOUR_OF_DAY, currentHour + i)

            if (i == 0) {
                time[i] = resources.getString(R.string.today)
                continue
            }
            val formattedTime = SimpleDateFormat(AppConstants.FORMAT_HOURS, Locale.getDefault()).format(calendar.time)
            time[i] = if (i == 1) {
                if (currentHour == 23) {
                    "00:00"
                } else {
                    formattedTime
                }
            } else {
                formattedTime
            }
        }
    }


    private fun getMin(m: IntArray): Int {
        var tmp = m[0]
        for (i in m) {
            tmp = if (tmp < i) tmp else i
        }
        return tmp
    }

    private fun getMax(m: IntArray): Int {
        var tmp = m[0]
        for (i in m) {
            tmp = if (tmp > i) tmp else i
        }
        return tmp
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        mHeight = h
        mWidth = w
        partHeight = mHeight / PART
        dayWidth = mWidth / DAY_NUM
        firstPointX = dayWidth / 2
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(resources.getColor(R.color.transparent))
        computer()
        drawDayDivide(canvas, animFlag)
        drawPointAndTemperatureLine(canvas, animFlag)
        drawWeatherIconAndText(canvas, animFlag)
    }

    fun startAnimation() {
        animFlag = 0
        handler.sendEmptyMessage(0)
    }

    fun cleanAnimation() {
        handler.removeMessages(0)
        animFlag = 0
        postInvalidate()
    }

    private val handler: Handler = @SuppressLint("HandlerLeak")
    object : Handler() {
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
            if (animFlag < DAY_NUM) {
                postInvalidate()
                animFlag++
                sendEmptyMessageDelayed(0, 50)
            }
        }
    }

    private fun drawWeatherIconAndText(canvas: Canvas, flag: Int) {
        for (i in 0 until flag) {
            if (weatherIcon[i].isNullOrEmpty()) {
                continue
            }
            val iconUrl = weatherIcon[i]!!
            val x = calculateXPositionForIcon(i)
            val y = calculateYPositionForIcon()

            loadImage(iconUrl) { iconBitmap ->
                iconBitmap?.let {
                    val scaledIcon = scaleBitmap(iconBitmap, (ICON_SIZE / it.height).toFloat())
                    canvas.drawBitmap(scaledIcon!!, x, y, null)
                }
            }

            val text = time[i] ?: ""
            val textX = x + (ICON_SIZE - mTextPaint!!.measureText(text)) / 2
            val textY = y + ICON_SIZE + TEXT_MARGIN
            canvas.drawText(text, textX, textY, mTextPaint!!)
        }
    }


    private fun drawPointAndTemperatureLine(canvas: Canvas, flag: Int) {
        val maxPath = Path()
        val minPath = Path()

        for (i in 0 until flag) {
            val x = firstPointX + dayWidth * i
            val yMax = if (diffInMax == 0) partHeight / 2 else (abs(temMax[i] - maxInMax) * diffInMaxHeight) + PART_MARGIN
            val yMin = if (diffInMin == 0) partHeight / 2 + partHeight else (abs(temMin[i] - maxInMin) * diffInMinHeight) + PART_MARGIN + partHeight

            // Vẽ điểm và văn bản cho nhiệt độ Max
            canvas.drawCircle(x.toFloat(), yMax.toFloat(), POINT_RADIUS.toFloat(), mPointPaint!!)
            val tempMax = "${temMax[i]}$DEGREE"
            canvas.drawText(
                tempMax,
                x - mTextPaint!!.measureText(tempMax) / 2,
                (yMax - TEXT_MARGIN).toFloat(),
                mTextPaint!!
            )

            // Vẽ điểm và văn bản cho nhiệt độ Min
            canvas.drawCircle(x.toFloat(), yMin.toFloat(), POINT_RADIUS.toFloat(), mPointPaint!!)
            val tempMin = "${temMin[i]}$DEGREE"
            canvas.drawText(
                tempMin,
                x - mTextPaint!!.measureText(tempMin) / 2,
                (yMin - TEXT_MARGIN).toFloat(),
                mTextPaint!!
            )

            // Vẽ đường dẫn cho nhiệt độ Max và Min
            if (i == 0) {
                maxPath.moveTo(x.toFloat(), yMax.toFloat())
                minPath.moveTo(x.toFloat(), yMin.toFloat())
            } else {
                maxPath.lineTo(x.toFloat(), yMax.toFloat())
                minPath.lineTo(x.toFloat(), yMin.toFloat())
            }
        }

        // Vẽ đường dẫn cho nhiệt độ Max và Min
        canvas.drawPath(maxPath, mMaxLinePaint!!)
        canvas.drawPath(minPath, mMinLintPaint!!)
    }


    private fun calculateXPositionForIcon(index: Int): Float {
        val availableWidth = mWidth - paddingLeft - paddingRight
        val iconWidth = weatherIcon.size * (ICON_SIZE + ICON_SPACING)
        val sidePadding = (availableWidth - iconWidth) / 2
        return sidePadding + index * (ICON_SIZE + ICON_SPACING).toFloat()
    }

    private fun calculateYPositionForIcon(): Float {
        val availableHeight = mHeight - paddingTop - paddingBottom
        val topPadding = paddingTop
        val bottomPadding = paddingBottom
        val iconHeight = ICON_SIZE
        val iconCount = weatherIcon.size
        return topPadding + (availableHeight - topPadding - bottomPadding - (iconCount * iconHeight)) / 2.toFloat()
    }

    private fun loadImage(url: String, callback: (Bitmap?) -> Unit) {//lỗi xử lý ảnh
        val urlImage = "https://openweathermap.org/img/wn/$url.png"
        Glide.with(this)
            .asBitmap()
            .load(urlImage)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.ic_default)
                    .error(R.drawable.ic_default)
            )
            .centerCrop()
            .into(object : CustomTarget<Bitmap>() {
                override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                    try {
                        callback(resource) // Gọi callback khi tải thành công
                    } catch (e: Exception) {
                        // Xử lý hoặc ghi log khi có lỗi xảy ra trong quá trình callback
                        Log.e("LoadImageCallback", "Error calling callback: ${e.message}")
                    }
                }

                override fun onLoadCleared(placeholder: Drawable?) {
                    // Do nothing
                }
            })
    }

    private fun scaleBitmap(origin: Bitmap?, ratio: Float): Bitmap? {
        if (origin == null) {
            return null
        }
        val width = origin.width
        val height = origin.height
        val matrix = Matrix()
        matrix.preScale(ratio, ratio)
        val newBM = Bitmap.createBitmap(origin, 0, 0, width, height, matrix, false)
        return if (newBM == origin) {
            newBM
        } else newBM
    }

    private fun drawDayDivide(canvas: Canvas, flag: Int) {
        for (i in 1 until flag) {
            canvas.drawLine(
                (i * dayWidth).toFloat(),
                DIVIDE_MARGIN.toFloat(),
                (i * dayWidth).toFloat(),
                (mHeight - DIVIDE_MARGIN).toFloat(),
                mDayDividePaint!!
            )
        }
    }

    fun setTemperatureAndIcon(
        max: ArrayList<Int>,
        min: ArrayList<Int>,
        icon: ArrayList<String>,
    ) {
        for (i in 0 until DAY_NUM) {
            temMax[i] = max[i]
            temMin[i] = min[i]
            val iconUrl = icon[i]
            weatherIcon.add(iconUrl)
        }
        invalidate()
    }

}

