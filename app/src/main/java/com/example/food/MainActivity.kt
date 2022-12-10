package com.example.food

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.food.databinding.ActivityMainBinding
import com.example.food.drinks.Drinks
import com.example.food.foods.Food

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup()

    }

    private fun setup() {

        binding.btnFood.setOnClickListener {
            startActivity(Intent(this, Food::class.java))
        }

        binding.btnDrinks.setOnClickListener {
            startActivity(Intent(this, Drinks::class.java))
        }

        val titulo = findViewById<TextView>(R.id.tvTituloToolbar)
        titulo.text = "Menú"
        val volver = findViewById<ImageView>(R.id.btnVolverToolbar)
        volver.setOnClickListener {
            finish()
        }

    }
}