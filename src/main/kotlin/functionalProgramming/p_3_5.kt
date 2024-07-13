package org.example.functionalProgramming

fun main() {
    val revenueByWeek =
        listOf(
            listOf(1, 3, 3, 9, 3),
            listOf(8, 3, 3, 1, 2),
            listOf(4, 3, 4, 9, 3),
            listOf(8, 4, 3, 9, 7),
        )

//    val total = mutableListOf<Int>()
//    revenueByWeek.map {
//        for (i in it) {
//            total.add(i)
//        }
//    }
//    val total = revenueByWeek.flatMap { it }
    val total = revenueByWeek.flatten()
    val average = total.average()
    println(average)

    // -------------------
    val data =
        mapOf(
            "file 1" to listOf(13, 87, 35, 77, 98),
            "file 2" to listOf(29, -87, 11, 22, 12),
            "file 3" to listOf(13, 29, 35, 22, 4),
        )

//    val averageProperty1 = data.flatMap { it.value }.average()
//    println(averageProperty1)

    val avgFiltered =
        data
            .filterNot { it -> it.value.any { it < 0 } }
            .flatMap { it.value }
            .average()
    println(avgFiltered)
}
