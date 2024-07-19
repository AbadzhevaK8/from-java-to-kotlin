package org.example.oop.p49

fun main() {
    val workers = mutableListOf<Worker>()
    workers.add(Seller("Anna", 37))
    workers.add(Seller("Sara", 61))
    workers.add(Seller("Helga", 23))
    workers.add(Programmer("Tamara", 45, "Scala"))
    workers.add(Programmer("Yulduz", 34, "TypeScript"))
    workers.add(Director("Lola", 43))

    for (worker in workers) {
        worker.work()
        if (worker is Programmer) {
            println(worker.language)
        }
        if (worker is Cleaner) {
            worker.clean()
        }
    }
    println("HW! ------------------ ")
    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }
    for (cleaner in cleaners) {
        cleaner.clean()
    }
}
