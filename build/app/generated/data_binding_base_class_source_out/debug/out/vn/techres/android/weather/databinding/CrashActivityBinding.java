// Generated by data binding compiler. Do not edit!
package vn.techres.android.weather.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import java.lang.Deprecated;
import java.lang.Object;
import vn.techres.android.weather.R;

public abstract class CrashActivityBinding extends ViewDataBinding {
  @NonNull
  public final DrawerLayout dlCrashDrawer;

  @NonNull
  public final AppCompatImageView ivCrashInfo;

  @NonNull
  public final AppCompatImageView ivCrashRestart;

  @NonNull
  public final AppCompatImageView ivCrashShare;

  @NonNull
  public final LinearLayout llCrashBar;

  @NonNull
  public final LinearLayout llCrashInfo;

  @NonNull
  public final AppCompatTextView tvCrashInfo;

  @NonNull
  public final AppCompatTextView tvCrashMessage;

  @NonNull
  public final AppCompatTextView tvCrashTitle;

  protected CrashActivityBinding(Object _bindingComponent, View _root, int _localFieldCount,
      DrawerLayout dlCrashDrawer, AppCompatImageView ivCrashInfo, AppCompatImageView ivCrashRestart,
      AppCompatImageView ivCrashShare, LinearLayout llCrashBar, LinearLayout llCrashInfo,
      AppCompatTextView tvCrashInfo, AppCompatTextView tvCrashMessage,
      AppCompatTextView tvCrashTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dlCrashDrawer = dlCrashDrawer;
    this.ivCrashInfo = ivCrashInfo;
    this.ivCrashRestart = ivCrashRestart;
    this.ivCrashShare = ivCrashShare;
    this.llCrashBar = llCrashBar;
    this.llCrashInfo = llCrashInfo;
    this.tvCrashInfo = tvCrashInfo;
    this.tvCrashMessage = tvCrashMessage;
    this.tvCrashTitle = tvCrashTitle;
  }

  @NonNull
  public static CrashActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.crash_activity, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CrashActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CrashActivityBinding>inflateInternal(inflater, R.layout.crash_activity, root, attachToRoot, component);
  }

  @NonNull
  public static CrashActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.crash_activity, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CrashActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CrashActivityBinding>inflateInternal(inflater, R.layout.crash_activity, null, false, component);
  }

  public static CrashActivityBinding bind(@NonNull View view) {
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
  public static CrashActivityBinding bind(@NonNull View view, @Nullable Object component) {
    return (CrashActivityBinding)bind(component, view, R.layout.crash_activity);
  }
}
