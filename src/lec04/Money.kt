package lec04

data class Money(val amount: Long) : Comparable<Money> {

    operator fun plus(other: Money): Money {
        return Money(other.amount + this.amount)
    }

    override fun compareTo(other: Money): Int {
        return other.amount.compareTo(amount)
    }
}