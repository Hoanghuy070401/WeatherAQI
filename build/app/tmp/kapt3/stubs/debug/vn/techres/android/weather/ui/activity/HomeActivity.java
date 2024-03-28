package vn.techres.android.weather.ui.activity;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 28/09/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\u0006\u0010\u0019\u001a\u00020\u0014J\b\u0010\u001a\u001a\u00020\u0014H\u0014J\b\u0010\u001b\u001a\u00020\u0014H\u0015J\b\u0010\u001c\u001a\u00020\fH\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0014J\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006&"}, d2 = {"Lvn/techres/android/weather/ui/activity/HomeActivity;", "Lvn/techres/android/weather/app/AppActivity;", "()V", "binding", "Lvn/techres/android/weather/databinding/HomeActivityBinding;", "getBinding", "()Lvn/techres/android/weather/databinding/HomeActivityBinding;", "setBinding", "(Lvn/techres/android/weather/databinding/HomeActivityBinding;)V", "currentPage", "", "twice", "", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "addLocationSuggest", "", "isCheck", "Lvn/techres/android/weather/model/eventbus/AddListSuggestEvenBus;", "getLayoutView", "Landroid/view/View;", "getUrlNew", "initData", "initView", "isServiceRunning", "onResume", "startServiceA", "lat", "", "lon", "updateDataFistLocation", "isUpdate", "Lvn/techres/android/weather/model/eventbus/UpdateDataEventBus;", "Companion", "app_debug"})
public final class HomeActivity extends vn.techres.android.weather.app.AppActivity {
    public vn.techres.android.weather.databinding.HomeActivityBinding binding;
    private int currentPage = 2;
    private boolean twice = false;
    @org.jetbrains.annotations.NotNull
    private java.lang.String url = "";
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.ui.activity.HomeActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static vn.techres.android.weather.model.entity.AddressCity data;
    
    public HomeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.databinding.HomeActivityBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.databinding.HomeActivityBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected android.view.View getLayoutView() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = 33)
    @java.lang.Override
    protected void initView() {
    }
    
    @java.lang.Override
    protected void initData() {
    }
    
    @org.greenrobot.eventbus.Subscribe(sticky = true)
    public final void updateDataFistLocation(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.eventbus.UpdateDataEventBus isUpdate) {
    }
    
    @org.greenrobot.eventbus.Subscribe(sticky = true)
    public final void addLocationSuggest(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.eventbus.AddListSuggestEvenBus isCheck) {
    }
    
    private final void startServiceA(double lat, double lon) {
    }
    
    private final boolean isServiceRunning() {
        return false;
    }
    
    public final void getUrlNew() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lvn/techres/android/weather/ui/activity/HomeActivity$Companion;", "", "()V", "data", "Lvn/techres/android/weather/model/entity/AddressCity;", "getData", "()Lvn/techres/android/weather/model/entity/AddressCity;", "setData", "(Lvn/techres/android/weather/model/entity/AddressCity;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.model.entity.AddressCity getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.NotNull
        vn.techres.android.weather.model.entity.AddressCity p0) {
        }
    }
}