package lec10

class Penguin(
        species: String,
        private val wingCount: Int = 2
) : Animal(species, 2), Swimable, Flyable {

    override fun move() {
        println("펭귄이 움직입니다 ~ 꿱꿱")
    }

    override val legCount: Int get() = super.legCount + this.wingCount

    // 중복되는 인터페이스를 특정할 때 super<타입 함수>.함수로 사용 가능
    override fun act() {
        super<Flyable>.act()
        super<Swimable>.act()
    }
}