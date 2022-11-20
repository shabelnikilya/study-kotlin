package org.example.car

private fun getCarBySpeed(speed: Int): Car {
    val (description, color) =
        if (speed < 100) {
            Pair("Легковая машина", Color.BLACK)
        } else if (speed > 100) {
            Pair("Гоночная машина", Color.RED)
        } else {
            Pair("Универсальная машина", Color.YELLOW)
        }
    return Car(description, color)
}

fun main() {
    val speed = 110
    println("Машина едет со скоростью $speed и машина является: ${getCarBySpeed(speed)}")

    val secondSpeed = 90
    println("Машина едет со скоростью $secondSpeed и машина является: ${getCarBySpeed(secondSpeed)}")
}