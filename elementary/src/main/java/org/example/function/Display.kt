@file:JvmName("DisplayUtils")
package org.example.function

@JvmOverloads
fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        println(character)
    }
}

fun main() {
    displaySeparator(character = '#')
}