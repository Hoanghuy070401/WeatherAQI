package vn.techres.android.weather.model.entity.modelAirWeather;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lvn/techres/android/weather/model/entity/modelAirWeather/Weather;", "", "()V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "icon", "getIcon", "setIcon", "id", "", "getId", "()J", "setId", "(J)V", "main", "getMain", "setMain", "app_debug"})
public final class Weather {
    @com.google.gson.annotations.SerializedName(value = "id")
    private long id = 0L;
    @com.google.gson.annotations.SerializedName(value = "main")
    @org.jetbrains.annotations.NotNull
    private java.lang.String main = "";
    @com.google.gson.annotations.SerializedName(value = "description")
    @org.jetbrains.annotations.NotNull
    private java.lang.String description = "";
    @com.google.gson.annotations.SerializedName(value = "icon")
    @org.jetbrains.annotations.NotNull
    private java.lang.String icon = "";
    
    public Weather() {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMain() {
        return null;
    }
    
    public final void setMain(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIcon() {
        return null;
    }
    
    public final void setIcon(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}