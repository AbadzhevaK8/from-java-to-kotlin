package org.example.oop.p46

fun main() {
    val student1 = Student("Anna", "Miller", "1090803")
    val student2 = Student("Anna", "Miller", "1090803")
    val (name: String, lastName: String, id: String) = student1
    println(name)
    println(lastName)
    println(id)
    println(student1)
    println(student2)
    println(student1.hashCode())
    println(student2.hashCode())
    println(student1 == student2)
    println(student1 === student2)

    // -----------------------
    val address = Address("Chicago", "Elm", 13)
    val address1 = address.copy()

    println(address)
    println(address1)
    println(address.hashCode())
    println(address1.hashCode())
    println(address1 == address)
    val (city, street, building) = address
}

