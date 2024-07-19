package org.example.oop.p410

fun main() {
    val car: Transport = Car()
    val bicycle: Transport = Bicycle()
    if (car is Car) {
        car.name = "Car2"
    }
    if (car !is Car) return
    car.name = "Car3"
    println(car.name)

    // --------------------------

    travel(
        object : Transport("transport") {
            override fun drive() {
                println("The $name is moving...")
            }
        },
    )
}

fun travel(transport: Transport) {
    transport.drive()
}
