package lec17

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나",3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000)
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    isApple(fruits[0])
    isApple.invoke(fruits[0])

    filterFruits(fruits, isApple) // 메소드를 마치 값처럼 넣어줄 수 있다. (코틀린에서 메서드는 1급 시민)

    filterFruits(fruits) { it.name == "사과" } // it이라는 키워드를 이용해 대폭 생산성을 높일 수 있다.
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {

    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}