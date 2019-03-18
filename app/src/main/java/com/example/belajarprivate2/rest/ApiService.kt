package com.example.belajarprivate2.rest

import com.example.belajarprivate2.model.Post
import io.reactivex.Observable
import retrofit2.http.GET
import java.util.*

interface ApiService{

@GET("posts/")
fun getAllPosts(): Observable<List<Post>>


}