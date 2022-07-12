package com.example.myapplication.Kotlin

// 10. 제어흐름

// When

fun main(args: Array<String>) {
    val value: Int = 1

    when (value) {
        9 -> println("value is 9")
        8 -> println("value is 8")
        0 -> println("value is 0")
        else -> println("I do not know value")
    }

    if (value == 3) println("value is 3")
    else if(value == 1) println("value is 1")
    else if(value == 8) println("value is 8")
    else println("I do not know value")

    val value2 = when (value) {
        1 -> 99
        8 -> 3
        8 -> 19
        else -> 980
    }
    println(value2)
}