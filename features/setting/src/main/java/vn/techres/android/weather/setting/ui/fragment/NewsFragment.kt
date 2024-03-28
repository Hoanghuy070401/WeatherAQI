package vn.techres.android.weather.setting.ui.fragment

import android.annotation.SuppressLint
import android.view.View
import vn.techres.android.weather.app.AppFragment
import vn.techres.android.weather.setting.databinding.FragmentNewsBinding
import vn.techres.android.weather.model.listNews
import vn.techres.android.weather.R
import vn.techres.android.weather.model.entity.modelNews.NewsModel
import vn.techres.android.weather.setting.model.interfaces.ItemClickView
import vn.techres.android.weather.setting.ui.adapter.NewsAdapter
import vn.techres.android.weather.ui.activity.BrowserActivity
import vn.techres.android.weather.ui.activity.HomeActivity
import vn.techres.android.weather.utils.AppUtils
import vn.techres.android.weather.utils.PhotoShowUtils

class NewsFragment : AppFragment<HomeActivity>() {
    private lateinit var binding: FragmentNewsBinding
    override fun getLayoutView(): View {
        binding = FragmentNewsBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun initData() {
     //
    }




}