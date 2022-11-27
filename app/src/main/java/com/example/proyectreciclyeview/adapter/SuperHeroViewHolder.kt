package com.example.proyectreciclyeview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.proyectreciclyeview.R
import com.example.proyectreciclyeview.SuperHero
import com.example.proyectreciclyeview.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)


    fun render(superHeroModel: SuperHero){
       binding.tvSuperHeroName.text = superHeroModel.superhero
       binding.tvRealName.text = superHeroModel.realName
       binding.tvTipo.text = superHeroModel.tipo
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo ).into(binding.ivSuperHero)
    }
}