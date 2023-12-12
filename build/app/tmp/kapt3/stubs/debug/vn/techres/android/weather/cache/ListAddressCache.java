package vn.techres.android.weather.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\fJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004J\u001e\u0010\u000f\u001a\u00020\b2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\fJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lvn/techres/android/weather/cache/ListAddressCache;", "", "()V", "mLocationDevice", "Lvn/techres/android/weather/model/entity/AddressCity;", "mmkv", "Lcom/tencent/mmkv/MMKV;", "addLocationToCache", "", "newLocation", "getAllLocations", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "removeLocationFromCache", "locationToRemove", "saveAllLocations", "locations", "updateLocationInCache", "updatedLocation", "app_debug"})
public final class ListAddressCache {
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.cache.ListAddressCache INSTANCE = null;
    private static vn.techres.android.weather.model.entity.AddressCity mLocationDevice;
    private static final com.tencent.mmkv.MMKV mmkv = null;
    
    private ListAddressCache() {
        super();
    }
    
    public final void saveAllLocations(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<vn.techres.android.weather.model.entity.AddressCity> locations) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<vn.techres.android.weather.model.entity.AddressCity> getAllLocations() {
        return null;
    }
    
    public final void removeLocationFromCache(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.AddressCity locationToRemove) {
    }
    
    public final void addLocationToCache(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.AddressCity newLocation) {
    }
    
    public final void updateLocationInCache(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.AddressCity updatedLocation) {
    }
}