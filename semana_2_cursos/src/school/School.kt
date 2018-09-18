package school
/*
* Universidad del Valle de Guatemala
* Programacion Orientada a Objetos
* CC2008 - Seccion 30
* */

import structure.Stage

class School (
        //atributos
    val name: String,
    private var stages: ArrayList<Stage> = ArrayList()
) {
    // metodo para buscar un stage, lo devuelve si es que existe alguno
    fun findStage(searchName: String): Stage? {
        val filteredStages = stages.filter { it.name == searchName }
        if (filteredStages.count() > 0) {
            return filteredStages[0]
        }

        return null
    }
// agrega un stage si es que no existe
    fun addStage(stage: Stage): Boolean {
        if (findStage(stage.name) == null) {
            stages.add(stage)
            return true
        }

        return false
    }
// devuelve un String que describe el estado actual del objeto
    override fun toString(): String {
        val stageNames = stages.joinToString()
        return """
            Stage:
                Name: $name
                Stages: $stageNames
        """.trimIndent()
    }
}