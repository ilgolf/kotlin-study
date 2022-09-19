package lec20

import lec16.Person

fun main() {

}

/**
 * 세이프콜과 let 함수를 이용하여 if 연산을 간단하게 표현하여 가독성을 높여준다. (표현도 직관적)
 */
fun printPerson(person: Person?) {

    person?.let {
        println(it.firstName + it.lastName)
        println(it.age)
    }

//    if (person != null) {
//        println(person.firstName + person.lastName)
//        println(person.age)
//    }
}