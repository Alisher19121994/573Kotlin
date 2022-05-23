package com.example.a573kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter_1(var context: Context, var list: ArrayList<Contents>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var EXPLORE = 0
    private var CONTENTS = 1

    private fun isHeader(position: Int): Boolean {
        return position == 0
    }

    override fun getItemViewType(position: Int): Int {
        return if (isHeader(position)) {
            EXPLORE
        } else {
            CONTENTS
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == EXPLORE) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.explore, parent, false)
            return ExploreViewHolder(view)
        }
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contents, parent, false)
        return ContentsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val contents = list[position]
        if (holder is ExploreViewHolder) {
        }
        if (holder is ContentsViewHolder) {
            holder.titles.text = contents.title
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ExploreViewHolder(itemViews: View) : RecyclerView.ViewHolder(itemViews) {

    }

    inner class ContentsViewHolder(itemViews: View) : RecyclerView.ViewHolder(itemViews) {
        var titles: TextView = itemViews.findViewById(R.id.contents_text_id)

    }
}