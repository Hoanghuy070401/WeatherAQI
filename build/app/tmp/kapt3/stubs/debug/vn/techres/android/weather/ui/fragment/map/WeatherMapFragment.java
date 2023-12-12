package vn.techres.android.weather.ui.fragment.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00c6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 i2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001iB\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020>H\u0002J\b\u0010@\u001a\u00020>H\u0002J\b\u0010A\u001a\u00020BH\u0002J \u0010C\u001a\u00020>2\u0006\u0010D\u001a\u00020\u001f2\u0006\u0010E\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u001fH\u0002J\b\u0010G\u001a\u00020>H\u0003J\b\u0010H\u001a\u00020IH\u0014J\b\u0010J\u001a\u00020>H\u0002J\u0010\u0010K\u001a\u00020>2\u0006\u0010L\u001a\u000200H\u0016J\b\u0010M\u001a\u00020>H\u0015J\b\u0010N\u001a\u00020>H\u0002J\u0010\u0010O\u001a\u00020>2\u0006\u0010P\u001a\u00020\"H\u0016J-\u0010Q\u001a\u00020>2\u0006\u0010R\u001a\u0002002\u000e\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0T2\u0006\u0010U\u001a\u00020VH\u0017\u00a2\u0006\u0002\u0010WJ\b\u0010X\u001a\u00020>H\u0016J\u0010\u0010Y\u001a\u00020>2\u0006\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020>H\u0002J\u0010\u0010]\u001a\u00020>2\u0006\u0010^\u001a\u00020\u001fH\u0002J0\u0010_\u001a\u00020>2\u0006\u0010`\u001a\u00020\u001f2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`a2\u0006\u0010b\u001a\u00020\u0007H\u0003J\b\u0010c\u001a\u00020>H\u0002J\b\u0010d\u001a\u00020>H\u0002J\b\u0010e\u001a\u00020>H\u0002J\b\u0010f\u001a\u00020>H\u0003J\b\u0010g\u001a\u00020>H\u0002J\u0010\u0010h\u001a\u00020>2\u0006\u0010E\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u000e\u0010(\u001a\u00020)X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u000206X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u000109X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006j"}, d2 = {"Lvn/techres/android/weather/ui/fragment/map/WeatherMapFragment;", "Lvn/techres/android/weather/app/AppFragment;", "Lvn/techres/android/weather/ui/activity/HomeActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lvn/techres/android/weather/model/interfaces/ImageClick;", "()V", "adapterCity", "Lvn/techres/android/weather/ui/adapter/ListCityAdapter;", "binding", "Lvn/techres/android/weather/databinding/FragmentWeatherMapBinding;", "date", "", "getDate", "()J", "setDate", "(J)V", "defaultLocation", "Lcom/google/android/gms/maps/model/LatLng;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "handler", "Landroid/os/Handler;", "isCloseSearchView", "", "isHidden", "lastKnownLocation", "Landroid/location/Location;", "listCity", "Ljava/util/ArrayList;", "Lvn/techres/android/weather/model/entity/modelCity/ItemSearch;", "listControl", "", "listStyle", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "markerList", "", "Lcom/google/android/gms/maps/model/Marker;", "getMarkerList", "()Ljava/util/List;", "placesClient", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "play", "getPlay", "()Z", "setPlay", "(Z)V", "process", "", "getProcess", "()I", "setProcess", "(I)V", "runnable", "Ljava/lang/Runnable;", "textSearch", "tileOverNew", "Lcom/google/android/gms/maps/model/TileOverlay;", "tileOverOld", "tileType", "time", "checkEmpty", "", "controlSpinnerStyleMap", "controlSpinnerWeather", "createTransparentTileProvider", "Lcom/google/android/gms/maps/model/TileProvider;", "getDataWeather", "name", "latLng", "units", "getDeviceLocation", "getLayoutView", "Landroid/view/View;", "getLocationPermission", "imageClick", "position", "initData", "nextProgress", "onMapReady", "p0", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "preventProgress", "searchDetailPlaces", "id", "searchPlaces", "query", "Lkotlin/collections/ArrayList;", "adapter", "setFilterSearch", "setUpMap", "startTimer", "updateLocationUI", "updateTileOverLay", "zoomCamera", "Companion", "app_debug"})
public final class WeatherMapFragment extends vn.techres.android.weather.app.AppFragment<vn.techres.android.weather.ui.activity.HomeActivity> implements com.google.android.gms.maps.OnMapReadyCallback, vn.techres.android.weather.model.interfaces.ImageClick {
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.ui.fragment.map.WeatherMapFragment.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private static final int DEFAULT_ZOOM = 15;
    private static final java.lang.String KEY_CAMERA_POSITION = "camera_position";
    private static final java.lang.String KEY_LOCATION = "location";
    private final android.os.Handler handler = null;
    private java.lang.Runnable runnable;
    private com.google.android.gms.maps.GoogleMap mMap;
    private vn.techres.android.weather.databinding.FragmentWeatherMapBinding binding;
    private com.google.android.libraries.places.api.net.PlacesClient placesClient;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    private android.location.Location lastKnownLocation;
    private final com.google.android.gms.maps.model.LatLng defaultLocation = null;
    private java.util.ArrayList<java.lang.String> listControl;
    private java.util.ArrayList<java.lang.String> listStyle;
    private java.lang.String tileType;
    private long time = 0L;
    private java.util.ArrayList<vn.techres.android.weather.model.entity.modelCity.ItemSearch> listCity;
    private long date = 0L;
    private com.google.android.gms.maps.model.TileOverlay tileOverOld;
    private com.google.android.gms.maps.model.TileOverlay tileOverNew;
    private vn.techres.android.weather.ui.adapter.ListCityAdapter adapterCity;
    private boolean isHidden = true;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.google.android.gms.maps.model.Marker> markerList = null;
    private java.lang.String textSearch;
    private boolean play = true;
    private int process = 10800000;
    private boolean isCloseSearchView = false;
    
    public WeatherMapFragment() {
        super();
    }
    
    public final long getDate() {
        return 0L;
    }
    
    public final void setDate(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.google.android.gms.maps.model.Marker> getMarkerList() {
        return null;
    }
    
    public final boolean getPlay() {
        return false;
    }
    
    public final void setPlay(boolean p0) {
    }
    
    public final int getProcess() {
        return 0;
    }
    
    public final void setProcess(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected android.view.View getLayoutView() {
        return null;
    }
    
    private final void zoomCamera(com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override
    protected void initData() {
    }
    
    private final void setFilterSearch() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void searchPlaces(java.lang.String query, java.util.ArrayList<vn.techres.android.weather.model.entity.modelCity.ItemSearch> listCity, vn.techres.android.weather.ui.adapter.ListCityAdapter adapter) {
    }
    
    private final void searchDetailPlaces(java.lang.String id) {
    }
    
    private final void startTimer() {
    }
    
    private final void preventProgress() {
    }
    
    private final void nextProgress() {
    }
    
    private final void controlSpinnerStyleMap() {
    }
    
    private final void controlSpinnerWeather() {
    }
    
    @java.lang.Override
    public void onMapReady(@org.jetbrains.annotations.NotNull
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @java.lang.Override
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void updateLocationUI() {
    }
    
    private final void getLocationPermission() {
    }
    
    @android.annotation.SuppressLint(value = {"TimberArgCount"})
    private final void getDeviceLocation() {
    }
    
    private final void setUpMap() {
    }
    
    private final void updateTileOverLay() {
    }
    
    private final com.google.android.gms.maps.model.TileProvider createTransparentTileProvider() {
        return null;
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void imageClick(int position) {
    }
    
    private final void getDataWeather(java.lang.String name, com.google.android.gms.maps.model.LatLng latLng, java.lang.String units) {
    }
    
    private final void checkEmpty() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lvn/techres/android/weather/ui/fragment/map/WeatherMapFragment$Companion;", "", "()V", "DEFAULT_ZOOM", "", "KEY_CAMERA_POSITION", "", "KEY_LOCATION", "TAG", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}