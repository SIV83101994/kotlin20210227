package com.類別與動作.類別成員與SingleTon

import java.util.*


object KSingleTon {   //object==單一物件  / class==可創建許多物件
    private  var num : Int = 0
    init {
        num = Random().nextInt(100)
    }
    fun getNum() : Int = this.num
    // == fun getNum():Int{
    // return this.num}
}

fun main() {
    val a1 = KSingleTon
    println(a1.getNum())
    val a2 = KSingleTon
    println(a2.getNum())
}