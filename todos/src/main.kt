import lists.TaskList
import tasks.Task

fun getMenu(hasLists: Boolean, hasSelectedList: Boolean): String {
    if (!hasLists) {
        return """
            Menu:
            1. Crear lista
            2. Salir
        """.trimIndent()
    }

    if (hasSelectedList) {
        return """
            Menu:
            1. Deseleccionar lista
            2. Agregar tarea
            3. Cambiar de estado una tarea
            4. Salir
        """.trimIndent()
    }

    return """
        Menu:
        1. Crear lista
        2. Ver listas
        3. Seleccionar lista
        4. Salir
    """.trimIndent()
}

fun main(args: Array<String>) {
    var taskLists = ArrayList<TaskList>()
    var currentList: TaskList? = null
    var wantsToContinue = true

    do {
        val hasLists = !taskLists.isEmpty()

        println(getMenu(hasLists, currentList != null))

        print("Ingrese una opcion: ")
        val strOption = readLine()!!
        val option = strOption.toInt()
        if (!hasLists) {
            when (option) {
                1 -> {
                    print("Ingrese un titulo: ")
                    val title = readLine()!!
                    val newList = TaskList(title)
                    taskLists.add(newList)
                    println("Lista creada exitosamente")
                }
                2 -> {
                    wantsToContinue = false
                }
            }
        } else if (currentList != null) {
            when (option) {
                1 -> {
                    currentList = null
                    println("Lista deseleccionada exitosamente")
                }
                2 -> {
                    print("Ingrese un titulo: ")
                    val title = readLine()!!
                    val newTask = Task(title)
                    currentList.addTask(newTask)
                    println("Task creado exitosamente exitosamente")
                }
                3 -> {
                    println(currentList)
                    print("Ingrese una tarea a cambiar de estado: ")
                    val strIndex = readLine()!!
                    val index = strIndex.toInt()

                    val currentTask = currentList.getTask(index - 1)
                    if (currentTask != null) {
                        currentTask.toggle()
                    } else {
                        println("Esa tarea no existe!")
                    }
                }
                4 -> {
                    wantsToContinue = false
                }
            }
        } else {
            when (option) {
                1 -> {
                    print("Ingrese un titulo: ")
                    val title = readLine()!!
                    val newList = TaskList(title)
                    taskLists.add(newList)
                    println("Lista creada exitosamente")
                }
                2 -> {
                    taskLists.forEach { println(it) }
                }
                3 -> {
                    taskLists.forEachIndexed { index, taskList -> println("${index + 1}: $taskList") }
                    print("Ingrese una lista a seleccionar: ")
                    val strIndex = readLine()!!
                    val index = strIndex.toInt()

                    val tryingList = taskLists.getOrNull(index - 1)
                    if (tryingList != null) {
                        currentList = tryingList
                        println("Lista ${currentList.title} seleccionada exitosamente")
                    } else {
                        println("Esa lista no existe!")
                    }
                }
                4 -> {
                    wantsToContinue = false
                }
            }
        }
    } while (wantsToContinue)

}