package lec15

/**
 * Tip. 컬렉션 선언 시 우선은 불변 컬렉션으로 선언 후 필요한 경우 가변 컬렉션으로 바꿔주는 것이 좋다.
 */
fun main() {

    val arr = arrayOf(100, 200)

    for (i in arr.indices) {
        println("$i, ${arr[i]}")
    }

    for ((index, value) in arr.withIndex()) {
        println("$index, $value")
    }

    arr.plus(300) // 배열 값 추가는 메소드를 이용해 간편하게 가능하다.

    val list = listOf(100, 200)
    val emtyList = emptyList<Int>() // emptyList는 비어있기 때문에 반드시 Generic을 선언해 타입을 명시해주어야한다.

    println(list[0]) // kotlin에서는 list도 배열 가져오듯이 가져올 수 있다.

    for (number in list) {
        println(number)
    }

    for ((index, value) in list.withIndex()) {
        println("$index, $value")
    }

    // list.add(300) 불변이기 때문에 사용 불가

    val mutList = mutableListOf(100, 200)

    mutList.add(300) // 가변 리스트를 따로 정의해야 가능하다.

    val oldMap = mutableMapOf<Int, String>()

    // put연산 대신 배열에 값 넣듯이 저장 가능
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    // 자바와는 달리 to를 통해 key와 value를 구분한다.
    val map = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in map.keys) {
        println("$key, ${map[key]}")
    }

    for ((index, value) in map.entries) {
        println("$index, $value")
    }
}