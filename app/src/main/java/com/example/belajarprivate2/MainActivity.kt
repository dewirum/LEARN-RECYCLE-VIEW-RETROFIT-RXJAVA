package com.example.belajarprivate2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.belajarprivate2.adapter.PostitemAdapter
import com.example.belajarprivate2.model.Post
import com.example.belajarprivate2.rest.ApiClient
import com.example.belajarprivate2.rest.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv__list_posts.layoutManager = LinearLayoutManager(this)
        val service:ApiService = ApiClient.client()
        service.getAllPosts().subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe{
                rv__list_posts.adapter = PostitemAdapter(it, this)
            }



    }
}
