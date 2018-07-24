package structure

import students.Student

class Level (
        val name: String,
        private var students: ArrayList<Student> = ArrayList()
) {
    fun findStudent(searchCode: String): Student? {
        val filteredStudent = students.filter { it.code == searchCode }
        if (filteredStudent.count() > 0) {
            return filteredStudent[0]
        }

        return null
    }

    fun addStudent(student: Student): Boolean {
        if (findStudent(student.code) == null) {
            students.add(student)
            return true
        }

        return false
    }

    override fun toString(): String {
        val studentNames = students.map{ it.code }.joinToString()
        return """
            Level:
                Name: $name
                Students: $studentNames
        """.trimIndent()
    }
}