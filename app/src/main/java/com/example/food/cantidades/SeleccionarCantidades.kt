package com.example.food.cantidades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.food.R
import com.example.food.carrito.CarritoDeCompras
import com.example.food.databinding.ActivityFoodBinding
import com.example.food.databinding.ActivitySeleccionarCantidadesBinding

class SeleccionarCantidades : AppCompatActivity() {

    private lateinit var binding: ActivitySeleccionarCantidadesBinding
    private lateinit var nombre:String
    private lateinit var descripcion:String
    private lateinit var precio:String
    private lateinit var img:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeleccionarCantidadesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup()


    }

    private fun setup() {

        val intent = intent
        nombre = intent.getStringExtra("nombre")!!
        descripcion = intent.getStringExtra("descripcion")!!
        precio = intent.getStringExtra("precio")!!
        img = intent.getStringExtra("img")!!

        setupViews()
        funcionalidades()


    }

    private fun funcionalidades() {

        var cantidad = binding.tvCantidad.text.toString().toInt()

        binding.ivMinus.setOnClickListener {

            if(cantidad != 1){
                cantidad--
                binding.tvCantidad.text = cantidad.toString()

                binding.tvValorTotal.text = "$ ${(cantidad * precio.split(" ")[1].toInt())}"

            }

        }
        binding.ivPlus.setOnClickListener {

            cantidad++
            binding.tvCantidad.text = cantidad.toString()

            binding.tvValorTotal.text = "$ ${(cantidad * precio.split(" ")[1].toInt())}"

        }

        binding.btnInsertarAlCarro.setOnClickListener {

            val intent = Intent(this, CarritoDeCompras::class.java)
            intent.putExtra("nombreProducto", nombre)
            intent.putExtra("precioTotal", binding.tvValorTotal.text)
            intent.putExtra("cantidadProductos", binding.tvCantidad.text)


            startActivity(intent)
        }

    }

    private fun setupViews() {
        binding.tvTituloSeleccion.text = nombre
        binding.tvDescripcionSeleccion.text = descripcion
        binding.tvValorUnitario.text = precio
        binding.tvValorTotal.text = precio

        val titulo = findViewById<TextView>(R.id.tvTituloToolbar)
        titulo.text = nombre
        val volver = findViewById<ImageView>(R.id.btnVolverToolbar)
        volver.setOnClickListener {
            finish()
        }

        Glide.with(this).load(img).into(binding.imgSeleccionCantidades)

    }
}