package by.grinyuk.demo.pizzeria.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("toppings")
data class ToppingEntity(
    @Id
    var email: String,
    var toppings: List<Topping>
)
