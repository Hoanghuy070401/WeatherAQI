package vn.techres.android.weather.http.api;

import java.lang.System;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/23/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lvn/techres/android/weather/http/api/GetDetailCityApi;", "Lvn/techres/android/weather/http/api/BaseApi;", "()V", "idCity", "", "getIdCity", "()Ljava/lang/String;", "setIdCity", "(Ljava/lang/String;)V", "keyApi", "getKeyApi", "setKeyApi", "lang", "getLang", "setLang", "getApi", "getHost", "Companion", "app_debug"})
public final class GetDetailCityApi extends vn.techres.android.weather.http.api.BaseApi {
    @org.jetbrains.annotations.NotNull
    @com.hjq.http.annotation.HttpRename(value = "id")
    private java.lang.String idCity = "";
    @org.jetbrains.annotations.NotNull
    @com.hjq.http.annotation.HttpRename(value = "lang")
    private java.lang.String lang = "vi";
    @org.jetbrains.annotations.NotNull
    @com.hjq.http.annotation.HttpRename(value = "apiKey")
    private java.lang.String keyApi = "KCh8EqX8SazXmRGXLEq8kbLF9cgygdZ7NNV0e42k67s";
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.http.api.GetDetailCityApi.Companion Companion = null;
    
    public GetDetailCityApi() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIdCity() {
        return null;
    }
    
    public final void setIdCity(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLang() {
        return null;
    }
    
    public final void setLang(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKeyApi() {
        return null;
    }
    
    public final void setKeyApi(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getHost() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lvn/techres/android/weather/http/api/GetDetailCityApi$Companion;", "", "()V", "params", "Lvn/techres/android/weather/http/api/BaseApi;", "idCity", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.http.api.BaseApi params(@org.jetbrains.annotations.NotNull
        java.lang.String idCity) {
            return null;
        }
    }
}