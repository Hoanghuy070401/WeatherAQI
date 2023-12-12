package vn.techres.android.weather;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import vn.techres.android.weather.databinding.ActivityImagePreviewBindingImpl;
import vn.techres.android.weather.databinding.CrashActivityBindingImpl;
import vn.techres.android.weather.databinding.DateDialogBindingImpl;
import vn.techres.android.weather.databinding.DialogCancelBindingImpl;
import vn.techres.android.weather.databinding.DialogConfirmBindingImpl;
import vn.techres.android.weather.databinding.DialogNotificationBindingImpl;
import vn.techres.android.weather.databinding.FragmentNoSupportBindingImpl;
import vn.techres.android.weather.databinding.FragmentSettingBindingImpl;
import vn.techres.android.weather.databinding.HomeActivityBindingImpl;
import vn.techres.android.weather.databinding.ItemAddressBindingImpl;
import vn.techres.android.weather.databinding.LayoutLineMarkerBindingImpl;
import vn.techres.android.weather.databinding.PickerItemBindingImpl;
import vn.techres.android.weather.databinding.QuantityInputDialogBindingImpl;
import vn.techres.android.weather.databinding.SplashActivityBindingImpl;
import vn.techres.android.weather.databinding.TabItemDesignBindingImpl;
import vn.techres.android.weather.databinding.TabItemSlidingBindingImpl;
import vn.techres.android.weather.databinding.UpdateDialogBindingImpl;
import vn.techres.android.weather.databinding.WaitDialogBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYIMAGEPREVIEW = 1;

  private static final int LAYOUT_CRASHACTIVITY = 2;

  private static final int LAYOUT_DATEDIALOG = 3;

  private static final int LAYOUT_DIALOGCANCEL = 4;

  private static final int LAYOUT_DIALOGCONFIRM = 5;

  private static final int LAYOUT_DIALOGNOTIFICATION = 6;

  private static final int LAYOUT_FRAGMENTNOSUPPORT = 7;

  private static final int LAYOUT_FRAGMENTSETTING = 8;

  private static final int LAYOUT_HOMEACTIVITY = 9;

  private static final int LAYOUT_ITEMADDRESS = 10;

  private static final int LAYOUT_LAYOUTLINEMARKER = 11;

  private static final int LAYOUT_PICKERITEM = 12;

  private static final int LAYOUT_QUANTITYINPUTDIALOG = 13;

  private static final int LAYOUT_SPLASHACTIVITY = 14;

  private static final int LAYOUT_TABITEMDESIGN = 15;

  private static final int LAYOUT_TABITEMSLIDING = 16;

  private static final int LAYOUT_UPDATEDIALOG = 17;

  private static final int LAYOUT_WAITDIALOG = 18;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(18);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.activity_image_preview, LAYOUT_ACTIVITYIMAGEPREVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.crash_activity, LAYOUT_CRASHACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.date_dialog, LAYOUT_DATEDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.dialog_cancel, LAYOUT_DIALOGCANCEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.dialog_confirm, LAYOUT_DIALOGCONFIRM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.dialog_notification, LAYOUT_DIALOGNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.fragment_no_support, LAYOUT_FRAGMENTNOSUPPORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.fragment_setting, LAYOUT_FRAGMENTSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.home_activity, LAYOUT_HOMEACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.item_address, LAYOUT_ITEMADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.layout_line_marker, LAYOUT_LAYOUTLINEMARKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.picker_item, LAYOUT_PICKERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.quantity_input_dialog, LAYOUT_QUANTITYINPUTDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.splash_activity, LAYOUT_SPLASHACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.tab_item_design, LAYOUT_TABITEMDESIGN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.tab_item_sliding, LAYOUT_TABITEMSLIDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.update_dialog, LAYOUT_UPDATEDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.techres.android.weather.R.layout.wait_dialog, LAYOUT_WAITDIALOG);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYIMAGEPREVIEW: {
          if ("layout/activity_image_preview_0".equals(tag)) {
            return new ActivityImagePreviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_image_preview is invalid. Received: " + tag);
        }
        case  LAYOUT_CRASHACTIVITY: {
          if ("layout/crash_activity_0".equals(tag)) {
            return new CrashActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for crash_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_DATEDIALOG: {
          if ("layout/date_dialog_0".equals(tag)) {
            return new DateDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for date_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGCANCEL: {
          if ("layout/dialog_cancel_0".equals(tag)) {
            return new DialogCancelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_cancel is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGCONFIRM: {
          if ("layout/dialog_confirm_0".equals(tag)) {
            return new DialogConfirmBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_confirm is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGNOTIFICATION: {
          if ("layout/dialog_notification_0".equals(tag)) {
            return new DialogNotificationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_notification is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNOSUPPORT: {
          if ("layout/fragment_no_support_0".equals(tag)) {
            return new FragmentNoSupportBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_no_support is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTING: {
          if ("layout/fragment_setting_0".equals(tag)) {
            return new FragmentSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMEACTIVITY: {
          if ("layout/home_activity_0".equals(tag)) {
            return new HomeActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMADDRESS: {
          if ("layout/item_address_0".equals(tag)) {
            return new ItemAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_address is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTLINEMARKER: {
          if ("layout/layout_line_marker_0".equals(tag)) {
            return new LayoutLineMarkerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_line_marker is invalid. Received: " + tag);
        }
        case  LAYOUT_PICKERITEM: {
          if ("layout/picker_item_0".equals(tag)) {
            return new PickerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for picker_item is invalid. Received: " + tag);
        }
        case  LAYOUT_QUANTITYINPUTDIALOG: {
          if ("layout/quantity_input_dialog_0".equals(tag)) {
            return new QuantityInputDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for quantity_input_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_SPLASHACTIVITY: {
          if ("layout/splash_activity_0".equals(tag)) {
            return new SplashActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for splash_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_TABITEMDESIGN: {
          if ("layout/tab_item_design_0".equals(tag)) {
            return new TabItemDesignBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for tab_item_design is invalid. Received: " + tag);
        }
        case  LAYOUT_TABITEMSLIDING: {
          if ("layout/tab_item_sliding_0".equals(tag)) {
            return new TabItemSlidingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for tab_item_sliding is invalid. Received: " + tag);
        }
        case  LAYOUT_UPDATEDIALOG: {
          if ("layout/update_dialog_0".equals(tag)) {
            return new UpdateDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for update_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_WAITDIALOG: {
          if ("layout/wait_dialog_0".equals(tag)) {
            return new WaitDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for wait_dialog is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(18);

    static {
      sKeys.put("layout/activity_image_preview_0", vn.techres.android.weather.R.layout.activity_image_preview);
      sKeys.put("layout/crash_activity_0", vn.techres.android.weather.R.layout.crash_activity);
      sKeys.put("layout/date_dialog_0", vn.techres.android.weather.R.layout.date_dialog);
      sKeys.put("layout/dialog_cancel_0", vn.techres.android.weather.R.layout.dialog_cancel);
      sKeys.put("layout/dialog_confirm_0", vn.techres.android.weather.R.layout.dialog_confirm);
      sKeys.put("layout/dialog_notification_0", vn.techres.android.weather.R.layout.dialog_notification);
      sKeys.put("layout/fragment_no_support_0", vn.techres.android.weather.R.layout.fragment_no_support);
      sKeys.put("layout/fragment_setting_0", vn.techres.android.weather.R.layout.fragment_setting);
      sKeys.put("layout/home_activity_0", vn.techres.android.weather.R.layout.home_activity);
      sKeys.put("layout/item_address_0", vn.techres.android.weather.R.layout.item_address);
      sKeys.put("layout/layout_line_marker_0", vn.techres.android.weather.R.layout.layout_line_marker);
      sKeys.put("layout/picker_item_0", vn.techres.android.weather.R.layout.picker_item);
      sKeys.put("layout/quantity_input_dialog_0", vn.techres.android.weather.R.layout.quantity_input_dialog);
      sKeys.put("layout/splash_activity_0", vn.techres.android.weather.R.layout.splash_activity);
      sKeys.put("layout/tab_item_design_0", vn.techres.android.weather.R.layout.tab_item_design);
      sKeys.put("layout/tab_item_sliding_0", vn.techres.android.weather.R.layout.tab_item_sliding);
      sKeys.put("layout/update_dialog_0", vn.techres.android.weather.R.layout.update_dialog);
      sKeys.put("layout/wait_dialog_0", vn.techres.android.weather.R.layout.wait_dialog);
    }
  }
}
