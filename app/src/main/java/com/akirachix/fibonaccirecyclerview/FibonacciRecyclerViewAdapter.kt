package com.akirachix.fibonaccirecyclerview

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class FibonacciRecyclerViewAdapter(var numbersList: List<Int>): RecyclerView.Adapter<NumbersViewHolder>(){

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
    val itemView = LayoutInflater.from(parent.context).inflate(R.layout.fibonacci_series_list, parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {

        holder.tvNumber.text = numbersList[position].toString()

    }

    override fun getItemCount(): Int {

        return numbersList.size

    }
}


class NumbersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    val tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)


}