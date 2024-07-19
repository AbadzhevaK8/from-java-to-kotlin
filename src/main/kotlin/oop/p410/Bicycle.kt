package org.example.oop.p410

class Bicycle(
    name: String = "Bicycle",
) : Transport(name) {
    override fun drive() {
        println("The bike is moving...")
    }
}
