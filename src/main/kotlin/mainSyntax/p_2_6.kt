@file:Suppress("ktlint:standard:filename")

package mainSyntax

fun main() {
    val nameOfMonth = "March"
    val season = when (nameOfMonth) {
        "December", "January", "February" -> {
            "Winter"
        }
        "March", "April", "May" -> {
            "Spring"
        }
        "June", "July", "August" -> {
            "Summer"
        }
        "September", "October", "November" -> {
            "Autumn"
        }
        else -> {
            "Not found"
        }
    }
    println(season)

    val indexOfMonth = 8
    val seasonByIndex = when (indexOfMonth) {
        12, 1, 2 -> {
            "Winter"
        }
        3, 4, 5 -> {
            "Spring"
        }
        6, 7, 8 -> {
            "Summer"
        }
        in 9..11 -> {
            "Autumn"
        }
        else -> {
            "Not found"
        }
    }
    println(seasonByIndex)

    val temp = 80
    val state = when {
        temp < 0 -> "solid"
        temp < 100 -> "liquid"
        else -> "gaseous"
    }
    println(state)

    val time = 1
    val weather = false
    val activity = when {
        time !in 8..22 -> "sleep"
        weather -> "walking"
        else -> "reading"
    }
    println(activity)
}