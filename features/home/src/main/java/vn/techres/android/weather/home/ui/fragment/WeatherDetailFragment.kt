package vn.techres.android.weather.home.ui.fragment

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.View
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.ValueFormatter
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import com.github.mikephil.charting.utils.ColorTemplate
import com.github.tianma8023.formatter.SunriseSunsetLabelFormatter
import com.github.tianma8023.model.Time
import com.google.gson.GsonBuilder
import com.hjq.http.EasyHttp
import com.hjq.http.listener.HttpCallback
import org.greenrobot.eventbus.Subscribe
import timber.log.Timber
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppFragment
import vn.techres.android.weather.app.helper.MyAxisValueFormatter
import vn.techres.android.weather.app.helper.MyValueFormatter
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.home.databinding.LayoutDataWeatherBinding
import vn.techres.android.weather.home.ui.activity.WeatherDayMoreActivity
import vn.techres.android.weather.home.ui.adapter.DynamicViewPagerAdapter
import vn.techres.android.weather.home.ui.adapter.ListDaysSevenAdapter
import vn.techres.android.weather.ui.adapter.ListHoursWeatherAirAdapter
import vn.techres.android.weather.home.ui.fragment.WeatherFragment.Companion.activityViewPagerAdapter
import vn.techres.android.weather.http.api.CurrentAirApi
import vn.techres.android.weather.http.api.CurrentWeatherApi
import vn.techres.android.weather.http.api.GetListAirHours
import vn.techres.android.weather.http.api.GetListWeatherHours
import vn.techres.android.weather.http.api.GetWeatherDaysApi
import vn.techres.android.weather.model.entity.AddressCity
import vn.techres.android.weather.model.entity.modelAirWeather.AirNow
import vn.techres.android.weather.model.entity.modelAirWeather.ListAir
import vn.techres.android.weather.model.entity.modelAirWeather.ListAirWeatherHours
import vn.techres.android.weather.model.entity.modelAirWeather.WeatherNow
import vn.techres.android.weather.model.entity.modelWeatherDays.List
import vn.techres.android.weather.model.entity.modelWeatherDays.WeatherDays
import vn.techres.android.weather.model.eventbus.UpdateDataEventBus
import vn.techres.android.weather.model.titles
import vn.techres.android.weather.other.CustomLineMarkerView
import vn.techres.android.weather.ui.activity.HomeActivity
import vn.techres.android.weather.utils.AppUtils
import vn.techres.android.weather.utils.AppUtils.checkWeather
import vn.techres.android.weather.utils.AppUtils.hide
import vn.techres.android.weather.utils.AppUtils.show
import vn.techres.android.weather.utils.TypeFaceUtils

/*** @author:Nguyễn Hoàng Huy* @date: 11/6/2023.*/
class WeatherDetailFragment : AppFragment<HomeActivity>() {
    private var fragmentViewPagerAdapter: DynamicViewPagerAdapter? = null
    private var titleToDisplay = titles[0]
    private var listDaysWeather = ArrayList<List>()
    private var listHoursWeather = ArrayList<List>()
    private var listHoursAir = ArrayList<ListAir>()
    private var listHoursAirWeather = ArrayList<ListAirWeatherHours>()
    private lateinit var adapterWeatherDays: ListDaysSevenAdapter
    private lateinit var adapterWeatherAirHours: ListHoursWeatherAirAdapter
    private var listAir=ArrayList<ListAir>()
    private var weatherNow= ArrayList<WeatherNow>()
    private var isListAir=0

    companion object {
        fun getInstance(titleId: Int): WeatherDetailFragment {
            val thisDynamicFragment = WeatherDetailFragment()
            val titleToDisplay =
                titles[titleId]
            Timber.tag("title1").e(titles[titleId].nameCity)
            thisDynamicFragment.titleToDisplay = titleToDisplay
            return thisDynamicFragment
        }
    }

