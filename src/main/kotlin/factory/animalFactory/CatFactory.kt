package factory.animalFactory

import factory.animals.Animal
import factory.animals.Cat

class CatFactory: Factory {
    override fun createAnimal(): Animal {
        return Cat()
    }
}