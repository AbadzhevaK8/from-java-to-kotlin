package org.example.oop.p410.hw

class SportPerson {
    fun invokeWaterHuman(waterHuman: WaterHuman) {
        waterHuman.bringWater()
    }

    inline fun invokeWaterHuman(bringWater: () -> Unit) {
        bringWater()
    }
}
