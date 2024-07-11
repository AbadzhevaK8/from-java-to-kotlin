package org.example.main_syntax

fun main() {
    val numbers = mutableListOf(1, 2, 3, 88, 2, 3, 9, 0, 4, 5)
    println(sort(8, 3, 32, 83, 294, 0, -17, 9, 23))
    println(sort(numbers))
}

fun max(
    a: Int,
    b: Int,
) = if (a > b) a else b

fun crop(str: String) = str.substring(0, 5.coerceAtMost(str.length))

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (num in numbers) {
        result += num
    }
    return result
}

fun sort(numbers: MutableList<Int>): List<Int> {
    for (i in 1 until numbers.size) {
        for (j in numbers.size - 1 downTo i) {
            if (numbers[j] < numbers[j - 1]) {
                numbers[j] =
                    numbers[j - 1].also {
                        numbers[j - 1] = numbers[j]
                    }
            }
        }
    }
    return numbers
}

fun sort(numbers: Array<Int>) = sort(numbers.toMutableList())

fun sort(vararg numbers: Int) = sort(numbers.toMutableList())
