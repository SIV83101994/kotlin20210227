package com.ktest

import com.jtest.JHello

class KHello {
    fun callMe(){

        print("HAHA")
    }
}

fun main(args: Array<String>) {
    println("Hello Kotlin! 我是中文")
    // 呼叫 JHello 的 callMe
    val j  = JHello()
    j.callMe()
    val k = KHello()
    k.callMe()

}