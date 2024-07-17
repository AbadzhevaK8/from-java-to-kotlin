package org.example.oop.p48

open class Animal(
    val name: String,
    var weight: Float,
    val habitat: String,
) {
    open fun eat() {
        println("I'm eating.")
    }

    fun run() {
        println("I'm running.")
    }
}
