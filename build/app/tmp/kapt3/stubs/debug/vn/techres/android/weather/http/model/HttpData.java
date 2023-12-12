package vn.techres.android.weather.http.model;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 03/10/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\r\u0010\n\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lvn/techres/android/weather/http/model/HttpData;", "T", "", "()V", "code", "", "list", "Ljava/lang/Object;", "message", "getCode", "getData", "()Ljava/lang/Object;", "getMessage", "isRequestSucceed", "", "isRequestUnauthorized", "isTokenFailure", "app_debug"})
public class HttpData<T extends java.lang.Object> {
    private final java.lang.String code = null;
    private final java.lang.String message = null;
    private final T list = null;
    
    public HttpData() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final T getData() {
        return null;
    }
    
    public final boolean isRequestSucceed() {
        return false;
    }
    
    public final boolean isRequestUnauthorized() {
        return false;
    }
    
    public final boolean isTokenFailure() {
        return false;
    }
}