package org.example.oop.p49

class Seller(
    name: String,
    age: Int,
) : Worker(name, age),
    Cleaner {
    override fun work() {
        println("I'm selling")
    }

    override fun clean() {
        println("Seller is cleaning")
    }
}
