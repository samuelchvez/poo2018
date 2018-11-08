package pizza_delivery

data class Pizza(
        val flavour: String,
        val size: String,
        var isCooked: Boolean,
        val to: String
)