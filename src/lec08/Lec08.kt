package lec08

fun main() {
    // default parameter 사용 시 defaul 값 생략 가능
    repeat("Hello World")

    // default parameter가 있더라도 파라미터에 값을 넣어주면 넣은 값이 돌아간다.
    repeat("Hello World", 4, false)

    // Named Parameter가 있으면 빌더가 없더라도 파라미터 값을 잘못넣는 실수를 줄일 수 있다.
    printNameAndGender(name = "GOLF", gender = "MALE")

    // 가변 인자를 넣어줄 땐 자바랑 똑같이 넣어줄 수 있다.
    printAll("A", "B", "C")

    // 배열은 spread 연산자를 통해 내부 배열을 꺼내서 가변인자로 넣어주어야 한다. 자바랑 다른 점
    val array = arrayOf("A", "B", "C")

    printAll(*array)
}

// if 문 자체가 하나의 expression이기 때문에 값 그 자체가 되며 다음과 같이 표현 가능하다. 반환 타입도 생략 가능
fun max(a: Int, b: Int) = if (a > b) a else b

// default parameter
fun repeat(
        str: String,
        num: Int = 3,
        useNewLine: Boolean = true
) {

    for (i in 1.. num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }

    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

// 가변 인자 명령어 vararg
fun printAll(vararg strings : String) {
    for (str in strings) {
        println(str)
    }
}