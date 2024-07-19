package org.example.oop.p49

class Director(
    name: String,
    age: Int,
) : Worker(name, age) {
    override fun work() {
        println("I manage the process.")
    }
}
