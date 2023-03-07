package com.example.design_pattern_spring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/duck")
class DuckController {
    @GetMapping("/hello")
    fun hello() {
        print("hello");
    }
}