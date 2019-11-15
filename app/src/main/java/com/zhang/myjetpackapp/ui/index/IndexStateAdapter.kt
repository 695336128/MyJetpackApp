package com.zhang.myjetpackapp.ui.index

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zhang.myjetpackapp.R
import kotlinx.android.synthetic.main.index_page_layout.view.*

class IndexStateAdapter(val pages: Array<String>): RecyclerView.Adapter<IndexStateAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.index_page_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pages.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        pages[position].run{
            holder.itemView.index_tv.text = this
        }
    }

    inner class ViewHolder(rootView: View): RecyclerView.ViewHolder(rootView)
}