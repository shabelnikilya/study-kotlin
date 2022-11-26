package org.example.lasmbdas.employee

fun getEmployeeList(): List<Employee> {
    return listOf(
        Employee("Ilya", 29),
        Employee("Roma", 55),
        Employee("Kostya", 13),
        Employee("Jenya", 22),
        Employee("Jenya", 33)
    )
}

fun getEmployeeMap(): Map<String, Employee> {
    return mapOf(
        "Ilya" to Employee("Ilya", 29),
        "Roma" to Employee("Roma", 55),
        "Kostya" to Employee("Kostya", 13),
        "Jenya" to Employee("Jenya", 22),
        "Lexa" to Employee("Jenya", 33)
    )
}

fun main() {
    val employee = getEmployeeList().filter {it.age > 20
    }
        .map { it.age }
        .first()

    println(employee)

    getEmployeeMap().filter { entry -> entry.key == "Roma" && entry.value.age > 20 }
        .map { (_, value) -> value }
        .map {
            println(it.name)
            it.name
        }

    println(getEmployeeList().maxBy { it.age }.name)
    println(getEmployeeList().minBy { it.age }.name)
    println(getEmployeeList().maxBy { it.name }.name)

    println(getEmployeeList().find { it.name == "Jenya" })
    println("****")
    println(
        getEmployeeList().groupBy { it -> it.name }
            .maxBy { entry -> entry.value.size }
    )

    val (youngest, oldest) = getEmployeeList().partition { it.age < 30 }
    println(youngest)
    println(oldest)

    println(getEmployeeList().associateBy { it.name })

    println(getEmployeeList().zipWithNext().first().first.name)
    println("!!!!!!!!!!!!!!")
    println(
        getEmployeeList()
        .groupBy{ it.name }
        .flatMap { entry -> entry.value })
}
