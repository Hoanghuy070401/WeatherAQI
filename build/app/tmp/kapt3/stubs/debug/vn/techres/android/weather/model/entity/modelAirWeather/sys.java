package vn.techres.android.weather.model.entity.modelAirWeather;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"Lvn/techres/android/weather/model/entity/modelAirWeather/sys;", "Ljava/io/Serializable;", "()V", "country", "", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", "id", "", "getId", "()J", "setId", "(J)V", "sunrise", "", "getSunrise", "()D", "setSunrise", "(D)V", "sunset", "getSunset", "setSunset", "type", "", "getType", "()I", "setType", "(I)V", "app_debug"})
public final class sys implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "type")
    private int type = 0;
    @com.google.gson.annotations.SerializedName(value = "id")
    private long id = 0L;
    @com.google.gson.annotations.SerializedName(value = "country")
    @org.jetbrains.annotations.NotNull
    private java.lang.String country = "";
    @com.google.gson.annotations.SerializedName(value = "sunrise")
    private double sunrise = 0.0;
    @com.google.gson.annotations.SerializedName(value = "sunset")
    private double sunset = 0.0;
    
    public sys() {
        super();
    }
    
    public final int getType() {
        return 0;
    }
    
    public final void setType(int p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final void setCountry(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final double getSunrise() {
        return 0.0;
    }
    
    public final void setSunrise(double p0) {
    }
    
    public final double getSunset() {
        return 0.0;
    }
    
    public final void setSunset(double p0) {
    }
}