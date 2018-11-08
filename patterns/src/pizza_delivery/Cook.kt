package pizza_delivery

import java.util.*


class Cook(val name: String): Observable() {
    private var currentPizza: Pizza? = null
    fun startCooking(flavour: String, size: String, to: String) {
        currentPizza = Pizza(flavour, size, false, to)
        println("Starting to cook ${currentPizza}!")

        setChanged()
        notifyObservers(currentPizza!!)

        Thread.sleep(10000)

        currentPizza!!.isCooked = true

        println("Completed cooking ${currentPizza}!")

        setChanged()
        notifyObservers(currentPizza!!)

        currentPizza = null
    }
}