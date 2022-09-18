package lec12

fun main() {
    val baby = Person.newBaby("GOLF")
    println(Person.log())

    println(Singleton.a)
    Singleton.a += 10

    val s1 = Singleton
    val s2 = Singleton

    println("s1 = ${s1}")
    println("s2 = ${s2}")

    moveSomething(object : Movable {
        override fun fly() {
            println("오리날다")
        }

        override fun move() {
            println("응애 움직이자")
        }
    })
}

class Person(
    var name: String,
    var age: Int
) {

    companion object Factory: Log {
        private const val MIN_AGE = 1

        @JvmStatic // Java에서 static 함수 쓰는 것 처럼 사용 가능
       fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("안녕하세요 사람입니다.")
        }
    }
}

object Singleton {
    var a: Int = 0
}

private fun moveSomething(movable: Movable) {

    movable.fly()
    movable.move()
}