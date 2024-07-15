package org.example.oop.p41

import java.util.*

class Dog {
    var name: String = ""
        get() = field.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    var age: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }
    var weight: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }
}
