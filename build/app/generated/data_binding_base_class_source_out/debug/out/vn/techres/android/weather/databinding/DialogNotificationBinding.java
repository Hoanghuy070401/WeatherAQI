// Generated by data binding compiler. Do not edit!
package vn.techres.android.weather.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import vn.techres.android.weather.R;
import vn.techres.android.weather.widget.AppTextView;

public abstract class DialogNotificationBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imvAQI;

  @NonNull
  public final ImageView imvWeather;

  @NonNull
  public final LinearLayout llStyleWeather;

  @NonNull
  public final AppTextView tvAQI;

  @NonNull
  public final AppTextView tvWeather;

  protected DialogNotificationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imvAQI, ImageView imvWeather, LinearLayout llStyleWeather, AppTextView tvAQI,
      AppTextView tvWeather) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imvAQI = imvAQI;
    this.imvWeather = imvWeather;
    this.llStyleWeather = llStyleWeather;
    this.tvAQI = tvAQI;
    this.tvWeather = tvWeather;
  }

  @NonNull
  public static DialogNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_notification, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogNotificationBinding>inflateInternal(inflater, R.layout.dialog_notification, root, attachToRoot, component);
  }

  @NonNull
  public static DialogNotificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_notification, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogNotificationBinding>inflateInternal(inflater, R.layout.dialog_notification, null, false, component);
  }

  public static DialogNotificationBinding bind(@NonNull View view) {
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
  public static DialogNotificationBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogNotificationBinding)bind(component, view, R.layout.dialog_notification);
  }
}
