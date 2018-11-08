import pizza_delivery.Cook
import pizza_delivery.CustomerServiceRepresentative
import pizza_delivery.DeliveryGuy

fun main(args: Array<String>) {
    val myCook = Cook("Pappa Johns")
    val myDeliveryGuy = DeliveryGuy("Jhonny Bravo")
    val myCustomerServiceRepresentative = CustomerServiceRepresentative("Roxana Valdetti")

    myCook.addObserver(myDeliveryGuy)
    myCook.addObserver(myCustomerServiceRepresentative)


    myCook.startCooking("Cinco Carnes", "Big", "UVG")

    println("LOG:")
    for (log in myCustomerServiceRepresentative.registers) {
        println(log)
    }
}