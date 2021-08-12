package builder.pizza

class PizzaMenu(
    private val cheese: String,
    private val meat: String,
    private val sauce: String,
    private val vegetables: MutableList<String>,
    private val radius: Int
) {
    fun showMenu() {
        println("This pizza have:")
        println("Cheese: $cheese;")
        println("Meat: $meat;")
        println("Sauce: $sauce;")
        println("Vegetables: ")
        vegetables.forEach {
            print("$it; ")
        }
        println()
        println("Pizza's size is ${radius*2}")
    }
}