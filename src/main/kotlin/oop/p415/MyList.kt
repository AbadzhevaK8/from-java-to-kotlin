package org.example.oop.p415

interface MyList<T> {
    fun get(index: Int): T

    fun add(string: T)

    fun remove(element: T)

    fun removeAt(index: Int)

    fun size(): Int
}
