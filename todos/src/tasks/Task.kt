package tasks
/*
 * Universidad del Valle de Guatemala
 * Programacion Orientada a Objetos
 * CC2008 - Seccion 30
 * */
class Task (
        // task
        var title: String,
        private var isCompleted: Boolean = false
) {
    // cambia el estado de una task
    fun toggle() {
        isCompleted = !isCompleted
    }
// si se completo se retorna +
    private fun getCompletedSign(): String {
        if (isCompleted) {
            return "+"
        }

        return "-"
    }

    override fun toString(): String {
        return "$title (${getCompletedSign()})"
    }
}