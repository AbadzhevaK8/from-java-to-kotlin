package org.example.functionalProgramming

fun main() {
    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()
    for (i in 0..1000) {
        names.add("Name$i")
        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }
    val users = names.zip(phones)
    for (user in users) {
        println("Name: ${user.first} phone: ${user.second}")
    }

    val fullNames = mutableListOf<String>()
    for (i in 0..1000) {
        fullNames.add("Name$i Lastname$i")
    }
    val names1 = fullNames.map { it.substringBefore(" ") }
    val lastNames = fullNames.map { it.substringAfter(" ") }

    val users2 = names1.zip(lastNames)
    for (i in users2) {
        println("Name: ${i.first} Lastname: ${i.second}")
    }
}
