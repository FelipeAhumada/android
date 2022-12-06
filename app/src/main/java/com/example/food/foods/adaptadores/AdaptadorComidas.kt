package com.example.food.foods.adaptadores

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.food.R
import com.example.food.foods.Comida

class AdaptadorComidas(private val listadoComidas:List<Comida>, private val onClickListener:(Comida) -> Unit): RecyclerView.Adapter<ViewholderComidas>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewholderComidas {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewholderComidas(layoutInflater.inflate(R.layout.item_bebida, parent, false))
    }

    override fun onBindViewHolder(holder: ViewholderComidas, position: Int) {
        val item = listadoComidas[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int {
        return listadoComidas.size
    }
}