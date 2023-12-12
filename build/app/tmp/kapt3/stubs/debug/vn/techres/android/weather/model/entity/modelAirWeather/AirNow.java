package vn.techres.android.weather.model.entity.modelAirWeather;

import java.lang.System;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lvn/techres/android/weather/model/entity/modelAirWeather/AirNow;", "", "()V", "coord", "Lvn/techres/android/weather/model/entity/modelAirWeather/Coord;", "getCoord", "()Lvn/techres/android/weather/model/entity/modelAirWeather/Coord;", "setCoord", "(Lvn/techres/android/weather/model/entity/modelAirWeather/Coord;)V", "list", "Ljava/util/ArrayList;", "Lvn/techres/android/weather/model/entity/modelAirWeather/ListAir;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "app_debug"})
public final class AirNow {
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "coord")
    private vn.techres.android.weather.model.entity.modelAirWeather.Coord coord;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "list")
    private java.util.ArrayList<vn.techres.android.weather.model.entity.modelAirWeather.ListAir> list;
    
    public AirNow() {
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
    public final java.util.ArrayList<vn.techres.android.weather.model.entity.modelAirWeather.ListAir> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<vn.techres.android.weather.model.entity.modelAirWeather.ListAir> p0) {
    }
}