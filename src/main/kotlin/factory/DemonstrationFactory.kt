package factory

import factory.animalFactory.CatFactory
import factory.animalFactory.DogFactory
import factory.animalFactory.Factory

class DemonstrationFactory{
    private lateinit var factory: Factory

    fun configure(type: String) {
        if(type == "dog")
            factory = DogFactory()
        if(type == "cat")
            factory = CatFactory()
    }

    fun createObject() = factory.createAnimal()
}