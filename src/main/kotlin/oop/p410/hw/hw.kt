package org.example.oop.p410.hw

fun main() {
    val sportPerson = SportPerson()
    sportPerson.invokeWaterHuman(
        object : WaterHuman {
            override fun bringWater() {
                println("Here is your water.")
            }
        },
    )
}
