package com.example.design_pattern_spring.behavior

class FlyNoWay: FlyBehavior {
    override fun fly() {
        print("못날아잉")
    }
}