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
        if (listNews.isNotEmpty()){
            val news1 = NewsModel(
                listNews[0].title, listNews[0].link, listNews[0].linkPhoto, listNews[0].linkPhotoLogo,
                listNews[0].date
            )
            PhotoShowUtils.loadFoodImage(news1.linkPhoto, binding.imvPhotoNews)
            binding.tvTitle.text = news1.title
            binding.llNews1.clickWithDebounce(500){
                BrowserActivity.start(
                    requireContext(),urlRoot+news1.link, getString(R.string.app_name)
                )
            }
            listNews.removeAt(0)
        }else{
            //
        }


        adapter = NewsAdapter(requireContext())
        adapter.setData(listNews)
        adapter.clickItem=this
        AppUtils.initRecyclerView(binding.rcvNews, adapter)
    }


    override fun itemClick(position: Int) {
        val url = urlRoot + listNews[position].link
        BrowserActivity.start(
            requireContext(), url, getString(R.string.app_name)
        )
    }

}