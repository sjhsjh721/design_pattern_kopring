package com.example.design_pattern_spring.behavior

class MuteQuack: QuackBehavior {
    override fun quack() {
        print("<<조용~>>")
    }
}