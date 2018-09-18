import animals.Dog
import behaviors.Walker
import people.professionals.Programmer

fun main (args: Array<String>) {
    val samuel = Programmer("Samuel", 29, "Python")
    val doge = Dog("Doge", "Shiva")

    println(samuel)
    samuel.age = 10
    println(samuel)
    samuel.age = 100
    println(samuel)

    goForAWalk(samuel, 10)
    goForAWalk(doge, 100)
}

fun goForAWalk(walker: Walker, steps: Int) {
    for (i in 0 until steps) {
        walker.walk()
    }
}
