package ch09

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val start = LocalDateTime.now()

    Thread.sleep(1000) // 1초가 걸리작업
    Thread.sleep(1000)
    Thread.sleep(1000)
    Thread.sleep(1000)

    val end = LocalDateTime.now()
    println(Duration.between(start, end).toMillis())
}