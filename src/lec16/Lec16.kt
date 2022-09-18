package lec16

fun main() {

    val str = "ABC"
    val ch = str.lastChar() // 확장함수를 통해 원래 String에 내제된 함수처럼 사용 가능하다.

    println(ch)
}

/**
 * 확장 함수 : fun 확장하려는 클래스.함수이름(): 리턴타입 으로 선언 가능하며
 * this 키워드를 이용해 실제 클래스 안에 접근할 수 있다.
 * 확장함수에서는 private이나 protected 레벨의 속성 or 메서드에는 접근할 수 없다.
 *
 * 확장함수와 멤버함수가 시그니처가 동일하면 멤버함수가 먼저 호출된다.
 */
fun String.lastChar(): Char  {
    return this[this.length - 1]
}

fun createPerson(firstName: String, lastName: String): Person {

    // 중복 코드를 줄일 때 지역함수를 사용할 수 있다. 하지만 private으로 외부에 선언해주는게 더 깔끔...
    fun validateNAme(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다. 현재 값 $name")
        }
    }

    validateNAme(firstName, "firstName")
    validateNAme(lastName, "lastName")

    return Person(firstName, lastName, 1)
}

class Person(
    val firstName: String,
    val lastName: String,
    val age: Int
)

