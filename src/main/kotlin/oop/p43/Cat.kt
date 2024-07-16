package org.example.oop.p43

class Cat(
    val name: String,
    var age: Int,
    val weight: Float = 0f,
) {
    val isOld: Boolean
        get() = age >= 12

    fun printInfo() {
        println("Name: $name age: $age weight: $weight")
    }

//    fun isOld() = age >= 12
}
