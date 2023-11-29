package vn.techres.android.weather.ui.adapter;

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 9/21/2023.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\"\u0010\f\u001a\f0\rR\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lvn/techres/android/weather/ui/adapter/ListCityAdapter;", "Lvn/techres/android/weather/app/AppAdapter;", "Lvn/techres/android/weather/model/entity/modelCity/ItemSearch;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "imageClickListener", "Lvn/techres/android/weather/model/interfaces/imageClick;", "getImageClickListener", "()Lvn/techres/android/weather/model/interfaces/imageClick;", "setImageClickListener", "(Lvn/techres/android/weather/model/interfaces/imageClick;)V", "onCreateViewHolder", "Lvn/techres/android/weather/app/AppAdapter$AppViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "ViewHolder", "app_debug"})
public final class ListCityAdapter extends vn.techres.android.weather.app.AppAdapter<vn.techres.android.weather.model.entity.modelCity.ItemSearch> {
    @org.jetbrains.annotations.Nullable
    private vn.techres.android.weather.model.interfaces.imageClick imageClickListener;
    
    public ListCityAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final vn.techres.android.weather.model.interfaces.imageClick getImageClickListener() {
        return null;
    }
    
    public final void setImageClickListener(@org.jetbrains.annotations.Nullable
    vn.techres.android.weather.model.interfaces.imageClick p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public vn.techres.android.weather.app.AppAdapter<vn.techres.android.weather.model.entity.modelCity.ItemSearch>.AppViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lvn/techres/android/weather/ui/adapter/ListCityAdapter$ViewHolder;", "Lvn/techres/android/weather/app/AppAdapter$AppViewHolder;", "Lvn/techres/android/weather/app/AppAdapter;", "Lvn/techres/android/weather/model/entity/modelCity/ItemSearch;", "binding", "Lvn/techres/android/weather/databinding/ItemCityBinding;", "(Lvn/techres/android/weather/ui/adapter/ListCityAdapter;Lvn/techres/android/weather/databinding/ItemCityBinding;)V", "onBindView", "", "position", "", "app_debug"})
    public final class ViewHolder extends vn.techres.android.weather.app.AppAdapter<vn.techres.android.weather.model.entity.modelCity.ItemSearch>.AppViewHolder {
        @org.jetbrains.annotations.NotNull
        private final vn.techres.android.weather.databinding.ItemCityBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        vn.techres.android.weather.databinding.ItemCityBinding binding) {
            super(null, 0);
        }
        
        @java.lang.Override
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public void onBindView(int position) {
        }
    }
}