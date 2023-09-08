package ch08

// 상호운영성(Interoperable)
fun main() {
    val person = Person("John")
    println(person.name)
    person.name = "Jane"

    // 코틀린에서는 반환값 void -> Unit
    person.printInfo()
}