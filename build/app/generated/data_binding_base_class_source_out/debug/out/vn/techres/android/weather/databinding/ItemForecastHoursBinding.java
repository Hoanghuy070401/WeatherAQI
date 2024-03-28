// Generated by view binder compiler. Do not edit!
package vn.techres.android.weather.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import vn.techres.android.weather.R;
import vn.techres.android.weather.widget.AppTextView;

public final class ItemForecastHoursBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imvIcon;

  @NonNull
  public final LinearLayout llItemWeatherHours;

  @NonNull
  public final AppTextView tvAQI;

  @NonNull
  public final AppTextView tvDate;

  @NonNull
  public final AppTextView tvHours;

  @NonNull
  public final AppTextView tvRain;

  @NonNull
  public final AppTextView tvTemperature;

  private ItemForecastHoursBinding(@NonNull LinearLayout rootView, @NonNull ImageView imvIcon,
      @NonNull LinearLayout llItemWeatherHours, @NonNull AppTextView tvAQI,
      @NonNull AppTextView tvDate, @NonNull AppTextView tvHours, @NonNull AppTextView tvRain,
      @NonNull AppTextView tvTemperature) {
    this.rootView = rootView;
    this.imvIcon = imvIcon;
    this.llItemWeatherHours = llItemWeatherHours;
    this.tvAQI = tvAQI;
    this.tvDate = tvDate;
    this.tvHours = tvHours;
    this.tvRain = tvRain;
    this.tvTemperature = tvTemperature;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemForecastHoursBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemForecastHoursBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_forecast_hours, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemForecastHoursBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imvIcon;
      ImageView imvIcon = ViewBindings.findChildViewById(rootView, id);
      if (imvIcon == null) {
        break missingId;
      }

      LinearLayout llItemWeatherHours = (LinearLayout) rootView;

      id = R.id.tvAQI;
      AppTextView tvAQI = ViewBindings.findChildViewById(rootView, id);
      if (tvAQI == null) {
        break missingId;
      }

      id = R.id.tvDate;
      AppTextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tvHours;
      AppTextView tvHours = ViewBindings.findChildViewById(rootView, id);
      if (tvHours == null) {
        break missingId;
      }

      id = R.id.tvRain;
      AppTextView tvRain = ViewBindings.findChildViewById(rootView, id);
      if (tvRain == null) {
        break missingId;
      }

      id = R.id.tvTemperature;
      AppTextView tvTemperature = ViewBindings.findChildViewById(rootView, id);
      if (tvTemperature == null) {
        break missingId;
      }

      return new ItemForecastHoursBinding((LinearLayout) rootView, imvIcon, llItemWeatherHours,
          tvAQI, tvDate, tvHours, tvRain, tvTemperature);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}