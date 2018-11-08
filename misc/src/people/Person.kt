package people

import behaviors.Walker

open class Person: Walker {
    var name: String

    var age: Int
        set(value) {
            field = value
            isAdult = age >= 18
        }

    var isAdult : Boolean
        private set

    override var steps = 0

    constructor(_name: String, _age: Int = 0) {
        name = _name
        age = _age
        isAdult = age >= 18
    }

    override fun walk() {
        steps += 1
        println("ay")
    }

    override fun toString(): String {
        return """
            name: ${name}
            age: ${age}
            isAdult: ${isAdult}
        """.trimIndent()
    }
}