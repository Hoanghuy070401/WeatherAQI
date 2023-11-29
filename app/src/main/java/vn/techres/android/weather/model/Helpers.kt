package vn.techres.android.weather.model

import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.model.entity.AddressCity


//// danh sách tiêu đề được xác định trước
//val testMovieTitles = ArrayList<AddressCity>()

var titles : ArrayList<AddressCity> = arrayListOf(AddressCity(0,AppConstants.FIST_LOCATION,0.0,0.0))

val titlesOrdinals: MutableMap<String, Int> = mutableMapOf(titles[0].nameCity to 0)   // có thể đã lưu trữ cái này

const val MY_LOG = "MY_LOG"


