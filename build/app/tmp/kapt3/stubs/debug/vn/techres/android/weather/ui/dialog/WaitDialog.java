package vn.techres.android.weather.ui.dialog;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2018/12/2
 * desc   : 等待加载对话框
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lvn/techres/android/weather/ui/dialog/WaitDialog;", "", "()V", "Builder", "app_debug"})
public final class WaitDialog {
    
    public WaitDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u000fR\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lvn/techres/android/weather/ui/dialog/WaitDialog$Builder;", "Lvn/techres/base/BaseDialog$Builder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "messageView", "Landroid/widget/TextView;", "getMessageView", "()Landroid/widget/TextView;", "messageView$delegate", "Lkotlin/Lazy;", "setMessage", "text", "", "id", "", "app_debug"})
    public static final class Builder extends vn.techres.base.BaseDialog.Builder<vn.techres.android.weather.ui.dialog.WaitDialog.Builder> {
        @org.jetbrains.annotations.NotNull
        private final kotlin.Lazy messageView$delegate = null;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null);
        }
        
        private final android.widget.TextView getMessageView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.ui.dialog.WaitDialog.Builder setMessage(@androidx.annotation.StringRes
        int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.ui.dialog.WaitDialog.Builder setMessage(@org.jetbrains.annotations.Nullable
        java.lang.CharSequence text) {
            return null;
        }
    }
}