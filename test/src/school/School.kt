package school

import structure.Stage

class School (
        val name: String,
        private var stages: ArrayList<Stage> = ArrayList()
) {
    fun findStage(searchName: String): Stage? {
        val filteredStages = stages.filter { it.name == searchName }
        if (filteredStages.count() > 0) {
            return filteredStages[0]
        }

        return null
    }

    fun addStage(stage: Stage): Boolean {
        if (findStage(stage.name) == null) {
            stages.add(stage)
            return true
        }

        return false
    }

    fun getStage(pos: Int): Stage? {
        if (0 <= pos && pos < stages.count()) {
            return stages.get(pos)
        }

        return null
    }

    fun getStagesMenu(): String {
        var result = ""

        for (i in stages.indices) {
            result += "${i + 1}: ${stages[i].name}\n"
        }

        return result
    }

    override fun toString(): String {
        val stageNames = stages.joinToString()
        return """
            Stage:
                Name: $name
                Stages: $stageNames
        """.trimIndent()
    }
}