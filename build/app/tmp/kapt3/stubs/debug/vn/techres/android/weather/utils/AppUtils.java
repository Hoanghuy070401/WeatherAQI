package vn.techres.android.weather.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00dc\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J6\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019J\u0018\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\fH\u0002J\u0016\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016J\u001a\u0010%\u001a\u00020\f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00190\'J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0016J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0016J.\u00100\u001a\u00020)2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u00107\u001a\u000208J\u000e\u00100\u001a\u00020\f2\u0006\u00109\u001a\u00020:J\u001e\u0010;\u001a\u00020)2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@J\u001a\u0010A\u001a\u00020)2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010BH\u0002J\u0010\u0010C\u001a\u00020\f2\u0006\u0010D\u001a\u00020\fH\u0007J\u0018\u0010E\u001a\u00020\u00192\u0006\u0010F\u001a\u00020\u00192\u0006\u0010G\u001a\u00020\u0019H\u0002J\u000e\u0010H\u001a\u00020\f2\u0006\u0010I\u001a\u000202J\u000e\u0010J\u001a\u00020\f2\u0006\u0010K\u001a\u00020\u0019J\u0010\u0010L\u001a\u00020M2\u0006\u0010D\u001a\u00020\fH\u0007J\u0010\u0010N\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\u0019J\u0006\u0010S\u001a\u00020\fJ\u000e\u0010T\u001a\u00020\f2\u0006\u0010U\u001a\u00020\u0016J\u0010\u0010V\u001a\u0004\u0018\u00010\f2\u0006\u0010W\u001a\u00020\fJ\u0018\u0010X\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\f2\u0006\u0010Z\u001a\u00020.H\u0002J\u0010\u0010[\u001a\u00020\f2\u0006\u0010\\\u001a\u00020\fH\u0007J\u000e\u0010]\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0019J&\u0010^\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010_\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020\f2\u0006\u0010`\u001a\u00020\u0016J\u000e\u0010a\u001a\u00020\f2\u0006\u0010b\u001a\u00020\u0016J\u000e\u0010c\u001a\u00020d2\u0006\u0010W\u001a\u00020\fJ\u0010\u0010e\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010f\u001a\u0004\u0018\u00010g2\u0006\u0010h\u001a\u00020\fJ\u001e\u0010i\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\u0019J\u0010\u0010j\u001a\u00020\f2\u0006\u0010k\u001a\u00020\u0016H\u0007J\u0018\u0010l\u001a\u0002022\u0006\u0010m\u001a\u00020\f2\u0006\u0010n\u001a\u00020.H\u0007J\u0010\u0010o\u001a\u00020\f2\u0006\u0010p\u001a\u000202H\u0007J\u0018\u0010o\u001a\u00020\f2\u0006\u0010p\u001a\u0002022\u0006\u0010n\u001a\u00020.H\u0007J\u0018\u0010q\u001a\u00020\f2\u0006\u0010p\u001a\u0002022\u0006\u0010Z\u001a\u00020.H\u0007J\u000e\u0010r\u001a\u00020\f2\u0006\u0010 \u001a\u00020sJ\u000e\u0010r\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fJ\u0006\u0010t\u001a\u00020\fJ\u000e\u0010u\u001a\u00020\f2\u0006\u0010W\u001a\u00020\fJ\b\u0010v\u001a\u0004\u0018\u00010\fJ\u000e\u0010w\u001a\u00020\f2\u0006\u0010x\u001a\u00020\fJ\u000e\u0010y\u001a\u00020\f2\u0006\u0010 \u001a\u00020sJ\u000e\u0010z\u001a\u00020\f2\u0006\u0010{\u001a\u00020\fJ\u000e\u0010|\u001a\u00020\f2\u0006\u0010}\u001a\u00020\u0016J\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00160\u007fJ\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010\f2\u0006\u0010x\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014J \u0010\u0081\u0001\u001a\u00020)2\u0007\u0010\u0082\u0001\u001a\u00020>2\u000e\u0010\u0083\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0084\u0001J \u0010\u0085\u0001\u001a\u00020)2\u0007\u0010\u0082\u0001\u001a\u00020>2\u000e\u0010\u0083\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0084\u0001J \u0010\u0086\u0001\u001a\u00020)2\u0007\u0010\u0082\u0001\u001a\u00020>2\u000e\u0010\u0083\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0084\u0001J)\u0010\u0086\u0001\u001a\u00020)2\u0007\u0010\u0082\u0001\u001a\u00020>2\u000e\u0010\u0083\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0084\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u0016J \u0010\u0088\u0001\u001a\u00020)2\u0007\u0010\u0082\u0001\u001a\u00020>2\u000e\u0010\u0083\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0084\u0001J \u0010\u0089\u0001\u001a\u00020)2\u0007\u0010\u0082\u0001\u001a\u00020>2\u000e\u0010\u0083\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0084\u0001J)\u0010\u0089\u0001\u001a\u00020)2\u0007\u0010\u0082\u0001\u001a\u00020>2\u000e\u0010\u0083\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0084\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u0016J \u0010\u008a\u0001\u001a\u00020)2\u0007\u0010\u0082\u0001\u001a\u00020>2\u000e\u0010\u0083\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u0084\u0001J\t\u0010\u008b\u0001\u001a\u00020\fH\u0007J5\u0010\u008c\u0001\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0007\u0010\u008d\u0001\u001a\u00020\u00162\u0007\u0010\u008e\u0001\u001a\u00020\u00162\u0007\u0010\u008f\u0001\u001a\u00020\u00192\u0007\u0010\u0090\u0001\u001a\u00020\u0019H\u0002J\u0010\u0010\u0091\u0001\u001a\u00020\f2\u0007\u0010\u0092\u0001\u001a\u00020\fJ\u0010\u0010\u0093\u0001\u001a\u00020\f2\u0007\u0010\u0094\u0001\u001a\u00020\u0016J\u000f\u0010\u0095\u0001\u001a\u00020s2\u0006\u0010b\u001a\u00020sJ!\u0010\u0096\u0001\u001a\u00020\u00192\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00192\u0007\u0010\u0098\u0001\u001a\u00020\u0016\u00a2\u0006\u0003\u0010\u0099\u0001J\u000f\u0010\u009a\u0001\u001a\u0002022\u0006\u0010b\u001a\u00020\u0019J\u0010\u0010\u009b\u0001\u001a\u00020\u00192\u0007\u0010\u009c\u0001\u001a\u00020\u0019J2\u0010\u009d\u0001\u001a\u00020)2\u0007\u0010\u0094\u0001\u001a\u00020\u00162\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u00107\u001a\u000208H\u0003J\"\u0010\u009e\u0001\u001a\u00020)2\u0007\u0010\u0094\u0001\u001a\u00020\u00162\u0006\u00103\u001a\u0002042\u0006\u0010\u0013\u001a\u00020\u0014H\u0003J\u0011\u0010\u009f\u0001\u001a\u00030\u00a0\u00012\u0007\u0010\u00a1\u0001\u001a\u00020\fJ\u0010\u0010\u00a2\u0001\u001a\u00020\f2\u0007\u0010\u00a3\u0001\u001a\u00020\fJ\u0018\u0010\u00a4\u0001\u001a\u00020\u00162\u0006\u0010n\u001a\u00020.2\u0007\u0010\u00a5\u0001\u001a\u00020\fJ&\u0010\u00a6\u0001\u001a\u00020)*\u0002042\t\b\u0002\u0010\u00a7\u0001\u001a\u0002022\u000e\u0010\u00a8\u0001\u001a\t\u0012\u0004\u0012\u00020)0\u00a9\u0001J\u0015\u0010\u00aa\u0001\u001a\u00030\u00ab\u0001*\u00030\u00ab\u00012\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u00aa\u0001\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u00ac\u0001\u001a\u00020)*\u00030\u00ad\u0001H\u0007J\u000b\u0010\u00ae\u0001\u001a\u00020)*\u000204J\u000b\u0010\u00af\u0001\u001a\u00020)*\u000204J\u000b\u0010\u00b0\u0001\u001a\u00020)*\u000204R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u00b1\u0001"}, d2 = {"Lvn/techres/android/weather/utils/AppUtils;", "", "()V", "EMOJI_FILTER", "Landroid/text/InputFilter;", "getEMOJI_FILTER", "()Landroid/text/InputFilter;", "setEMOJI_FILTER", "(Landroid/text/InputFilter;)V", "specialCharacters", "getSpecialCharacters", "units", "", "getUnits", "()Ljava/lang/String;", "setUnits", "(Ljava/lang/String;)V", "bitmapDescriptorFromVector", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "context", "Landroid/content/Context;", "vectorResId", "", "calculateAQI_China", "co", "", "no2", "o3", "so2", "pm25", "pm10", "calculateIndividualAQINow", "value", "pollutant", "calculateTotalPage", "totalRecord", "limit", "chatGayOnhiem", "chiSo", "", "checkImageAQi", "", "imageView", "Landroid/widget/ImageView;", "AQI", "checkMimeTypeVideo", "", "type", "checkWeather", "idWeather", "", "background", "Landroid/view/View;", "backgroundWeather", "Lcom/github/matteobattilana/weather/WeatherView;", "lottie", "Lcom/airbnb/lottie/LottieAnimationView;", "weather", "Lvn/techres/android/weather/model/entity/modelAirWeather/WeatherNow;", "checkWeatherItem", "configRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "configRecyclerViewWithFlexBoxLayout", "Lcom/google/android/flexbox/FlexboxLayoutManager;", "convertDateToCustomString", "dateString", "convertMicrogramsPerCubicMeterToPpb", "concentrationMicrogramsPerCubicMeter", "molecularWeight", "convertMillisToHoursMinutes", "milliseconds", "convertRainPercent", "pop", "convertStringToDate", "Ljava/time/LocalDate;", "convertUgMgCO", "coordinatesToLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "latitude", "longitude", "dateNow", "doiHuongGio", "huongGio", "encodeBase64", "string", "extractTimeFromString", "dateTimeString", "getHours", "formatDateTime", "inputDateTime", "formatDoubleToString", "formatReportDateTime", "reportTypeSort", "position", "formatTwoInt", "number", "fromHtml", "Landroid/text/Spanned;", "generateID", "generateQRCode", "Landroid/graphics/Bitmap;", "idGroup", "getCompleteAddressString", "getCurrentDate", "days", "getDateFormat", "date", "hours", "getDayDetails", "dt", "getDayDetailsHours", "getDecimalFormattedString", "Ljava/math/BigDecimal;", "getDeviceName", "getFirstLetterEachWord", "getLocalIpAddress", "getMimeType", "url", "getMoneyFormatted", "getNameFileFormatTime", "path", "getRandomString", "len", "getTechresColorList", "", "getVideo", "initRecyclerView", "view", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "initRecyclerViewGrid", "initRecyclerViewHorizontal", "count", "initRecyclerViewReverse", "initRecyclerViewVertical", "initRecyclerViewVerticalWithFlexBoxLayout", "layThoiGianHienTai", "linearInterpolation", "iLow", "iHigh", "cLow", "cHigh", "removeVietnameseFromString", "str", "returnUnits", "status", "roundBigDecimal", "roundDouble", "numberF", "roundTo", "(Ljava/lang/Double;I)D", "roundNumber", "roundOffDecimal", "numInDouble", "setBackGround", "setBackGroundItem", "setFileToStorageDir", "Ljava/io/File;", "fileName", "subAddress", "address", "timeComponents", "time", "clickWithDebounce", "debounceTime", "action", "Lkotlin/Function0;", "dpToPx", "", "enableScrollText", "Lvn/techres/android/weather/widget/AppEditText;", "hide", "invisible", "show", "app_debug"})
public final class AppUtils {
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.utils.AppUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static java.lang.String units = "";
    @org.jetbrains.annotations.NotNull
    private static android.text.InputFilter EMOJI_FILTER;
    @org.jetbrains.annotations.NotNull
    private static final android.text.InputFilter specialCharacters = null;
    
