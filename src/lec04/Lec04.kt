package lec04

fun main() {
    val money1 = Money(2_000L)
    val money2 = Money(1_000L)

    if (money2.amount < money1.amount) {
        println("Money1이 Money2보다 큽니다.")
    }

    val money3 = Money(1_000L)
    val money4 = Money(1_000L)

    println(money3 == money4)
    println(money3 === money4)

    println(money1 + money2)
}