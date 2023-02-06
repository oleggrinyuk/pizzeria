package by.grinyuk.demo.pizzeria.controller.dto

import by.grinyuk.demo.pizzeria.controller.dto.`in`.AddToppingsDto
import by.grinyuk.demo.pizzeria.controller.dto.out.AuthorToppingsDto
import by.grinyuk.demo.pizzeria.entity.ToppingEntity
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface ToppingMapper {

    fun toEntity(dto: AddToppingsDto): ToppingEntity

    fun toDto(entity: ToppingEntity): AddToppingsDto

    fun toAuthorToppingsDto(entity: ToppingEntity): AuthorToppingsDto

}