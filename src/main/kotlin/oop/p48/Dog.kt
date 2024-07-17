package org.example.oop.p48

class Dog(weight: Float) : Animal(name = "Dog", weight, "surface") {
    override fun eat() {
        println("I'm eating a bone.")
    }
}