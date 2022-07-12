package com.example.myapplication.Kotlin

// 08. 제어 흐름
// - if, else

fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    // if / else 사용 하는 방법 (1)
//    println("1번")
    // 0
    if (a > b) {
    // 1
        println("a 가 b 보다 크다.")
    } else {
        // 2
        println("a 가 b 보다 작다")
    }
    // 3
//    println("3번")

    // if / else 사용 하는 방법 (2)
    if (a > b) {
        println("a가 b 보다 크다")
    }

    if (a > b) println("a가 b 보다 크다")

    // if / else / else if 사용 하는 방법 (3)
    if (a > b) {
        println("a가 b보다 크다")
    } else if (a < b) {
        println("a가 b보다 작다")
    } else if (a == b){
        println("a와 b는 같다")
    } else {

    }

    // 값을 리턴하는 if 사용방법
    val max1 = if(a > b) {
        a // 5
    } else {
        b // 10
    }
    // 값을 리턴하는 if 사용방법(2)
    val max2 = if(a > b) a else b
    println()
    println(max1)
    println(max2)

}