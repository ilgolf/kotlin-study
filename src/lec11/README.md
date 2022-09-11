## 코틀린에서의 접근 제어자

기존 Java에서의 접근 제어자

| 접근 제어자    | Java                      | Kotlin                            |
|-----------|---------------------------|-----------------------------------|
| public    | 모든 곳에서 접근 가능              | 자바랑 동일                            |
| protected | 같은 패키지 또는 하위 클래스에서만 접근 가능 | 선언된 클래스 또는 하위 클래스에서 접근 가능         |
| default   | 같은 패키지에서 접근 가능            | 코틀린에서는 internal로 변경 같은 모듈에서 접근 가능 |
| private   | 선언된 클래스 내에서만 접근           | 자바랑 동일                            |

코틀린에서는 패키지로 접근 제어를 정의하지 않기 때문에 대신에 모듈로 변경되었다. 그러므로 protected에서도 기존에
자바와는 다르게 같은 패키지라는 개념이 없어 같은 패키지 접근이 불가능하다.

그리고 바뀐점이 하나 더 있다면 Java에서는 기본 접근 제어자가 default였다면 kotlin은 public이다.

또한 kotlin은 자바와 다르게 한 파일에 변수 메소드 클래스를 모두 정의할 수 있다. 때문에 파일에 대한
접근 제어자도 중요하다.

| 접근 제어자    | 설명                |
|-----------|-------------------|
| public    | 기본값 어디서나 접근 가능    |
| protected | 파일(최상단)에는 적가 불가   |
| internal  | 같은 모듈내에 접근 가능     |
| private   | 일언된 파일 내에서만능접근 가능 |

<br/>

```kotlin
private val number: Int = 3

fun printNumber() {
    println(number) // private이라도 같은 파일 내에 존재한다면 접근 가능
}

class Cat()
```

<br/>

생성자에 접근 제어자를 부여하려면 명시적으로 constructor를 선언해주어야 한다.

```kotlin
class Animal private constructor (
    val species: String,
    val leg: Int
        )
```

