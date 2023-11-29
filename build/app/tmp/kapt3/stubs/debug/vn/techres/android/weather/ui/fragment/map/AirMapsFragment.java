package vn.techres.android.weather.ui.fragment.map;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001PB\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020(H\u0002J\b\u0010+\u001a\u00020,H\u0002J\u0018\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\rH\u0002J\b\u00100\u001a\u00020(H\u0003J\b\u00101\u001a\u000202H\u0014J\b\u00103\u001a\u00020(H\u0002J\u0010\u00104\u001a\u00020(2\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020(H\u0014J\u0010\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020\u001bH\u0016J-\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u0002062\u000e\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180=2\u0006\u0010>\u001a\u00020?H\u0017\u00a2\u0006\u0002\u0010@J\b\u0010A\u001a\u00020(H\u0016J\u0010\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020(2\u0006\u0010F\u001a\u00020\u0018H\u0002J8\u0010G\u001a\u00020(2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u00182\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`K2\u0006\u0010L\u001a\u00020\u0007H\u0003J\b\u0010M\u001a\u00020(H\u0002J\b\u0010N\u001a\u00020(H\u0002J\b\u0010O\u001a\u00020(H\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006Q"}, d2 = {"Lvn/techres/android/weather/ui/fragment/map/AirMapsFragment;", "Lvn/techres/android/weather/app/AppFragment;", "Lvn/techres/android/weather/ui/activity/HomeActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lvn/techres/android/weather/model/interfaces/imageClick;", "()V", "adapterCity", "Lvn/techres/android/weather/ui/adapter/ListCityAdapter;", "binding", "Lvn/techres/android/weather/databinding/FragmentAirBinding;", "date", "", "defaultLocation", "Lcom/google/android/gms/maps/model/LatLng;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "isCloseSearchView", "", "lastKnownLocation", "Landroid/location/Location;", "listCity", "Ljava/util/ArrayList;", "Lvn/techres/android/weather/model/entity/modelCity/ItemSearch;", "listControlAir", "", "listStyleAir", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "markerList", "", "Lcom/google/android/gms/maps/model/Marker;", "getMarkerList", "()Ljava/util/List;", "placesClient", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "textSearch", "tileOver", "Lcom/google/android/gms/maps/model/TileOverlay;", "tileType", "checkEmpty", "", "controlSpinnerAQI", "controlSpinnerStyleMap", "createTransparentTileProvider", "Lcom/google/android/gms/maps/model/TileProvider;", "getDataAir", "name", "latLng", "getDeviceLocation", "getLayoutView", "Landroid/view/View;", "getLocationPermission", "imageClick", "position", "", "initData", "onMapReady", "p0", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "searchDetailPlaces", "id", "searchPlaces", "process", "Landroid/widget/ProgressBar;", "query", "Lkotlin/collections/ArrayList;", "adapter", "setFilterSearch", "setUpMap", "updateLocationUI", "Companion", "app_debug"})
public final class AirMapsFragment extends vn.techres.android.weather.app.AppFragment<vn.techres.android.weather.ui.activity.HomeActivity> implements com.google.android.gms.maps.OnMapReadyCallback, vn.techres.android.weather.model.interfaces.imageClick {
    private static final java.lang.String TAG = null;
    private static final int DEFAULT_ZOOM = 15;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEY_CAMERA_POSITION = "camera_position";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEY_LOCATION = "location";
    private com.google.android.gms.maps.GoogleMap mMap;
    private vn.techres.android.weather.databinding.FragmentAirBinding binding;
    private com.google.android.libraries.places.api.net.PlacesClient placesClient;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    @org.jetbrains.annotations.Nullable
    private android.location.Location lastKnownLocation;
    @org.jetbrains.annotations.NotNull
    private final com.google.android.gms.maps.model.LatLng defaultLocation = null;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<java.lang.String> listControlAir;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<java.lang.String> listStyleAir;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<vn.techres.android.weather.model.entity.modelCity.ItemSearch> listCity;
    @org.jetbrains.annotations.NotNull
    private java.lang.String textSearch;
    @org.jetbrains.annotations.NotNull
    private java.lang.String tileType;
    private long date = 0L;
    @org.jetbrains.annotations.Nullable
    private com.google.android.gms.maps.model.TileOverlay tileOver;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.google.android.gms.maps.model.Marker> markerList = null;
    private vn.techres.android.weather.ui.adapter.ListCityAdapter adapterCity;
    private boolean isCloseSearchView = false;
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.ui.fragment.map.AirMapsFragment.Companion Companion = null;
    
    public AirMapsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.google.android.gms.maps.model.Marker> getMarkerList() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected android.view.View getLayoutView() {
        return null;
    }
    
    @java.lang.Override
    protected void initData() {
    }
    
    private final void controlSpinnerStyleMap() {
    }
    
    private final void controlSpinnerAQI() {
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
    
    private final com.google.android.gms.maps.model.TileProvider createTransparentTileProvider() {
        return null;
    }
    
    private final void setFilterSearch() {
    }
    
    private final void checkEmpty() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void imageClick(int position) {
    }
    
    private final void getDataAir(java.lang.String name, com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void searchPlaces(android.widget.ProgressBar process, java.lang.String query, java.util.ArrayList<vn.techres.android.weather.model.entity.modelCity.ItemSearch> listCity, vn.techres.android.weather.ui.adapter.ListCityAdapter adapter) {
    }
    
    private final void searchDetailPlaces(java.lang.String id) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lvn/techres/android/weather/ui/fragment/map/AirMapsFragment$Companion;", "", "()V", "DEFAULT_ZOOM", "", "KEY_CAMERA_POSITION", "", "KEY_LOCATION", "TAG", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}