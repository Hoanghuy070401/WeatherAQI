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

class NewsFragment : AppFragment<HomeActivity>(), ItemClickView {
    private lateinit var binding: FragmentNewsBinding
    private lateinit var adapter: NewsAdapter
   private val urlRoot = "https://baomoi.com/"
    override fun getLayoutView(): View {
        binding = FragmentNewsBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun initData() {
        val news1 = NewsModel(
            listNews[0].title, listNews[0].link, listNews[0].linkPhoto, listNews[0].linkPhotoLogo,
            listNews[0].date
        )
        val news2 = NewsModel(
            listNews[1].title, listNews[1].link, listNews[1].linkPhoto, listNews[1].linkPhotoLogo,
            listNews[1].date
        )
        val news3 = NewsModel(
            listNews[2].title, listNews[2].link, listNews[2].linkPhoto, listNews[2].linkPhotoLogo,
            listNews[2].date
        )
        PhotoShowUtils.loadImage(news1.linkPhoto, binding.imvPhotoNews)
        PhotoShowUtils.loadImage(news2.linkPhoto, binding.imvPhotoNews1)
        PhotoShowUtils.loadImage(news3.linkPhoto, binding.imvPhotoNews2)
        binding.tvTitle.text = news1.title
        binding.tvTitle1.text = news2.title
        binding.tvTitle2.text = news3.title
        binding.llNews1.clickWithDebounce(500){
            BrowserActivity.start(
                requireContext(),urlRoot+news1.link, getString(R.string.app_name)
            )
        }
        binding.llNews2.clickWithDebounce(500){
            BrowserActivity.start(
                requireContext(),urlRoot+news2.link, getString(R.string.app_name)
            )
        }
        binding.llNews3.clickWithDebounce(500){
            BrowserActivity.start(
                requireContext(),urlRoot+news3.link, getString(R.string.app_name)
            )
        }

        for (item in 0..2) {
            listNews.removeAt(item)
        }

        adapter = NewsAdapter(requireContext())
        adapter.setData(listNews)
        AppUtils.initRecyclerView(binding.rcvNews, adapter)
    }


    override fun itemClick(position: Int) {
        val url = urlRoot + listNews[position].link
        BrowserActivity.start(
            requireContext(), url, getString(R.string.app_name)
        )
    }

}