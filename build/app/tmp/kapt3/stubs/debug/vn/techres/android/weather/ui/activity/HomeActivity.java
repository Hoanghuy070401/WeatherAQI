package vn.techres.android.weather.ui.activity;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 28/09/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lvn/techres/android/weather/ui/activity/HomeActivity;", "Lvn/techres/android/weather/app/AppActivity;", "()V", "binding", "Lvn/techres/android/weather/databinding/HomeActivityBinding;", "getBinding", "()Lvn/techres/android/weather/databinding/HomeActivityBinding;", "setBinding", "(Lvn/techres/android/weather/databinding/HomeActivityBinding;)V", "currentPage", "", "twice", "", "addLocationSuggest", "", "isCheck", "Lvn/techres/android/weather/model/eventbus/AddListSuggestEvenBus;", "getLayoutView", "Landroid/view/View;", "initData", "initView", "Companion", "app_debug"})
public final class HomeActivity extends vn.techres.android.weather.app.AppActivity {
    public vn.techres.android.weather.databinding.HomeActivityBinding binding;
    private int currentPage = 2;
    private boolean twice = false;
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
    public final void addLocationSuggest(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.eventbus.AddListSuggestEvenBus isCheck) {
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