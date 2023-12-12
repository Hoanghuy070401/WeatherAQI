package vn.techres.android.weather.model.entity.modelAirWeather;

import java.lang.System;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lvn/techres/android/weather/model/entity/modelAirWeather/Wind;", "Ljava/io/Serializable;", "()V", "deg", "", "getDeg", "()D", "setDeg", "(D)V", "gust", "getGust", "setGust", "speed", "getSpeed", "setSpeed", "app_debug"})
public final class Wind implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "speed")
    private double speed = 0.0;
    @com.google.gson.annotations.SerializedName(value = "deg")
    private double deg = 0.0;
    @com.google.gson.annotations.SerializedName(value = "gust")
    private double gust = 0.0;
    
    public Wind() {
        super();
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
    
    public final double getGust() {
        return 0.0;
    }
    
    public final void setGust(double p0) {
    }
}