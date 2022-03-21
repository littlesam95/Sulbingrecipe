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

class BeverageAdapter(val beverageList: ArrayList<BeverageRecycler>): RecyclerView.Adapter<BeverageAdapter.CustomViewHolder>() {
    var mPosition = 0

    fun getPosition(): Int {
        return mPosition
    }

    private fun setPosition(position: Int) {
        mPosition = position
    }

    fun addItem(beverageRecycler: BeverageRecycler) {
        beverageList.add(beverageRecycler)
        notifyDataSetChanged()
    }

    fun removeItem(position: Int) {
        if (position > 0) {
            beverageList.removeAt(position)
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeverageAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.beverage_recycler, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return beverageList.size
    }

    override fun onBindViewHolder(holder: BeverageAdapter.CustomViewHolder, position: Int) {
        holder.beveragebutton.setImageResource(beverageList.get(position).beveragebutton)
        holder.beverageindex.text = beverageList.get(position).beverageindex.toString()

        holder.beveragebutton.setOnClickListener {
            val intent = Intent(holder.itemView?.context, BeveragerecipeActivity::class.java)
            intent.putExtra("idText", holder.beverageindex.text)
            startActivity(holder.itemView.context, intent, null)
        }
    }

    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val beveragebutton = itemView.findViewById<ImageButton>(R.id.beveragebutton)
        val beverageindex = itemView.findViewById<TextView>(R.id.beverageindex)

        init {
            beveragebutton.setOnClickListener {

            }
        }
    }
}