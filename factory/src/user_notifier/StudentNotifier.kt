package user_notifier

import users.Student
import users.User

class StudentNotifier: UserNotifier {
    override fun notify(user: User) {
        if (user is Student) {
            println("Sending email to ${user.email}")

            // TODO: send email
        }
    }
}