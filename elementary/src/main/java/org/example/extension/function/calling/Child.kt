package org.example.extension.function.calling

open class Child: Parent() {


}
fun Parent.foo() = "parent"

fun Child.foo() = "child"


fun main() {
    val child: Parent = Child()
    println(child.foo())
}