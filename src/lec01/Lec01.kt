package lec01

/**
 * 간단한 Tip
 * 모든 변수는 우선 val로 만들고 꼭 필요한 경우 var로 변경한다.
 */

fun main() {

    var number1 = 10L

    number1 = 20L

    val number2 = 10L

    // number2 = 20L val : 불변 타입 (변경 불가)

    val longNumber : Long // Long 타입의 변수 선언 초기화 x

    // println(longNumber) 컴파일 에러

    longNumber = 10L

    println(longNumber) // 가능

    val number3 : Long = 1_000L
    val number4 : Long = 20L

    val sum = number3 + number4

    var number5 = 10

    // number5 = null 기본적으로 코틀린은 null 불가

    var number6: Long? = 10L
    number6 = null // ?를 붙이면 nullable한 변수를 선언할 수 있다.

    val person = Person("GOLF", 27)
}

/**
 * 코틀린은 상황에 따라 알아서 가변 되기 때문에 Primitive와 Wrapper 타입에 대한 차이를 구분하지 않는다.
 */