package user_notificators

import users.User

interface UserNotificator {
    fun notify(user: User): Unit
}