package org.example.functionalProgramming

fun main() {
    val sum: (Int, Int) -> Int = { a, b -> a + b }
    println(sum(3, 12))

    val square: (Int) -> Int = { it * it }
    println(square(12))

    // Task 1
    val perimeter: (Int, Int) -> Int = { a: Int, b: Int -> (a + b) * 2 }
    println(perimeter(7, 3))

    // Task 2
    val greeting: (String) -> Unit = { println("Hello, $it!") }
    greeting("Kate")

    // Task 3
    val sortedArray: (Array<Int>) -> Array<Int> = {
        for (i in it.size - 2 downTo 0) {
            for (j in 0..i) {
                if (it[j] < it[i] + 1) {
                    val temp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = temp
                }
            }
        }
        it
    }
    val arrayResult = sortedArray(arrayOf(1, 5, 7, 3))
    for (i in arrayResult) {
        println(i)
    }
}
