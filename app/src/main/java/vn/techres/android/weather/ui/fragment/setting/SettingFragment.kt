package vn.techres.android.weather.ui.fragment.setting

import android.view.View
import vn.techres.android.weather.R
import vn.techres.android.weather.app.AppFragment
import vn.techres.android.weather.databinding.FragmentSettingBinding
import vn.techres.android.weather.ui.activity.HomeActivity


class SettingFragment : AppFragment<HomeActivity>() {
    private lateinit var binding :FragmentSettingBinding
    override fun getLayoutView(): View {
        binding = FragmentSettingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initData() {
        //
        binding.tvAddressLocation.isSelected = true
        binding.tvAddressLocation.text = getString(R.string.location_address)
        binding.llAQI.setOnClickListener {  }
        binding.llDisplay.setOnClickListener {  }
        binding.llInfo.setOnClickListener {  }
        binding.llFeedback.setOnClickListener {  }
        binding.llLanguage.setOnClickListener {  }
        binding.llEnvironmentManager.setOnClickListener {  }
        binding.llLocationManager.setOnClickListener {  }
        binding.llNotification.setOnClickListener {  }
        binding.llSystemUnit.setOnClickListener {  }
    }

}