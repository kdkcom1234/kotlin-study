package ch09

import kotlinx.coroutines.*
import java.time.Duration
import java.time.LocalDateTime

// 프로세스: 프로그램을 실행해서 메모리에 올라간 것을 프로세스
// -----
// 스레드: 프로세스의 실행단위를 나눈 것
// 컨텍스트: 다중 작업을 싱글스레드 처리하기위 한 기법(시간분할)
// ------
// 코루틴: 스레드가 기본적으로 리소스소모가 많기 때문에, 좀 더 작은 단위로 나눈 것
// ------
// 동시에 여러개의 작업을 처리하기 위한방법

// 1작업시작 -> 1작업끝 -> 2번작업시작->2번작업끝
// 1번작업의 완료가 2번작업에 영향 미침(의존성관계)

// 1번작업 시작->끝
// 2번작업 시작->끝
// 1/2번 작업간에는 의존관계가 없음
// 나눠서 처리한 작업의 결과를 UI에서 보여주거나,
// 결과저장하거나 이럴때 한번에 보여줘야함

// a사람이 첫번째 API호출 - thread 1
// a사람이 두번째 API호출 - thread 2
// b사람이 첫번째 API호출 - thread 3
// 스프링MVC - 스레드풀을 500

fun main() {
    val start = LocalDateTime.now()
    // 코루틴들이 모두 끝날때 까지 현재 스레드에서 대기
    runBlocking {
        // 코루틴을 실행
        launch {
            delay(500L)
        }

        launch {
            delay(1500L) // 이작업이 가장 마지막에 끝나고 오래걸리는 작업
        }

        launch {
            delay(700L)
        }

        launch {
            delay(100L)
        }

        println("runBlocking - ${Thread.currentThread().name}")
    }

    val end = LocalDateTime.now()
    println(Duration.between(start, end).toMillis())
}