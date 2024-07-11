@file:Suppress("ktlint:standard:filename")

package mainSyntax

fun main() {
    printInfo(lastName = "Liberty", name = "Jane")
    println(volume(3))
    println(volume(2, 3))
    println(volume(3, 2, 5))
}

fun printInfo(
    lastName: String = "",
    name: String = "",
    patronymic: String = "",
) {
    if (lastName.isNotEmpty()) {
        println("Lastname: $lastName")
    }
    if (name.isNotEmpty()) {
        println("Firstname: $name")
    }
    if (patronymic.isNotEmpty()) {
        println("Patronymic: $patronymic")
    }
}

// fun printInfo(
//    lastName: String,
//    name: String,
// ) {
//    printInfo(lastName, name, "")
// }

fun volume(
    x: Int,
    y: Int = x,
    z: Int = x,
): Int = x * y * z
