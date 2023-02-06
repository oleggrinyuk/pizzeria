package by.grinyuk.demo.pizzeria.controller.dto.out

import by.grinyuk.demo.pizzeria.entity.Topping

data class PreferencesStatDto(val preferences: Map<Topping, Int>)
