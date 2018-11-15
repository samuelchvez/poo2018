import user_notifier.UserNotifierFactory
import users.Parent
import users.Student

fun main(args: Array<String>) {
    val canuto = Parent("Canuto", "El Perro", "12345678")
    val canito = Student("Canito", "El Perrito", "07351", "cel07351@uvg.edu.gt")

    UserNotifierFactory.getNotifier(canuto)!!.notify(canuto)
    UserNotifierFactory.getNotifier(canito)!!.notify(canito)
}