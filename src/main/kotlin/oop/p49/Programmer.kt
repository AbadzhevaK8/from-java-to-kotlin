package org.example.oop.p49

class Programmer(
    name: String,
    age: Int,
    val language: String,
) : Worker(name, age),
    Cleaner {
    override fun work() {
        println("I'm coding on $language")
    }

    override fun clean() {
        println("Programmer is cleaning")
    }
}
