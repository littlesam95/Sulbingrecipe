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

class DessertAdapter(val dessertList: ArrayList<DessertRecycler>): RecyclerView.Adapter<DessertAdapter.CustomViewHolder>() {
    var mPosition = 0

    fun getPosition(): Int {
        return mPosition
    }

    private fun setPosition(position: Int) {
        mPosition = position
    }

    fun addItem(dessertRecycler: DessertRecycler) {
        dessertList.add(dessertRecycler)
        notifyDataSetChanged()
    }

    fun removeItem(position: Int) {
        if (position > 0) {
            dessertList.removeAt(position)
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DessertAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dessert_recycler, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dessertList.size
    }

    override fun onBindViewHolder(holder: DessertAdapter.CustomViewHolder, position: Int) {
        holder.bind(dessertList[position])

        holder.dessertbutton.setOnClickListener {
            val intent = Intent(holder.itemView?.context, DessertrecipeActivity::class.java)
            intent.putExtra("idText", holder.dessertindex.text)
            startActivity(holder.itemView.context, intent, null)
        }
    }

    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val dessertbutton = itemView.findViewById<ImageButton>(R.id.dessertbutton)
        val dessertindex = itemView.findViewById<TextView>(R.id.dessertindex)

        fun bind(dessertRecycler: DessertRecycler) {
            Glide.with(itemView).load(dessertRecycler.dessertbutton).centerInside().into(dessertbutton)
            dessertindex.text = dessertRecycler.dessertindex.toString()
        }

        init {
            dessertbutton.setOnClickListener {

            }
        }
    }
}