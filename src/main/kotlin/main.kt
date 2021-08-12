import abstractFactory.DemonstrationAbstractFactory
import builder.DemonstrationBuilder
import factory.DemonstrationFactory

fun main(args: Array<String>) {

}

fun createFactoryPattern(argument: String) {
    val df = DemonstrationFactory()
    df.configure(argument)
    df.createObject().voice()
}

fun createAbstractFactoryPattern(argument: String) {
    val daf = DemonstrationAbstractFactory()
    val client = daf.configure(argument)
    client?.paint()
}

fun createBuilderPattern(argument: String) {
    val db = DemonstrationBuilder()
    println(db.createPizza(argument).toString())
    db.createPizzaMenu(argument)?.showMenu()
}