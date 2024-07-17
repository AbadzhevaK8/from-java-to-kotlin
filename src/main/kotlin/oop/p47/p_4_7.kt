package org.example.oop.p47

import org.example.oop.p47.Month.*
import org.example.oop.p47.Season.*

fun main() {
    val month = AUGUST
    val season =
        when (month) {
            DECEMBER, JANUARY, FEBRUARY -> WINTER.value
            MARCH, APRIL, MAY -> SPRING.value
            JUNE, JULY, AUGUST -> SUMMER.value
            SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN.value
        }
    println(season)
}
