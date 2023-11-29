package vn.techres.android.weather.manager

import vn.techres.android.weather.constants.AppConstants

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 10/30/2023.
 */
class TileLoadManager(private val totalTileCount: Int) {
    private var loadedTileCount = 0

    fun tileLoaded() {
        loadedTileCount++
        if (loadedTileCount == totalTileCount) {
            // Tất cả các Tile đã được tải hoàn tất
            AppConstants.FINISH=true

        }
    }
}