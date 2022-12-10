package com.example.food.drinks

data class Bebida(

    val nombre:String,
    val valor: String,
    val descripcion:String,
    val img:String

)

class ProveedorBebidas(){

    companion object{
        val listaBebidas = listOf<Bebida>(
            Bebida(
                "Café Expreso",
                "$ 1500",
                "Café Colombiano, recien molido.",
                "https://i.ibb.co/6HKZyGb/kisspng-white-coffee-cafe-espresso-coffee-cup-in-house-service-support-connect-vending-5c585866142f0.png"
            ),
            Bebida(
                "Cafe Cortado",
                "$ 2500",
                "Café Colombiano, recien molido. Leche descremada.",
                "https://i.ibb.co/7zncSZk/kisspng-cuban-espresso-cappuccino-coffee-wiener-melange-co-rice-beverage-chiccolat-natfood-5beae1af0.png"
            ),
            Bebida(
                "Cafe Irlandes",
                "$ 5500",
                "Café Colombiano, recien molido. Leche y 1 oz de Wisky.",
                "https://i.ibb.co/2Ff1BQK/kisspng-irish-coffee-cocktail-whiskey-baileys-irish-cream-migammashow-cocktails-5b6e95b6efa2c9-58147.png"
            )
        )
    }

}
