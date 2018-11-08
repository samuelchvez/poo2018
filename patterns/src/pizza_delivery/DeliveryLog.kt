package pizza_delivery

import java.time.LocalDateTime

data class DeliveryLog(
        val event: String,
        val pizza: Pizza,
        val time: LocalDateTime
)