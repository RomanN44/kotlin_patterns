package builder.builders

import builder.pizza.Pizza
import builder.pizza.PizzaMenu

class PizzaMenuBuilder: Builder {
    private var cheese: String = ""
    private var meat: String = ""
    private var sauce: String = ""
    private var vegetables: MutableList<String> = mutableListOf()
    private var radius: Int = 0

    override fun setCheese(cheese: String) {
        this.cheese = cheese
    }

    override fun setMeat(meat: String) {
        this.meat = meat
    }

    override fun setSauce(sauce: String) {
        this.sauce = sauce
    }

    override fun setVegetables(vegetables: MutableList<String>) {
        this.vegetables = vegetables
    }

    override fun setRadius(radius: Int) {
        this.radius = radius
    }

    fun getResultMenu(): PizzaMenu {
        return PizzaMenu(cheese, meat, sauce, vegetables, radius)
    }
}