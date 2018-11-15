package user_notificators

import users.Parent
import users.User

class ParentNotificator: UserNotificator {
    override fun notify(user: User) {
        if (user is Parent) {
            println("Sending SMS to ${user.phone}")

            // TODO: send SMS
        }
    }
}