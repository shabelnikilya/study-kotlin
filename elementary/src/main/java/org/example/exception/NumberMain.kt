package org.example.exception

import java.io.IOException
import java.lang.IllegalArgumentException

fun ageValidate(user: User) {
    if (user.age !in 0..120) {
        throw IllegalArgumentException("Не корректный возраст пользователя: ${user.age}")
    }
}

@Throws(IOException::class)
fun emailValidate(user: User) {
    val email = user.email
    if (email.isEmpty()) {
        throw IOException("Отсутствует емейл у пользователя: ${user.name}")
    }
}

fun main() {
    val validUser = User("Ilya", 30, "**@mail.ru")
    val notValidUser = User("Roma", 200, "")

    ageValidate(validUser)
    try {
        ageValidate(notValidUser)
    } catch (e: IllegalArgumentException) {
        println("Исключено перехвачео!")
    }

    try {
        emailValidate(notValidUser)
    } catch (e: IOException) {
        println("Исключено перехвачео!")
    }
}
