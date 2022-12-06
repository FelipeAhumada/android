package com.example.food.foods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.food.R
import com.example.food.cantidades.SeleccionarCantidades
import com.example.food.databinding.ActivityFoodBinding
import com.example.food.drinks.ProveedorBebidas
import com.example.food.drinks.adaptador.AdaptadorBebidas
import com.example.food.foods.adaptadores.AdaptadorComidas

class Food : AppCompatActivity() {

    private lateinit var binding:ActivityFoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup()

    }

    private fun setup() {

        initRv()

        val titulo = findViewById<TextView>(R.id.tvTituloToolbar)
        titulo.text = "Comidas"
        val volver = findViewById<ImageView>(R.id.btnVolverToolbar)
        volver.setOnClickListener {
            finish()
        }

    }

    private fun initRv() {
        val linearlayour = LinearLayoutManager(this)

        val decorator = DividerItemDecoration(this, linearlayour.orientation)

        val rv = binding.rvFoods
        rv.layoutManager = linearlayour
        rv.adapter = AdaptadorComidas(ProveedorComidas.listaComidas) { onItemSelected(it) }
        rv.addItemDecoration(decorator)

    }

    private fun onItemSelected(comida:Comida){
        val intent = Intent(this, SeleccionarCantidades::class.java)
        intent.putExtra("nombre", comida.nombre)
        intent.putExtra("descripcion", comida.descripcion)
        intent.putExtra("precio", comida.valor)
        intent.putExtra("img", comida.img)
        startActivity(intent)

    }
}