// Generated by data binding compiler. Do not edit!
package vn.techres.android.weather.home.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.Deprecated;
import java.lang.Object;
import me.relex.circleindicator.CircleIndicator3;
import vn.techres.android.weather.home.R;

public abstract class FragmentWeatherBinding extends ViewDataBinding {
  @NonNull
  public final ViewPager2 Viewpager2;

  @NonNull
  public final ImageButton btnLocation;

  @NonNull
  public final CircleIndicator3 clViewPager2;

  @NonNull
  public final RelativeLayout rlBgStyle;

  @NonNull
  public final RelativeLayout rlHeader;

  protected FragmentWeatherBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ViewPager2 Viewpager2, ImageButton btnLocation, CircleIndicator3 clViewPager2,
      RelativeLayout rlBgStyle, RelativeLayout rlHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.Viewpager2 = Viewpager2;
    this.btnLocation = btnLocation;
    this.clViewPager2 = clViewPager2;
    this.rlBgStyle = rlBgStyle;
    this.rlHeader = rlHeader;
  }

  @NonNull
  public static FragmentWeatherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_weather, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWeatherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentWeatherBinding>inflateInternal(inflater, R.layout.fragment_weather, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentWeatherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_weather, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWeatherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentWeatherBinding>inflateInternal(inflater, R.layout.fragment_weather, null, false, component);
  }

  public static FragmentWeatherBinding bind(@NonNull View view) {
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
  public static FragmentWeatherBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentWeatherBinding)bind(component, view, R.layout.fragment_weather);
  }
}
