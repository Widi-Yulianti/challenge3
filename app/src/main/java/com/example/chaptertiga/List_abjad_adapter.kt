package com.example.chaptertiga

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView

class List_abjad_adapter(val listItem: ArrayList<Abjad>) : RecyclerView.Adapter<List_abjad_adapter.ListViewHolder>() {

    private lateinit var context : Context
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.btn_abjad_list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.abjad_list, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val abjad = listItem[position]
        holder.tvName.text = abjad.huruf

        holder.tvName.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                if(holder.tvName.length() == 1){
                    var bundle = Bundle()
                    bundle.putString("click_abjad", holder.tvName.text.toString())
                    Navigation.findNavController(holder.itemView).navigate(R.id.action_list_abjad_fragment_to_list_kata_Fragment,bundle)
                } else{
                    val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=${holder.tvName.text.toString()}"))
                    context.startActivity(browserIntent)
                }
            }
        })
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        context = recyclerView.context
    }
}