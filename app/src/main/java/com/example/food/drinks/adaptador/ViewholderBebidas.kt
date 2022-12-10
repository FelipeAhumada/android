package com.example.food.drinks.adaptador

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.food.databinding.ItemBebidaBinding
import com.example.food.drinks.Bebida

class ViewholderBebidas(view:View):ViewHolder(view) {

    val binding = ItemBebidaBinding.bind(view)

    fun render(bebida:Bebida, onClickListener:(Bebida) -> Unit){
        binding.tvTituloBebida.text = bebida.nombre
        binding.tvDescripcionBebida.text = bebida.descripcion
        binding.tvPrecioBebida.text = bebida.valor
        Glide.with(binding.imgBebida.context).load(bebida.img).into(binding.imgBebida)

        itemView.setOnClickListener {
            onClickListener(bebida)
        }

    }

}