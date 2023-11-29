package vn.techres.android.weather.app.helper;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a8\u0006\u0011"}, d2 = {"Lvn/techres/android/weather/app/helper/GlobalUploadObserver;", "Lnet/gotev/uploadservice/observer/request/RequestObserverDelegate;", "()V", "onCompleted", "", "context", "Landroid/content/Context;", "uploadInfo", "Lnet/gotev/uploadservice/data/UploadInfo;", "onCompletedWhileNotObserving", "onError", "exception", "", "onProgress", "onSuccess", "serverResponse", "Lnet/gotev/uploadservice/network/ServerResponse;", "app_debug"})
public final class GlobalUploadObserver implements net.gotev.uploadservice.observer.request.RequestObserverDelegate {
    
    public GlobalUploadObserver() {
        super();
    }
    
    @java.lang.Override
    public void onCompleted(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    net.gotev.uploadservice.data.UploadInfo uploadInfo) {
    }
    
    @java.lang.Override
    public void onCompletedWhileNotObserving() {
    }
    
    @java.lang.Override
    public void onError(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    net.gotev.uploadservice.data.UploadInfo uploadInfo, @org.jetbrains.annotations.NotNull
    java.lang.Throwable exception) {
    }
    
    @java.lang.Override
    public void onProgress(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    net.gotev.uploadservice.data.UploadInfo uploadInfo) {
    }
    
    @java.lang.Override
    public void onSuccess(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    net.gotev.uploadservice.data.UploadInfo uploadInfo, @org.jetbrains.annotations.NotNull
    net.gotev.uploadservice.network.ServerResponse serverResponse) {
    }
}