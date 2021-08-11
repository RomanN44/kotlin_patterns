package abstractFactory

import abstractFactory.factory.PlasticFactory
import abstractFactory.factory.WoodenFactory

class DemonstrationAbstractFactory {
    private var factoryClient: FactoryClient? = null
    fun configure(type: String): FactoryClient? {
        if(type == "wooden")
            factoryClient = FactoryClient(WoodenFactory())
        if(type == "plastic")
            factoryClient = FactoryClient((PlasticFactory()))
        return factoryClient
    }
}