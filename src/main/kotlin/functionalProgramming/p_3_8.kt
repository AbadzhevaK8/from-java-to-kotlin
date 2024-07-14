package org.example.functionalProgramming

fun main() {
    val result = modifyString("Hello world!") { it.uppercase() }
    println(result)
    val res = listModify(listOf(3, 9, 2, 99, 34, 74)) { it.sum() }
    println(res)
}

fun modifyString(
    string: String,
    modify: (String) -> String,
): String = modify(string)

inline fun listModify(
    list: List<Int>,
    operator: (List<Int>) -> Int,
): Int = operator(list)
