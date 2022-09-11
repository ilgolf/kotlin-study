package lec02

fun main() {

    val str: String? = "ABC"
//    println(str.length) 컴파일 에러 : null safe x

    println(str?.length ?:0) // Elvis 연산자 null이 아니면 length null이면 0 반환
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
            ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean ? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?:false
}

fun startsWithA4(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA5(str: String?): Boolean {
    return str!!.startsWith("A")
}
