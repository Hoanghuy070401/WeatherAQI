package vn.techres.android.weather.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lvn/techres/android/weather/cache/DataWeatherWidgetCache;", "", "()V", "dataWeather", "Lvn/techres/android/weather/model/entity/modelWeatherDays/WeatherDays;", "mmkv", "Lcom/tencent/mmkv/MMKV;", "getData", "saveData", "", "location", "app_debug"})
public final class DataWeatherWidgetCache {
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.cache.DataWeatherWidgetCache INSTANCE = null;
    private static vn.techres.android.weather.model.entity.modelWeatherDays.WeatherDays dataWeather;
    private static final com.tencent.mmkv.MMKV mmkv = null;
    
    private DataWeatherWidgetCache() {
        super();
    }
    
    public final void saveData(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelWeatherDays.WeatherDays location) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelWeatherDays.WeatherDays getData() {
        return null;
    }
}