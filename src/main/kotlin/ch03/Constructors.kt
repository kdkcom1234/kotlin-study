package ch03

class PersonConstructor(
    val name: String,
    var age : Int = 0
) {
    // 생성자가 여러개임
    // 기본생성자가 있고, 다른생성자는 기본생성자를 호출
    // 기본생성자가 매개변수(초기화블럭)가 가장 많음

//    // 이 생성자함수는 : 매개변수가 2개인 함수 타입
//    constructor(name: String) : this(name, 0)

    // 생성자의 주요 역할
    // 객체를 생성을 함 -> 필드 초기화를 하면서 객체를 생성함
    // 객체를 생성할 때 추가적인 초기화 작업이 필요할 수 있음

    // 필드 외에 추가적인 초기화 작업을 할 수 있는 블록
    init {
        if(age != 0) {
            println("New instance created for $name who is $age years old")
        } else {
            println("New instance created for $name")
        }
    }
}


fun main() {
    val person = PersonConstructor("Alice", 30)
    val person2 = PersonConstructor("John")
}