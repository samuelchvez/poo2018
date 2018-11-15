package user_notifier

import users.User

interface UserNotifier {
    fun notify(user: User): Unit
}
