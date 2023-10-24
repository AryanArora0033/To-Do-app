package com.example.todo

import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.MyLayout
import kotlinx.android.synthetic.main.view.view.priority
import kotlinx.android.synthetic.main.view.view.title
//nice work dude

class hello

class Adapter(var data: List<cardinfo>) : RecyclerView.Adapter<Adapter.viewholder>() {
    class viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title = itemView.title
        var priority = itemView.priority
        var Layout = itemView.MyLayout
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.view, parent, false)
        return viewholder(itemView)

    }

    override fun getItemCount(): Int {
        return data.size

    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.title.text = data[position].title
        holder.priority.text = data[position].priority
        when (data[position].priority.lowercase()) {
            "high" -> holder.Layout.setBackgroundColor(Color.parseColor("#F05454"))
            "medium" -> holder.Layout.setBackgroundColor(Color.parseColor("#EDC988"))
            else -> holder.Layout.setBackgroundColor(Color.parseColor("#4CAF50"))


        }
        holder.itemView.setOnClickListener{

            val intent=Intent(holder.itemView.context,UpdateCard::class.java)
            intent.putExtra("id",position)
            holder.itemView.context.startActivity(intent)



        }

    }
}