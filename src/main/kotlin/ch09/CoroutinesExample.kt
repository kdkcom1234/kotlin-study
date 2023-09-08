package ch09

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.Duration
import java.time.LocalDateTime

fun main() {
    // 작업 목록
    val durationArr = arrayOf<Long>(200, 100, 300, 200, 400)
    // 작업 결과 목록
    val ids = Array(5){""};

    val start = LocalDateTime.now()
    println(start.toString())

    runBlocking {
        for(i in 1..durationArr.size) {
            launch {
                // 처리 시작
                delay(durationArr[i-1]) // long term process
                // 처리 종료

                // 결과를 등록
                ids[i-1] = "${i.toLong()}: ${durationArr[i-1]}"
            }
        }
    }
    val end = LocalDateTime.now()
    println(end.toString())

    println("""
			|All tasks are ended: ${ids.joinToString { it.toString() }}
			|Elapsed time: ${Duration.between(start, end).toMillis()}
            |Current Thread: ${Thread.currentThread().name}
		""".trimMargin())
}