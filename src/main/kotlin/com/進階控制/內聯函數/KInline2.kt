package com.進階控制.內聯函數

val sum:(Int,Int) -> Int = {x ,y -> x + y}
val action: () -> Unit = { println("Kotlin")} // Unit --> Void

//內聯函式多用在高階函式中
//將函式作用於參數或是返回值的函式
//避免建立太多物件的困擾

inline fun doCalc(a:Int,b:Int,cal:(a:Int,b:Int)->Int):Int{
    return cal(a,b)
}

fun main() {
    val value = doCalc(10,20, sum)  //sum 可以變成內聯函式
    print(value)
    action()
}