package builder

import builder.builders.Builder
import builder.builders.PizzaBuilder
import builder.builders.PizzaMenuBuilder
import builder.pizzeria.Pizzeria

class DemonstrationBuilder {
    private val pizzeria = Pizzeria()
    private val pizzaBuilder = PizzaBuilder()
    private val pizzaMenuBuilder = PizzaMenuBuilder()

    fun createPizza(pizza: String) =
        when(pizza){
            "PepperoniFresh" -> {
                pizzeria.createPepperoniFresh(pizzaBuilder)
                pizzaBuilder.getResult()
            }
            "Carbonara" -> {
                pizzeria.createCarbonara(pizzaBuilder)
                pizzaBuilder.getResult()
            }
            "Dodo" -> {
                pizzeria.createDodo(pizzaBuilder)
                pizzaBuilder.getResult()
            }
            else -> null
        }

    fun createPizzaMenu(pizza: String) =
        when(pizza){
            "PepperoniFresh" -> {
                pizzeria.createPepperoniFresh(pizzaMenuBuilder)
                pizzaMenuBuilder.getResultMenu()
            }
            "Carbonara" -> {
                pizzeria.createCarbonara(pizzaMenuBuilder)
                pizzaMenuBuilder.getResultMenu()
            }
            "Dodo" -> {
                pizzeria.createDodo(pizzaMenuBuilder)
                pizzaMenuBuilder.getResultMenu()
            }
            else -> null
        }

}