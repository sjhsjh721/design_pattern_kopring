package com.example.design_pattern_spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class DesignPatternSpringApplication

fun main(args: Array<String>) {
    runApplication<DesignPatternSpringApplication>(*args)

    @GetMapping("/")
    fun hello(){
        print("hello")
    }
}
