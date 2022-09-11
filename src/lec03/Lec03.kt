package lec03

import lec01.Person

fun main() {
    val number1 = 3

    // val number2: Long = number1 코틀린에서는 타입이 명시적으로 선언되므로 오토박싱 X

    val number2: Long = number1.toLong() // to~ 함수로 캐스팅해줘야함

    /**
     * nullable한 타입에선 적절한 처리가 필요하다.
     */

    printAgeIfPersonNotNull(Person("골프", 27))

    val person = Person("골프", 27)

//    System.out.println(String.format("이름 : %s", person.name)) 기존 자바에서는 다음과 같이 변수를 이용해 출력했다면

    println("이름 : ${person.name}, 나이 : ${person.age}")

    val name = "노경태"

    println("이름 : $name") // 변수만 호출할 때는 중괄호할생략이 가능


    val str = """
        ABC
        EFG
        $name
        ${person.age}
    """.trimIndent()

    println(str)

    val strArr = "ABCDEFG"

    println(strArr[0])
    println(strArr[2])
}

fun printAgeIfPersonNotNull(obj: Any) {
    if (obj is Person) {
        println(obj.age)
    }
}

fun printAgeIfPersonNullable(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}