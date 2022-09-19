package lec19

/**
 * break와 continue 사용 시 왠만하면 for 루프를 도는 것이 가장 좋다.
 */
fun main() {

    val numbers = listOf(1, 2, 3)

    numbers.map { number -> number + 1 }
        .forEach{ number -> println(number) }

    for (number in numbers) {
        if (number == 2) {
            break
        }
    }

    // forEach 구문을 실행하는 와중에 멈추고 싶다면 run이라는 블록으로 감싸고 return@run을 통해 해당 블록 실행을 종료시킨다.
    run {
        numbers.forEach { number ->
            if (number == 2) {
                return@run
            }
        }
    }

    // 복잡도가 늘어나고 유지보수가 힘들어지기 때문에 (for문이 어디서 종료될지 모름) 그렇기 때문에 사용 자제 하자
    loop@ for (i in 1 .. 100) {
        for (j in 1 .. 100) {
            if (j == 2) {
                break@loop // 바깥에 있는 loop라벨이 달린 for문이 종료된다.
            }
        }
    }


}