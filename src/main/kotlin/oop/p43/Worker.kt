package org.example.oop.p43

import java.time.LocalDateTime

class Worker(
    val name: String,
    val position: String,
    val startYear: Int,
) {
    val experience: Int
        get() = LocalDateTime.now().year - startYear

    fun work() {
        println("I'm working...")
    }
}
