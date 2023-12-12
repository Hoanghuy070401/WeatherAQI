package vn.techres.android.weather.model.entity.modelWeatherDays;

import java.lang.System;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\'\u001a\u00020(8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001e\u00100\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001e\u00103\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001e\u00106\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001e\u00109\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001e\u0010<\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u000f\"\u0004\b>\u0010\u0011R\u001e\u0010?\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u000f\"\u0004\bA\u0010\u0011R\u001e\u0010B\u001a\u00020C8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010H\u001a\b\u0012\u0004\u0012\u00020J0I8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N\u00a8\u0006O"}, d2 = {"Lvn/techres/android/weather/model/entity/modelWeatherDays/List;", "", "()V", "clouds", "", "getClouds", "()D", "setClouds", "(D)V", "deg", "getDeg", "setDeg", "dt", "", "getDt", "()J", "setDt", "(J)V", "dtTxt", "", "getDtTxt", "()Ljava/lang/String;", "setDtTxt", "(Ljava/lang/String;)V", "feelsLike", "Lvn/techres/android/weather/model/entity/modelWeatherDays/FeelsLike;", "getFeelsLike", "()Lvn/techres/android/weather/model/entity/modelWeatherDays/FeelsLike;", "setFeelsLike", "(Lvn/techres/android/weather/model/entity/modelWeatherDays/FeelsLike;)V", "gust", "getGust", "setGust", "humidity", "", "getHumidity", "()I", "setHumidity", "(I)V", "main", "Lvn/techres/android/weather/model/entity/modelAirWeather/MainWeather;", "getMain", "()Lvn/techres/android/weather/model/entity/modelAirWeather/MainWeather;", "setMain", "(Lvn/techres/android/weather/model/entity/modelAirWeather/MainWeather;)V", "pop", "getPop", "setPop", "pressure", "getPressure", "setPressure", "rain", "getRain", "setRain", "snow", "getSnow", "setSnow", "speed", "getSpeed", "setSpeed", "sunrise", "getSunrise", "setSunrise", "sunset", "getSunset", "setSunset", "temp", "Lvn/techres/android/weather/model/entity/modelWeatherDays/Temp;", "getTemp", "()Lvn/techres/android/weather/model/entity/modelWeatherDays/Temp;", "setTemp", "(Lvn/techres/android/weather/model/entity/modelWeatherDays/Temp;)V", "weather", "Ljava/util/ArrayList;", "Lvn/techres/android/weather/model/entity/modelAirWeather/Weather;", "getWeather", "()Ljava/util/ArrayList;", "setWeather", "(Ljava/util/ArrayList;)V", "app_debug"})
public final class List {
    @com.google.gson.annotations.SerializedName(value = "dt")
    private long dt = 0L;
    @com.google.gson.annotations.SerializedName(value = "sunrise")
    private long sunrise = 0L;
    @com.google.gson.annotations.SerializedName(value = "sunset")
    private long sunset = 0L;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "temp")
    private vn.techres.android.weather.model.entity.modelWeatherDays.Temp temp;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "main")
    private vn.techres.android.weather.model.entity.modelAirWeather.MainWeather main;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "feels_like")
    private vn.techres.android.weather.model.entity.modelWeatherDays.FeelsLike feelsLike;
    @com.google.gson.annotations.SerializedName(value = "pressure")
    private double pressure = 0.0;
    @com.google.gson.annotations.SerializedName(value = "humidity")
    private int humidity = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "weather")
    private java.util.ArrayList<vn.techres.android.weather.model.entity.modelAirWeather.Weather> weather;
    @com.google.gson.annotations.SerializedName(value = "speed")
    private double speed = 0.0;
    @com.google.gson.annotations.SerializedName(value = "deg")
    private double deg = 0.0;
    @com.google.gson.annotations.SerializedName(value = "clouds")
    private double clouds = 0.0;
    @com.google.gson.annotations.SerializedName(value = "rain")
    private double rain = -1.0;
    @com.google.gson.annotations.SerializedName(value = "gust")
    private double gust = 0.0;
    @com.google.gson.annotations.SerializedName(value = "snow")
    private double snow = -1.0;
    @com.google.gson.annotations.SerializedName(value = "pop")
    private double pop = -1.0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "dt_txt")
    private java.lang.String dtTxt = "";
    
    public List() {
        super();
    }
    
    public final long getDt() {
        return 0L;
    }
    
    public final void setDt(long p0) {
    }
    
    public final long getSunrise() {
        return 0L;
    }
    
    public final void setSunrise(long p0) {
    }
    
    public final long getSunset() {
        return 0L;
    }
    
    public final void setSunset(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelWeatherDays.Temp getTemp() {
        return null;
    }
    
    public final void setTemp(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelWeatherDays.Temp p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelAirWeather.MainWeather getMain() {
        return null;
    }
    
    public final void setMain(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelAirWeather.MainWeather p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelWeatherDays.FeelsLike getFeelsLike() {
        return null;
    }
    
    public final void setFeelsLike(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelWeatherDays.FeelsLike p0) {
    }
    
    public final double getPressure() {
        return 0.0;
    }
    
    public final void setPressure(double p0) {
    }
    
    public final int getHumidity() {
        return 0;
    }
    
    public final void setHumidity(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<vn.techres.android.weather.model.entity.modelAirWeather.Weather> getWeather() {
        return null;
    }
    
    public final void setWeather(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<vn.techres.android.weather.model.entity.modelAirWeather.Weather> p0) {
    }
    
    public final double getSpeed() {
        return 0.0;
    }
    
    public final void setSpeed(double p0) {
    }
    
    public final double getDeg() {
        return 0.0;
    }
    
    public final void setDeg(double p0) {
    }
    
    public final double getClouds() {
        return 0.0;
    }
    
    public final void setClouds(double p0) {
    }
    
    public final double getRain() {
        return 0.0;
    }
    
    public final void setRain(double p0) {
    }
    
    public final double getGust() {
        return 0.0;
    }
    
    public final void setGust(double p0) {
    }
    
    public final double getSnow() {
        return 0.0;
    }
    
    public final void setSnow(double p0) {
    }
    
    public final double getPop() {
        return 0.0;
    }
    
    public final void setPop(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDtTxt() {
        return null;
    }
    
    public final void setDtTxt(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}