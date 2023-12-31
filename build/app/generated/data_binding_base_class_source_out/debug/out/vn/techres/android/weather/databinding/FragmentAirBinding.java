// Generated by view binder compiler. Do not edit!
package vn.techres.android.weather.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import vn.techres.android.weather.R;

public final class FragmentAirBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final SearchView acSearchAIR;

  @NonNull
  public final ImageView imvControlMap;

  @NonNull
  public final ImageView imvControlWeather;

  @NonNull
  public final ImageView imvRemoveMarker;

  @NonNull
  public final LinearLayout llControlMap;

  @NonNull
  public final LinearLayout llControlWeather;

  @NonNull
  public final LinearLayout llLegend;

  @NonNull
  public final LinearLayout llRemoveMarker;

  @NonNull
  public final ProgressBar mProgressBar;

  @NonNull
  public final FragmentContainerView map;

  @NonNull
  public final RelativeLayout rlSearch;

  @NonNull
  public final RecyclerView rvDataCity;

  @NonNull
  public final TextView snippet;

  @NonNull
  public final Spinner spnModeAir;

  @NonNull
  public final Spinner spnStyleMapAir;

  @NonNull
  public final TextView title;

  private FragmentAirBinding(@NonNull FrameLayout rootView, @NonNull SearchView acSearchAIR,
      @NonNull ImageView imvControlMap, @NonNull ImageView imvControlWeather,
      @NonNull ImageView imvRemoveMarker, @NonNull LinearLayout llControlMap,
      @NonNull LinearLayout llControlWeather, @NonNull LinearLayout llLegend,
      @NonNull LinearLayout llRemoveMarker, @NonNull ProgressBar mProgressBar,
      @NonNull FragmentContainerView map, @NonNull RelativeLayout rlSearch,
      @NonNull RecyclerView rvDataCity, @NonNull TextView snippet, @NonNull Spinner spnModeAir,
      @NonNull Spinner spnStyleMapAir, @NonNull TextView title) {
    this.rootView = rootView;
    this.acSearchAIR = acSearchAIR;
    this.imvControlMap = imvControlMap;
    this.imvControlWeather = imvControlWeather;
    this.imvRemoveMarker = imvRemoveMarker;
    this.llControlMap = llControlMap;
    this.llControlWeather = llControlWeather;
    this.llLegend = llLegend;
    this.llRemoveMarker = llRemoveMarker;
    this.mProgressBar = mProgressBar;
    this.map = map;
    this.rlSearch = rlSearch;
    this.rvDataCity = rvDataCity;
    this.snippet = snippet;
    this.spnModeAir = spnModeAir;
    this.spnStyleMapAir = spnStyleMapAir;
    this.title = title;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAirBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAirBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_air, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAirBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.acSearchAIR;
      SearchView acSearchAIR = ViewBindings.findChildViewById(rootView, id);
      if (acSearchAIR == null) {
        break missingId;
      }

      id = R.id.imvControlMap;
      ImageView imvControlMap = ViewBindings.findChildViewById(rootView, id);
      if (imvControlMap == null) {
        break missingId;
      }

      id = R.id.imvControlWeather;
      ImageView imvControlWeather = ViewBindings.findChildViewById(rootView, id);
      if (imvControlWeather == null) {
        break missingId;
      }

      id = R.id.imvRemoveMarker;
      ImageView imvRemoveMarker = ViewBindings.findChildViewById(rootView, id);
      if (imvRemoveMarker == null) {
        break missingId;
      }

      id = R.id.llControlMap;
      LinearLayout llControlMap = ViewBindings.findChildViewById(rootView, id);
      if (llControlMap == null) {
        break missingId;
      }

      id = R.id.llControlWeather;
      LinearLayout llControlWeather = ViewBindings.findChildViewById(rootView, id);
      if (llControlWeather == null) {
        break missingId;
      }

      id = R.id.llLegend;
      LinearLayout llLegend = ViewBindings.findChildViewById(rootView, id);
      if (llLegend == null) {
        break missingId;
      }

      id = R.id.llRemoveMarker;
      LinearLayout llRemoveMarker = ViewBindings.findChildViewById(rootView, id);
      if (llRemoveMarker == null) {
        break missingId;
      }

      id = R.id.mProgressBar;
      ProgressBar mProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (mProgressBar == null) {
        break missingId;
      }

      id = R.id.map;
      FragmentContainerView map = ViewBindings.findChildViewById(rootView, id);
      if (map == null) {
        break missingId;
      }

      id = R.id.rlSearch;
      RelativeLayout rlSearch = ViewBindings.findChildViewById(rootView, id);
      if (rlSearch == null) {
        break missingId;
      }

      id = R.id.rvDataCity;
      RecyclerView rvDataCity = ViewBindings.findChildViewById(rootView, id);
      if (rvDataCity == null) {
        break missingId;
      }

      id = R.id.snippet;
      TextView snippet = ViewBindings.findChildViewById(rootView, id);
      if (snippet == null) {
        break missingId;
      }

      id = R.id.spnModeAir;
      Spinner spnModeAir = ViewBindings.findChildViewById(rootView, id);
      if (spnModeAir == null) {
        break missingId;
      }

      id = R.id.spnStyleMapAir;
      Spinner spnStyleMapAir = ViewBindings.findChildViewById(rootView, id);
      if (spnStyleMapAir == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new FragmentAirBinding((FrameLayout) rootView, acSearchAIR, imvControlMap,
          imvControlWeather, imvRemoveMarker, llControlMap, llControlWeather, llLegend,
          llRemoveMarker, mProgressBar, map, rlSearch, rvDataCity, snippet, spnModeAir,
          spnStyleMapAir, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
