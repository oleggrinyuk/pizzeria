package by.grinyuk.demo.pizzeria.repository

import by.grinyuk.demo.pizzeria.entity.Topping
import by.grinyuk.demo.pizzeria.entity.ToppingEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ToppingRepository: MongoRepository<ToppingEntity, String> {

    fun countByToppingsContains(topping: Topping) : Int
}