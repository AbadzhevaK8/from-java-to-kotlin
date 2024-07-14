package org.example.functionalProgramming

fun main() {
    val data =
        mapOf(
            "January" to listOf(100, 100, 100, 100),
            "February" to listOf(200, 200, -190, 200),
            "March" to listOf(200, 100, 400, 300),
            "April" to listOf(250, -250, 100, 300),
            "May" to listOf(200, 100, 400, 300),
            "June" to listOf(200, 100, 300, 300),
        )
    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val validData = data.filterNot { it -> it.value.any { it < 0 } }
    val averageWeek = validData.flatMap { it.value }.average()
    println("Average week: $averageWeek")

    val listOfSum = validData.map { it.value.sum() }
    val max = listOfSum.maxOrNull()
    val min = listOfSum.minOrNull()
    val averageMonth = listOfSum.average()

    val maxMonth = validData.filter { it.value.sum() == max }.keys
    val minMonth = validData.filter { it.value.sum() == min }.keys

    println("Average per month: $averageMonth")
    println("\nMax per month: $max")
    println("In the following months: ${maxMonth.joinToString(" ")}")

    println("\nMin per month: $min")
    println("In the following months: ${minMonth.joinToString(" ")}")

    val invalidData = data.filter { it.value.any { it < 0 } }
    val errorMonth = invalidData.keys
    println("\nMonths with mistakes: ")
    for (month in errorMonth) {
        println(month)
    }
}
