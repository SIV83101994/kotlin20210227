package com.ktest

fun main() {
    // 數組陣列
    val num1 = arrayOf(1,5,7,3)     //隱式宣告
    val num2 = arrayOf<Int>(1,5,7,3)  //顯式宣告
    // for
    for (i in 0..num1.size-1){
        println(num1[i])
    }
    println(num1.indices)
    for (i in num1.indices){  //indices-->index範圍
        println(num1[i])
    }
}