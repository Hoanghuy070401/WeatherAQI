
import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"LDialogAlertWeatherAQI;", "", "()V", "Builder", "app_debug"})
public final class DialogAlertWeatherAQI {
    
    public DialogAlertWeatherAQI() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"LDialogAlertWeatherAQI$Builder;", "Lvn/techres/base/BaseDialog$Builder;", "context", "Landroid/content/Context;", "listWeather", "Lvn/techres/android/weather/model/entity/modelAirWeather/WeatherNow;", "listAQI", "Lvn/techres/android/weather/model/entity/modelAirWeather/ListAir;", "(Landroid/content/Context;Lvn/techres/android/weather/model/entity/modelAirWeather/WeatherNow;Lvn/techres/android/weather/model/entity/modelAirWeather/ListAir;)V", "binding", "Lvn/techres/android/weather/databinding/DialogNotificationBinding;", "onActionDone", "LDialogAlertWeatherAQI$Builder$OnActionDone;", "OnActionDone", "app_debug"})
    public static final class Builder extends vn.techres.base.BaseDialog.Builder<DialogAlertWeatherAQI.Builder> {
        private vn.techres.android.weather.databinding.DialogNotificationBinding binding;
        private DialogAlertWeatherAQI.Builder.OnActionDone onActionDone;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        vn.techres.android.weather.model.entity.modelAirWeather.WeatherNow listWeather, @org.jetbrains.annotations.NotNull
        vn.techres.android.weather.model.entity.modelAirWeather.ListAir listAQI) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final DialogAlertWeatherAQI.Builder onActionDone(@org.jetbrains.annotations.NotNull
        DialogAlertWeatherAQI.Builder.OnActionDone onActionDone) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"LDialogAlertWeatherAQI$Builder$OnActionDone;", "", "onActionDone", "", "app_debug"})
        public static abstract interface OnActionDone {
            
            public abstract void onActionDone();
        }
    }
}