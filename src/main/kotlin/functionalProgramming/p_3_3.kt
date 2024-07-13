package org.example.functionalProgramming

fun main() {
    val array = (0..1000).toList()
    val employees = array.map { "Employee №$it" }
    val first30 = employees.take(30)
    val last30 = employees.takeLast(30)
    val drop30 = employees.drop(30)
    val dropLast30 = employees.dropLast(30)
    for (employee in first30) {
        println(employee)
    }

    val array2 =
        generateSequence(0) {
            println("Generated: ${it + 2}")
            it + 2
        }
    val evenList = array2.take(10)
    for (i in evenList) {
        println(i)
    }

    val array3 =
        generateSequence("Employee №1") {
            val index = it.substring(10).toInt()
            "Employee №${index + 1}"
        }
    val listOfFirst100 = array3.take(100)
    for (employee in listOfFirst100) {
        println(employee)
    }

    val employees1 = generateSequence(1) {it + 1}
        .map { "employee #$it" }
        .take(100);
    for (e in employees1) {
        println(e);
    }
}
