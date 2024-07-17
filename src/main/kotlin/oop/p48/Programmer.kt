package org.example.oop.p48

class Programmer(
    name: String,
    age: Int,
    val language: String,
) : Worker(name, age) {
    override fun work() {
        println("I'm coding on $language")
    }
}
