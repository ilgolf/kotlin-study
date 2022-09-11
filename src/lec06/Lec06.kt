package lec06

fun main() {
    val list = listOf(1L, 2L, 3L)

    // for-each 문
    for (number in list) {
        println(number)
    }

    // 일반 for문
    for (i in 1 .. 3) {
        println(i)
    }

    // for 문 하향식
    for (i in 3 downTo 1) {
        println(i)
    }

    // for 문 2씩 증가하는 경우
    for (i in 1 .. 5 step 2) {
        println(i)
    }
}