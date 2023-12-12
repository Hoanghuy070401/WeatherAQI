package vn.techres.android.weather.model.entity.modelAirWeather;

import java.lang.System;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\'\u001a\u00020(8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001e\u00100\u001a\u0002018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u0002078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010<\u001a\u00020=8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0012\"\u0004\bD\u0010\u0014R\u001e\u0010E\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010$\"\u0004\bG\u0010&R$\u0010H\u001a\b\u0012\u0004\u0012\u00020J0I8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001e\u0010O\u001a\u00020P8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T\u00a8\u0006U"}, d2 = {"Lvn/techres/android/weather/model/entity/modelAirWeather/WeatherNow;", "", "()V", "base", "", "getBase", "()Ljava/lang/String;", "setBase", "(Ljava/lang/String;)V", "clouds", "Lvn/techres/android/weather/model/entity/modelAirWeather/Clouds;", "getClouds", "()Lvn/techres/android/weather/model/entity/modelAirWeather/Clouds;", "setClouds", "(Lvn/techres/android/weather/model/entity/modelAirWeather/Clouds;)V", "cod", "", "getCod", "()I", "setCod", "(I)V", "coord", "Lvn/techres/android/weather/model/entity/modelAirWeather/Coord;", "getCoord", "()Lvn/techres/android/weather/model/entity/modelAirWeather/Coord;", "setCoord", "(Lvn/techres/android/weather/model/entity/modelAirWeather/Coord;)V", "dt", "", "getDt", "()D", "setDt", "(D)V", "id", "", "getId", "()J", "setId", "(J)V", "main", "Lvn/techres/android/weather/model/entity/modelAirWeather/MainWeather;", "getMain", "()Lvn/techres/android/weather/model/entity/modelAirWeather/MainWeather;", "setMain", "(Lvn/techres/android/weather/model/entity/modelAirWeather/MainWeather;)V", "name", "getName", "setName", "rain", "Lvn/techres/android/weather/model/entity/modelAirWeather/Rain;", "getRain", "()Lvn/techres/android/weather/model/entity/modelAirWeather/Rain;", "setRain", "(Lvn/techres/android/weather/model/entity/modelAirWeather/Rain;)V", "snow", "Lvn/techres/android/weather/model/entity/modelAirWeather/Snow;", "getSnow", "()Lvn/techres/android/weather/model/entity/modelAirWeather/Snow;", "setSnow", "(Lvn/techres/android/weather/model/entity/modelAirWeather/Snow;)V", "sys", "Lvn/techres/android/weather/model/entity/modelAirWeather/sys;", "getSys", "()Lvn/techres/android/weather/model/entity/modelAirWeather/sys;", "setSys", "(Lvn/techres/android/weather/model/entity/modelAirWeather/sys;)V", "timezone", "getTimezone", "setTimezone", "visibility", "getVisibility", "setVisibility", "weather", "Ljava/util/ArrayList;", "Lvn/techres/android/weather/model/entity/modelAirWeather/Weather;", "getWeather", "()Ljava/util/ArrayList;", "setWeather", "(Ljava/util/ArrayList;)V", "wind", "Lvn/techres/android/weather/model/entity/modelAirWeather/Wind;", "getWind", "()Lvn/techres/android/weather/model/entity/modelAirWeather/Wind;", "setWind", "(Lvn/techres/android/weather/model/entity/modelAirWeather/Wind;)V", "app_debug"})
public final class WeatherNow {
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "coord")
    private vn.techres.android.weather.model.entity.modelAirWeather.Coord coord;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "weather")
    private java.util.ArrayList<vn.techres.android.weather.model.entity.modelAirWeather.Weather> weather;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "main")
    private vn.techres.android.weather.model.entity.modelAirWeather.MainWeather main;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "wind")
    private vn.techres.android.weather.model.entity.modelAirWeather.Wind wind;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "clouds")
    private vn.techres.android.weather.model.entity.modelAirWeather.Clouds clouds;
    @com.google.gson.annotations.SerializedName(value = "dt")
    private double dt = 0.0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "sys")
    private vn.techres.android.weather.model.entity.modelAirWeather.sys sys;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name = "";
    @com.google.gson.annotations.SerializedName(value = "cod")
    private int cod = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "base")
    private java.lang.String base = "";
    @com.google.gson.annotations.SerializedName(value = "visibility")
    private long visibility = 0L;
    @com.google.gson.annotations.SerializedName(value = "timezone")
    private int timezone = 0;
    @com.google.gson.annotations.SerializedName(value = "id")
    private long id = 0L;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "snow")
    private vn.techres.android.weather.model.entity.modelAirWeather.Snow snow;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "rain")
    private vn.techres.android.weather.model.entity.modelAirWeather.Rain rain;
    
    public WeatherNow() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelAirWeather.Coord getCoord() {
        return null;
    }
    
    public final void setCoord(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelAirWeather.Coord p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<vn.techres.android.weather.model.entity.modelAirWeather.Weather> getWeather() {
        return null;
    }
    
    public final void setWeather(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<vn.techres.android.weather.model.entity.modelAirWeather.Weather> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelAirWeather.MainWeather getMain() {
        return null;
    }
    
    public final void setMain(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelAirWeather.MainWeather p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelAirWeather.Wind getWind() {
        return null;
    }
    
    public final void setWind(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelAirWeather.Wind p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelAirWeather.Clouds getClouds() {
        return null;
    }
    
    public final void setClouds(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelAirWeather.Clouds p0) {
    }
    
    public final double getDt() {
        return 0.0;
    }
    
    public final void setDt(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelAirWeather.sys getSys() {
        return null;
    }
    
    public final void setSys(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelAirWeather.sys p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getCod() {
        return 0;
    }
    
    public final void setCod(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBase() {
        return null;
    }
    
    public final void setBase(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final long getVisibility() {
        return 0L;
    }
    
    public final void setVisibility(long p0) {
    }
    
    public final int getTimezone() {
        return 0;
    }
    
    public final void setTimezone(int p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelAirWeather.Snow getSnow() {
        return null;
    }
    
    public final void setSnow(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelAirWeather.Snow p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelAirWeather.Rain getRain() {
        return null;
    }
    
    public final void setRain(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelAirWeather.Rain p0) {
    }
}