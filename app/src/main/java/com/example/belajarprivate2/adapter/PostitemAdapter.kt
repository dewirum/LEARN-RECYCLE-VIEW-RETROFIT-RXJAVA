package com.example.belajarprivate2.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.belajarprivate2.R
import com.example.belajarprivate2.model.Post
import kotlinx.android.synthetic.main.post_item_layout.view.*

class PostitemAdapter(val postList: List<Post>, val context: Context) :
    RecyclerView.Adapter<PostitemAdapter.viewHolder>() {
    class viewHolder(view: View):RecyclerView.ViewHolder(view) {
     val tvTittle = view.tvTittle
        val tvBody = view.tvBody
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): viewHolder {
     return viewHolder(LayoutInflater.from(context).inflate(R.layout.post_item_layout, p0,false))
    }

    override fun getItemCount(): Int {
     return postList.size
    }
    override fun onBindViewHolder(p0: viewHolder, p1: Int) {
     p0.tvTittle.text = postList.get(p1).title
        p0.tvBody.text = postList.get(p1).body
    }
    }