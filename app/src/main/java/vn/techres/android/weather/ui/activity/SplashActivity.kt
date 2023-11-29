package vn.techres.android.weather.ui.activity

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.gyf.immersionbar.BarHide
import com.gyf.immersionbar.ImmersionBar
import timber.log.Timber
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppActivity
import vn.techres.android.weather.constants.AppConstants
import vn.techres.android.weather.databinding.SplashActivityBinding
import vn.techres.android.weather.manager.ActivityManager
import vn.techres.android.weather.model.entity.AddressCity
import vn.techres.android.weather.model.eventbus.UpdateDataEventBus
import vn.techres.android.weather.model.titles
import vn.techres.android.weather.model.titlesOrdinals
import vn.techres.android.weather.ui.fragment.map.WeatherMapFragment


/**
 * @Author: Bùi Hửu Thắng
 * @Date: 28/09/2022
 */
@SuppressLint("CustomSplashScreen")
class SplashActivity : AppActivity() {
    private lateinit var binding: SplashActivityBinding
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    override fun getLayoutView(): View {
        binding = SplashActivityBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        getLocationPermission()
        fusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(this)
    }

    override fun onBackPressed() {
        ActivityManager.getInstance().finishAllActivities()
    }
    private fun getLocationPermission() {
        /*
         * Request location permission, so that we can get the location of the
         * device. The result of the permission request is handled by a callback,
         * onRequestPermissionsResult.
         */
        if (ContextCompat.checkSelfPermission(this.getContext(),
                Manifest.permission.ACCESS_FINE_LOCATION)
            == PackageManager.PERMISSION_GRANTED) {
            AppConstants.LOCATION_PERMISSION_GRANTED = true
        } else {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                AppConstants.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION
            )
        }
    }


    override fun initData() {
//        binding.ivSplashDebug.let {
//            it.setText(AppConfig.getBuildType().uppercase(Locale.getDefault()))
//            if (AppConfig.isDebug()) {
//                it.visibility = View.VISIBLE
//            } else {
//                it.visibility = View.INVISIBLE
//            }
//        }
//        registrationToken()
        goToHome()
    }


    //Di chuyển đến màn hình sau khi đăng nhập thành công
    private fun goToHome() {
        postDelayed({
//            if (UserCache.isLogin()) {
//                try {
//                    val intent = Intent(this@SplashActivity, HomeActivity::class.java)
//                    startActivity(intent)
//                    finish()
//                } catch (e: ClassNotFoundException) {
//                    e.printStackTrace()
//                }
//            } else {
//                try {
//                    val intent = Intent(
//                        this@SplashActivity,
//                        Class.forName(ModuleClassConstants.LOGIN_ACTIVITY)
//                    )
//                    startActivity(intent)
//                    finish()
//                } catch (e: ClassNotFoundException) {
//                    e.printStackTrace()
//                }
//            }
            try {
                val intent = Intent(this@SplashActivity, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            }
        }, 2000)
    }

    override fun createStatusBarConfig(): ImmersionBar {
        return super.createStatusBarConfig()
            // Ẩn thanh trạng thái và thanh điều hướng
            .hideBar(BarHide.FLAG_HIDE_BAR)
    }

    override fun initActivity() {
        // Nếu Hoạt động hiện tại không phải là Hoạt động đầu tiên trong ngăn xếp tác vụ
        if (!isTaskRoot) {
            val intent: Intent? = intent
            // Nếu Hoạt động hiện tại được bắt đầu từ biểu tượng màn hình
            if (((intent != null) && intent.hasCategory(Intent.CATEGORY_LAUNCHER)
                        && (Intent.ACTION_MAIN == intent.action))
            ) {
                // Hủy Hoạt động hiện tại để tránh lặp lại việc khởi tạo mục nhập
                finish()
                return
            }
        }
        super.initActivity()
    }

//    private fun registrationToken() {
//        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
//            if (!task.isSuccessful) {
//                Timber.d("Fetching FCM registration token failed %s", task.exception)
//                return@OnCompleteListener
//            }
//
//            // Get new FCM registration token
//            val token = task.result
//            Timber.d("push_token_Data %s", token)
//            val mmkv: MMKV = MMKV.mmkvWithID("push_token")
//            mmkv.putString(AppConstants.PUSH_TOKEN, token).commit()
//        })
//
//    }
}