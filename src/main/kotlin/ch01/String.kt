package ch01

fun main() {
    val name = "John"
    val lastName = " Doe"
    val fullName = name + lastName

    // 템플릿 리터럴
    // JS: `${변수명(함수호출리턴값)}`

    // $변수명, ${식}
    val age = 30
//    val sentence = "My name is ${name + lastName} and I am $age years old."
    val sentence = "My name is $fullName and I am $age years old."

    val lowerName = "john"
    // 대소문자 구분없이 문자열 비교
    lowerName.equals(name, ignoreCase = true)
}