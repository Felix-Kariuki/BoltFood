package com.flexcode.boltfood.data

import com.flexcode.boltfood.R

data class FoodItem(
    val foodImage: Int,
    val name: String,
    val time: String,
    val canceledPrice: String,
    val price: String,
    val rating: String
)

val foodList = listOf(
    FoodItem(
        foodImage = R.drawable.burger,
        name = "Burger",
        time = "45 - 60 min",
        price = "Ksh 450",
        rating = "4.5",
        canceledPrice = "Ksh 520"
    ),
    FoodItem(
        foodImage = R.drawable.burger,
        name = "Burger1",
        time = "45 - 60 min",
        price = "Ksh 120",
        rating = "4.1",
        canceledPrice = "Ksh 189"
    ),
    FoodItem(
        foodImage = R.drawable.burger,
        name = "Burger2",
        time = "45 - 60 min",
        price = "Ksh 155",
        rating = "4.5",
        canceledPrice = "Ksh 133"
    )
)