    private AppUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatReportDateTime(@org.jetbrains.annotations.NotNull
    android.content.Context context, int reportTypeSort, @org.jetbrains.annotations.NotNull
    java.lang.String inputDateTime, int position) {
        return null;
    }
    
    public final int calculateAQI_China(double co, double no2, double o3, double so2, double pm25, double pm10) {
        return 0;
    }
    
    private final int calculateIndividualAQINow(double value, java.lang.String pollutant) {
        return 0;
    }
    
    private final double linearInterpolation(double value, int iLow, int iHigh, double cLow, double cHigh) {
        return 0.0;
    }
    
    private final double convertMicrogramsPerCubicMeterToPpb(double concentrationMicrogramsPerCubicMeter, double molecularWeight) {
        return 0.0;
    }
    
    private final double convertUgMgCO(double co) {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUnits() {
        return null;
    }
    
    public final void setUnits(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String returnUnits(int status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String getDayDetails(long dt, boolean hours) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String getDayDetails(long dt) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String getDayDetailsHours(long dt, boolean getHours) {
        return null;
    }
    
    private final java.lang.String extractTimeFromString(java.lang.String dateTimeString, boolean getHours) {
        return null;
    }
    
    public final int timeComponents(boolean hours, @org.jetbrains.annotations.NotNull
    java.lang.String time) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String doiHuongGio(int huongGio) {
        return null;
    }
    
    public final int dpToPx(int $this$dpToPx, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0;
    }
    
    public final float dpToPx(float $this$dpToPx, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String dateNow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final java.lang.String layThoiGianHienTai() {
        return null;
    }
    
    public final void checkWeather(long idWeather, @org.jetbrains.annotations.NotNull
    android.view.View background, @org.jetbrains.annotations.NotNull
    com.github.matteobattilana.weather.WeatherView backgroundWeather, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.airbnb.lottie.LottieAnimationView lottie) {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    private final void setBackGround(int status, android.view.View background, com.github.matteobattilana.weather.WeatherView backgroundWeather, android.content.Context context, com.airbnb.lottie.LottieAnimationView lottie) {
    }
    
    public final void checkWeatherItem(long idWeather, @org.jetbrains.annotations.NotNull
    android.view.View background, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    private final void setBackGroundItem(int status, android.view.View background, android.content.Context context) {
    }
    
    public final void checkImageAQi(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, int AQI) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String chatGayOnhiem(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.Double> chiSo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String checkWeather(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelAirWeather.WeatherNow weather) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final java.lang.String getCurrentDate(int days) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final java.lang.String formatDateTime(@org.jetbrains.annotations.NotNull
    java.lang.String inputDateTime) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final long getDateFormat(@org.jetbrains.annotations.NotNull
    java.lang.String date, boolean hours) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.maps.model.LatLng coordinatesToLatLng(double latitude, double longitude) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final java.time.LocalDate convertStringToDate(@org.jetbrains.annotations.NotNull
    java.lang.String dateString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final java.lang.String convertDateToCustomString(@org.jetbrains.annotations.NotNull
    java.lang.String dateString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String convertMillisToHoursMinutes(long milliseconds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String convertRainPercent(double pop) {
        return null;
    }
    
    /**
     * Trả về tên thiết bị
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDeviceName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLocalIpAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.io.File setFileToStorageDir(@org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.text.Spanned fromHtml(@org.jetbrains.annotations.NotNull
    java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDecimalFormattedString(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMoneyFormatted(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDecimalFormattedString(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    public final double roundDouble(@org.jetbrains.annotations.Nullable
    java.lang.Double numberF, int roundTo) {
        return 0.0;
    }
    
    public final void initRecyclerView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    public final void configRecyclerView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
    }
    
    public final void initRecyclerViewVertical(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    public final void initRecyclerViewVerticalWithFlexBoxLayout(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    private final void configRecyclerViewWithFlexBoxLayout(androidx.recyclerview.widget.RecyclerView recyclerView, com.google.android.flexbox.FlexboxLayoutManager layoutManager) {
    }
    
    public final void initRecyclerViewVertical(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter, int count) {
    }
    
    public final void initRecyclerViewHorizontal(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    public final void initRecyclerViewHorizontal(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter, int count) {
    }
    
    public final void initRecyclerViewReverse(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatDoubleToString(double value) {
        return null;
    }
    
    public final double roundOffDecimal(double numInDouble) {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String encodeBase64(@org.jetbrains.annotations.NotNull
    java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    public final java.lang.String generateID(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    public final void initRecyclerViewGrid(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getTechresColorList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.text.InputFilter getEMOJI_FILTER() {
        return null;
    }
    
    public final void setEMOJI_FILTER(@org.jetbrains.annotations.NotNull
    android.text.InputFilter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.text.InputFilter getSpecialCharacters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCompleteAddressString(@org.jetbrains.annotations.NotNull
    android.content.Context context, double latitude, double longitude) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptorFromVector(@org.jetbrains.annotations.NotNull
    android.content.Context context, int vectorResId) {
        return null;
    }
    
    public final int calculateTotalPage(int totalRecord, int limit) {
        return 0;
    }
    
    public final void show(@org.jetbrains.annotations.NotNull
    android.view.View $this$show) {
    }
    
    public final void hide(@org.jetbrains.annotations.NotNull
    android.view.View $this$hide) {
    }
    
    public final void invisible(@org.jetbrains.annotations.NotNull
    android.view.View $this$invisible) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatTwoInt(int number) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public final void enableScrollText(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.widget.AppEditText $this$enableScrollText) {
    }
    
    public final void clickWithDebounce(@org.jetbrains.annotations.NotNull
    android.view.View $this$clickWithDebounce, long debounceTime, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public final boolean checkMimeTypeVideo(int type) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMimeType(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRandomString(int len) {
        return null;
    }
    
    public final long roundNumber(double number) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal roundBigDecimal(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal number) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNameFileFormatTime(@org.jetbrains.annotations.NotNull
    java.lang.String path) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVideo(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap generateQRCode(@org.jetbrains.annotations.NotNull
    java.lang.String idGroup) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String removeVietnameseFromString(@org.jetbrains.annotations.NotNull
    java.lang.String str) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFirstLetterEachWord(@org.jetbrains.annotations.NotNull
    java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String subAddress(@org.jetbrains.annotations.NotNull
    java.lang.String address) {
        return null;
    }
}