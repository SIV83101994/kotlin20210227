package com.ktest

fun main(){
    val chinese :Int? = 100
    val english :Int? = null
    val math :Int? = 80
    //若沒考則放入null,計算總分的時候以0分計之
    //計算總分？
    val sum = (chinese ?: 0) + (english ?: 0) + (math ?: 0)  //要用()區分獨立事件
    println(sum)

    var sum2 = chinese?.plus(english ?: 0) ?: 0
}