package com.carsaver.test
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
open class HomeController {

    @Get
    fun index() = mapOf("message" to "Hello World")
}