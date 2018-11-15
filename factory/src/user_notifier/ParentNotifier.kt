package user_notifier

import users.Parent
import users.User

class ParentNotifier: UserNotifier {
    override fun notify(user: User) {
        if (user is Parent) {
            println("Sending SMS to ${user.phone}")

            // TODO: send SMS
        }
    }
}