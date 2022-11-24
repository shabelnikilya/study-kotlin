package org.example.npe

import java.lang.RuntimeException


fun String?.isEmptyOrNull(): Boolean = this.isNullOrEmpty()

fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    s1.isEmptyOrNull() eq true
    s2.isEmptyOrNull() eq true

    val s3 = "   "
    s3.isEmptyOrNull() eq false

    val line = "Hello"
    var secondLinde: String? = null
    println((line as? String)?.uppercase())
    println((secondLinde as? String)?.uppercase())
}

private infix fun Boolean.eq(b: Boolean) {
    if (this != b) {
        throw RuntimeException("Не равны результаты!")
    }
}
