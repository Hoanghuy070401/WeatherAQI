package vn.techres.android.weather.ui.dialog;

import java.lang.System;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2018/12/2
 * desc   : 提示对话框
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lvn/techres/android/weather/ui/dialog/TipsDialog;", "", "()V", "Builder", "Companion", "app_debug"})
public final class TipsDialog {
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.ui.dialog.TipsDialog.Companion Companion = null;
    public static final int ICON_FINISH = vn.techres.android.weather.R.drawable.tips_finish_ic;
    public static final int ICON_ERROR = vn.techres.android.weather.R.drawable.tips_error_ic;
    public static final int ICON_WARNING = vn.techres.android.weather.R.drawable.tips_warning_ic;
    
    public TipsDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u001b\u001a\u00020\u00002\b\b\u0001\u0010\u001c\u001a\u00020\bJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010\u001d\u001a\u00020\u00002\b\b\u0001\u0010\u001c\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006 "}, d2 = {"Lvn/techres/android/weather/ui/dialog/TipsDialog$Builder;", "Lvn/techres/base/BaseDialog$Builder;", "Ljava/lang/Runnable;", "Lvn/techres/base/BaseDialog$OnShowListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "duration", "", "iconView", "Landroid/widget/ImageView;", "getIconView", "()Landroid/widget/ImageView;", "iconView$delegate", "Lkotlin/Lazy;", "messageView", "Landroid/widget/TextView;", "getMessageView", "()Landroid/widget/TextView;", "messageView$delegate", "create", "Lvn/techres/base/BaseDialog;", "onShow", "", "dialog", "run", "setDuration", "setIcon", "id", "setMessage", "text", "", "app_debug"})
    public static final class Builder extends vn.techres.base.BaseDialog.Builder<vn.techres.android.weather.ui.dialog.TipsDialog.Builder> implements java.lang.Runnable, vn.techres.base.BaseDialog.OnShowListener {
        private final kotlin.Lazy messageView$delegate = null;
        private final kotlin.Lazy iconView$delegate = null;
        private int duration = 2000;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null);
        }
        
        private final android.widget.TextView getMessageView() {
            return null;
        }
        
        private final android.widget.ImageView getIconView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.ui.dialog.TipsDialog.Builder setIcon(@androidx.annotation.DrawableRes
        int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.ui.dialog.TipsDialog.Builder setDuration(int duration) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.ui.dialog.TipsDialog.Builder setMessage(@androidx.annotation.StringRes
        int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.ui.dialog.TipsDialog.Builder setMessage(@org.jetbrains.annotations.Nullable
        java.lang.CharSequence text) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public vn.techres.base.BaseDialog create() {
            return null;
        }
        
        @java.lang.Override
        public void onShow(@org.jetbrains.annotations.Nullable
        vn.techres.base.BaseDialog dialog) {
        }
        
        @java.lang.Override
        public void run() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lvn/techres/android/weather/ui/dialog/TipsDialog$Companion;", "", "()V", "ICON_ERROR", "", "ICON_FINISH", "ICON_WARNING", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}