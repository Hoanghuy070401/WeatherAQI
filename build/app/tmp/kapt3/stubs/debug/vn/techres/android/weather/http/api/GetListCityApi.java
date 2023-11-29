package vn.techres.android.weather.http.api;

/**
 * @Author: NGUYEN THE DAT
 * @Date: 4/10/2023
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lvn/techres/android/weather/http/api/GetListCityApi;", "Lvn/techres/android/weather/http/api/BaseApi;", "()V", "countryName", "", "getCountryName", "()Ljava/lang/String;", "setCountryName", "(Ljava/lang/String;)V", "keyApi", "getKeyApi", "setKeyApi", "lang", "getLang", "setLang", "limit", "", "getLimit", "()I", "setLimit", "(I)V", "types", "getTypes", "setTypes", "getApi", "getHost", "Companion", "app_debug"})
public final class GetListCityApi extends vn.techres.android.weather.http.api.BaseApi {
    @com.hjq.http.annotation.HttpRename(value = "q")
    @org.jetbrains.annotations.NotNull
    private java.lang.String countryName = "";
    @com.hjq.http.annotation.HttpRename(value = "limit")
    private int limit = 20;
    @com.hjq.http.annotation.HttpRename(value = "lang")
    @org.jetbrains.annotations.NotNull
    private java.lang.String lang = "vi";
    @com.hjq.http.annotation.HttpRename(value = "types")
    @org.jetbrains.annotations.NotNull
    private java.lang.String types = "area";
    @com.hjq.http.annotation.HttpRename(value = "apiKey")
    @org.jetbrains.annotations.NotNull
    private java.lang.String keyApi = "KCh8EqX8SazXmRGXLEq8kbLF9cgygdZ7NNV0e42k67s";
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.http.api.GetListCityApi.Companion Companion = null;
    
    public GetListCityApi() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountryName() {
        return null;
    }
    
    public final void setCountryName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getLimit() {
        return 0;
    }
    
    public final void setLimit(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLang() {
        return null;
    }
    
    public final void setLang(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTypes() {
        return null;
    }
    
    public final void setTypes(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKeyApi() {
        return null;
    }
    
    public final void setKeyApi(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getApi() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getHost() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lvn/techres/android/weather/http/api/GetListCityApi$Companion;", "", "()V", "params", "Lvn/techres/android/weather/http/api/BaseApi;", "countryName", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.http.api.BaseApi params(@org.jetbrains.annotations.NotNull
        java.lang.String countryName) {
            return null;
        }
    }
}