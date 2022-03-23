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
import com.bumptech.glide.Glide

class SulbingAdapter(val sulbingList: ArrayList<SulbingRecycler>): RecyclerView.Adapter<SulbingAdapter.CustomViewHolder>() {
    var mPosition = 0

    fun getPosition(): Int {
        return mPosition
    }

    private fun setPosition(position: Int) {
        mPosition = position
    }

    fun addItem(sulbingRecycler: SulbingRecycler) {
        sulbingList.add(sulbingRecycler)
        notifyDataSetChanged()
    }

    fun removeItem(position: Int) {
        if (position > 0) {
            sulbingList.removeAt(position)
            notifyDataSetChanged()
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SulbingAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sulbing_recycler, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return sulbingList.size
    }

    override fun onBindViewHolder(holder: SulbingAdapter.CustomViewHolder, position: Int) {
        holder.bind(sulbingList[position])

        holder.sulbingbutton.setOnClickListener {
            val intent = Intent(holder.itemView?.context, SulbingrecipeActivity::class.java)
            intent.putExtra("idText", holder.sulbingindex.text)
            startActivity(holder.itemView.context, intent, null)
        }
    }

    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val sulbingbutton = itemView.findViewById<ImageButton>(R.id.sulbingbutton)
        val sulbingindex = itemView.findViewById<TextView>(R.id.sulbingindex)

        fun bind(sulbingRecycler: SulbingRecycler) {
            Glide.with(itemView).load(sulbingRecycler.sulbingbutton).centerInside().into(sulbingbutton)
            sulbingindex.text = sulbingRecycler.sulbingindex.toString()
        }

        init {
            sulbingbutton.setOnClickListener {

            }
        }
    }
}