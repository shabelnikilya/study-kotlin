package org.example.car

private fun getCarBySpeed(speed: Int): Car {
    val (description, color) = when {
        speed < 100 -> "Легковая машина" to Color.BLACK
        speed >= 100 -> "Гоночная машина" to Color.RED
        else -> "Универсальная машина" to Color.YELLOW
    }
    return Car(description, color)
}

fun main() {
    val speed = 110
    println("Машина едет со скоростью $speed и машина является: ${getCarBySpeed(speed)}")

    val secondSpeed = 90
    println("Машина едет со скоростью $secondSpeed и машина является: ${getCarBySpeed(secondSpeed)}")
}