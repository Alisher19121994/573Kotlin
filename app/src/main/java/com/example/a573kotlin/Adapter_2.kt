package com.example.a573kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter_2(var context: Context, var list: ArrayList<Shorts>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shorts_video, parent, false)
        return ShortsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val shorts = list[position]
        if (holder is ShortsViewHolder){
            holder.image.setImageResource(shorts.image)
            holder.title.text = shorts.title
            holder.views.text = shorts.views
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ShortsViewHolder(itemViews: View) : RecyclerView.ViewHolder(itemViews) {
        var image: ImageView = itemViews.findViewById(R.id.shorts_videos_image_id)
        var title: TextView = itemViews.findViewById(R.id.shorts_text_1_id)
        var views: TextView = itemViews.findViewById(R.id.shorts_text_2_id)


    }
}