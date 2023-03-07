package com.example.design_pattern_spring.dto

import com.example.design_pattern_spring.behavior.FlyBehavior
import com.example.design_pattern_spring.behavior.QuackBehavior

abstract class Duck {
    val flyBehavior: FlyBehavior
        get() {
            TODO()
        }
    val quackBehavior: QuackBehavior = TODO()


    abstract fun display()
    fun performFly() {}
    fun performQuack() {}
    fun swim() {
        print("수영한다~")
    }

}