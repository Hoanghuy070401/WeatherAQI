package vn.techres.android.weather.http.api;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 10/9/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\n\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011\u00a8\u0006\u0017"}, d2 = {"Lvn/techres/android/weather/http/api/CurrentAirApi;", "Lvn/techres/android/weather/http/api/BaseApi;", "()V", "keyApi", "", "getKeyApi", "()Ljava/lang/String;", "setKeyApi", "(Ljava/lang/String;)V", "lang", "getLang", "setLang", "lat", "", "getLat", "()D", "setLat", "(D)V", "lon", "getLon", "setLon", "getApi", "Companion", "app_debug"})
public final class CurrentAirApi extends vn.techres.android.weather.http.api.BaseApi {
    @com.hjq.http.annotation.HttpRename(value = "lat")
    private double lat = 0.0;
    @com.hjq.http.annotation.HttpRename(value = "lon")
    private double lon = 0.0;
    @com.hjq.http.annotation.HttpRename(value = "lang")
    @org.jetbrains.annotations.NotNull
    private java.lang.String lang = "vi";
    @com.hjq.http.annotation.HttpRename(value = "appid")
    @org.jetbrains.annotations.NotNull
    private java.lang.String keyApi = "9de243494c0b295cca9337e1e96b00e2";
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.http.api.CurrentAirApi.Companion Companion = null;
    
    public CurrentAirApi() {
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
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKeyApi() {
        return null;
    }
    
    public final void setKeyApi(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getApi() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a8\u0006\b"}, d2 = {"Lvn/techres/android/weather/http/api/CurrentAirApi$Companion;", "", "()V", "param", "Lvn/techres/android/weather/http/api/BaseApi;", "lat", "", "lon", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.http.api.BaseApi param(double lat, double lon) {
            return null;
        }
    }
}