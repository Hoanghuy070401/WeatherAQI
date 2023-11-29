package vn.techres.android.weather.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u001c\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ4\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0014j\b\u0012\u0004\u0012\u00020\u0012`\u0015J4\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0014j\b\u0012\u0004\u0012\u00020\u0012`\u0015J4\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0014j\b\u0012\u0004\u0012\u00020\u0012`\u0015J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lvn/techres/android/weather/utils/PhotoPickerUtils;", "", "()V", "selectorStyle", "Lcom/luck/picture/lib/style/PictureSelectorStyle;", "showImagePickerChat", "", "activity", "Landroid/app/Activity;", "intent", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "showImagePickerChooseAvatar", "showImagePickerInDialog", "context", "Landroid/content/Context;", "onResultCallbackListener", "Lcom/luck/picture/lib/interfaces/OnResultCallbackListener;", "Lcom/luck/picture/lib/entity/LocalMedia;", "listData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "showImagePickerNewsFeed", "showImagePickerOneMedia", "styleSelector", "app_debug"})
public final class PhotoPickerUtils {
    @org.jetbrains.annotations.Nullable
    private static com.luck.picture.lib.style.PictureSelectorStyle selectorStyle;
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.utils.PhotoPickerUtils INSTANCE = null;
    
    private PhotoPickerUtils() {
        super();
    }
    
    public final void showImagePickerChooseAvatar(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> intent) {
    }
    
    public final void showImagePickerChat(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> intent) {
    }
    
    public final void showImagePickerNewsFeed(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> intent, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> listData) {
    }
    
    public final void showImagePickerOneMedia(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> intent, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> listData) {
    }
    
    public final void showImagePickerInDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.luck.picture.lib.interfaces.OnResultCallbackListener<com.luck.picture.lib.entity.LocalMedia> onResultCallbackListener, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> listData) {
    }
    
    private final void styleSelector(android.content.Context context) {
    }
}