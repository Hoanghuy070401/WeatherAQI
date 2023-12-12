package vn.techres.android.weather.model.entity.modelWeatherDays;

import java.lang.System;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006\""}, d2 = {"Lvn/techres/android/weather/model/entity/modelWeatherDays/WeatherDays;", "", "()V", "city", "Lvn/techres/android/weather/model/entity/modelWeatherDays/City;", "getCity", "()Lvn/techres/android/weather/model/entity/modelWeatherDays/City;", "setCity", "(Lvn/techres/android/weather/model/entity/modelWeatherDays/City;)V", "cnt", "", "getCnt", "()I", "setCnt", "(I)V", "cod", "getCod", "setCod", "code", "getCode", "setCode", "list", "Ljava/util/ArrayList;", "Lvn/techres/android/weather/model/entity/modelWeatherDays/List;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "message", "", "getMessage", "()D", "setMessage", "(D)V", "app_debug"})
public final class WeatherDays {
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "city")
    private vn.techres.android.weather.model.entity.modelWeatherDays.City city;
    @com.google.gson.annotations.SerializedName(value = "cod")
    private int cod = 0;
    @com.google.gson.annotations.SerializedName(value = "code")
    private int code = 0;
    @com.google.gson.annotations.SerializedName(value = "message")
    private double message = 0.0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "list")
    private java.util.ArrayList<vn.techres.android.weather.model.entity.modelWeatherDays.List> list;
    @com.google.gson.annotations.SerializedName(value = "cnt")
    private int cnt = 0;
    
    public WeatherDays() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelWeatherDays.City getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelWeatherDays.City p0) {
    }
    
    public final int getCod() {
        return 0;
    }
    
    public final void setCod(int p0) {
    }
    
    public final int getCode() {
        return 0;
    }
    
    public final void setCode(int p0) {
    }
    
    public final double getMessage() {
        return 0.0;
    }
    
    public final void setMessage(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<vn.techres.android.weather.model.entity.modelWeatherDays.List> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<vn.techres.android.weather.model.entity.modelWeatherDays.List> p0) {
    }
    
    public final int getCnt() {
        return 0;
    }
    
    public final void setCnt(int p0) {
    }
}