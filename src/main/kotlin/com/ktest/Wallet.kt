package com.ktest
//錢包
class Wallet(val name: String, var money: Int ) {
    //如何檢查傳入的參數是否正確？
    init {
        money = if (money>0) money else 0
    }
}

fun main() {
    val w1 = Wallet("Jo",100)
    println(w1)
    val w2 = Wallet("May",-100)
    println(w2)
}