package vn.techres.android.weather.http.api;

import java.lang.System;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\r\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001e\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e\u00a8\u0006 "}, d2 = {"Lvn/techres/android/weather/http/api/GetWeatherDaysApi;", "Lvn/techres/android/weather/http/api/BaseApi;", "()V", "cnt", "", "getCnt", "()I", "setCnt", "(I)V", "keyApi", "", "getKeyApi", "()Ljava/lang/String;", "setKeyApi", "(Ljava/lang/String;)V", "lang", "getLang", "setLang", "lat", "", "getLat", "()D", "setLat", "(D)V", "lon", "getLon", "setLon", "units", "getUnits", "setUnits", "getApi", "Companion", "app_debug"})
public final class GetWeatherDaysApi extends vn.techres.android.weather.http.api.BaseApi {
    @com.hjq.http.annotation.HttpRename(value = "lat")
    private double lat = 0.0;
    @com.hjq.http.annotation.HttpRename(value = "lon")
    private double lon = 0.0;
    @org.jetbrains.annotations.NotNull
    @com.hjq.http.annotation.HttpRename(value = "lang")
    private java.lang.String lang = "vi";
    @com.hjq.http.annotation.HttpRename(value = "cnt")
    private int cnt = 0;
    @org.jetbrains.annotations.NotNull
    @com.hjq.http.annotation.HttpRename(value = "units")
    private java.lang.String units = "";
    @org.jetbrains.annotations.NotNull
    @com.hjq.http.annotation.HttpRename(value = "appid")
    private java.lang.String keyApi = "9de243494c0b295cca9337e1e96b00e2";
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.http.api.GetWeatherDaysApi.Companion Companion = null;
    
    public GetWeatherDaysApi() {
        super();
    }
    
    public final double getLat() {
        return 0.0;
    }
    
    public final void setLat(double p0) {
    }
    
    public final double getLon() {
        return 0.0;
    }
    
    public final void setLon(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLang() {
        return null;
    }
    
    public final void setLang(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getCnt() {
        return 0;
    }
    
    public final void setCnt(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUnits() {
        return null;
    }
    
    public final void setUnits(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKeyApi() {
        return null;
    }
    
    public final void setKeyApi(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getApi() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\f"}, d2 = {"Lvn/techres/android/weather/http/api/GetWeatherDaysApi$Companion;", "", "()V", "param", "Lvn/techres/android/weather/http/api/BaseApi;", "lat", "", "lon", "cnt", "", "units", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.http.api.BaseApi param(double lat, double lon, int cnt, @org.jetbrains.annotations.NotNull
        java.lang.String units) {
            return null;
        }
    }
}