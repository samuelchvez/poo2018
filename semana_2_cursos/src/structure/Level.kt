package structure
/*
* Universidad del Valle de Guatemala
* Programacion Orientada a Objetos
* CC2008 - Seccion 30
* */

import students.Student

class Level (
        //atributos
    val name: String,
    private var students: ArrayList<Student> = ArrayList()
) {
    // metodo para buscar al estudiante segun su codigo de estudiante
    fun findStudent(searchCode: String): Student? {
        val filteredStudent = students.filter { it.code == searchCode }
        if (filteredStudent.count() > 0) {
            return filteredStudent[0]
        }
        return null
    }
// metodo que agrega a un estudiante si no existe.
    fun addStudent(student: Student): Boolean {
        if (findStudent(student.code) == null) {
            students.add(student)
            return true
        }

        return false
    }
// metodo que devuelve un String del estado acutal del objeto
    override fun toString(): String {
        val studentNames = students.map{ it.code }.joinToString()
        return """
            Level:
                Name: $name
                Students: $studentNames
        """.trimIndent()
    }
}