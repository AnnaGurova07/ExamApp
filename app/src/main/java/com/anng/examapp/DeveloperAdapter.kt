package com.anng.examapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DeveloperAdapter(private val developerName: List<String> ) :
    RecyclerView.Adapter<DeveloperViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeveloperViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.developer_list_item, parent,false)
        return DeveloperViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: DeveloperViewHolder, position: Int) {
      val name= developerName[position]
        holder .blind(name)
    }

    override fun getItemCount(): Int {
        return developerName.size
    }

}