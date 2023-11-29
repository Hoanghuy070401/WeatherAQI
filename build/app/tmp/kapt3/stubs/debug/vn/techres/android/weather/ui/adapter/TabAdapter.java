package vn.techres.android.weather.ui.adapter;

/**
 * @Author: NGUYEN THE DAT
 * @Date: 4/12/2023
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0005!\"#$%B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0014J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J$\u0010\u0017\u001a\u000e0\u0018R\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016J\"\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0011\u001a\u00020\u0007H\u0017J\u0010\u0010\u001f\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010 \u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lvn/techres/android/weather/ui/adapter/TabAdapter;", "Lvn/techres/android/weather/app/AppAdapter;", "", "Lvn/techres/base/BaseAdapter$OnItemClickListener;", "context", "Landroid/content/Context;", "tabMode", "", "fixed", "", "(Landroid/content/Context;IZ)V", "listener", "Lvn/techres/android/weather/ui/adapter/TabAdapter$OnTabListener;", "selectedPosition", "generateDefaultLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "getItemViewType", "position", "getSelectedPosition", "onAttachedToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onCreateViewHolder", "Lvn/techres/android/weather/app/AppAdapter$AppViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemClick", "itemView", "Landroid/view/View;", "setOnTabListener", "setSelectedPosition", "Companion", "DesignViewHolder", "OnTabListener", "SlidingViewHolder", "TabAdapterDataObserver", "app_debug"})
public final class TabAdapter extends vn.techres.android.weather.app.AppAdapter<java.lang.String> implements vn.techres.base.BaseAdapter.OnItemClickListener {
    
    /**
     * Tab style
     */
    private final int tabMode = 0;
    
    /**
     * Tab Chiều rộng có cố định không
     */
    private final boolean fixed = false;
    public static final int TAB_MODE_DESIGN = 1;
    public static final int TAB_MODE_SLIDING = 2;
    
    /**
     * Vị trí mục hiện được chọn
     */
    private int selectedPosition = 0;
    
    /**
     * Đối tượng trình nghe thanh điều hướng
     */
    @org.jetbrains.annotations.Nullable
    private vn.techres.android.weather.ui.adapter.TabAdapter.OnTabListener listener;
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.ui.adapter.TabAdapter.Companion Companion = null;
    
    @kotlin.jvm.JvmOverloads
    public TabAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, int tabMode, boolean fixed) {
        super(null);
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public vn.techres.android.weather.app.AppAdapter<java.lang.String>.AppViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected androidx.recyclerview.widget.RecyclerView.LayoutManager generateDefaultLayoutManager(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    public final int getSelectedPosition() {
        return 0;
    }
    
    public final void setSelectedPosition(int position) {
    }
    
    /**
     * Thiết lập trình nghe thanh điều hướng
     */
    public final void setOnTabListener(@org.jetbrains.annotations.Nullable
    vn.techres.android.weather.ui.adapter.TabAdapter.OnTabListener listener) {
    }
    
    /**
     * [BaseAdapter.OnItemClickListener]
     */
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public void onItemClick(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable
    android.view.View itemView, int position) {
    }
    
    @kotlin.jvm.JvmOverloads
    public TabAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public TabAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, int tabMode) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lvn/techres/android/weather/ui/adapter/TabAdapter$Companion;", "", "()V", "TAB_MODE_DESIGN", "", "TAB_MODE_SLIDING", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u000e0\u0001R\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lvn/techres/android/weather/ui/adapter/TabAdapter$DesignViewHolder;", "Lvn/techres/android/weather/app/AppAdapter$AppViewHolder;", "Lvn/techres/android/weather/app/AppAdapter;", "", "binding", "Lvn/techres/android/weather/databinding/TabItemDesignBinding;", "(Lvn/techres/android/weather/ui/adapter/TabAdapter;Lvn/techres/android/weather/databinding/TabItemDesignBinding;)V", "getBinding", "()Lvn/techres/android/weather/databinding/TabItemDesignBinding;", "onBindView", "", "position", "", "app_debug"})
    public final class DesignViewHolder extends vn.techres.android.weather.app.AppAdapter<java.lang.String>.AppViewHolder {
        @org.jetbrains.annotations.NotNull
        private final vn.techres.android.weather.databinding.TabItemDesignBinding binding = null;
        
        public DesignViewHolder(@org.jetbrains.annotations.NotNull
        vn.techres.android.weather.databinding.TabItemDesignBinding binding) {
            super(0);
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.databinding.TabItemDesignBinding getBinding() {
            return null;
        }
        
        @java.lang.Override
        public void onBindView(int position) {
        }
    }
    
    /**
     * Tab lắng nghe
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lvn/techres/android/weather/ui/adapter/TabAdapter$OnTabListener;", "", "onTabSelected", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "position", "", "app_debug"})
    public static abstract interface OnTabListener {
        
        /**
         * Tab đã được lựa chọn
         */
        public abstract boolean onTabSelected(@org.jetbrains.annotations.NotNull
        androidx.recyclerview.widget.RecyclerView recyclerView, int position);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u000e0\u0001R\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lvn/techres/android/weather/ui/adapter/TabAdapter$SlidingViewHolder;", "Lvn/techres/android/weather/app/AppAdapter$AppViewHolder;", "Lvn/techres/android/weather/app/AppAdapter;", "", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "binding", "Lvn/techres/android/weather/databinding/TabItemSlidingBinding;", "(Lvn/techres/android/weather/ui/adapter/TabAdapter;Lvn/techres/android/weather/databinding/TabItemSlidingBinding;)V", "getBinding", "()Lvn/techres/android/weather/databinding/TabItemSlidingBinding;", "mDefaultTextSize", "", "getMDefaultTextSize", "()I", "mDefaultTextSize$delegate", "Lkotlin/Lazy;", "mSelectedTextSize", "getMSelectedTextSize", "mSelectedTextSize$delegate", "onAnimationUpdate", "", "animation", "Landroid/animation/ValueAnimator;", "onBindView", "position", "startAnimator", "start", "end", "app_debug"})
    public final class SlidingViewHolder extends vn.techres.android.weather.app.AppAdapter<java.lang.String>.AppViewHolder implements android.animation.ValueAnimator.AnimatorUpdateListener {
        @org.jetbrains.annotations.NotNull
        private final vn.techres.android.weather.databinding.TabItemSlidingBinding binding = null;
        @org.jetbrains.annotations.NotNull
        private final kotlin.Lazy mDefaultTextSize$delegate = null;
        @org.jetbrains.annotations.NotNull
        private final kotlin.Lazy mSelectedTextSize$delegate = null;
        
        public SlidingViewHolder(@org.jetbrains.annotations.NotNull
        vn.techres.android.weather.databinding.TabItemSlidingBinding binding) {
            super(0);
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.techres.android.weather.databinding.TabItemSlidingBinding getBinding() {
            return null;
        }
        
        private final int getMDefaultTextSize() {
            return 0;
        }
        
        private final int getMSelectedTextSize() {
            return 0;
        }
        
        @java.lang.Override
        public void onBindView(int position) {
        }
        
        private final void startAnimator(int start, int end) {
        }
        
        @java.lang.Override
        public void onAnimationUpdate(@org.jetbrains.annotations.NotNull
        android.animation.ValueAnimator animation) {
        }
    }
    
    /**
     * Trình nghe thay đổi dữ liệu
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0002\u00a8\u0006\u0011"}, d2 = {"Lvn/techres/android/weather/ui/adapter/TabAdapter$TabAdapterDataObserver;", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "(Lvn/techres/android/weather/ui/adapter/TabAdapter;)V", "onChanged", "", "onItemRangeChanged", "positionStart", "", "itemCount", "payload", "", "onItemRangeInserted", "onItemRangeMoved", "fromPosition", "toPosition", "onItemRangeRemoved", "refreshLayoutManager", "app_debug"})
    final class TabAdapterDataObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        
        public TabAdapterDataObserver() {
            super();
        }
        
        @java.lang.Override
        public void onChanged() {
        }
        
        @java.lang.Override
        public void onItemRangeChanged(int positionStart, int itemCount, @org.jetbrains.annotations.Nullable
        java.lang.Object payload) {
        }
        
        @java.lang.Override
        public void onItemRangeChanged(int positionStart, int itemCount) {
        }
        
        @java.lang.Override
        public void onItemRangeInserted(int positionStart, int itemCount) {
        }
        
        @java.lang.Override
        public void onItemRangeRemoved(int positionStart, int itemCount) {
        }
        
        @java.lang.Override
        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
        }
        
        private final void refreshLayoutManager() {
        }
    }
}