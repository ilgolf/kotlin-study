package lec01

class Person (
    name: String,
    age: Int
) {
    var name = name
        private set

    var age = age
        private set

    fun change(name: String, age: Int): Person {
        this.age = age
        this.name = name

        return this
    }
}

fun main() {
    val person =
            Person(name = "GOLF", age = 23)
            .change(name = "노경태", age = 27)

    println(person)
}