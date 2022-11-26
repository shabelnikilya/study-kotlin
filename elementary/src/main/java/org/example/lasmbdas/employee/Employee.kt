package org.example.lasmbdas.employee

data class Employee(val name: String, val age: Int) {

    fun ageLimit(ageLimit: Int) = age > ageLimit

    fun getAgeLimit() = ::ageLimit
}