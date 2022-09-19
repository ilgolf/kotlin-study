package lec18

import lec17.Fruit

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

    filterFruits(fruits) { it.name == "사과" }

    val groupBy = fruits.groupBy { fruit -> fruit.name }

    println(groupBy)
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {

    /**
     * 비슷한 문법으로 none (조건 아예 불만족 시 true), any(조건을 하나라도 만족 시 true)
     */
    return fruits.filter(filter)
}