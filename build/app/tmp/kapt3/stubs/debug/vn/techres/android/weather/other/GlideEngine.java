package vn.techres.android.weather.other;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J0\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0014"}, d2 = {"Lvn/techres/android/weather/other/GlideEngine;", "Lcom/luck/picture/lib/engine/ImageEngine;", "()V", "loadAlbumCover", "", "context", "Landroid/content/Context;", "url", "", "imageView", "Landroid/widget/ImageView;", "loadGridImage", "loadImage", "maxWidth", "", "maxHeight", "pauseRequests", "resumeRequests", "Companion", "InstanceHolder", "app_debug"})
public final class GlideEngine implements com.luck.picture.lib.engine.ImageEngine {
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.other.GlideEngine.Companion Companion = null;
    
    private GlideEngine() {
        super();
    }
    
    /**
     * 加载图片
     *
     * @param context   上下文
     * @param url       资源url
     * @param imageView 图片承载控件
     */
    @java.lang.Override
    public void loadImage(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView) {
    }
    
    @java.lang.Override
    public void loadImage(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull
    java.lang.String url, int maxWidth, int maxHeight) {
    }
    
    /**
     * 加载相册目录封面
     *
     * @param context   上下文
     * @param url       图片路径
     * @param imageView 承载图片ImageView
     */
    @java.lang.Override
    public void loadAlbumCover(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView) {
    }
    
    /**
     * 加载图片列表图片
     *
     * @param context   上下文
     * @param url       图片路径
     * @param imageView 承载图片ImageView
     */
    @java.lang.Override
    public void loadGridImage(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView) {
    }
    
    @java.lang.Override
    public void pauseRequests(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public void resumeRequests(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lvn/techres/android/weather/other/GlideEngine$InstanceHolder;", "", "()V", "instance", "Lvn/techres/android/weather/other/GlideEngine;", "getInstance", "()Lvn/techres/android/weather/other/GlideEngine;", "app_debug"})
    static final class InstanceHolder {
        @org.jetbrains.annotations.NotNull
        public static final vn.techres.android.weather.other.GlideEngine.InstanceHolder INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static final vn.techres.android.weather.other.GlideEngine instance = null;
        
        private InstanceHolder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.other.GlideEngine getInstance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lvn/techres/android/weather/other/GlideEngine$Companion;", "", "()V", "createGlideEngine", "Lvn/techres/android/weather/other/GlideEngine;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.other.GlideEngine createGlideEngine() {
            return null;
        }
    }
}