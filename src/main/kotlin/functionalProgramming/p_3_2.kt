package org.example.functionalProgramming

fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
    }
    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }
    for (i in listOfEvenNumbers) {
        println(i)
    }

    val listOfNames = mutableListOf("Annie", "Tiamat", "Athena", "Artemia", "Gera")
    val resultList = listOfNames.filter { it.startsWith("A") }
    for (i in resultList) {
        println(i)
    }

    val numbers = (0..100).toList()
    val doubledNumbers = numbers.map { it * 2 }
    for (i in doubledNumbers) {
        println(i)
    }

    val employees = numbers.map { "Employee №$it" }
    for (employee in employees) {
        println(employee)
    }

    // task
    val list = List(1000) { (0..1000).random() }
    val result =
        list
            .filter { it % 5 == 0 || it % 3 == 0 }
            .map { it * it }
            .sortedDescending()
            .map { "$it" }
    for (i in result) {
        println(i)
    }
}
