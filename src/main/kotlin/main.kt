import abstractFactory.DemonstrationAbstractFactory
import factory.DemonstrationFactory

fun main(args: Array<String>) {
    createAbstractFactoryPattern(args[0])
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