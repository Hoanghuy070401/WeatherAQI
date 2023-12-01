package vn.techres.android.weather.model.eventbus;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/28/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lvn/techres/android/weather/model/eventbus/AddListSuggestEvenBus;", "", "isCheck", "", "data", "Lvn/techres/android/weather/model/entity/AddressCity;", "(ZLvn/techres/android/weather/model/entity/AddressCity;)V", "getData", "()Lvn/techres/android/weather/model/entity/AddressCity;", "setData", "(Lvn/techres/android/weather/model/entity/AddressCity;)V", "()Z", "setCheck", "(Z)V", "app_debug"})
public final class AddListSuggestEvenBus {
    private boolean isCheck;
    @org.jetbrains.annotations.NotNull
    private vn.techres.android.weather.model.entity.AddressCity data;
    
    public AddListSuggestEvenBus(boolean isCheck, @org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.AddressCity data) {
        super();
    }
    
    public final boolean isCheck() {
        return false;
    }
    
    public final void setCheck(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.AddressCity getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.AddressCity p0) {
    }
}