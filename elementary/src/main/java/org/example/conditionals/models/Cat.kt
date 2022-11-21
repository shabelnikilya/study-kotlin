package org.example.conditionals.models

class Cat(name: String): Pet(name) {


    fun showCat() {
        println(this.name)
    }
}