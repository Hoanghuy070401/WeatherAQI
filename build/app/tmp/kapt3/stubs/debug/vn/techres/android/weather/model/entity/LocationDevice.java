package vn.techres.android.weather.model.entity;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 10/11/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0006R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lvn/techres/android/weather/model/entity/LocationDevice;", "", "lat", "", "lon", "(DD)V", "()V", "getLat", "()D", "setLat", "(D)V", "getLon", "setLon", "namePlace", "", "getNamePlace", "()Ljava/lang/String;", "setNamePlace", "(Ljava/lang/String;)V", "app_debug"})
public final class LocationDevice {
    @com.google.gson.annotations.SerializedName(value = "lat")
    private double lat = 0.0;
    @com.google.gson.annotations.SerializedName(value = "lon")
    private double lon = 0.0;
    @com.google.gson.annotations.SerializedName(value = "name_place")
    @org.jetbrains.annotations.NotNull
    private java.lang.String namePlace = "";
    
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
    public final java.lang.String getNamePlace() {
        return null;
    }
    
    public final void setNamePlace(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public LocationDevice(double lat, double lon) {
        super();
    }
    
    public LocationDevice() {
        super();
    }
}