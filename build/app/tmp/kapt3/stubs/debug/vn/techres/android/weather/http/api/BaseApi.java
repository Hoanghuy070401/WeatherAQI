package vn.techres.android.weather.http.api;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 03/10/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lvn/techres/android/weather/http/api/BaseApi;", "Lcom/hjq/http/config/IRequestApi;", "Lcom/hjq/http/config/IRequestType;", "Lcom/hjq/http/config/IRequestHost;", "()V", "appid", "", "getAppid", "()Ljava/lang/String;", "setAppid", "(Ljava/lang/String;)V", "getApi", "getBodyType", "Lcom/hjq/http/model/BodyType;", "getHost", "app_debug"})
public class BaseApi implements com.hjq.http.config.IRequestApi, com.hjq.http.config.IRequestType, com.hjq.http.config.IRequestHost {
    @org.jetbrains.annotations.NotNull
    @com.hjq.http.annotation.HttpRename(value = "appid")
    @com.hjq.http.annotation.HttpHeader
    private java.lang.String appid = "9de243494c0b295cca9337e1e96b00e2";
    
    public BaseApi() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAppid() {
        return null;
    }
    
    public final void setAppid(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.hjq.http.model.BodyType getBodyType() {
        return null;
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
}