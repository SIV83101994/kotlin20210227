package com.類別與動作.列舉與印章

enum class Coin(val money:Int){
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25)
}

fun main() {
    val coin = Coin.NICKLE
    println(coin.money)
}