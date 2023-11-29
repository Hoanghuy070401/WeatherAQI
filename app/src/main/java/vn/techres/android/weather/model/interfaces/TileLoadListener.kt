package vn.techres.android.weather.model.interfaces

import com.google.android.gms.maps.model.Tile

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 10/30/2023.
 */
interface TileLoadListener {
    fun onTileLoaded(tile: Tile)
}