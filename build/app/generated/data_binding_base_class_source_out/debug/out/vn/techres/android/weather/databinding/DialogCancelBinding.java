// Generated by data binding compiler. Do not edit!
package vn.techres.android.weather.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import vn.techres.android.weather.R;
import vn.techres.android.weather.widget.AppButtonBold;
import vn.techres.android.weather.widget.AppEditText;
import vn.techres.android.weather.widget.AppTextViewBold;

public abstract class DialogCancelBinding extends ViewDataBinding {
  @NonNull
  public final AppButtonBold btnCancel;

  @NonNull
  public final AppButtonBold btnConfirm;

  @NonNull
  public final AppEditText tvCancelReason;

  @NonNull
  public final AppTextViewBold tvHeader;

  protected DialogCancelBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppButtonBold btnCancel, AppButtonBold btnConfirm, AppEditText tvCancelReason,
      AppTextViewBold tvHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnCancel = btnCancel;
    this.btnConfirm = btnConfirm;
    this.tvCancelReason = tvCancelReason;
    this.tvHeader = tvHeader;
  }

  @NonNull
  public static DialogCancelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_cancel, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogCancelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogCancelBinding>inflateInternal(inflater, R.layout.dialog_cancel, root, attachToRoot, component);
  }

  @NonNull
  public static DialogCancelBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_cancel, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogCancelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogCancelBinding>inflateInternal(inflater, R.layout.dialog_cancel, null, false, component);
  }

  public static DialogCancelBinding bind(@NonNull View view) {
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
  public static DialogCancelBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogCancelBinding)bind(component, view, R.layout.dialog_cancel);
  }
}