package com.example.kotlin07

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class MyAdapter(val mainActivity: MainActivity,val l1: ArrayList<ModelData>) : RecyclerView.Adapter<MyAdapter.ViewData>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewData {
        var view = LayoutInflater.from(mainActivity).inflate(R.layout.item,parent,false)
        return ViewData(view)
    }

    override fun onBindViewHolder(holder: ViewData, position: Int) {
        holder.txt_1.text = l1[position].name
        holder.txt_2.text = l1[position].capital
    }

    override fun getItemCount(): Int {
        return  l1.size
    }

    class ViewData(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txt_1 =itemView.findViewById<TextView>(R.id.txt_1)
        var txt_2 =itemView.findViewById<TextView>(R.id.txt_2)
    }

}