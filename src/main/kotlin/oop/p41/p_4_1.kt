package org.example.oop.p41

fun main() {
    val user = User()
    user.name = null
    user.age = -40
    println("Name: ${user.name} Age: ${user.age}")

    val dog = Dog()
    dog.name = "gera"
    dog.age = 7
    dog.age = -9
    dog.weight = 5

    println("Name: ${dog.name} age: ${dog.age} weight: ${dog.weight}")
}
