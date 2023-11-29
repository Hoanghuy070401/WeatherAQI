// Generated by view binder compiler. Do not edit!
package vn.techres.android.weather.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import vn.techres.android.weather.R;
import vn.techres.android.weather.widget.AppTextViewBold;

public final class UiDialogBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final LinearLayout llUiContainer;

  @NonNull
  public final LinearLayout lnAction;

  @NonNull
  public final AppTextViewBold tvUiCancel;

  @NonNull
  public final AppTextViewBold tvUiConfirm;

  @NonNull
  public final AppTextViewBold tvUiTitle;

  @NonNull
  public final View vUiLine;

  @NonNull
  public final View viewTitle;

  private UiDialogBinding(@NonNull CardView rootView, @NonNull LinearLayout llUiContainer,
      @NonNull LinearLayout lnAction, @NonNull AppTextViewBold tvUiCancel,
      @NonNull AppTextViewBold tvUiConfirm, @NonNull AppTextViewBold tvUiTitle,
      @NonNull View vUiLine, @NonNull View viewTitle) {
    this.rootView = rootView;
    this.llUiContainer = llUiContainer;
    this.lnAction = lnAction;
    this.tvUiCancel = tvUiCancel;
    this.tvUiConfirm = tvUiConfirm;
    this.tvUiTitle = tvUiTitle;
    this.vUiLine = vUiLine;
    this.viewTitle = viewTitle;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static UiDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UiDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.ui_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UiDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ll_ui_container;
      LinearLayout llUiContainer = ViewBindings.findChildViewById(rootView, id);
      if (llUiContainer == null) {
        break missingId;
      }

      id = R.id.lnAction;
      LinearLayout lnAction = ViewBindings.findChildViewById(rootView, id);
      if (lnAction == null) {
        break missingId;
      }

      id = R.id.tv_ui_cancel;
      AppTextViewBold tvUiCancel = ViewBindings.findChildViewById(rootView, id);
      if (tvUiCancel == null) {
        break missingId;
      }

      id = R.id.tv_ui_confirm;
      AppTextViewBold tvUiConfirm = ViewBindings.findChildViewById(rootView, id);
      if (tvUiConfirm == null) {
        break missingId;
      }

      id = R.id.tv_ui_title;
      AppTextViewBold tvUiTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvUiTitle == null) {
        break missingId;
      }

      id = R.id.v_ui_line;
      View vUiLine = ViewBindings.findChildViewById(rootView, id);
      if (vUiLine == null) {
        break missingId;
      }

      id = R.id.view_title;
      View viewTitle = ViewBindings.findChildViewById(rootView, id);
      if (viewTitle == null) {
        break missingId;
      }

      return new UiDialogBinding((CardView) rootView, llUiContainer, lnAction, tvUiCancel,
          tvUiConfirm, tvUiTitle, vUiLine, viewTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}