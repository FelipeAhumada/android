package com.example.food.carrito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.food.R
import com.example.food.carrito.adaptadores.AdaptadorCarrito
import com.example.food.databinding.ActivityCarritoDeComprasBinding

class CarritoDeCompras : AppCompatActivity() {

    private lateinit var binding:ActivityCarritoDeComprasBinding
    private lateinit var nombreProducto:String
    private lateinit var precioTotal:String
    private lateinit var cantidadProductos:String
    private lateinit var listaAlimentos:MutableList<Alimento>
    private lateinit var rv:RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarritoDeComprasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup()

    }

    private fun setup() {

        setupViews()
        initRv()

    }

    private fun initRv() {

        listaAlimentos = mutableListOf(Alimento(nombreProducto, precioTotal, cantidadProductos))

        val linearManager= LinearLayoutManager(this)
        val decorator = DividerItemDecoration(this, linearManager.orientation)
        rv = binding.rvCarro
        rv.layoutManager = linearManager
        rv.adapter = AdaptadorCarrito(listaAlimentos) {
            onItemSelected(
                it
            )
        }
        rv.addItemDecoration(decorator)
    }


    private fun setupViews() {

        val intent = intent
        nombreProducto = intent.getStringExtra("nombreProducto")!!
        precioTotal = intent.getStringExtra("precioTotal")!!
        cantidadProductos = intent.getStringExtra("cantidadProductos")!!

        val titulo = findViewById<TextView>(R.id.tvTituloToolbar)
        titulo.text = "Carro"
        val volver = findViewById<ImageView>(R.id.btnVolverToolbar)
        volver.setOnClickListener {
            finish()
        }

        binding.tvPrecioTotalCarrito.text = "Total: ${precioTotal}"

        /*
        binding.btnComprarCarrito.setOnClickListener {
        }

         */

    }

    private fun onItemSelected(alimento: Alimento){
        listaAlimentos.clear()
        rv.adapter!!.notifyItemRemoved(0)
        binding.tvPrecioTotalCarrito.text = "No hay prodcutos."
        binding.tvSinProductos.visibility = TextView.VISIBLE
    }
}