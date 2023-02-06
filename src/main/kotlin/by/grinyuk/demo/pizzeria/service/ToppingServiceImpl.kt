package by.grinyuk.demo.pizzeria.service

import by.grinyuk.demo.pizzeria.entity.Topping
import by.grinyuk.demo.pizzeria.entity.ToppingEntity
import by.grinyuk.demo.pizzeria.repository.ToppingRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class ToppingServiceImpl(val repository: ToppingRepository,) : ToppingService {

    override fun addToppings(entity: ToppingEntity) {
        repository.save(entity)
    }

    override fun copyToppings(from: String, to: String) {
        val topping = repository.findById(from).orElseThrow { RuntimeException("Entity not found!") }
        topping.email = to
        repository.save(topping)
    }

    override fun statByToppings(): Map<Topping, Int> {
        val hashMap = HashMap<Topping, Int>()
        Topping.values().forEach {
            hashMap[it] = repository.countByToppingsContains(it)
        }
        return hashMap
    }

    override fun authorPreferences(): ToppingEntity {
        return repository.findById("oleg@gmail.com").orElseThrow { RuntimeException("Entity not found!") }
    }
}