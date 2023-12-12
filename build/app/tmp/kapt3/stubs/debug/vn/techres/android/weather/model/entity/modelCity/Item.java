package vn.techres.android.weather.model.entity.modelCity;

import java.lang.System;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001e\u0010$\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lvn/techres/android/weather/model/entity/modelCity/Item;", "", "()V", "address", "Lvn/techres/android/weather/model/entity/modelCity/Address;", "getAddress", "()Lvn/techres/android/weather/model/entity/modelCity/Address;", "setAddress", "(Lvn/techres/android/weather/model/entity/modelCity/Address;)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "language", "getLanguage", "setLanguage", "localityType", "getLocalityType", "setLocalityType", "mapView", "Lvn/techres/android/weather/model/entity/modelCity/MapView;", "getMapView", "()Lvn/techres/android/weather/model/entity/modelCity/MapView;", "setMapView", "(Lvn/techres/android/weather/model/entity/modelCity/MapView;)V", "position", "Lvn/techres/android/weather/model/entity/modelCity/Position;", "getPosition", "()Lvn/techres/android/weather/model/entity/modelCity/Position;", "setPosition", "(Lvn/techres/android/weather/model/entity/modelCity/Position;)V", "resultType", "getResultType", "setResultType", "title", "getTitle", "setTitle", "app_debug"})
public final class Item {
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title = "";
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.String id = "";
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "language")
    private java.lang.String language = "";
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "resultType")
    private java.lang.String resultType = "";
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "localityType")
    private java.lang.String localityType = "";
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "address")
    private vn.techres.android.weather.model.entity.modelCity.Address address;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "position")
    private vn.techres.android.weather.model.entity.modelCity.Position position;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "mapView")
    private vn.techres.android.weather.model.entity.modelCity.MapView mapView;
    
    public Item() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final void setLanguage(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getResultType() {
        return null;
    }
    
    public final void setResultType(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLocalityType() {
        return null;
    }
    
    public final void setLocalityType(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelCity.Address getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelCity.Address p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelCity.Position getPosition() {
        return null;
    }
    
    public final void setPosition(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelCity.Position p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.model.entity.modelCity.MapView getMapView() {
        return null;
    }
    
    public final void setMapView(@org.jetbrains.annotations.NotNull
    vn.techres.android.weather.model.entity.modelCity.MapView p0) {
    }
}