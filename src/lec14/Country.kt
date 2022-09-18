package lec14


fun main() {
    handleCar(Avante())
}

/**
 * kotilin에서 enum을 더 잘 활용할 수 있도록 when은 다음과 같은 문법으로 else 처리 없이 간단하게 분기 처리를 할 수 있게
 * 도와준다.
 *
 * 또한 kotlin 특성 덕분에 enum 클래스의 가독성도 좋아진 것을 알 수 있다.
 */
fun handleCountry(country: Country) {

    when (country) {
        Country.KOREA -> println("한국 핸들링")
        Country.AMERICA -> println("미국 핸들링")
    }
}

enum class Country(
    private val code: String
) {

    KOREA("KO"),
    AMERICA("US")
    ;
}

fun handleCar(car: HyundaiCar) {

    when (car) {
        is Avante -> println("${car.name} 입니다.")
        is Sonata -> println("${car.name} 입니다.")
        is Grandeur -> println("${car.name} 입니다.")
    }
}

/**
 * sealed class는 컴파일 타임 때 하위 클래스들을 기억하기 때문에 런타임 때 추가가 불가능하다.
 * 하지만 enum과 다르게 상속이 가능하고 하위 클래스는 여러 인스턴스 선언이 가능하다.
 * 마찬가지로 when과 함께 사용하면 유용하게 사용할 수 있다.
 */
sealed class HyundaiCar(

    val name: String,
    val price: Long
)

class Avante: HyundaiCar("아반떼", 1_0000L)

class Sonata: HyundaiCar("소나타", 2_0000L)

class Grandeur: HyundaiCar("그랜져", 3_000L)