package lec14


fun main() {
    val dto1 = PersonDto("골프", 27)
    val dto2 = PersonDto("골프", 27)

    println(dto1)
    println(dto1 == dto2)
}

/**
 * kotlin에서 제공하는 data class는 equals and hashcode 그리고 toString이 다 구현이 되어있다.
 * 기존 자바에서는 다 구현해주거나 lombok을 쓰는 등 처리가 필요했지만 kotlin은 번거로움을 줄이고자 data class를 만든다.
 */
data class PersonDto (
    val name: String,
    val age: Int
)