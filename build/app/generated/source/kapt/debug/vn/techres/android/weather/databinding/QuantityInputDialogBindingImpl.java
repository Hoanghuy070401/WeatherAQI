package vn.techres.android.weather.databinding;
import vn.techres.android.weather.R;
import vn.techres.android.weather.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class QuantityInputDialogBindingImpl extends QuantityInputDialogBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvTitle, 1);
        sViewsWithIds.put(R.id.tvInput, 2);
        sViewsWithIds.put(R.id.btnKeyReset, 3);
        sViewsWithIds.put(R.id.btnKeyMinus, 4);
        sViewsWithIds.put(R.id.btnKeyPlus, 5);
        sViewsWithIds.put(R.id.btnKeyBack, 6);
        sViewsWithIds.put(R.id.btnKey7, 7);
        sViewsWithIds.put(R.id.btnKey8, 8);
        sViewsWithIds.put(R.id.btnKey9, 9);
        sViewsWithIds.put(R.id.btnKey4, 10);
        sViewsWithIds.put(R.id.btnKey5, 11);
        sViewsWithIds.put(R.id.btnKey6, 12);
        sViewsWithIds.put(R.id.btnKey1, 13);
        sViewsWithIds.put(R.id.btnKey2, 14);
        sViewsWithIds.put(R.id.btnKey3, 15);
        sViewsWithIds.put(R.id.btnKey0, 16);
        sViewsWithIds.put(R.id.btnKey000, 17);
        sViewsWithIds.put(R.id.btnKeyDot, 18);
        sViewsWithIds.put(R.id.btnAccept, 19);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public QuantityInputDialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private QuantityInputDialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (vn.techres.android.weather.widget.AppButton) bindings[19]
            , (vn.techres.android.weather.widget.AppButton) bindings[16]
            , (vn.techres.android.weather.widget.AppButton) bindings[17]
            , (vn.techres.android.weather.widget.AppButton) bindings[13]
            , (vn.techres.android.weather.widget.AppButton) bindings[14]
            , (vn.techres.android.weather.widget.AppButton) bindings[15]
            , (vn.techres.android.weather.widget.AppButton) bindings[10]
            , (vn.techres.android.weather.widget.AppButton) bindings[11]
            , (vn.techres.android.weather.widget.AppButton) bindings[12]
            , (vn.techres.android.weather.widget.AppButton) bindings[7]
            , (vn.techres.android.weather.widget.AppButton) bindings[8]
            , (vn.techres.android.weather.widget.AppButton) bindings[9]
            , (android.widget.ImageButton) bindings[6]
            , (vn.techres.android.weather.widget.AppButton) bindings[18]
            , (vn.techres.android.weather.widget.AppButton) bindings[4]
            , (vn.techres.android.weather.widget.AppButton) bindings[5]
            , (vn.techres.android.weather.widget.AppButton) bindings[3]
            , (vn.techres.android.weather.widget.AppTextViewBold) bindings[2]
            , (vn.techres.android.weather.widget.AppTextViewBold) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}