package com.基礎語法

import kotlin.random.Random

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
    //使用Lambda
    val num3 = Array(5){i -> i * 1 }
    for (i in num3.indices){
        println(num3[i])
    }
    //四星彩電腦選號(亂數:0-9)
    val num4 = Array(4 ){ _ -> Random.nextInt(10)}  // kotlin: 可以用'_'取代i(當後面不需要用到i參數時)
    println(num4.contentToString()) //Arrays.toString()

    // setter / getter
    var n1 = num4.get(1) //num4[1] /get->取值
    println(n1)
    num4.set(1,9) //num4[1]=9   / set->設定
    println(num4.contentToString())

    //for-each (印出每個元素內容)
    num4.forEach { n -> println(n) }
}