package lists
/*
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * CC2008 - Seccion 30
 * */
import tasks.Task

class TaskList (
        // atributos
        var title: String,
        private val tasks: ArrayList<Task> = ArrayList()
) {
    // agrega una tarea
    fun addTask(task: Task) {
        tasks.add(task)
    }
// obtiene una tarea
    fun getTask(index: Int): Task? {
        return tasks.getOrNull(index)
    }
// toString
    override fun toString(): String {
        var strTasks = ""
        tasks.forEachIndexed { index, task -> strTasks += "${index + 1}: $task\n"  }
        return """
            TASK LIST $title:
            $strTasks
        """.trimIndent()
    }
}