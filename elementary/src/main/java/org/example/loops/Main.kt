package org.example.loops

fun getStringList(): List<String> = listOf<String>("First name", "Second name", "Middle name")

fun getMap(): Map<Int, String> = mapOf(1 to "First name", 2 to "Second name", 3 to "Middle name")

fun main() {
    for (s in getStringList()) {
        println(s)
    }

    for ((index, value) in getStringList().withIndex()) {
        println("index = $index, value = $value")
    }

    for (i in 1..5) {
        print(i)
    }
    println()
    for (i in 1 until 5) {
        print(i)
    }
    println("-------------")

    for (i in 10 downTo 3 step 3) {
        print(i)
    }
    println("-------------")
    for ((key, value) in getMap()) {
        println("key = $key, value = $value")
    }
}