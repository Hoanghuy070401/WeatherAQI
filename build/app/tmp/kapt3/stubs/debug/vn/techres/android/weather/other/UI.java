package vn.techres.android.weather.other;

/**
 * @Author: NGUYEN KHANH DUY
 * @Date: 24/04/2023
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0003J\u0006\u0010\"\u001a\u00020\u001dJ\u000e\u0010#\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010#\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\t\u00a8\u0006&"}, d2 = {"Lvn/techres/android/weather/other/UI;", "", "()V", "darkMode", "", "mCustomFooter", "getMCustomFooter", "()Z", "setMCustomFooter", "(Z)V", "mCustomView", "getMCustomView", "setMCustomView", "mEmojiView", "getMEmojiView", "setMEmojiView", "mFooterView", "getMFooterView", "setMFooterView", "mSingleEmojiView", "getMSingleEmojiView", "setMSingleEmojiView", "mStickerView", "getMStickerView", "setMStickerView", "mWhiteCategory", "getMWhiteCategory", "setMWhiteCategory", "initCustomFooter", "", "context", "Landroid/content/Context;", "emojiPager", "Lcom/aghajari/emojiview/view/AXEmojiPager;", "loadTheme", "loadView", "editText", "Landroid/widget/EditText;", "app_debug"})
public final class UI {
    private static boolean mEmojiView = false;
    private static boolean mSingleEmojiView = false;
    private static boolean mStickerView = false;
    private static boolean mCustomView = false;
    private static boolean mFooterView = false;
    private static boolean mCustomFooter = false;
    private static boolean mWhiteCategory = false;
    @kotlin.jvm.JvmField
    public static boolean darkMode = false;
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.other.UI INSTANCE = null;
    
    private UI() {
        super();
    }
    
    public final boolean getMEmojiView() {
        return false;
    }
    
    public final void setMEmojiView(boolean p0) {
    }
    
    public final boolean getMSingleEmojiView() {
        return false;
    }
    
    public final void setMSingleEmojiView(boolean p0) {
    }
    
    public final boolean getMStickerView() {
        return false;
    }
    
    public final void setMStickerView(boolean p0) {
    }
    
    public final boolean getMCustomView() {
        return false;
    }
    
    public final void setMCustomView(boolean p0) {
    }
    
    public final boolean getMFooterView() {
        return false;
    }
    
    public final void setMFooterView(boolean p0) {
    }
    
    public final boolean getMCustomFooter() {
        return false;
    }
    
    public final void setMCustomFooter(boolean p0) {
    }
    
    public final boolean getMWhiteCategory() {
        return false;
    }
    
    public final void setMWhiteCategory(boolean p0) {
    }
    
    public final void loadTheme() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.aghajari.emojiview.view.AXEmojiPager loadView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.widget.EditText editText) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.aghajari.emojiview.view.AXEmojiPager loadView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility", "UseCompatLoadingForDrawables"})
    private final void initCustomFooter(android.content.Context context, com.aghajari.emojiview.view.AXEmojiPager emojiPager) {
    }
}