package by.grinyuk.demo.pizzeria.controller

import by.grinyuk.demo.pizzeria.controller.dto.ToppingMapper
import by.grinyuk.demo.pizzeria.controller.dto.`in`.AddToppingsDto
import by.grinyuk.demo.pizzeria.controller.dto.`in`.CopyFriendsToppingsDto
import by.grinyuk.demo.pizzeria.controller.dto.out.AuthorToppingsDto
import by.grinyuk.demo.pizzeria.controller.dto.out.PreferencesStatDto
import by.grinyuk.demo.pizzeria.service.ToppingService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/toppings")
class ToppingController(val service: ToppingService, val mapper: ToppingMapper) {

    @PostMapping
    fun addToppings(@RequestBody topping: AddToppingsDto) = service.addToppings(mapper.toEntity(topping))

    @PutMapping
    fun wantTheSame(@RequestBody req: CopyFriendsToppingsDto) {
        if (!req.friend.equals(req.me, true))
            service.copyToppings(req.friend, req.me)
    }

    @GetMapping
    fun getStatByToppings(): PreferencesStatDto {
        return PreferencesStatDto(service.statByToppings())
    }

    @GetMapping("/author")
    fun getAuthorPreferences(): AuthorToppingsDto {
        return mapper.toAuthorToppingsDto(service.authorPreferences())
    }
}