package user_notificators

import users.Parent
import users.Student
import users.User

object UserNotificatorFactory {
    fun getNotificator(user: User): UserNotificator? {
        when (user) {
            is Student -> return StudentNotificator()
            is Parent -> return ParentNotificator()
            else -> return null
        }
    }
}