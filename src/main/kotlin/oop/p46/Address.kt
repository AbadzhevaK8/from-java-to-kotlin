package org.example.oop.p46

class Address(
    val city: String,
    val street: String,
    val building: Int,
) {
    operator fun component1() = city

    operator fun component2() = street

    operator fun component3() = building

    fun copy(
        city: String = this.city,
        street: String = this.street,
        building: Int = this.building,
    ): Address = Address(city, street, building)

    override fun toString(): String = "Address(city='$city', street='$street', building=$building)"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (city != other.city) return false
        if (street != other.street) return false
        if (building != other.building) return false

        return true
    }

    override fun hashCode(): Int {
        var result = city.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + building
        return result
    }
}
