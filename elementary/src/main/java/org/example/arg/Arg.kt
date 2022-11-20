package org.example.arg

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Аргументы для запуска программы отсутствуют"
    println("Переменная для запука программы: $name")
}