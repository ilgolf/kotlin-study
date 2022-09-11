package lec10

/**
 * 코틀린에서는 interface에서 함수를 구현할 때 default 메소드를 구현하지 않더라도 가능하다.
 */
interface Flyable {

    fun act() {
        println("파닥 파닥")
    }
}