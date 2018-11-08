package pizza_delivery

import observable.Observable
import observable.Observer
import java.time.LocalDateTime

class CustomerServiceRepresentative(val name: String): Observer {
    val registers: ArrayList<DeliveryLog> = arrayListOf()

    fun register(pizza: Pizza) {
        if (!pizza.isCooked) {
            println("Registering that ${pizza} is cooking!")
            registers.add(DeliveryLog("cooking", pizza, LocalDateTime.now()))
        } else {
            println("Registering that ${pizza} is delivering!")
            registers.add(DeliveryLog("delivering", pizza, LocalDateTime.now()))
        }
    }

    override fun update(o: Observable?, arg: Any) {
        if (arg is Pizza) {
            register(arg)
        }
    }
}