// Generated by view binder compiler. Do not edit!
package vn.techres.android.weather.home.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.matteobattilana.weather.WeatherView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import vn.techres.android.weather.home.R;
import vn.techres.android.weather.widget.AppTextViewBold;

public final class LayoutDataWeatherBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout rlBgStyle;

  @NonNull
  public final AppTextViewBold tvTemperature;

  @NonNull
  public final AppTextViewBold tvTemperatureName;

  @NonNull
  public final WeatherView weatherView;

  private LayoutDataWeatherBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout rlBgStyle, @NonNull AppTextViewBold tvTemperature,
      @NonNull AppTextViewBold tvTemperatureName, @NonNull WeatherView weatherView) {
    this.rootView = rootView;
    this.rlBgStyle = rlBgStyle;
    this.tvTemperature = tvTemperature;
    this.tvTemperatureName = tvTemperatureName;
    this.weatherView = weatherView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutDataWeatherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutDataWeatherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_data_weather, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutDataWeatherBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout rlBgStyle = (ConstraintLayout) rootView;

      id = R.id.tvTemperature;
      AppTextViewBold tvTemperature = ViewBindings.findChildViewById(rootView, id);
      if (tvTemperature == null) {
        break missingId;
      }

      id = R.id.tvTemperatureName;
      AppTextViewBold tvTemperatureName = ViewBindings.findChildViewById(rootView, id);
      if (tvTemperatureName == null) {
        break missingId;
      }

      id = R.id.weatherView;
      WeatherView weatherView = ViewBindings.findChildViewById(rootView, id);
      if (weatherView == null) {
        break missingId;
      }

      return new LayoutDataWeatherBinding((ConstraintLayout) rootView, rlBgStyle, tvTemperature,
          tvTemperatureName, weatherView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
