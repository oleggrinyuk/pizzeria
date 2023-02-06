package by.grinyuk.demo.pizzeria.service

import by.grinyuk.demo.pizzeria.entity.Topping
import by.grinyuk.demo.pizzeria.entity.ToppingEntity

interface ToppingService {
    fun addToppings(entity: ToppingEntity)

    fun copyToppings(from: String, to: String)

    fun statByToppings(): Map<Topping, Int>

    fun authorPreferences() : ToppingEntity
}