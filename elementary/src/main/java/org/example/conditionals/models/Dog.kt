package org.example.conditionals.models

class Dog(name: String): Pet(name) {

    fun showDog() {
        println(this.name)
    }
}