package org.example.functionalProgramming

var name: String? = "lkjlkj"
val outerList: MutableList<Int> = mutableListOf<Int>()

fun main() {
    if (name?.length?.compareTo(5) == 1) {
        println("lkjlkj")
    }

    name?.let {
        if (it.length > 5) {
            println("lkjlkj")
        }
    }

    val list = mutableListOf<Int>()
    with(list) {
        for (i in 0..1000) {
            add((1..1000).random())
        }
        println(sum())
        println(average())
        println(min())
        println(max())
        println(first())
        println(last())
    }

    with(outerList) {
        for (i in 0..1000) {
            add((1..1000).random())
        }
        let { filter { it % 2 == 0 }.take(100).map { println("Task: $it") } }
    }
}



