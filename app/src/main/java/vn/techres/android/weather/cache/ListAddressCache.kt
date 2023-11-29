package vn.techres.android.weather.cache

import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonParser
import com.tencent.mmkv.MMKV
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.model.entity.AddressCity
import vn.techres.android.weather.model.entity.LocationDevice

object ListAddressCache {
    private var mLocationDevice = AddressCity()
    private val mmkv: MMKV = MMKV.mmkvWithID("cache_list_location")

    fun saveAllLocations(locations: ArrayList<AddressCity>) {
        try {
            val mmkv = MMKV.defaultMMKV()
            mmkv.remove(AppConstants.CACHE_LOCATION) // Xóa dữ liệu cũ (nếu có)

            val gson = Gson()
            val jsonArray = JsonArray()

            // Chuyển đổi từng đối tượng AddressCity thành JsonObject và thêm vào JsonArray
            locations.forEach { location ->
                val locationJson = gson.toJsonTree(location).asJsonObject
                jsonArray.add(locationJson)
            }
            // Lưu JsonArray chứa các đối tượng vào MMKV
            mmkv.putString(AppConstants.CACHE_LOCATION, jsonArray.toString()).apply()
        } catch (e: Exception) {
            e.printStackTrace()
            // Xử lý ngoại lệ khi xảy ra lỗi
        }
    }


    fun getAllLocations(): ArrayList<AddressCity> {
        val mmkv = MMKV.defaultMMKV()
        val gson = Gson()
        val savedJson = mmkv.getString(AppConstants.CACHE_LOCATION, null)

        val locations = ArrayList<AddressCity>()
        savedJson?.let { jsonString ->
            val jsonArray = JsonParser.parseString(jsonString).asJsonArray

            jsonArray.forEach { jsonElement ->
                val location = gson.fromJson(jsonElement, AddressCity::class.java)
                locations.add(location)
            }
        }

        return locations
    }


    fun removeLocationFromCache(locationToRemove: AddressCity) {
        val mmkv = MMKV.defaultMMKV()
        val gson = Gson()
        val savedJson = mmkv.getString(AppConstants.CACHE_LOCATION, null)

        val locations = mutableListOf<AddressCity>()

        savedJson?.let { jsonString ->
            val jsonArray = JsonParser.parseString(jsonString).asJsonArray

            jsonArray.forEach { jsonElement ->
                val location = gson.fromJson(jsonElement, AddressCity::class.java)
                if (location != locationToRemove) {
                    locations.add(location)
                }
            }

            // Lưu lại danh sách đã được cập nhật (loại bỏ phần tử cần xóa) vào cache
            mmkv.remove(AppConstants.CACHE_LOCATION)
            val updatedJson = gson.toJsonTree(locations).asJsonArray
            mmkv.putString(AppConstants.CACHE_LOCATION, updatedJson.toString()).apply()
        }
    }
    fun addLocationToCache(newLocation: AddressCity) {
        val mmkv = MMKV.defaultMMKV()
        val gson = Gson()
        val savedJson = mmkv.getString(AppConstants.CACHE_LOCATION, null)

        val locations = mutableListOf<AddressCity>()

        savedJson?.let { jsonString ->
            val jsonArray = JsonParser.parseString(jsonString).asJsonArray

            jsonArray.forEach { jsonElement ->
                val location = gson.fromJson(jsonElement, AddressCity::class.java)
                locations.add(location)
            }

            // Thêm phần tử mới vào danh sách
            locations.add(newLocation)

            // Lưu lại danh sách đã được cập nhật vào cache
            mmkv.remove(AppConstants.CACHE_LOCATION)
            val updatedJson = gson.toJsonTree(locations).asJsonArray
            mmkv.putString(AppConstants.CACHE_LOCATION, updatedJson.toString()).apply()
        }
    }

    fun updateLocationInCache(updatedLocation: AddressCity) {
        val mmkv = MMKV.defaultMMKV()
        val gson = Gson()
        val savedJson = mmkv.getString(AppConstants.CACHE_LOCATION, null)

        val locations = mutableListOf<AddressCity>()

        savedJson?.let { jsonString ->
            val jsonArray = JsonParser.parseString(jsonString).asJsonArray

            jsonArray.forEach { jsonElement ->
                val location = gson.fromJson(jsonElement, AddressCity::class.java)
                if (location.id == updatedLocation.id) {
                    // Cập nhật thông tin cho phần tử cần thay đổi
                    location.nameCity = updatedLocation.nameCity
                    location.lon = updatedLocation.lon
                    location.lat = updatedLocation.lat
                }
                locations.add(location)
            }

            // Lưu lại danh sách đã được cập nhật vào cache
            mmkv.remove(AppConstants.CACHE_LOCATION)
            val updatedJson = gson.toJsonTree(locations).asJsonArray
            mmkv.putString(AppConstants.CACHE_LOCATION, updatedJson.toString()).apply()
        }
    }



}