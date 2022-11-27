package com.example.proyectreciclyeview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectreciclyeview.adapter.SuperHeroAdapter
import com.example.proyectreciclyeview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)
        initRecyclerView()
    }
    fun initRecyclerView(){
        //val recyclerView = findViewById<RecyclerView>(R.id.recyclerSuperHero)

        binding.recyclerSuperHero.layoutManager = LinearLayoutManager(this, )
        binding.recyclerSuperHero.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)


    }

}