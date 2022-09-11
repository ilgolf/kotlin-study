package lec09

/**
 * 기본적으로 코틀린에서는 프로퍼티에 getter, setter가 포함되어있기 때문에 간단하게 다음과 같이 클래스 + 프로퍼티 표현이 기능
 * init 블럭 안에 생성되기 전 action을 정의해서 값에 대한 검증도 할 수 있다.
 * 생성자를 하나 더 만들어 주고 싶다면 constructor를 선언해주고 this()생성자에 값을 새로 넣어주며 선언이 가능하다.
 * 하지만 코틀린에서는 부생성자보다 default Parameter를 선호한다.
 * 해당 메소드 (action)이 속성을 나타내는 것이면 customGetter 행동 자체를 정의하는 거면 method 정의하는 것이 좋다.
 */
class Person(
        name: String,
        var age: Int
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    // 두 번째 생성자
    constructor(name: String): this(name = name, age = 1)

    val isAdult: Boolean get() = this.age >= 20 // customGetter를 만들어줘서 마치 프로퍼티가 존재하는 것 처럼 보여준다.

    val upperCaseName: String get() = this.name.lowercase() // customGetter를 통해 get으로 필드 호출 시 특별한 action 부여 가능

    // setter 자체를 지양하기 때문에 좋은 코드는 아니다.
    var name: String = name
    set(value) {
        field = value.lowercase()
    }
}

fun main() {
    val person1 = Person("GOLF", 100)

    /**
     * 코틀린에선 setXXX, getXXX라는 메소드가 아닌 함수안에 필드를 직접적으로 호출하는 것으로 getter, setter 호출
     */
    println(person1.name)
    person1.age = 10
    println(person1.age)
//    person.name = "이니니잉" // 불편 필드였던 name은 setter가 없으므로 수정 X

    // val person2 = Person(name = "GOLF", age = -22)

    val person2 = Person("GOLF") // 두 번째 생성자 사용
    println(person2.age)
    println(person2.upperCaseName)
}