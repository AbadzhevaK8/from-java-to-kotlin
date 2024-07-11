@file:Suppress("ktlint:standard:filename")

package mainSyntax

fun main() {
    // arrays
    val array = arrayOf(1, 2, 3, 34, 45, null)
    val array1 = arrayOfNulls<Int?>(10)
    array[4] = 88
    println(array[4])

    // arrayList
    val listOfNumbers: MutableList<Int> = ArrayList<Int>()
    listOfNumbers.add(8)
    println(listOfNumbers[0])
}