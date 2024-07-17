package org.example.oop.p43

class Cat(
    val name: String,
    var age: Int,
    val weight: Float = 0f,
) {
    val isOld: Boolean
        get() = age >= 12

    fun printInfo() {
        println("Name: $name age: $age weight: $weight")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Cat

        if (name != other.name) return false
        if (age != other.age) return false
        if (weight != other.weight) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        result = 31 * result + weight.hashCode()
        return result
    }

//    fun isOld() = age >= 12
}
