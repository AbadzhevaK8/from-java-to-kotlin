package org.example.oop.p410

class Car(
    override var name: String = "Car",
) : Transport(name) {
    override fun drive() {
        println("The car is moving...")
    }

    fun startEngine(): Boolean {
        println("Starting engine...")
        return true
    }
}
