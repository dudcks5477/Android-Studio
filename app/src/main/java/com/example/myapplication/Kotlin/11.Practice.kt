package com.example.myapplication.Kotlin

// 11. 제어흐름 실습

fun main(args: Array<String>) {
    val value: Int? = null
    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null

    // when 구문은 조건으로 갖는 값의 모든 경우에 대응 해주는 것이 좋다
    when (value2) {
        true -> println("")
        false -> println("")
        null -> println("")
    }
    println(value2)

    // 값을 리턴하는 when 구문의 경우 반듯이 값을 리턴해야 한다
    val value3 = when (value2) {
        true -> 1
        false -> 9
        else -> 8
    }
    println(value3)

    // when의 다양한 조건식 (1)
    val value4: Int = 3
    when (value4) {
        is Int -> {
            println("value4 is int")
        }
        else -> {
            println("value4 is not int")
        }
    }

    // when의 다양항 조건식 (2)
    val value5: Int = 20
    when (value5) {
        in 10 .. 20 -> {
            println("value is in 10-20")
        }
        in 20 .. 30 -> {
            println("value is in 10-20")
        }
        in 30 .. 40 -> {
            println("value is in 10-20")
        }
    }
}