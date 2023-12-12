package vn.techres.android.weather.app;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 28/09/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016\u00a8\u0006\t"}, d2 = {"Lvn/techres/android/weather/app/AppApplication;", "Landroid/app/Application;", "()V", "createNotificationChannels", "", "context", "Landroid/content/Context;", "onCreate", "Companion", "app_debug"})
public final class AppApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.app.AppApplication.Companion Companion = null;
    public static com.tencent.mmkv.MMKV kv;
    @org.jetbrains.annotations.Nullable
    private static vn.techres.android.weather.app.AppApplication instance;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String UPLOAD_CHANNEL_ID = "UPLOAD_CHANNEL_ID";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EMPLOYEE_NOTIFICATION_CHANNEL_ID = "EMPLOYEE_NOTIFICATION_CHANNEL_ID";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SYSTEM_NOTIFICATION_CHANNEL_ID = "SYSTEM_NOTIFICATION_CHANNEL_ID";
    public static android.app.NotificationChannel channelUpload;
    public static android.app.NotificationChannel channelEmployee;
    public static android.app.NotificationChannel channelSystem;
    public static android.app.NotificationManager notificationManager;
    private static int widthView = 0;
    private static int heightView = 0;
    
    public AppApplication() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    private final void createNotificationChannels(android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00042\b\b\u0001\u00103\u001a\u00020\u0014J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u000207R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010\u0018\u00a8\u00068"}, d2 = {"Lvn/techres/android/weather/app/AppApplication$Companion;", "", "()V", "EMPLOYEE_NOTIFICATION_CHANNEL_ID", "", "SYSTEM_NOTIFICATION_CHANNEL_ID", "UPLOAD_CHANNEL_ID", "channelEmployee", "Landroid/app/NotificationChannel;", "getChannelEmployee", "()Landroid/app/NotificationChannel;", "setChannelEmployee", "(Landroid/app/NotificationChannel;)V", "channelSystem", "getChannelSystem", "setChannelSystem", "channelUpload", "getChannelUpload", "setChannelUpload", "heightView", "", "getHeightView", "()I", "setHeightView", "(I)V", "instance", "Lvn/techres/android/weather/app/AppApplication;", "getInstance", "()Lvn/techres/android/weather/app/AppApplication;", "setInstance", "(Lvn/techres/android/weather/app/AppApplication;)V", "kv", "Lcom/tencent/mmkv/MMKV;", "getKv", "()Lcom/tencent/mmkv/MMKV;", "setKv", "(Lcom/tencent/mmkv/MMKV;)V", "notificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "()Landroid/app/NotificationManager;", "setNotificationManager", "(Landroid/app/NotificationManager;)V", "widthView", "getWidthView", "setWidthView", "getNotificationConfig", "Lnet/gotev/uploadservice/data/UploadNotificationConfig;", "context", "Landroid/content/Context;", "uploadId", "title", "initSdk", "", "application", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.tencent.mmkv.MMKV getKv() {
            return null;
        }
        
        public final void setKv(@org.jetbrains.annotations.NotNull
        com.tencent.mmkv.MMKV p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final vn.techres.android.weather.app.AppApplication getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.Nullable
        vn.techres.android.weather.app.AppApplication p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.app.NotificationChannel getChannelUpload() {
            return null;
        }
        
        public final void setChannelUpload(@org.jetbrains.annotations.NotNull
        android.app.NotificationChannel p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.app.NotificationChannel getChannelEmployee() {
            return null;
        }
        
        public final void setChannelEmployee(@org.jetbrains.annotations.NotNull
        android.app.NotificationChannel p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.app.NotificationChannel getChannelSystem() {
            return null;
        }
        
        public final void setChannelSystem(@org.jetbrains.annotations.NotNull
        android.app.NotificationChannel p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.app.NotificationManager getNotificationManager() {
            return null;
        }
        
        public final void setNotificationManager(@org.jetbrains.annotations.NotNull
        android.app.NotificationManager p0) {
        }
        
        public final int getWidthView() {
            return 0;
        }
        
        public final void setWidthView(int p0) {
        }
        
        public final int getHeightView() {
            return 0;
        }
        
        public final void setHeightView(int p0) {
        }
        
        public final void initSdk(@org.jetbrains.annotations.NotNull
        android.app.Application application) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final net.gotev.uploadservice.data.UploadNotificationConfig getNotificationConfig(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String uploadId, @androidx.annotation.StringRes
        int title) {
            return null;
        }
    }
}