package org.example.conditionals

fun answer(value: String) {
    val answer = when (value) {
        "YES", "yes" -> "OK"
        "NO", "no" -> "Not ok!"
        else -> "I don't understand"
    }
    println(answer)
}