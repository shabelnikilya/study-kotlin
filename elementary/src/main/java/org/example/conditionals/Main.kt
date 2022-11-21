package org.example.conditionals

import org.example.conditionals.models.Cat
import org.example.conditionals.models.Dog
import org.example.conditionals.models.Pet

fun kindPet(pet: Pet) {
    when (pet) {
        is Cat -> pet.showCat()
        is Dog -> pet.showDog()
    }
}

fun main() {
    answer("YES")
    answer("no")
    answer("nothing")

    val firstPet: Pet = Cat("Кошка")
    val secondPet: Pet = Dog("Собака")

    kindPet(firstPet)
    kindPet(secondPet)
}