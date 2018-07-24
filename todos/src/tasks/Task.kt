package tasks

class Task (
        var title: String,
        private var isCompleted: Boolean = false
) {
    fun toggle() {
        isCompleted = !isCompleted
    }

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