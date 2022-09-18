package lec13

fun main() {

}

/**
 * 자바에서의 내부 클래스를 코틀린에선 다음과 같이 표현한다.
 * static Class와 동일하게 동작하여 자바에서의 외부 참조가 가능한 내부 클래스의 치명적인 단점을 없앴다.
 */
class JavaHouse (
    private val address: String,
    private val livingRoom: LivingRoom
) {
    class LivingRoom (
        private val area: Double
    )

    /**
     * inner class는 자바에서 권장되지 않은 내부 클래스 형태로 this@{object} 형태로 외부 참조가 가능해진다.
     */
    inner class BathRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@JavaHouse.address
    }
}