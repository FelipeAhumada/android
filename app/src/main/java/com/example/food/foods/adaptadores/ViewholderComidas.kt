package com.example.food.foods.adaptadores

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.food.databinding.ItemBebidaBinding
import com.example.food.drinks.Bebida
import com.example.food.foods.Comida

class ViewholderComidas(view: View): RecyclerView.ViewHolder(view) {


    val binding = ItemBebidaBinding.bind(view)

    fun render(comida: Comida, onClickListener:(Comida) -> Unit){
        binding.tvTituloBebida.text = comida.nombre
        binding.tvDescripcionBebida.text = comida.descripcion
        binding.tvPrecioBebida.text = comida.valor
        Glide.with(binding.imgBebida.context).load(comida.img).into(binding.imgBebida)

        itemView.setOnClickListener {
            onClickListener(comida)
        }

    }

}