package main

import main.utils.*

//import demo.utils.subtract
//import main.utils.Car
//import java.util.Calendar


fun enciendelosTodos (carros: ArrayList<Car>) {
    carros.forEach { it.turnOn() }
}


fun main(args: Array<String>) {
    /*val y = arrayOf(1, 2, 3)
    // y[1] = 8
    // println("No falla $y")

    print("Y: ")
    y.forEach(imprimir)
    println("")

    val z = y.map(cuadrado)
    print("Z: ")
    z.forEach(imprimir)
*/
    /*

    println("DO / WHILE")
    var i = 0
    do {
        println("I VALE: $i")
        i += 1
    } while (i < 10)

    println("WHILE")
    i = 0
    while (i < 10) {
        println("I VALE: $i")
        i += 1
    }

    println("Ya salimos del ciclo! $i")

    */

    /*
    var model: Int
    var okModel: Boolean = false
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
    } while (!okModel)*/


    /*
    print("Ingrese su nombre por favor: ")
    val nombre = readLine()!!
    println("EL NOMBRE INGRESADO ES: $nombre")
    */

    /*

    val resultado1: Double = sumar(5, 6)
    println("5 + 6 = ${resultado1}")

    val resultado2: Int = restar(5, 6)
    println("5 - 6 = ${resultado2}")
    */


    // println("JACKO:")

    // Crear el jacko
    val elJacko = Car(
            model = 2009,
            color = "plateado",
            numberOfDoors = 4
    )

    // Crear el jacko
    val elMamaMovil = Car(
            model = 2015,
            color = "blanco",
            numberOfDoors = 4
    )

    val misCarros: ArrayList<Car> = arrayListOf(
            elJacko,
            elMamaMovil
    )
    enciendelosTodos(misCarros)
    misCarros.forEach { println(it) }

    /*

    // Imprimir el jacko (o invocar a toString)
    println(elJacko)

    // Encender
    println("Estoy por encenderlo...")
    elJacko.turnOn()

    // Imprimir el jacko (o invocar a toString)
    println(elJacko)

    println("MAMAMOVIL:")

    // Crear el jacko
    val elMamaMovil = Car(
            model = 2015,
            color = "blanco",
            numberOfDoors = 4
    )

    */
/*
    // Imprimir el jacko (o invocar a toString)
    println(elMamaMovil)

    // Encender
    println("Estoy por encenderlo...")
    elJacko.turnOn()

    // Imprimir el jacko (o invocar a toString)
    println(elMamaMovil)

*/






}
