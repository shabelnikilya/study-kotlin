package org.example.lasmbdas

fun main() {
    val heroes = listOf(
        Hero("The Captain", 60, Gender.MALE),
        Hero("Frenchy", 42, Gender.MALE),
        Hero("The kid", 9, null),
        Hero("Lady lauren", 29, Gender.FEMALE),
        Hero("First Mate", 29, Gender.MALE),
        Hero("Sir Stephen", 37, Gender.MALE)
    )

    println(heroes.lastOrNull()?.name)
    println(heroes.lastOrNull() { it.age == 37})
}