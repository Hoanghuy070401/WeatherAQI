package vn.techres.android.weather.ui.dialog;

/**
 * @Author: NGUYEN THE DAT
 * @Date: 4/8/2023
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lvn/techres/android/weather/ui/dialog/UpdateDialog;", "", "()V", "Builder", "app_debug"})
public final class UpdateDialog {
    
    public UpdateDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0012J\u0010\u0010$\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010&J\u0010\u0010\'\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010&R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0019\u0010\u000b\u00a8\u0006)"}, d2 = {"Lvn/techres/android/weather/ui/dialog/UpdateDialog$Builder;", "Lvn/techres/base/BaseDialog$Builder;", "Lvn/techres/base/action/ToastAction;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "apkFile", "Ljava/io/File;", "closeView", "Landroid/widget/TextView;", "getCloseView", "()Landroid/widget/TextView;", "closeView$delegate", "Lkotlin/Lazy;", "detailsView", "getDetailsView", "detailsView$delegate", "forceUpdate", "", "goMarket", "Landroid/content/Intent;", "nameView", "getNameView", "nameView$delegate", "updateView", "getUpdateView", "updateView$delegate", "onClick", "", "view", "Landroid/view/View;", "setDownloadUrl", "url", "", "setForceUpdate", "force", "setUpdateLog", "text", "", "setVersionName", "name", "app_debug"})
    public static final class Builder extends vn.techres.base.BaseDialog.Builder<vn.techres.android.weather.ui.dialog.UpdateDialog.Builder> implements vn.techres.base.action.ToastAction {
        @org.jetbrains.annotations.NotNull
        private final kotlin.Lazy nameView$delegate = null;
        @org.jetbrains.annotations.NotNull
        private final kotlin.Lazy detailsView$delegate = null;
        @org.jetbrains.annotations.NotNull
        private final kotlin.Lazy updateView$delegate = null;
        @org.jetbrains.annotations.NotNull
        private final kotlin.Lazy closeView$delegate = null;
        
        /**
         * Apk 文件
         */
        @org.jetbrains.annotations.Nullable
        private java.io.File apkFile;
        
        /**
         * 是否强制更新
         */
        private boolean forceUpdate = false;
        
        /**
         * 当前是否下载完毕
         */
        @org.jetbrains.annotations.Nullable
        private android.content.Intent goMarket;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null);
        }
        
        private final android.widget.TextView getNameView() {
            return null;
        }
        
        private final android.widget.TextView getDetailsView() {
            return null;
        }
        
        private final android.widget.TextView getUpdateView() {
            return null;
        }
        
        private final android.widget.TextView getCloseView() {
            return null;
        }
        
        /**
         * 设置版本名
         */
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.ui.dialog.UpdateDialog.Builder setVersionName(@org.jetbrains.annotations.Nullable
        java.lang.CharSequence name) {
            return null;
        }
        
        /**
         * 设置更新日志
         */
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.ui.dialog.UpdateDialog.Builder setUpdateLog(@org.jetbrains.annotations.Nullable
        java.lang.CharSequence text) {
            return null;
        }
        
        /**
         * 设置强制更新
         */
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.ui.dialog.UpdateDialog.Builder setForceUpdate(boolean force) {
            return null;
        }
        
        /**
         * 设置下载 url
         */
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.ui.dialog.UpdateDialog.Builder setDownloadUrl(@org.jetbrains.annotations.Nullable
        java.lang.String url) {
            return null;
        }
        
        @java.lang.Override
        public void onClick(@org.jetbrains.annotations.NotNull
        android.view.View view) {
        }
        
        @java.lang.Override
        public void toast(@androidx.annotation.StringRes
        int id) {
        }
        
        @java.lang.Override
        public void toast(@org.jetbrains.annotations.Nullable
        java.lang.CharSequence text) {
        }
        
        @java.lang.Override
        public void toast(@org.jetbrains.annotations.Nullable
        java.lang.Object object) {
        }
    }
}