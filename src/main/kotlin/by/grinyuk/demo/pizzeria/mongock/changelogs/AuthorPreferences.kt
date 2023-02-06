package by.grinyuk.demo.pizzeria.mongock.changelogs

import by.grinyuk.demo.pizzeria.entity.Topping
import by.grinyuk.demo.pizzeria.entity.ToppingEntity
import io.mongock.api.annotations.ChangeUnit
import io.mongock.api.annotations.Execution
import io.mongock.api.annotations.RollbackExecution
import org.springframework.data.mongodb.core.MongoTemplate


@ChangeUnit(id="PopulateAuthorPreferences", order = "1", author = "oleg")
class AuthorPreferences {

    @Execution
    fun populate(mongoTemplate: MongoTemplate) {
        mongoTemplate.save(ToppingEntity("oleg@gmail.com", listOf(Topping.PEPPERONI)))
    }

    @RollbackExecution
    fun rollback() {
    }
}