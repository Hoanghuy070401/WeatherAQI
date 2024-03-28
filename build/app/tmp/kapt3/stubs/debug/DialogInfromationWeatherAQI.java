
import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"LDialogInfromationWeatherAQI;", "", "()V", "Builder", "app_debug"})
public final class DialogInfromationWeatherAQI {
    
    public DialogInfromationWeatherAQI() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\'B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J(\u0010 \u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\tH\u0002J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u0012\u0010\"\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"LDialogInfromationWeatherAQI$Builder;", "Lvn/techres/base/BaseDialog$Builder;", "Lcom/hjq/http/listener/OnHttpListener;", "Lvn/techres/android/weather/model/entity/modelAirWeather/WeatherNow;", "context", "Landroid/content/Context;", "lifecycle", "Landroidx/lifecycle/LifecycleOwner;", "name", "", "lat", "", "lon", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Ljava/lang/String;DD)V", "adapterWeatherAirHours", "Lvn/techres/android/weather/ui/adapter/ListHoursWeatherAirAdapter;", "binding", "Lvn/techres/android/weather/databinding/InformationDialogBinding;", "getLifecycle", "()Landroidx/lifecycle/LifecycleOwner;", "listHoursAir", "Ljava/util/ArrayList;", "Lvn/techres/android/weather/model/entity/modelAirWeather/ListAir;", "listHoursAirWeather", "Lvn/techres/android/weather/model/entity/modelAirWeather/ListAirWeatherHours;", "listHoursWeather", "Lvn/techres/android/weather/model/entity/modelWeatherDays/List;", "onActionDone", "LDialogInfromationWeatherAQI$Builder$OnActionDone;", "getAirDataHours", "", "getDataAir", "getDataWeather", "units", "onFail", "e", "Ljava/lang/Exception;", "onSucceed", "result", "OnActionDone", "app_debug"})
    public static final class Builder extends vn.techres.base.BaseDialog.Builder<DialogInfromationWeatherAQI.Builder> implements com.hjq.http.listener.OnHttpListener<vn.techres.android.weather.model.entity.modelAirWeather.WeatherNow> {
        @org.jetbrains.annotations.NotNull
        private final androidx.lifecycle.LifecycleOwner lifecycle = null;
        private vn.techres.android.weather.databinding.InformationDialogBinding binding;
        private DialogInfromationWeatherAQI.Builder.OnActionDone onActionDone;
        private java.util.ArrayList<vn.techres.android.weather.model.entity.modelWeatherDays.List> listHoursWeather;
        private java.util.ArrayList<vn.techres.android.weather.model.entity.modelAirWeather.ListAir> listHoursAir;
        private java.util.ArrayList<vn.techres.android.weather.model.entity.modelAirWeather.ListAirWeatherHours> listHoursAirWeather;
        private vn.techres.android.weather.ui.adapter.ListHoursWeatherAirAdapter adapterWeatherAirHours;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        androidx.lifecycle.LifecycleOwner lifecycle, @org.jetbrains.annotations.NotNull
        java.lang.String name, double lat, double lon) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.LifecycleOwner getLifecycle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final DialogInfromationWeatherAQI.Builder onActionDone(@org.jetbrains.annotations.NotNull
        DialogInfromationWeatherAQI.Builder.OnActionDone onActionDone) {
            return null;
        }
        
        private final void getDataWeather(java.lang.String name, double lat, double lon, java.lang.String units) {
        }
        
        private final void getAirDataHours(double lat, double lon) {
        }
        
        private final void getDataAir(double lat, double lon) {
        }
        
        @java.lang.Override
        public void onSucceed(@org.jetbrains.annotations.Nullable
        vn.techres.android.weather.model.entity.modelAirWeather.WeatherNow result) {
        }
        
        @java.lang.Override
        public void onFail(@org.jetbrains.annotations.Nullable
        java.lang.Exception e) {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"LDialogInfromationWeatherAQI$Builder$OnActionDone;", "", "onActionDone", "", "app_debug"})
        public static abstract interface OnActionDone {
            
            public abstract void onActionDone();
        }
    }
}