package factory.animalFactory

import factory.animals.Animal
import factory.animals.Dog

class DogFactory: Factory {
    override fun createAnimal(): Animal {
        return Dog()
    }
}