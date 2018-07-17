package main.utils

//fun add(num1: Int, num2: Int = 10): Int = num1 + num2
//
//fun nextTwo(num: Int): Pair<Int, Int> = Pair(num + 1, num + 2)

fun sumar(a: Int, b: Int): Double {
    return a + b + 0.0
}

val restar = { a: Int, b: Int -> a - b }

val imprimir = { n: Int -> print(" $n") }

val cuadrado = { n: Int -> n * n }


class Car (
    private val model: Int,
    private val color: String,
    var isTurnedOn: Boolean = false,
    private val numberOfDoors: Int = 2
) {
    fun turnOn() {
        isTurnedOn = true
    }

    fun turnOff() {
        isTurnedOn = false
    }

    override fun toString(): String {
        return """
            Car:
                Model: $model
                Color: $color
                Doors: $numberOfDoors
                Is turned On: $isTurnedOn
        """.trimIndent()
    }
}
