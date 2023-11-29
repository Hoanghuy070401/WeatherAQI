// Generated by view binder compiler. Do not edit!
package vn.techres.android.weather.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.hjq.shape.view.ShapeButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import vn.techres.android.weather.R;
import vn.techres.android.weather.widget.NestedLinearLayout;
import vn.techres.widget.view.SmartTextView;

public final class WidgetStatusLayoutBinding implements ViewBinding {
  @NonNull
  private final NestedLinearLayout rootView;

  @NonNull
  public final LottieAnimationView ivStatusIcon;

  @NonNull
  public final ShapeButton ivStatusRetry;

  @NonNull
  public final SmartTextView ivStatusText;

  private WidgetStatusLayoutBinding(@NonNull NestedLinearLayout rootView,
      @NonNull LottieAnimationView ivStatusIcon, @NonNull ShapeButton ivStatusRetry,
      @NonNull SmartTextView ivStatusText) {
    this.rootView = rootView;
    this.ivStatusIcon = ivStatusIcon;
    this.ivStatusRetry = ivStatusRetry;
    this.ivStatusText = ivStatusText;
  }

  @Override
  @NonNull
  public NestedLinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static WidgetStatusLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WidgetStatusLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.widget_status_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WidgetStatusLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_status_icon;
      LottieAnimationView ivStatusIcon = ViewBindings.findChildViewById(rootView, id);
      if (ivStatusIcon == null) {
        break missingId;
      }

      id = R.id.iv_status_retry;
      ShapeButton ivStatusRetry = ViewBindings.findChildViewById(rootView, id);
      if (ivStatusRetry == null) {
        break missingId;
      }

      id = R.id.iv_status_text;
      SmartTextView ivStatusText = ViewBindings.findChildViewById(rootView, id);
      if (ivStatusText == null) {
        break missingId;
      }

      return new WidgetStatusLayoutBinding((NestedLinearLayout) rootView, ivStatusIcon,
          ivStatusRetry, ivStatusText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}