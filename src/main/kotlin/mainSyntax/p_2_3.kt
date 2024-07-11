@file:Suppress("ktlint:standard:filename")

package mainSyntax

private var name: String? = null
private val name1: String? = null
private val name2: String? = "777777"
private val name3: String? = ""

fun main() {
    val length = name?.length?.toString()
    val length2 = name?.length ?: 0
    println(name?.length)

    // ---------------
    var result = (name1?.length ?: 0) + (name2?.length ?: 0) + (name3?.length ?: 0)
    println(result)
}