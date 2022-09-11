package lec10

/**
 * 상속 받을 때 ':' 을 사용하여 받아온다. Animal 생성자에 값을 넣어줌으로써 super()를 대신한다.
 */
class Cat(
        species: String
) : Animal(species, 4) {

    override fun move() {
        println("고양이가 사뿐사뿐 걸어가 ~~")
    }
}