package structure
/*
* Universidad del Valle de Guatemala
* Programacion Orientada a Objetos
* CC2008 - Seccion 30
* */

class Stage (
        // atributos
    val name: String,
    private var levels: ArrayList<Level> = ArrayList()
) {
    // metodo para  buscar el nivel
    fun findLevel(searchName: String): Level? {
        val filteredLevels = levels.filter { it.name == searchName }
        if (filteredLevels.count() > 0) {
            return filteredLevels[0]
        }

        return null
    }
// metodo que agrega el nivel
    fun addLevel(level: Level): Boolean {
    // si no existe el nivel, se agrea
        if (findLevel(level.name) == null) {
            levels.add(level)
            return true
        }
    // si existe devuelve falso
        return false
    }
// metodo que devuelve en forma de String el contenido del objeto
    override fun toString(): String {
        val levelNames = levels.map { it.name }.joinToString()
        return """
            Stage:
                Name: $name
                Levels: $levelNames
        """.trimIndent()
    }
}