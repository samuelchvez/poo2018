package main
/*
* Universidad del Valle de Guatemala
* Programacion Orientada a Objetos
* CC2008 - Seccion 30
* */

//se importan las otras clases que se utilizaran
import school.School
import structure.Stage
import structure.Level
import students.Student

//funcion menu
fun menu(): String {
    return """
        MENU:
        1. Agregar nivel
        2. Agregar grado
        3. Agregar estudiante
        4. Ver grados en un nivel
        5. Ver asignaciones en un grado
        6. Salir
    """.trimIndent()
}

//Main, aca se inicia el la ejecucion del programa
fun main(args: Array<String>) {
    //bandera que nos indica si se desea continuar
    var wantsToContinue = true
    //se crea el objeto tipo School
    val school = School("Mi Colegio")
// muestra el menu
    do {
        println(menu())
        print("Ingrese una opcion del menu (1 - 6): ")
        val option = readLine()!!.toInt()
        // evalua la accion de la a realizar segun la opcion ingresada
        when (option) {
            1 -> {
                print("Ingrese el nombre del nuevo nivel: ")
                val name = readLine()!!

                if (school.findStage(name) != null) {
                    println("Este nivel ya se habia agregado previamente")
                } else {
                    val stage = Stage(name)
                    school.addStage(stage)
                    println("Nivel agregado exitosamente")
                }
            }
            2 -> {
                print("Ingrese el nombre del nivel en el que se agregara el grado: ")
                val stageName = readLine()!!

                val stage = school.findStage(stageName)
                if (stage != null) {
                    print("Ingrese el nombre del grado: ")
                    val levelName = readLine()!!
                    val level = Level(levelName)
                    if (stage.addLevel(level)) {
                        println("Grado agregado exitosamente")
                    } else {
                        println("El grado ya habia sido previamente agregado")
                    }

                } else {
                    println("El nivel $stageName no existe")
                }
            }
            3 -> {
                print("Ingrese el nombre del nivel del alumno: ")
                val stageName = readLine()!!

                val stage = school.findStage(stageName)
                if (stage != null) {
                    print("Ingrese el nombre del grado del alumno: ")
                    val levelName = readLine()!!
                    val level = stage.findLevel(levelName)

                    if (level != null) {
                        print("Ingrese el nombre del alumno: ")
                        val studentName = readLine()!!

                        print("Ingrese el codigo de carnet del alumno: ")
                        val studentCode = readLine()!!
                        val student = Student(studentName, studentCode)
                        level.addStudent(student)

                        println("Estudiante agregado exitosamente")
                    } else {
                        println("El grado $levelName no existe")
                    }
                } else {
                    println("El nivel $stageName no existe")
                }
            }
            4 -> {
                print("Ingrese el nombre del nivel: ")
                val stageName = readLine()!!

                val stage = school.findStage(stageName)
                if (stage != null) {
                    println(stage)
                } else {
                    println("El nivel $stageName no existe")
                }
            }
            5 -> {
                print("Ingrese el nombre del nivel: ")
                val stageName = readLine()!!
                //verifica que exista
                val stage = school.findStage(stageName)
                if (stage != null) {
                    print("Ingrese el nombre del grado: ")
                    val levelName = readLine()!!
                    val level = stage.findLevel(levelName)

                    if (level != null) {
                        println(level)
                    } else {
                        println("El grado $levelName no existe")
                    }
                } else {
                    println("El nivel $stageName no existe")
                }
            }
            // termina el programa
            6 -> {
                wantsToContinue = false
            }
        }
// mientras la bandera sea verdadera se repetira lo anterior
    } while (wantsToContinue)
}