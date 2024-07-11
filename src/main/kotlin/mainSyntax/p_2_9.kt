@file:Suppress("ktlint:standard:filename")

package mainSyntax

fun main() {
    val array = arrayOfNulls<Int?>(101)
//    for (i in 0 until array.size) {
//        array[i] = i
//    }
//    for (i in array) {
//        println(i)
//    }
//    for (i in 100 downTo 0 step 2) {
//        println(i)
//    }
//    for (i in 0..100) {
//        array[i] = i
//    }
//    for ((index, i) in array.withIndex()) {
//        array[index] = i?.times(2)
//    }
//    for (i in array) {
//        println(i)
//    }
    //--------------
    val array1 = arrayOfNulls<Int?>(301)
    for ((index, i) in (300..600).withIndex()) {
        array1[index] = i
    }
    for (i in array1.size - 1 downTo 0 step 5) {
        println(array1[i])
    }
}