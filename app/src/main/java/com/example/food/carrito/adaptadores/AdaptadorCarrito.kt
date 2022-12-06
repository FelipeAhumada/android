package com.example.food.carrito.adaptadores

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.food.R
import com.example.food.carrito.Alimento

class AdaptadorCarrito(private val lista:List<Alimento>, private val onClickListener:(Alimento) -> Unit): RecyclerView.Adapter<ViewholderCarrito>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewholderCarrito {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewholderCarrito(layoutInflater.inflate(R.layout.item_carrito, parent, false))
    }

    override fun onBindViewHolder(holder: ViewholderCarrito, position: Int) {
        val item = lista[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int {
        return lista.size
    }


}