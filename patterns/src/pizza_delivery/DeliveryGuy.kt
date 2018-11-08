package pizza_delivery

import observable.Observable
import observable.Observer

class DeliveryGuy(val name: String, private var isDelivering: Boolean = false): Observer {

    fun tryToDeliver(pizza: Pizza) {
        if (pizza.isCooked) {
            isDelivering = true
            println("Delivering ${pizza}!")
        } else {
            println("Getting ready to deliver ${pizza}!")
        }
    }

    override fun update(o: Observable?, arg: Any) {
        if (arg is Pizza) {
            tryToDeliver(arg)
        }
    }
}