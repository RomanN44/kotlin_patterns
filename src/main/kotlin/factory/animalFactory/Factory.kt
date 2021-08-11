package factory.animalFactory

import factory.animals.Animal

interface Factory {
    fun createAnimal(): Animal
}