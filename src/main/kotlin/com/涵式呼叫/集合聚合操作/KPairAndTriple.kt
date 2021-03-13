package com.涵式呼叫.集合聚合操作

//Pair 與 Triple

fun main(){
    //val p = Pair(1,"A")
    val p = 1 to "A"  //利用中序(infix)指令建構
    println(p)
    println(p.javaClass)
    println(p.toList())
    println("${p.first}${p.first.javaClass},${p.second}${p.second.javaClass}")
}