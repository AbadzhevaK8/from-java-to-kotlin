package org.example.functionalProgramming

fun main() {
    val age = 5

    if (age.isAgeValid()) {
        println("Valid")
    }
    println(age.isPositive())

    val obj = mutableMapOf<String, String>()
    myWith(obj) {
        keys
        values
    }

    println(9.isPrime())
}

fun Int.isAgeValid() = this in 6..100

fun Int.isPositive() = this >= 0

fun Int.isPrime(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}

inline fun <T, R> myWith(
    obj: T,
    operation: T.() -> R,
): R = obj.operation()
