package by.grinyuk.demo.pizzeria

import io.mongock.runner.springboot.EnableMongock
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableMongock
class PizzeriaApplication


fun main(args: Array<String>) {
    runApplication<PizzeriaApplication>(*args)
}
