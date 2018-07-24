package structure

class Stage (
        val name: String,
        private var levels: ArrayList<Level> = ArrayList()
) {
    fun findLevel(searchName: String): Level? {
        val filteredLevels = levels.filter { it.name == searchName }
        if (filteredLevels.count() > 0) {
            return filteredLevels[0]
        }

        return null
    }

    fun addLevel(level: Level): Boolean {
        if (findLevel(level.name) == null) {
            levels.add(level)
            return true
        }

        return false
    }

    override fun toString(): String {
        val levelNames = levels.map { it.name }.joinToString()
        return """
            Stage:
                Name: $name
                Levels: $levelNames
        """.trimIndent()
    }
}