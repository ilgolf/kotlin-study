package lec10

/**
 * 현재 작성된 코드는 먼저 Base Class를 호출하고 나서 println이 실행되는데 이때 아직 초기화가 되지 않아 0이 호출된다. (잘못된 코드)
 * 상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야한다.
 */
fun main() {
    Derived(300)
}

class Derived(
        override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}

open class Base(
        open val number: Int = 100
) {
    init {
        println("Base Class")
        println(this.number)
    }
}
