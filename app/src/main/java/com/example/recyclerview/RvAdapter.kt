package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.RvItemBinding

class RvAdapter(private val context: Context, private var dataList: ArrayList<RvModel>) : RecyclerView.Adapter<RvAdapter.RvViewHolder>() {

    inner class RvViewHolder(val binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        val binding = RvItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return RvViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        holder.binding.profile.setImageResource(dataList[position].profile)
        holder.binding.name.text = dataList[position].name
        holder.binding.address.text = dataList[position].address
        holder.itemView.setOnClickListener {
            Toast.makeText(context, "${dataList[position].name} 클릭함", Toast.LENGTH_SHORT).show()
        }
    }
}
