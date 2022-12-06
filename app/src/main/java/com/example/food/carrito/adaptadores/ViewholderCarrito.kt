package com.example.food.carrito.adaptadores

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.food.carrito.Alimento
import com.example.food.databinding.ItemBebidaBinding
import com.example.food.databinding.ItemCarritoBinding

class ViewholderCarrito(view:View): RecyclerView.ViewHolder(view) {

    val binding = ItemCarritoBinding.bind(view)

    fun render(alimento: Alimento, onClickListener:(Alimento) -> Unit){

        binding.tvCantidadCarrito.text = alimento.cantidad
        binding.tvTituloCarrito.text = "x ${alimento.nombre}"
        binding.tvPrecioCarrito.text = alimento.precio

        binding.imgBorrarCarrito.setOnClickListener { onClickListener(alimento) }

    }

}