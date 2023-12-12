package vn.techres.android.weather.model.interfaces;

import java.lang.System;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 10/30/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lvn/techres/android/weather/model/interfaces/TileLoadListener;", "", "onTileLoaded", "", "tile", "Lcom/google/android/gms/maps/model/Tile;", "app_debug"})
public abstract interface TileLoadListener {
    
    public abstract void onTileLoaded(@org.jetbrains.annotations.NotNull
    com.google.android.gms.maps.model.Tile tile);
}