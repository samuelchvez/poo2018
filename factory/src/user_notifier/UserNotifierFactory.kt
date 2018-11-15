package user_notifier

import users.Parent
import users.Student
import users.User

object UserNotifierFactory {
    fun getNotifier(user: User): UserNotifier? {
        when (user) {
            is Student -> return StudentNotifier()
            is Parent -> return ParentNotifier()
            else -> return null
        }
    }
}