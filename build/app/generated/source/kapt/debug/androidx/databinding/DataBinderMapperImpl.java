package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new vn.techres.android.weather.DataBinderMapperImpl());
    addMapper("vn.techres.android.weather.setting");
    addMapper("vn.techres.android.weather.map");
    addMapper("vn.techres.android.weather.home");
  }
}
