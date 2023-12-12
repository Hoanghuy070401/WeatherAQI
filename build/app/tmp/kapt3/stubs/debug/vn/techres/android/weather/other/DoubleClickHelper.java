package vn.techres.android.weather.other;

import java.lang.System;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2018/10/18
 * desc   : 双击判断工具类
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lvn/techres/android/weather/other/DoubleClickHelper;", "", "()V", "TIME_ARRAY", "", "isOnDoubleClick", "", "time", "", "app_debug"})
public final class DoubleClickHelper {
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.other.DoubleClickHelper INSTANCE = null;
    
    /**
     * 数组的长度为2代表只记录双击操作
     */
    private static final long[] TIME_ARRAY = null;
    
    private DoubleClickHelper() {
        super();
    }
    
    /**
     * 是否在短时间内进行了双击操作
     */
    public final boolean isOnDoubleClick() {
        return false;
    }
    
    /**
     * 是否在短时间内进行了双击操作
     */
    public final boolean isOnDoubleClick(int time) {
        return false;
    }
}