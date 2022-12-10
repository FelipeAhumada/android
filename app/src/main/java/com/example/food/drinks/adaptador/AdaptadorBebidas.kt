package com.example.food.drinks.adaptador

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.food.R
import com.example.food.drinks.Bebida
import com.example.food.foods.Comida

class AdaptadorBebidas(private val listadoBebidas:List<Bebida>, private val onClickListener:(Bebida) -> Unit):RecyclerView.Adapter<ViewholderBebidas>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewholderBebidas {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewholderBebidas(layoutInflater.inflate(R.layout.item_bebida, parent, false))
    }

    override fun onBindViewHolder(holder: ViewholderBebidas, position: Int) {
        val item = listadoBebidas[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int {
        return listadoBebidas.size
    }


}