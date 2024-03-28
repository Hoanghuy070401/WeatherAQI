package vn.techres.android.weather.ui.fragment.setting

import android.content.Intent
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppFragment
import vn.techres.android.weather.constants.ModuleClassConstants
import vn.techres.android.weather.databinding.FragmentSettingBinding
import vn.techres.android.weather.model.titles
import vn.techres.android.weather.ui.activity.BrowserActivity
import vn.techres.android.weather.ui.activity.HomeActivity
import vn.techres.android.weather.utils.AppUtils.hide
import vn.techres.android.weather.utils.AppUtils.show


class SettingFragment : AppFragment<HomeActivity>() {
    private lateinit var binding :FragmentSettingBinding
    override fun getLayoutView(): View {
        binding = FragmentSettingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initData() {
        //
        binding.tvAddressLocation.isSelected = true
        binding.tvAddressLocation.text = titles[0].nameCity
        binding.llAQI.setOnClickListener {
            BrowserActivity.start(
                requireContext(),"https://aqicn.org/scale/", getString(R.string.app_name)
            )
        }
        binding.llInfo.setOnClickListener {  }
        binding.llFeedback.setOnClickListener {
            BrowserActivity.start(
                requireContext(),"https://hoanghuy070401.github.io/DKSD/textfiel.html", getString(R.string.app_name)
            )
        }
        binding.llEnvironmentManager.setOnClickListener {  }
        binding.llLocationManager.setOnClickListener {
            try {
                startActivity(
                    Intent(
                        context, Class.forName(ModuleClassConstants.CONTROL_LIST_LOCATION)
                    )
                )
            } catch (e: ClassNotFoundException) {
                //code
            }


        }
        binding.llSign.setOnClickListener {
            try {
                startActivity(
                    Intent(
                        context, Class.forName(ModuleClassConstants.SIGN_ACCOUNT)
                    )
                )
            } catch (e: ClassNotFoundException) {
                //code
            }


        }
    }

    override fun onResume() {
        super.onResume()
        val user = FirebaseAuth.getInstance().currentUser
        if (user != null) {
            binding.tvSign.text=getString(R.string.sign_out)
            binding.tvAccount.show()
            binding.tvAccount.text=user.displayName
        }else{
            binding.tvSign.text=getString(R.string.sign)
            binding.tvAccount.hide()
        }
    }

}