package org.example.lasmbdas

import org.example.lasmbdas.employee.Employee

fun del(number: Int): Boolean = number % 2 == 0

fun main() {
    val sum: (Int, Int) -> Int = { x, y -> x + y}
    val del: (Int) -> Boolean = {i -> i % 2 == 0}

    println(sum(2, 10))
    println(del(3))
    println(del(4))

    run { println("HELLO!") }

    val run = RunnabelClass();
    run.run(10) { println("RUN!") }

    val runKotlin = Runnable {println("RUN KOTLIN!!!")}
    run.run(4, runKotlin)
    println("_______")

    var f: (() -> Int)? = null
    f = { 37 }
    println(f.invoke())
    println("______")

    val predicate = ::del
    println(predicate(4))

    println("******")
    /*
    Не связанные ссылка
     */
    val limit = Employee::ageLimit

    val employee = Employee("Roma", 34)
    /*
    Связанная ссылка
     */
    val secondLimit = employee::ageLimit
    println(limit(employee, 37))
    println(secondLimit(30))

    val pred = employee.getAgeLimit()
    println(pred(43))
}