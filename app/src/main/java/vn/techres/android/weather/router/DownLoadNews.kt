package vn.techres.android.weather.router

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import timber.log.Timber
import vn.techres.android.weather.model.entity.modelNews.NewsModel

/**
 * @author:Nguyễn Hoàng Huy
 * @date: 12/11/2023.
 */
object DownLoadNews{
    suspend fun downloadArticles(): ArrayList<NewsModel> = withContext(Dispatchers.IO) {
        val listArticle = ArrayList<NewsModel>()
        try {

            val urlNew = "https://baomoi.com/t10723634/"
            for (item in 1 ..10){
                val page = urlNew+"trang$item.epi"
                val document: Document = Jsoup.connect(page).get()
                Timber.tag("listNewsDocument").e("$document")
                Timber.tag("listNewsPage").e(page)
                document.let {
                    val sub = document.select("div.bm_c>div.bm_B")
                    for (element: Element in sub) {
                        val article = NewsModel()
                        val titleSubject: Element? = element.select("div.bm_h>div.bm_g>h3>a").first()
                        Timber.tag("listNews11").i("$titleSubject")

                        val linkSubject: Element? = element.select("div.bm_h>div.bm_g>h3>a").first()
                        Timber.tag("listNews11").i("$linkSubject")

                        ///////
                        val imgSubject: Element? = element.select("div.bm_f>h3>a>figure>img").first()

                        val imgSubjectLogo: Element? = element.select("div.bm_h>div.bm_b>a>figure>img").first()
                        Timber.tag("listNews11").i("$imgSubject")

                        val dateSubject: Element? = element.select("div.bm_h>div.bm_b>time").first()
                        Timber.tag("listNews11").i("$linkSubject")

                        if (titleSubject != null) {
                            val title: String = titleSubject.attr("title")
                            Timber.tag("listNews22").i(title)
                            article.title = title
                        }
                        if (linkSubject != null) {
                            val link: String = linkSubject.attr("href")
                            article.link = link
                            Timber.tag("listNews22").i(link)
                        }
                        if (dateSubject != null) {
                            val date: String = dateSubject.attr("datetime").toString()
                            article.date = date
                            Timber.tag("GetDate").i(Gson().toJson(article))
                        }
                        if (imgSubject != null) {
                            val src: String = imgSubject.attr("src")
                            article.linkPhoto = src
                            Timber.tag("listNews22").i(src)
                        }
                        if (imgSubjectLogo != null) {
                            val src: String = imgSubjectLogo.attr("src")
                            article.linkPhotoLogo = src
                            Timber.tag("listNews22").i(src)
                        }
                        listArticle.add(article)
                    }
                }
            }
            listArticle.addAll(listArticle)
            Timber.tag("listNews").e(GsonBuilder().setPrettyPrinting().create().toJson(listArticle))


        } catch (e: Exception) {
            e.printStackTrace()
        }
        return@withContext listArticle
    }
}