package builder.pizza

class Pizza(
    private val cheese: String,
    private val meat: String,
    private val sauce: String,
    private val vegetables: MutableList<String>,
    private val radius: Int
)