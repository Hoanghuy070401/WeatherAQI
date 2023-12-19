package vn.techres.android.weather.ui.fragment.map.tileProvider;

import java.lang.System;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 9/7/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003J\"\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0017J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0002R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00038\u0002X\u0083D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lvn/techres/android/weather/ui/fragment/map/tileProvider/TransparentTileOWM;", "Lcom/google/android/gms/maps/model/TileProvider;", "tileType", "", "date", "", "(Ljava/lang/String;J)V", "AQI_TILE_URL", "OWM_TILE_URL", "OWM_TILE_URL_DATE", "WEATHER_MAP_SOS", "dated", "opacityPaint", "Landroid/graphics/Paint;", "adjustOpacity", "Landroid/graphics/Bitmap;", "bitmap", "getTile", "Lcom/google/android/gms/maps/model/Tile;", "x", "", "y", "zoom", "getTileUrl", "Ljava/net/URL;", "setOpacity", "", "opacity", "app_debug"})
public final class TransparentTileOWM implements com.google.android.gms.maps.model.TileProvider {
    private final android.graphics.Paint opacityPaint = null;
    private java.lang.String tileType;
    private long dated = 0L;
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final java.lang.String OWM_TILE_URL = "http://maps.openweathermap.org/maps/2.0/weather/%s/%d/%d/%d?fill_bound=true&use_norm=true&arrow_step=16&appid=9de243494c0b295cca9337e1e96b00e2";
    private final java.lang.String AQI_TILE_URL = "https://tiles.aqicn.org/tiles/%s/%d/%d/%d.png?token=33cf0f00-7e2a-45e8-9f7a-5e31a3e573d2";
    private final java.lang.String WEATHER_MAP_SOS = "http://maps.openweathermap.org/maps/2.0/relief/%d/%d/%d?appid=9de243494c0b295cca9337e1e96b00e2";
    private java.lang.String OWM_TILE_URL_DATE;
    
    public TransparentTileOWM(@org.jetbrains.annotations.NotNull
    java.lang.String tileType, long date) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override
    public com.google.android.gms.maps.model.Tile getTile(int x, int y, int zoom) {
        return null;
    }
    
    private final void setOpacity(int opacity) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final android.graphics.Bitmap adjustOpacity(android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    private final java.net.URL getTileUrl(int x, int y, int zoom) {
        return null;
    }
}