package org.example.oop.p48

fun main() {
    val dog = Dog(3f)
    println(dog)

    val workers = mutableListOf<Worker>()
    workers.add(Worker("Anna", 37))
    workers.add(Worker("Sara", 61))
    workers.add(Worker("Helga", 23))
    workers.add(Programmer("Tamara", 45, "Scala"))
    workers.add(Programmer("Yulduz", 34, "TypeScript"))
    for (worker in workers) {
        worker.work()
    }
}
