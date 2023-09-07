package ch06

data class Person(val name: String, val age: Int)
fun main() {
    // 요소를 변경가능한 컬렉션(리스트)
    val mutableList = mutableListOf(1, 2 ,3, 4)
    // 요소 추가
    mutableList.add(5)
    // 요소 삭제
    mutableList.removeAt(0)
    mutableList.remove(1)

//    val people =
//        mutableListOf(Person("Alice", 30),
//                        Person("Bob", 35),
//                        Person("John", 30))
    
//    // Person 빈 목록 리스트
//    var people = mutableListOf<Person>()
    
    // 변경 불가한 리스트
    val people =
        listOf(Person("Alice", 30),
            Person("Bob", 35),
            Person("John", 30))

//    people.remove(Person("Alice", 30))
//    people.removeAt(0)

    // 요소 접근
    mutableList.get(1) // 자바스타일 컬렉션(리스트) 요소 접근
    mutableList[1] // 배열처럼 인덱스로 접근

    // map
    // 이름 목록, List<String>
//    val names = people.map { p -> p.name }

    // 람다함수에서 매개변수가 1개이면 it으로 사용할 수 있음
    val names = people.map { it.name }

    // sort
    // 나이기준으로 정렬된 List<Person>
    val sortedByAge = people.sortedBy { it.age }

    // find
    // 이름으로 찾은 Person 객체 반환, 없을 수도 있기 때문에 Person?
    val findByName = people.find { it.name == "Alice" }

    // filter
    val youngPeople = people.filter { it.age < 30 }

    // groupBy
    // Map<그룹핑값, 그룹핑된객체목록>
    // Map<Int, List<Person>>
    val groupByAge = people.groupBy { it.age }

    println("-------------")
    for(group in groupByAge) {
        println("age: ${group.key}")
        for(person in group.value) {
            println(person)
        }
    }
}