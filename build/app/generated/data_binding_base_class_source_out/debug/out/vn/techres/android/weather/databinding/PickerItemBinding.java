// Generated by data binding compiler. Do not edit!
package vn.techres.android.weather.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import vn.techres.android.weather.R;

public abstract class PickerItemBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView tvPickerName;

  protected PickerItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatTextView tvPickerName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvPickerName = tvPickerName;
  }

  @NonNull
  public static PickerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.picker_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PickerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PickerItemBinding>inflateInternal(inflater, R.layout.picker_item, root, attachToRoot, component);
  }

  @NonNull
  public static PickerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.picker_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PickerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PickerItemBinding>inflateInternal(inflater, R.layout.picker_item, null, false, component);
  }

  public static PickerItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static PickerItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (PickerItemBinding)bind(component, view, R.layout.picker_item);
  }
}
