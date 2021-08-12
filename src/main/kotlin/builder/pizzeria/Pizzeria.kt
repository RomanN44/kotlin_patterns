package builder.pizzeria

import builder.builders.Builder

class Pizzeria {
    fun createPepperoniFresh(builder: Builder) {
        val vegetables: MutableList<String> = mutableListOf()
        vegetables.add("tomatoes")
        build(builder,
            "mozzarella",
            "pepperoni",
            "tomato",
            vegetables,
            15)
    }

    fun createCarbonara(builder: Builder) {
        val vegetables: MutableList<String> = mutableListOf()
        vegetables.add("tomatoes")
        vegetables.add("red onion")
        vegetables.add("garlic")
        vegetables.add("Italian herbs")
        build(builder,
            "cheddar",
            "bacon",
            "alfredo",
            vegetables,
            20)
    }

    fun createDodo(builder: Builder) {
        val vegetables: MutableList<String> = mutableListOf()
        vegetables.add("tomatoes")
        vegetables.add("mushrooms")
        vegetables.add("sweet pepper")
        vegetables.add("red onion")
        vegetables.add("garlic")
        build(builder,
            "mozzarella",
            "beef meatballs",
            "tomato ",
            vegetables,
            25)
    }

    private fun build(builder: Builder,
                      cheese: String,
                      meat: String,
                      sauce: String,
                      vegetables: MutableList<String>,
                      radius:Int) {
        builder.setCheese(cheese)
        builder.setMeat(meat)
        builder.setSauce(sauce)
        builder.setVegetables(vegetables)
        builder.setRadius(radius)
    }
}