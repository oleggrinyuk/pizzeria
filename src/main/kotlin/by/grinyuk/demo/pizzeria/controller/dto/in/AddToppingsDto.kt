package by.grinyuk.demo.pizzeria.controller.dto.`in`

import by.grinyuk.demo.pizzeria.entity.Topping

data class AddToppingsDto(
    val email: String,
    val toppings: List<Topping>
)
