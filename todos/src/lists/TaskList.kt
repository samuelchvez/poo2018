package lists

import tasks.Task

class TaskList (
        var title: String,
        private val tasks: ArrayList<Task> = ArrayList()
) {
    fun addTask(task: Task) {
        tasks.add(task)
    }

    fun getTask(index: Int): Task? {
        return tasks.getOrNull(index)
    }

    override fun toString(): String {
        var strTasks = ""
        tasks.forEachIndexed { index, task -> strTasks += "${index + 1}: $task\n"  }
        return """
            TASK LIST $title:
            $strTasks
        """.trimIndent()
    }
}