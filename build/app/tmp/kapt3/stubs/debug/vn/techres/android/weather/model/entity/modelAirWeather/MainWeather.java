package vn.techres.android.weather.model.entity.modelAirWeather;

import java.lang.System;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b\u00a8\u0006\u001e"}, d2 = {"Lvn/techres/android/weather/model/entity/modelAirWeather/MainWeather;", "", "()V", "feelsLike", "", "getFeelsLike", "()D", "setFeelsLike", "(D)V", "grndLevel", "getGrndLevel", "setGrndLevel", "humidity", "getHumidity", "setHumidity", "pressure", "getPressure", "setPressure", "seaLevel", "getSeaLevel", "setSeaLevel", "temp", "getTemp", "setTemp", "tempMax", "getTempMax", "setTempMax", "tempMin", "getTempMin", "setTempMin", "app_debug"})
public final class MainWeather {
    @com.google.gson.annotations.SerializedName(value = "temp")
    private double temp = 0.0;
    @com.google.gson.annotations.SerializedName(value = "feels_like")
    private double feelsLike = 0.0;
    @com.google.gson.annotations.SerializedName(value = "temp_min")
    private double tempMin = 0.0;
    @com.google.gson.annotations.SerializedName(value = "temp_max")
    private double tempMax = 0.0;
    @com.google.gson.annotations.SerializedName(value = "pressure")
    private double pressure = 0.0;
    @com.google.gson.annotations.SerializedName(value = "humidity")
    private double humidity = 0.0;
    @com.google.gson.annotations.SerializedName(value = "sea_level")
    private double seaLevel = 0.0;
    @com.google.gson.annotations.SerializedName(value = "grnd_level")
    private double grndLevel = 0.0;
    
    public MainWeather() {
        super();
    }
    
    public final double getTemp() {
        return 0.0;
    }
    
    public final void setTemp(double p0) {
    }
    
    public final double getFeelsLike() {
        return 0.0;
    }
    
    public final void setFeelsLike(double p0) {
    }
    
    public final double getTempMin() {
        return 0.0;
    }
    
    public final void setTempMin(double p0) {
    }
    
    public final double getTempMax() {
        return 0.0;
    }
    
    public final void setTempMax(double p0) {
    }
    
    public final double getPressure() {
        return 0.0;
    }
    
    public final void setPressure(double p0) {
    }
    
    public final double getHumidity() {
        return 0.0;
    }
    
    public final void setHumidity(double p0) {
    }
    
    public final double getSeaLevel() {
        return 0.0;
    }
    
    public final void setSeaLevel(double p0) {
    }
    
    public final double getGrndLevel() {
        return 0.0;
    }
    
    public final void setGrndLevel(double p0) {
    }
}