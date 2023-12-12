package vn.techres.android.weather.setting.ui.activity

import android.view.View
import kotlinx.coroutines.runBlocking
import vn.techres.android.weather.app.AppActivity
import vn.techres.android.weather.setting.databinding.ActivityCrawlDataNewsBinding
import vn.techres.android.weather.router.DownLoadNews


class CrawlDataNewsActivity : AppActivity() {
    private lateinit var binding: ActivityCrawlDataNewsBinding
    override fun getLayoutView(): View {
        binding = ActivityCrawlDataNewsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
    }

    override fun initData() {
        runBlocking {
            DownLoadNews.downloadArticles()
        }
    }
}