package com.dicoding.picodiploma.belajarrecycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val list: ArrayList<Users>) : RecyclerView.Adapter<Adapter.Holder>(){

    private var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        context = parent.getContext();
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        //holder.view.lbList.text = list.get(position).name
        holder.textHalo.text = list[position].halo
        holder.textView.text = list[position].name
        holder.textView.setOnClickListener {
            Toast.makeText(context, list[position].halo + list[position].name, Toast.LENGTH_SHORT).show()
        }
    }

    class Holder(view: View) : RecyclerView.ViewHolder(view){
        val textView = view.findViewById(R.id.lbList) as TextView
        val textHalo = view.findViewById(R.id.lbhalo) as TextView
    }
}
