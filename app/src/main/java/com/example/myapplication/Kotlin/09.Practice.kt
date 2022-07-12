package com.example.myapplication.Kotlin

fun main(args: Array<String>) {

    val a: Int? = null
    val b: Int = 98
    val c: Int = 31

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b + c == 898) {
        println("b plus c is 110")
    } else {
        println("b plus c is not 110")
    }

    // 엘비스 연산자
    val number: Int? = 189
    val number2 = number ?: 3
    println()
    println(number2)

    val num1:Int = 10
    val num2:Int = 20

    val max = if (num1 > num2) {
        num1 // 10
    } else if (num1 == num2){
        num2 // 20b
    } else {
        100
    }
}