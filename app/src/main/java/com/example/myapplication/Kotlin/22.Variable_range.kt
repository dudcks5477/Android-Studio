package com.example.myapplication.Kotlin

// 변수의 접근 범위
// 1. 전역 변수
// 2. 지역 변수

var number100: Int = 10

fun main(args: Array<String>) {
    println(number100)

    val test = Test("김영찬")
    test.testFun()
    test.name
    println(number100)

}

class Test(var name: String) {

    fun testFun() {
        var birth : String = "1998/03/18"
        name = "김영찬"
        number100 = 100
//        gender
        fun testFun3() {
            var gender: String = "male"
        }
    }

    fun testFun2() {
        name
//        birth
    }
}