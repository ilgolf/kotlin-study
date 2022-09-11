package lec11

/**
 * 자바에서는 Util성 코드를 만들기 위해 abstract class + private 생성자를 통해 인스턴스화를 막았지만
 * 코틀린에서는 다음과 같이 파일 최상단에 fun을 생성하여 비슷하게 구현할 수 있다.
 */
fun isDirectoryPath(path: String) : Boolean {
    return path.endsWith("/")
}