package vn.techres.android.weather.model.entity.modelAirWeather;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/13/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lvn/techres/android/weather/model/entity/modelAirWeather/ListAir;", "", "()V", "components", "Lvn/techres/android/weather/model/entity/modelAirWeather/Components;", "getComponents", "()Lvn/techres/android/weather/model/entity/modelAirWeather/Components;", "setComponents", "(Lvn/techres/android/weather/model/entity/modelAirWeather/Components;)V", "dt", "", "getDt", "()D", "setDt", "(D)V", "main", "Lvn/techres/android/weather/model/entity/modelAirWeather/Main;", "getMain", "()Lvn/techres/android/weather/model/entity/modelAirWeather/Main;", "setMain", "(Lvn/techres/android/weather/model/entity/modelAirWeather/Main;)V", "app_debug"})
public final class ListAir {
    @com.google.gson.annotations.SerializedName(value = "main")
    @org.jetbrains.annotations.NotNull
    private vn.techres.android.weather.model.entity.modelAirWeather.Main main;
    @com.google.gson.annotations.SerializedName(value = "components")
    @org.jetbrains.annotations.NotNull
    private vn.techres.android.weather.model.entity.modelAirWeather.Components components;
    @com.google.gson.annotations.SerializedName(value = "dt")
    private double dt = 0.0;
    
    public ListAir() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelAirWeather.Main getMain() {
        return null;
    }
    
    public final void setMain(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelAirWeather.Main p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelAirWeather.Components getComponents() {
        return null;
    }
    
    public final void setComponents(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelAirWeather.Components p0) {
    }
    
    public final double getDt() {
        return 0.0;
    }
    
    public final void setDt(double p0) {
    }
}