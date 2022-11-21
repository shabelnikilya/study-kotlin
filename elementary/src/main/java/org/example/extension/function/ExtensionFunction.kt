package org.example.extension.function

import java.lang.StringBuilder

fun String.lastChar() = get(length - 1)

fun String.repeat(repeat: Int): String {
    val result = StringBuilder()
    for (i in 1.. repeat) {
        result.append(this).append("/")
    }
    return result.toString()
}