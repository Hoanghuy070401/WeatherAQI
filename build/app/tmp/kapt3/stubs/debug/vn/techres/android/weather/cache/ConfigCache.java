package vn.techres.android.weather.cache;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 03/10/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lvn/techres/android/weather/cache/ConfigCache;", "", "()V", "mLocationDevice", "Lvn/techres/android/weather/model/entity/LocationDevice;", "mmkv", "Lcom/tencent/mmkv/MMKV;", "getLocation", "saveLocation", "", "location", "app_debug"})
public final class ConfigCache {
    @org.jetbrains.annotations.NotNull
    private static vn.techres.android.weather.model.entity.LocationDevice mLocationDevice;
    @org.jetbrains.annotations.NotNull
    private static final com.tencent.mmkv.MMKV mmkv = null;
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.cache.ConfigCache INSTANCE = null;
    
    private ConfigCache() {
        super();
    }
    
    public final void saveLocation(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.LocationDevice location) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.LocationDevice getLocation() {
        return null;
    }
}