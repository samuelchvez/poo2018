package main

//import demo.utils.subtract
import main.utils.Car
import java.util.Calendar

fun main(args: Array<String>) {
    var model: Int = Calendar.getInstance().get(Calendar.YEAR)
    var okModel = false
    do {
        print("Enter a model: ")
        val strModel: String? = readLine()
        if (strModel != null) {
            try {
                model = strModel.toInt()
                okModel = true
            } catch (error: NumberFormatException) {
                println("ERROR: invalid model number, try again")
                okModel = false
            }
        }
    } while (!okModel)


    val myCar = Car(model = model, color = "green", numberOfDoors = 2)
    println(myCar)
    myCar.turnOn()
    println(myCar)
    myCar.turnOff()
    println(myCar)
}
