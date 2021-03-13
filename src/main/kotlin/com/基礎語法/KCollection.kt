package com.基礎語法

fun main() {
    //集合 Set, List, Map
    val set = hashSetOf<Int>(1,5,2,7,8,3)
    val list = arrayListOf<Int>(1,5,7,3)
    val map = hashMapOf<Int,String>(1 to "One",5 to "Five",7 to "Seven",3 to "Three")
    println(set)
    println(list)
    println(map)

    println(set.max())  //版本1.3
    println(set.maxOrNull()) //版本1.4

    val nums = hashSetOf<Int>(10,42,5,4) //除以3的餘數(1,0,2,1)
    //set求出除以3的餘數 最大值
    println(nums.maxByOrNull { n -> n%3  })
    //set求出除以3的餘數 最小值
    println(nums.minByOrNull { it % 3 }) // it = n

    val set2 = hashSetOf<Int>(1,5,2,9,6,3)
    //set2 求出偶數的最大值
    println(set2.filter { n -> n%2 == 0 }.maxOrNull())
    println(set2.filter { it%2 ==0 }.maxOrNull())
    //動動腦:請問誰的名字最長？
    //使用 maxWithOrNull
    val names = hashSetOf<String>("Helen","John","Anita","Jackson")
    println(names.maxByOrNull { it.length })
    val longestString = names.maxWithOrNull(compareBy{it.length}) //參考API文件
    println(longestString)
}