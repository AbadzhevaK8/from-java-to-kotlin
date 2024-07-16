package org.example.oop.p43

fun main() {
    val cat = Cat("Morris", 15, 6.3f)
    cat.printInfo()
    println(cat.isOld)
    cat.age = 10
    println(cat.isOld)

    val worker = Worker("Anna", "programmer", 2004)
    worker.printInfo()
}

// fun Cat.isOld() = age >= 12

fun Worker.printInfo() {
    println("Name: $name position: $position start year: $startYear experience: $experience")
}
