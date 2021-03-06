package com.ktest

fun main() {
    //集合 Set, List, Map
    val set = hashSetOf<Int>(1,5,7,3)
    val list = arrayListOf<Int>(1,5,7,3)
    val map = hashMapOf<Int,String>(1 to "One",5 to "Five",7 to "Seven",3 to "Three")
    println(set)
    println(list)
    println(map)

    println(set.max())  //版本1.3
    println(set.maxOrNull()) //版本1.4
}