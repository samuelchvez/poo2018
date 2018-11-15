package user_notificators

import users.Student
import users.User

class StudentNotificator: UserNotificator {
    override fun notify(user: User) {
        if (user is Student) {
            println("Sending email to ${user.email}")

            // TODO: send email
        } else {
            println("lol es un papa!")
        }
    }
}