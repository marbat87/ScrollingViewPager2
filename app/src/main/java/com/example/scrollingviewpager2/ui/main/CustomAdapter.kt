package com.example.scrollingviewpager2.ui.main

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.scrollingviewpager2.Item
import com.example.scrollingviewpager2.R


class CustomAdapter// Constructor of the class
    (//All methods in this adapter are required for a bare minimum recyclerview adapter
    private val listItemLayout: Int, private val itemList: ArrayList<Item>?
) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // get the size of the list
    override fun getItemCount(): Int {
        return itemList?.size ?: 0
    }


    // specify the row layout file and click for each row
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(listItemLayout, parent, false)
        return ViewHolder(view)
    }

    // load data in each row element
    override fun onBindViewHolder(holder: ViewHolder, listPosition: Int) {
        val item = holder.item
        item.text = itemList!![listPosition].name
    }

    // Static inner class to initialize the views of rows
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var item: TextView

        init {
            itemView.setOnClickListener(this)
            item = itemView.findViewById(R.id.row_item)
        }

        override fun onClick(view: View) {
            Log.d("onclick", "onClick " + layoutPosition + " " + item.text)
        }
    }
}