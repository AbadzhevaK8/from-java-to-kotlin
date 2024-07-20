package org.example.oop.p415

fun main() {
//    val list: MyList<Int> = MyArrayList()
    val list = MyArrayList.myListOf(8, 8, 34, 3, 3, 4, "", "")
    for (i in 0..100) {
        list.add("$i")
    }
    for (i in 0..90) {
        list.removeAt(0)
    }
    for (i in 0 until list.size()) {
        println(list.get(i))
    }
}
