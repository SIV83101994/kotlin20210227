package com.涵式呼叫.集合聚合操作

fun main(){
    var numbers = listOf(5,42,10,4)
    println("Count: ${numbers.count()}")
    println("Sum: ${numbers.sum()}")
    println("Avg: ${numbers.average()}")
    println("Max: ${numbers.max()}")
    println("Min: ${numbers.min()}")
    println("Max: ${numbers.maxByOrNull { it }}")
    println("Min: ${numbers.minByOrNull { it }}")
    //numbers 中 %3 的最小值

}