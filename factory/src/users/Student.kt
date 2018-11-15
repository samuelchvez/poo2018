package users

class Student(
        firstName: String,
        lastName: String,
        val code: String,
        val email: String
): User(firstName, lastName) {
}