    private lateinit var binding: LayoutDataWeatherBinding
    override fun getLayoutView(): View {
        binding = LayoutDataWeatherBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun initData() {
        fragmentViewPagerAdapter = activityViewPagerAdapter
        setupView()
        if (titleToDisplay.lat == 0.0 && titleToDisplay.lon == 0.0) {
            binding.ilWeatherNow.tvTemperatureDayNow.text =
                getString(R.string.zero) + getString(R.string.oC)
            binding.ilWeatherNow.tvNameLocation.text = titleToDisplay.nameCity
        } else {
            setData(titleToDisplay)
        }

    }

    private fun setData(address: AddressCity) {
        setupData(address.nameCity, address.lat, address.lon)
    }

    private fun setupView() {
        adapterWeatherAirHours =
            ListHoursWeatherAirAdapter(requireActivity())
        adapterWeatherAirHours.setData(listHoursAirWeather)
        AppUtils.initRecyclerViewHorizontal(
            binding.ilWeatherAirHours.rcvListWeatherHours,
            adapterWeatherAirHours
        )
        adapterWeatherDays = ListDaysSevenAdapter(requireActivity())
        adapterWeatherDays.setData(listDaysWeather)
        AppUtils.initRecyclerViewVertical(
            binding.ilWeatherSevenDay.rcvListWeatherFiveDay,
            adapterWeatherDays
        )

        binding.ilWeatherOther.ssvSunrise.labelFormatter = object :
            SunriseSunsetLabelFormatter {
            override fun formatSunriseLabel(sunrise: Time): String {
                return ""
            }

            override fun formatSunsetLabel(sunset: Time): String {
                return ""
            }
        }
    }

    private fun setupData(name: String, lat: Double, lon: Double) {
        getDataWeather(
            name,
            lat,
            lon,
            AppUtils.returnUnits(2)
        )
        getDataAir(name,lat, lon)
        getDaysWeather(lat, lon, 3, AppUtils.returnUnits(2))
        getAirDataHours(lat, lon)
        binding.ilWeatherSevenDay.tvDayMore.clickWithDebounce(500) {
            val intent = Intent(requireContext(), WeatherDayMoreActivity::class.java)
            intent.putExtra(AppConstants.DETAILS_LOCATION_FIND_LAT,lat)
            intent.putExtra(AppConstants.DETAILS_LOCATION_FIND_LON,lon)
            intent.putExtra(AppConstants.DETAILS_LOCATION_FIND_NAME,name)
            startActivity(intent)
        }




    }
    fun checkAnimation(){
            if (listAir.isNotEmpty()&& weatherNow.isNotEmpty()){
                if (weatherNow[0].weather[0].id in 200..800 || listAir[0].main.AQI>3 || AppUtils.roundNumber(weatherNow[0].main.temp) !in 0..37 || AppUtils.roundNumber(weatherNow[0].wind.speed)>30 ){
                    if (isListAir==0){
                        checkWeatherAQI(weatherNow[0],listAir[0])
                        Timber.tag("listNotifine").e("${
                            GsonBuilder().setPrettyPrinting().create().toJson(weatherNow)
                        },${GsonBuilder().setPrettyPrinting().create().toJson(listAir)}")
                        isListAir++
                    }else{
                        //
                    }
                }
            }
    }

    private fun getDaysWeather(lat: Double, lon: Double, cnt: Int, units: String) {
        EasyHttp.get(this).api(GetWeatherDaysApi.param(lat, lon, cnt, units))
            .request(object : HttpCallback<WeatherDays>(this) {
                @SuppressLint("NotifyDataSetChanged", "SetTextI18n")
                override fun onSucceed(result: WeatherDays) {
                    listDaysWeather.clear()
                    if (result.cod == 200) {
                        listDaysWeather.addAll(result.list)
                        adapterWeatherDays.notifyDataSetChanged()
                        binding.ilWeatherOther.tvThereMayBeRain.text =
                            result.list[0].pop.toString() + getString(
                                R.string.persent
                            )
                    } else {
                        toast(getString(R.string.load_fail))
                    }
                }
            })
    }

    private fun getDataWeather(name: String, lat: Double, lon: Double, units: String) {
        EasyHttp.get(this).api(CurrentWeatherApi.param(lat, lon, units))
            .request(object : HttpCallback<WeatherNow>(this) {
                @SuppressLint("SetTextI18n")
                override fun onSucceed(result: WeatherNow) {
                    if (result.cod == 200) {
                        binding.ilWeatherNow.tvTemperatureDayNow.text =
                            AppUtils.roundBigDecimal(result.main.temp.toBigDecimal())
                                .toString()
                        binding.ilWeatherNow.tvUnitTemperatureDayNow.text = getString(R.string.oC)
                        binding.ilWeatherNow.tvNameLocation.text = name
                        checkWeather(
                            result.weather[0].id,
                            binding.rlBgStyle,
                            binding.weatherView,
                            requireContext(),binding.ilWeatherNow.ltWeather
                        )
                        val sunrise = AppUtils.getDayDetailsHours(result.sys.sunrise.toLong(), true)
                        val sunset = AppUtils.getDayDetailsHours(result.sys.sunset.toLong(), true)
                        binding.ilWeatherOther.ssvSunrise.sunriseTime = Time(
                            AppUtils.timeComponents(true, sunrise),
                            AppUtils.timeComponents(false, sunrise)
                        )
                        binding.ilWeatherOther.ssvSunrise.sunsetTime = Time(
                            AppUtils.timeComponents(true, sunset),
                            AppUtils.timeComponents(false, sunset)
                        )
                        binding.ilWeatherOther.ssvSunrise.startAnimate()
                        binding.ilWeatherNow.tvDeceptionWeather.text = result.weather[0].description
                        binding.ilWeatherNow.tvTemperatureDay.text =
                            AppUtils.roundBigDecimal(result.main.tempMax.toBigDecimal()).toString()
                        binding.ilWeatherNow.tvUnitTemperatureDay.text = getString(R.string.oC)
                        binding.ilWeatherNow.tvTemperatureNight.text =
                            AppUtils.roundBigDecimal(result.main.tempMin.toBigDecimal()).toString()
                        binding.ilWeatherNow.tvUnitTemperatureNight.text = getString(R.string.oC)
                        binding.ilWeatherOther.wavWeatherWin.updateDirection(result.wind.deg.toFloat())
                        binding.ilWeatherOther.tvWindDirection.text =
                            AppUtils.doiHuongGio(result.wind.deg.toInt())
                        binding.ilWeatherOther.tvSpeedsWin.text =
                            result.wind.speed.toString() + getString(R.string.ms)
                        binding.ilWeatherOther.tvHoursSunrise.text =
                            AppUtils.getDayDetailsHours(result.sys.sunrise.toLong(), true)
                        binding.ilWeatherOther.tvHoursSunset.text =
                            AppUtils.getDayDetailsHours(result.sys.sunset.toLong(), true)
                        binding.ilWeatherOther.tvHumidity.text =
                            result.main.humidity.toString() + getString(R.string.persent)
                        binding.ilWeatherOther.tvTemperatureFeeLike.text =
                            AppUtils.roundBigDecimal(result.main.tempMax.toBigDecimal())
                                .toString() + getString(R.string.oC)
                        binding.ilWeatherOther.tvPressure.text =
                            AppUtils.roundBigDecimal(result.main.pressure.toBigDecimal())
                                .toString() + getString(R.string.hPa)
                        binding.ilWeatherOther.tvCloudAll.text =
                            AppUtils.roundBigDecimal(result.clouds.all.toBigDecimal())
                                .toString() + getString(R.string.persent)
                        checkRainSnow(result)
                        weatherNow.add(result)
                    } else {
                        toast(getString(R.string.no_connect1))
                    }
                }
            })
    }
    private fun checkWeatherAQI(weatherNow: WeatherNow,aQI:ListAir){
        val confirmDialog = DialogAlertWeatherAQI.Builder(
            requireContext(),
            weatherNow,aQI
        )
        confirmDialog.onActionDone(object : DialogAlertWeatherAQI.Builder.OnActionDone {
            override fun onActionDone() {
                postDelayed({
                    confirmDialog.dismiss()
                },1000)
            }

        })
        confirmDialog.create().show()
    }

    private fun getDataAir(name:String,lat: Double, lon: Double) {
        EasyHttp.get(this).api(CurrentAirApi.param(lat, lon))
            .request(object : HttpCallback<AirNow>(this) {
                @SuppressLint("SuspiciousIndentation")
                override fun onSucceed(result: AirNow) {
                    val it = result.list[0].components
                    binding.ilWeatherNow.tvAQI.text =
                        AppUtils.calculateAQI_China(it.co, it.no2, it.o3, it.so2, it.pm25, it.pm10)
                            .toString()
                    AppUtils.checkImageAQi(binding.ilWeatherNow.imvAQI,result.list[0].main.AQI)
                    listAir.add(result.list[0])
                    if (name== titles[0].nameCity) {
                        checkAnimation()
                    }
                }

            })
    }

    private fun getAirDataHours(lat: Double, lon: Double) {
        EasyHttp.get(this).api(GetListAirHours.param(lat, lon))
            .request(object : HttpCallback<AirNow>(this) {
                override fun onSucceed(result: AirNow) {
                    val resultAir = result.list
                    EasyHttp.get(getAttachActivity())
                        .api(GetListWeatherHours.params(lat, lon, AppUtils.returnUnits(2)))
                        .request(object : HttpCallback<WeatherDays>(getAttachActivity()) {
                            @SuppressLint("NotifyDataSetChanged")
                            override fun onSucceed(result: WeatherDays) {
                                listHoursWeather.clear()
                                listHoursAir.clear()
                                listHoursAirWeather.clear()
                                if (result.cod == 200) {
                                    listHoursWeather.addAll(result.list)
                                    listHoursAir.addAll(resultAir)
                                    Timber.tag("listSize11").d(
                                        "${listHoursWeather.size},${listHoursAir.size}"
                                    ) // Giả sử cả hai danh sách có cùng kích thước và bạn muốn kết hợp chúng theo chỉ mục
                                    if (listHoursAir.size > 0 && listHoursWeather.size > 0) {
                                        for (i in 0 until 25) {
                                            val weather =
                                                listHoursWeather[i] // Nhận dữ liệu thời tiết tại chỉ mục i
                                            val air =
                                                listHoursAir[i] // Nhận dữ liệu không khí tại chỉ số i
                                            // Tạo một đối tượng mới kết hợp dữ liệu thời tiết và không khí
                                            val airWeather = ListAirWeatherHours(
                                                i.toLong(),
                                                air,
                                                weather
                                            ) // Thêm đối tượng kết hợp vào danh sách mới
                                            listHoursAirWeather.add(airWeather)
                                        }
                                        val numMapQuarter = HashMap<Int, String>()
                                        listHoursAirWeather.mapIndexed { i, data ->
                                            numMapQuarter[i] =
                                                AppUtils.getDayDetailsHours(
                                                    data.listWeather.dt,
                                                    true
                                                )
                                        }
                                        if (listHoursAirWeather.size > 0) {
                                            setDataReportTemperatureAQI(
                                                listHoursAirWeather,
                                                numMapQuarter,
                                                true,
                                                binding.ilLineChartTemperature.lineChartAQI
                                            )
                                            setDataReportTemperatureAQI(
                                                listHoursAirWeather,
                                                numMapQuarter,
                                                false,
                                                binding.ilLineChartTemperature.lineChartTemperature
                                            )
                                        }
                                        adapterWeatherAirHours.notifyDataSetChanged()
                                    }
                                } else {
                                    toast(getString(R.string.fail_data))
                                }

                            }
                        })
                }
            })
    }


    @SuppressLint("SetTextI18n")
    private fun checkRainSnow(result: WeatherNow) {
        if (result.rain.OneOclock != 0.0) {
            binding.ilWeatherOther.llRain1h.show()
            binding.ilWeatherOther.tvRain1h.text =
                result.rain.OneOclock.toString() + getString(R.string.mm)
        } else {
            binding.ilWeatherOther.llRain1h.hide()
        }
        if (result.rain.threeOclock != 0.0) {
            binding.ilWeatherOther.llRain3h.show()
            binding.ilWeatherOther.tvRain1h.text =
                result.rain.threeOclock.toString() + getString(R.string.mm)
        } else {
            binding.ilWeatherOther.llRain3h.hide()
        }


        if (result.snow.threeOclock != 0.0) {
            binding.ilWeatherOther.llSnow1h.show()
            binding.ilWeatherOther.tvSnow1h.text =
                result.rain.OneOclock.toString() + getString(R.string.mm)
        } else {
            binding.ilWeatherOther.llSnow1h.hide()
        }
        if (result.snow.threeOclock != 0.0) {
            binding.ilWeatherOther.llSnow3h.show()
            binding.ilWeatherOther.tvSnow3h.text =
                result.rain.threeOclock.toString() + getString(R.string.mm)
        } else {
            binding.ilWeatherOther.llSnow3h.hide()
        }

        if (result.wind.gust != 0.0) {
            binding.ilWeatherOther.llGust.show()
            binding.ilWeatherOther.tvGust.text =
                result.wind.gust.toString() + getString(R.string.ms)
        } else {
            binding.ilWeatherOther.llGust.hide()
        }
    }

    private fun setDataReportTemperatureAQI(
        data: ArrayList<ListAirWeatherHours>,
        numMapQuarter: HashMap<Int, String>,
        isAQI: Boolean,
        lineChart: LineChart,
    ) {
        initLineChart(lineChart, numMapQuarter)
        if (data.size < 1) {
            if (isAQI) binding.ilLineChartTemperature.lineChartAQI.data = null
            else binding.ilLineChartTemperature.lineChartTemperature.data = null
        } else {
            if (isAQI) binding.ilLineChartTemperature.lineChartAQI.data =
                generateLineDataTemperatureAQI(data, true)
            else binding.ilLineChartTemperature.lineChartTemperature.data =
                generateLineDataTemperatureAQI(data, false)
        }

    }

    private fun initLineChart(chart: LineChart, numMapQuarter: HashMap<Int, String>) {

        chart.animate()
        chart.description.isEnabled = false
        // enable touch gestures
        chart.setTouchEnabled(true)
        chart.dragDecelerationFrictionCoef = 0.9f
        // enable scaling and dragging
        chart.isDragEnabled = true
        chart.setScaleEnabled(true)
        chart.setDrawGridBackground(false)
        chart.isHighlightPerDragEnabled = true
        // if disabled, scaling can be done on x- and y-axis separately
        // if disabled, scaling can be done on x- and y-axis separately
        chart.setPinchZoom(true)
        chart.axisRight.isEnabled = false
        chart.legend.isEnabled = false
        // set an alternative background color
        // set an alternative background color
        chart.setBackgroundColor(requireActivity().getColor(R.color.gray_200_50))
        chart.isDoubleTapToZoomEnabled = true
        val custom: ValueFormatter = MyAxisValueFormatter()
        val leftAxis: YAxis = chart.axisLeft
        leftAxis.typeface = TypeFaceUtils.getRobotoRegularTypeface(getAttachActivity())
        leftAxis.setLabelCount(10, false)
        leftAxis.spaceTop = 15f
        leftAxis.valueFormatter = custom
        val xAxis: XAxis = chart.xAxis
        xAxis.position = XAxis.XAxisPosition.BOTTOM
        xAxis.typeface = TypeFaceUtils.getRobotoRegularTypeface(getAttachActivity())
        xAxis.setDrawGridLines(true)
        xAxis.setDrawAxisLine(true)
        xAxis.granularity = 1f
        xAxis.labelCount = 7
        xAxis.textSize = 10f
        xAxis.labelRotationAngle = 0f
        chart.setVisibleXRangeMaximum(10f)
        if (numMapQuarter.size > 0) xAxis.valueFormatter = object : MyAxisValueFormatter() {
            override fun getAxisLabel(value: Float, axis: AxisBase?): String {
                if (value.toInt() > -1 && value.toInt() < numMapQuarter.size) return numMapQuarter[value.toInt()].toString()
                return ""
            }
        }
        val customMarkerView = CustomLineMarkerView(
            requireActivity(), R.layout.layout_line_marker
        )
        chart.marker = customMarkerView
        chart.animateY(1500)
        chart.setNoDataTextColor(requireActivity().getColor(R.color.text_color_blue))
        chart.setNoDataText(requireActivity().getString(R.string.no_data))
        chart.setPinchZoom(true)
        chart.fitScreen()
    }

    private fun generateLineDataTemperatureAQI(
        data: ArrayList<ListAirWeatherHours>,
        isAQI: Boolean,
    ): LineData {
        val line = ArrayList<ILineDataSet>()
        val entriesTemperature = ArrayList<Entry>() //nhiệt độ
        val entriesAQI = ArrayList<Entry>() //AQI
        for (i in data.indices) {
            val it = data[i].listAir.components
            entriesTemperature.add(Entry(i.toFloat(), data[i].listWeather.main.temp.toFloat()))
            entriesAQI.add(
                Entry(
                    i.toFloat(),
                    AppUtils.calculateAQI_China(it.co, it.no2, it.o3, it.so2, it.pm25, it.pm10)
                        .toFloat()
                )
            )
        }
        val custom: ValueFormatter
        custom = MyValueFormatter()
        if (isAQI) {
            binding.ilLineChartTemperature.lineChartAQI.axisLeft.valueFormatter = custom
        } else {
            binding.ilLineChartTemperature.lineChartTemperature.axisLeft.valueFormatter = custom
        }


        val lineTemperature =
            LineDataSet(entriesTemperature, getString(R.string.map_chart_temperature))
        lineTemperature.color =
            getAttachActivity()!!.getColor(R.color.blue_700)
        lineTemperature.setCircleColor(getAttachActivity()!!.getColor(R.color.blue_700))
        lineTemperature.lineWidth = 1f
        lineTemperature.mode = LineDataSet.Mode.CUBIC_BEZIER
        lineTemperature.circleRadius = 1.5f
        lineTemperature.fillAlpha = 65
        lineTemperature.fillColor = ColorTemplate.colorWithAlpha(
            getAttachActivity()!!.getColor(R.color.blue_700), 200
        )
        lineTemperature.setDrawCircleHole(false)
        lineTemperature.setDrawIcons(false)
        lineTemperature.setDrawValues(false)
        lineTemperature.setDrawFilled(false)

        val lineAQI = LineDataSet(entriesAQI, getString(R.string.map_chart_temperature))
        lineAQI.color =
            getAttachActivity()!!.getColor(R.color.green_600)
        lineAQI.setCircleColor(getAttachActivity()!!.getColor(R.color.green_600))
        lineAQI.lineWidth = 1f
        lineAQI.mode = LineDataSet.Mode.CUBIC_BEZIER
        lineAQI.circleRadius = 1.5f
        lineAQI.fillAlpha = 65
        lineAQI.fillColor = ColorTemplate.colorWithAlpha(
            getAttachActivity()!!.getColor(R.color.green_600), 200
        )
        lineAQI.setDrawCircleHole(false)
        lineAQI.setDrawIcons(false)
        lineAQI.setDrawValues(false)
        lineAQI.setDrawFilled(false)
        if (isAQI) {
            line.add(lineAQI)
        } else {
            line.add(lineTemperature)
        }




        return LineData(line)
    }

    @Subscribe(sticky = true)
    fun updateDataFistLocation(isUpdate: UpdateDataEventBus) {
        if (isUpdate.isUpdate) {
            if (titleToDisplay.id == 0L) {
                setData(isUpdate.data)
            } else {
                //
            }

        }
    }

    fun checkIfFragmentAttached(operation: Context.() -> Unit) {
        if (isAdded && context != null) {
            operation(requireContext())
        }
    }




}