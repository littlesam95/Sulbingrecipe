package com.bodan.sulbingrecipe

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class SulbingAdapter(val sulbingList: ArrayList<SulbingRecycler>): RecyclerView.Adapter<SulbingAdapter.CustomViewHolder>() {
    override fun setHasStableIds(hasStableIds: Boolean) {
        super.setHasStableIds(hasStableIds)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SulbingAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sulbing_recycler, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return sulbingList.size
    }

    override fun onBindViewHolder(holder: SulbingAdapter.CustomViewHolder, position: Int) {
        holder.sulbingbutton.setImageResource(sulbingList.get(position).sulbingbutton)
        holder.sulbingtindex.text = sulbingList.get(position).sulbingindex.toString()

        holder.sulbingbutton.setOnClickListener {
            val intent = Intent(holder.itemView?.context, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", holder.sulbingtindex.text)
            startActivity(holder.itemView.context, intent, null)
        }
    }

    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val sulbingbutton = itemView.findViewById<ImageButton>(R.id.sulbingbutton)
        val sulbingtindex = itemView.findViewById<TextView>(R.id.sulbingindex)

        init {
            sulbingbutton.setOnClickListener {

            }
        }
    }
}