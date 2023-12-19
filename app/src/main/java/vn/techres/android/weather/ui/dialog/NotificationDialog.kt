package vn.techres.android.weather.ui.dialog

import android.content.Context
import android.content.res.Resources
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.LayoutInflater
import vn.techres.base.BaseDialog
import vn.techres.base.action.AnimAction
import vn.techres.android.weather.databinding.DialogNotificationBinding

/**
 * @Author: NGUYEN THE DAT
 * @Date: 4/14/2023
 */
class NotificationDialog {
    class Builder constructor(
        context: Context,
        headerText: String,
        messageText: String,isCancelable :Boolean
    ) :
        BaseDialog.Builder<Builder>(context) {
        private var binding: DialogNotificationBinding =
            DialogNotificationBinding.inflate(LayoutInflater.from(context))

        lateinit var onActionDone: OnActionDone

        fun onActionDone(onActionDone: OnActionDone): Builder = apply {
            this.onActionDone = onActionDone
        }

        init {
            setCancelable(isCancelable)
            setAnimStyle(AnimAction.ANIM_SCALE)
            setGravity(Gravity.CENTER)
            setContentView(binding.root)
            setWidth(Resources.getSystem().displayMetrics.widthPixels* 5 / 6)

                dismiss()
                onActionDone.onActionDone()
            }
        }

        interface OnActionDone {
            fun onActionDone()
        }
    }
