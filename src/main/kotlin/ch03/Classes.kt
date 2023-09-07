package ch03

// 코틀린의 클래스
// 기본적으로 public
// Person("", 0)
class Person(
    val name: String, // 초기화 이후에 변경불가(immutable)한 필드
    var age: Int = 30// 변경 가능한(mutable) 필드
) {
    fun introduce() {
        println("Heloo, I am $name and I am $age years old")
    }
}

// 코틀린에서 클래스는 기본적으로 public -> 가져다쓰는게 가능함
// 기본적으로 final -> 상속(extends)해서 사용이 불가능함
class VisibilityDemo {
    // 클래스 외부에서 접근 가능
    val publicVar = "I am public"
    // 클래스 내부에서만
    private val privateVar = "I am private"
    // 모듈 내부에서만 접근가능
    // sw: module(변수집합, 함수집합, 클래스+함수... 코드 집합을 모듈)
    // internal키워드의 모듈 : 코틀린 프로젝트 단위
    internal val internalVar = "I am internal"
    // private + 상속 받은 클래스에서 사용가능
    // 기본 클래스(class, public+final)
    protected val protectedVar = "I am protected"
}

class Calculator(val name: String) {
    fun printName() {
        println("calc name is $name")
    }

    // 싱글턴으로 구현되는 내부 클래스
    // 자바: Calculator.Operation.getInstance().add(3, 4)
    // 자바의 static 키워드처럼 쓸 수 있는데, 중요한 것은 성능적인 관점에서 싱글턴처럼 작동
    companion object {
        fun add(a: Int, b: Int): Int {
            return a + b;
        }
    }
}


fun main() {
    val person = Person("Alice", 30)
//    person.name = "John" // 변경불가
    person.age = 31 // 변경가능

    person.introduce()

    // named parameter
    val person2 = Person(age = 30, name= "John")
    // default value가 있는 매개변수 제외
    val person3 = Person("John")
    person3.age = 35

    var calc = Calculator("공학계산기")
    println(calc.name)
    calc.printName()

    println(Calculator.add(2, 3))
}