package vn.techres.android.weather.model.eventbus

import org.greenrobot.eventbus.Subscribe
import vn.techres.android.weather.model.entity.AddressCity

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 11/8/2023.
 */

class UpdateDataEventBus(var data:AddressCity , var isUpdate:Boolean) {
}