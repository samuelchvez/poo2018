import user_notificators.UserNotificatorFactory
import users.Parent
import users.Student

fun main(args: Array<String>) {
    val canuto = Parent("Canuto", "El perro", "12345678")
    val canito = Student("Canito", "El perrito", "cel07351@uvg.edu.gt")

    UserNotificatorFactory.getNotificator(canuto)!!.notify(canuto)
    UserNotificatorFactory.getNotificator(canito)!!.notify(canuto)
}