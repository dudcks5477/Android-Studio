package com.example.myapplication.Kotlin

fun main(array: Array<String>) {

    // 산술 연산자
    var a = 9 + 8
    var b = 0 - 3
    var c = 1 * 8
    var d = 98 / 3
    var e = 98 % 3

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    // 대입 연산자
    val f = 5
//    val 5 = f

    // 복합 대입 연산자
    a += 9
    b -= 8
    c *= 0
    d /= 3
    e %= 1

    println()
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    // 증감 연산자
    a++
    b--
    println()
    println(a)
    println(b)

    // 비교 연산자
    var g = a > b
    var h = a == b
    var i = !h
    var l = i != h
    println()
    println(g)
    println(h)
    println(i)
    println(l)

    // 논리 연산자
    val j = h && i
    val k = h || i
    println()
    println(j)
    println(k)
}