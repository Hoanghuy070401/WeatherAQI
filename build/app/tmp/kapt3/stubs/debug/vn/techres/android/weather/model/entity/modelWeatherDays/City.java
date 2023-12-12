package vn.techres.android.weather.model.entity.modelWeatherDays;

import java.lang.System;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014\u00a8\u0006!"}, d2 = {"Lvn/techres/android/weather/model/entity/modelWeatherDays/City;", "", "()V", "coord", "Lvn/techres/android/weather/model/entity/modelAirWeather/Coord;", "getCoord", "()Lvn/techres/android/weather/model/entity/modelAirWeather/Coord;", "setCoord", "(Lvn/techres/android/weather/model/entity/modelAirWeather/Coord;)V", "country", "", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", "id", "", "getId", "()J", "setId", "(J)V", "name", "getName", "setName", "population", "", "getPopulation", "()I", "setPopulation", "(I)V", "timezone", "getTimezone", "setTimezone", "app_debug"})
public final class City {
    @com.google.gson.annotations.SerializedName(value = "id")
    private long id = 0L;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name = "";
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "coord")
    private vn.techres.android.weather.model.entity.modelAirWeather.Coord coord;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "country")
    private java.lang.String country = "";
    @com.google.gson.annotations.SerializedName(value = "population")
    private int population = 0;
    @com.google.gson.annotations.SerializedName(value = "timezone")
    private long timezone = 0L;
    
    public City() {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelAirWeather.Coord getCoord() {
        return null;
    }
    
    public final void setCoord(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelAirWeather.Coord p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final void setCountry(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getPopulation() {
        return 0;
    }
    
    public final void setPopulation(int p0) {
    }
    
    public final long getTimezone() {
        return 0L;
    }
    
    public final void setTimezone(long p0) {
    }
}