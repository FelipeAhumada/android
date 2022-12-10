package com.example.food.drinks

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
import com.example.food.databinding.ActivityDrinksBinding
import com.example.food.drinks.adaptador.AdaptadorBebidas
import com.example.food.foods.Comida

class Drinks : AppCompatActivity() {

    private lateinit var binding:ActivityDrinksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrinksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup()



    }

    private fun setup() {

        initRv()

        val titulo = findViewById<TextView>(R.id.tvTituloToolbar)
        titulo.text = "Bebidas"
        val volver = findViewById<ImageView>(R.id.btnVolverToolbar)
        volver.setOnClickListener {
            finish()
        }

    }

    private fun initRv() {
        val linearlayour = LinearLayoutManager(this)

        val decorator = DividerItemDecoration(this, linearlayour.orientation)

        val rv = binding.rvDrinks
        rv.layoutManager = linearlayour
        rv.adapter = AdaptadorBebidas(ProveedorBebidas.listaBebidas) { onItemSelected(it) }
        rv.addItemDecoration(decorator)
    }

    private fun onItemSelected(bebida: Bebida){

        val intent = Intent(this, SeleccionarCantidades::class.java)
        intent.putExtra("nombre", bebida.nombre)
        intent.putExtra("descripcion", bebida.descripcion)
        intent.putExtra("precio", bebida.valor)
        intent.putExtra("img", bebida.img)
        startActivity(intent)

    }

}