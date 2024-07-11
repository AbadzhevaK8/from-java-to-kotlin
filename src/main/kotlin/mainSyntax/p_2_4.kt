@file:Suppress("ktlint:standard:filename")

package mainSyntax

fun main() {
    var count = 300
    val food = if (count > 500) {
        count -= 500
        "pizza"
    } else if (count > 200) {
        count -= 200
        "shawarma"
    } else {
        count -= 50
        "ramen"
    }
    println("You can buy $food")
}