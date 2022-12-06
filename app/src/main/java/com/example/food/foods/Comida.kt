package com.example.food.foods

import com.example.food.drinks.Bebida

data class Comida(

    val nombre:String,
    val valor: String,
    val descripcion:String,
    val img:String

)

class ProveedorComidas(){

    companion object{
        val listaComidas = listOf<Comida>(
            Comida(
                "Pizza Napolitana",
                "$ 7500",
                "Pizza de estilo napolitana.",
                "https://i.ibb.co/tHDhbb3/kisspng-sicilian-pizza-neapolitan-pizza-neapolitan-cuisine-5b2240a79e7f31-0573596815289714316492.png"
            ),
            Comida(
                "Pizza Española",
                "$ 8000",
                "Pizza estilo española.",
                "https://i.ibb.co/yVh7fxN/Pizza-Download-PNG-Image.png"
            ),
            Comida(
                "Pizza Vegetariana",
                "$ 6500",
                "Pizza hecha con productos vegetales.",
                "https://i.ibb.co/n3dH04n/pngwing-com.png"
            )
        )
    }

}