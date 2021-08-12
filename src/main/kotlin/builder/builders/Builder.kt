package builder.builders

interface Builder {
    fun setCheese(cheese: String)
    fun setMeat(meat: String)
    fun setSauce(sauce: String)
    fun setVegetables(vegetables: MutableList<String>)
    fun setRadius(radius: Int)
}