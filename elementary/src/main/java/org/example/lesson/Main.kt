package org.example.lesson

fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty()) return false
    val correct = s.first() in 'a'..'z' || s.first() == '_'
    if (!correct) return false;
    val line = s.substring(1)
    var correctLine: Boolean = true
    for (c in line) {
        correctLine = when {
            c in 'a'..'z' || c in '0'..'9' -> true
            else -> false
        }
        if (!correctLine) {
            break
        }
    }
    return correctLine
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}