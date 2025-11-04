package com.example.nectar_online_groceries.data

import com.example.nectar_online_groceries.R

data class Product(
    val name: String,
    val description: String,
    val price: String,
    val imageRes: Int
)

object ProductRepository {
    val exclusiveOffers = listOf(
        Product("Bananas", "7pcs, Priceg", "R$4,99", R.drawable.banana_icon),
        Product("Maçã", "1kg, Priceg", "R$4,99", R.drawable.apple_icon),
        Product("Pimentão", "1kg, Priceg", "R$4,99", R.drawable.bell_pepper_red_icon),
        )

    val bestSellers = listOf(
        Product("Pimentão", "1kg, Priceg", "R$4,99", R.drawable.bell_pepper_red_icon),
        Product("Gengibre", "250gm, Priceg", "R$4,99", R.drawable.ginger_icon),
        Product("Maçã", "1kg, Priceg", "R$4,99", R.drawable.apple_icon),
    )
}

