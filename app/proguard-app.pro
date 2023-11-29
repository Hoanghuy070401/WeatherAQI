# Bỏ qua cảnh báo
#-ignorewarning

# Làm xáo trộn và bảo vệ một phần mã của dự án của riêng bạn và các gói jar của bên thứ ba được tham chiếu
#-libraryjars libs/xxxxxxxxx.jar

-keep class vn.techres.android.weather.http.api.** {
    <fields>;
}
-keep class vn.techres.android.weather.http.response.** {
    <fields>;
}
-keep class vn.techres.android.weather.http.model.** {
    <fields>;
}


-keepclassmembernames class ** {
    @vn.techres.android.weather.aop.Log <methods>;
}

-keepattributes *Annotation*
-keepclassmembers class ** {
    @org.greenrobot.eventbus.Subscribe <methods>;
}
-keep enum org.greenrobot.eventbus.ThreadMode { *; }

# Only required if you use AsyncExecutor
-keepclassmembers class * extends org.greenrobot.eventbus.util.ThrowableFailureEvent {
    <init>(java.lang.Throwable);
}

-keep class com.google.firebase.appcheck.** { *; }