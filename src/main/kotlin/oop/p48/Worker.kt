package org.example.oop.p48

open class Worker(
    val name: String,
    val age: Int,
) {
    open fun work() {
        println("I'm working.")
    }
}
