package vn.techres.android.weather.app;

/**
 * @Author: Bui Huu Thang
 * @Date: 28/09/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u0002H\u00010\u00000\u00022\u00020\u0004:\u000234B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0016J\u0015\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0017J\u001f\u0010\u0015\u001a\u00020\u00132\b\b\u0001\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\u0017\u0010\u001b\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\u001cJ\u0012\u0010\u001b\u001a\u00020\u000b2\b\b\u0001\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0017\u0010\u001f\u001a\u00028\u00002\b\b\u0001\u0010\u0018\u001a\u00020\rH\u0016\u00a2\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\rH\u0016J\b\u0010\"\u001a\u00020\rH\u0016J\n\u0010#\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010$\u001a\u00020\u000bH\u0016J\u0015\u0010%\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0017J\u0012\u0010%\u001a\u00020\u00132\b\b\u0001\u0010\u0018\u001a\u00020\rH\u0016J\u0018\u0010&\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0017J\u001f\u0010\'\u001a\u00020\u00132\b\b\u0001\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u000bH\u0016J\u0012\u0010*\u001a\u00020\u00132\b\b\u0001\u0010+\u001a\u00020\rH\u0016J\u0010\u0010,\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010-\u001a\u00020\u0013*\u00020.2\b\b\u0002\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001302R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lvn/techres/android/weather/app/AppAdapter;", "T", "Lvn/techres/base/BaseAdapter;", "Lvn/techres/android/weather/app/AppAdapter$AppViewHolder;", "Lvn/techres/base/action/ToastAction;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dataSet", "", "lastPage", "", "pageNumber", "", "tag", "", "AppUtilsIAppUtilsInstancenstance", "Lvn/techres/android/weather/utils/AppUtils;", "addData", "", "data", "addItem", "item", "(Ljava/lang/Object;)V", "position", "(ILjava/lang/Object;)V", "clearData", "containsItem", "(Ljava/lang/Object;)Z", "getCount", "getData", "getItem", "(I)Ljava/lang/Object;", "getItemCount", "getPageNumber", "getTag", "isLastPage", "removeItem", "setData", "setItem", "setLastPage", "last", "setPageNumber", "number", "setTag", "clickWithDebounce", "Landroid/view/View;", "debounceTime", "", "action", "Lkotlin/Function0;", "AppViewHolder", "SimpleViewHolder", "app_debug"})
public abstract class AppAdapter<T extends java.lang.Object> extends vn.techres.base.BaseAdapter<vn.techres.android.weather.app.AppAdapter<T>.AppViewHolder> implements vn.techres.base.action.ToastAction {
    
    /**
     * Liệt kê dữ liệu
     */
    @org.jetbrains.annotations.NotNull
    private java.util.List<T> dataSet;
    
    /**
     * Số trang của danh sách hiện tại, mặc định là trang đầu tiên, được sử dụng cho chức năng tải phân trang
     */
    private int pageNumber = 1;
    
    /**
     * Cho dù đó là trang cuối cùng, mặc định là false, được sử dụng cho chức năng tải phân trang
     */
    private boolean lastPage = false;
    
    /**
     * Thẻ đối tượng
     */
    @org.jetbrains.annotations.Nullable
    private java.lang.Object tag;
    
    public AppAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    /**
     * Nhận tổng số dữ liệu
     */
    public int getCount() {
        return 0;
    }
    
    /**
     * Thiết lập dữ liệu mới
     */
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public void setData(@org.jetbrains.annotations.Nullable
    java.util.List<T> data) {
    }
    
    /**
     * Lấy dữ liệu hiện tại
     */
    @org.jetbrains.annotations.NotNull
    public java.util.List<T> getData() {
        return null;
    }
    
    /**
     * nối một số dữ liệu
     */
    public void addData(@org.jetbrains.annotations.Nullable
    java.util.List<T> data) {
    }
    
    /**
     * Xóa dữ liệu hiện tại
     */
    public void clearData() {
    }
    
    /**
     * Có bao gồm dữ liệu nhập tại một vị trí hay không
     */
    public boolean containsItem(@androidx.annotation.IntRange(from = 0L)
    int position) {
        return false;
    }
    
    /**
     * Có bao gồm dữ liệu mục hay không
     */
    public boolean containsItem(@org.jetbrains.annotations.Nullable
    T item) {
        return false;
    }
    
    /**
     * Nhận dữ liệu tại một vị trí
     */
    public T getItem(@androidx.annotation.IntRange(from = 0L)
    int position) {
        return null;
    }
    
    /**
     * Cập nhật dữ liệu tại một vị trí
     */
    public void setItem(@androidx.annotation.IntRange(from = 0L)
    int position, T item) {
    }
    
    /**
     * Thêm một phần dữ liệu duy nhất
     */
    public void addItem(T item) {
    }
    
    public void addItem(@androidx.annotation.IntRange(from = 0L)
    int position, T item) {
    }
    
    /**
     * Xóa một phần dữ liệu
     */
    public void removeItem(T item) {
    }
    
    public void removeItem(@androidx.annotation.IntRange(from = 0L)
    int position) {
    }
    
    /**
     * Lấy số trang hiện tại
     */
    public int getPageNumber() {
        return 0;
    }
    
    /**
     * Đặt số trang hiện tại
     */
    public void setPageNumber(@androidx.annotation.IntRange(from = 0L)
    int number) {
    }
    
    /**
     * Hiện tại có phải là trang cuối cùng không
     */
    public boolean isLastPage() {
        return false;
    }
    
    /**
     * Đặt xem đó có phải là trang cuối cùng hay không
     */
    public void setLastPage(boolean last) {
    }
    
    /**
     * Lấy điểm đánh dấu
     */
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getTag() {
        return null;
    }
    
    /**
     * Đặt điểm đánh dấu
     */
    public void setTag(@org.jetbrains.annotations.NotNull
    java.lang.Object tag) {
    }
    
    /**
     * Khởi tạo instance AppUtils
     */
    @org.jetbrains.annotations.NotNull
    public final vn.techres.android.weather.utils.AppUtils AppUtilsIAppUtilsInstancenstance() {
        return null;
    }
    
    public final void clickWithDebounce(@org.jetbrains.annotations.NotNull
    android.view.View $this$clickWithDebounce, long debounceTime, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00a6\u0004\u0018\u00002\u00160\u0001R\u0012\u0012\u000e\u0012\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lvn/techres/android/weather/app/AppAdapter$AppViewHolder;", "Lvn/techres/base/BaseAdapter$BaseViewHolder;", "Lvn/techres/base/BaseAdapter;", "Lvn/techres/android/weather/app/AppAdapter;", "id", "", "(Lvn/techres/android/weather/app/AppAdapter;I)V", "itemView", "Landroid/view/View;", "(Lvn/techres/android/weather/app/AppAdapter;Landroid/view/View;)V", "app_debug"})
    public abstract class AppViewHolder extends vn.techres.base.BaseAdapter<vn.techres.android.weather.app.AppAdapter<T>.AppViewHolder>.BaseViewHolder {
        
        public AppViewHolder(@androidx.annotation.LayoutRes
        int id) {
            super(0);
        }
        
        public AppViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016\u00a8\u0006\f"}, d2 = {"Lvn/techres/android/weather/app/AppAdapter$SimpleViewHolder;", "Lvn/techres/android/weather/app/AppAdapter$AppViewHolder;", "Lvn/techres/android/weather/app/AppAdapter;", "id", "", "(Lvn/techres/android/weather/app/AppAdapter;I)V", "itemView", "Landroid/view/View;", "(Lvn/techres/android/weather/app/AppAdapter;Landroid/view/View;)V", "onBindView", "", "position", "app_debug"})
    public final class SimpleViewHolder extends vn.techres.android.weather.app.AppAdapter<T>.AppViewHolder {
        
        public SimpleViewHolder(@androidx.annotation.LayoutRes
        int id) {
            super(null, 0);
        }
        
        public SimpleViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null, 0);
        }
        
        @java.lang.Override
        public void onBindView(int position) {
        }
    }
}