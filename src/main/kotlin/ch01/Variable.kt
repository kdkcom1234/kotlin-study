package ch01

fun main() {
    // 코틀린 변수, 불변변수/가변변수
    // js const,let

    // 가변변수(variable)
    var mutableVar = 10 // 변수선언 및 대입, 타입추론(type inference)
    // 타입추론
    // 변수에 대입 값에 따라서 타입이 지정됨
//    mutableVar = "abc" // (x)

    // 불변변수(value)
    val immutableVar = 20

    // ---------------------------------

    // 코틀린에서는 var/val 변수명 : 타입
    // null이 가능한 타입과 null이 불가능한 타입 분리
    // 자바: int 기본값 0, Int 기본이 null

    // 기본적으로 모든 타입은 null이 불가능하다
    //    var str : String = null

    // null이 불가능하기 대문에 null체크 필요가 없음
    var str2 : String = ""

    // null을 사용하려면 타입뒤에?를 붙임
    var nullableStr : String? = null
}