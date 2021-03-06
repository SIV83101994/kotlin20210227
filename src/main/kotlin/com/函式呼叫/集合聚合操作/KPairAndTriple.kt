package com.函式呼叫.集合聚合操作

//Pair 與 Triple

fun main(){
    //Pair
    //val p = Pair(1,"A")
    val p = 1 to "A"  //利用中序(infix)指令建構
    println(p)
    println(p.javaClass)
    println(p.toList())
    println("${p.first}${p.first.javaClass},${p.second}${p.second.javaClass}")

    //Triple
    //置入單一型別的元素
    println()
    val t = Triple(4,5,6)
    println("${t.first}${t.second}${t.third}")
    println("${t.component1()}${t.component2()}${t.component3()}")
    //置入不同型別的元素
    println()
    val t1 = Triple("I am a String", listOf(1,2,3),10)
    println("${t1.first}${t1.second}${t1.third}")
    println("${t1.first.javaClass}${t1.second.javaClass}${t1.third.javaClass}")
    println("${t1.component1()}${t1.component2()}${t1.component3()}")

    //解構 Pair,Triple
    println()
    val(a,b) = p //p是上面建立的Pair(1,"A")
    println("$a,$b")
    val (name ,score) = Pair("小明",100)
    println("$name,$score")

    val(i,j,k) = t
    println("$i,$j,$k")

    //應用
    var scores = mapOf(Pair("小明",100),"小華" to 80 ,"小美" to 90 )
    //在scores中新增小瑛成績:Pair("小瑛",70)
    //由於 mapOf 的預設是 immutable 因此不可加入新元素
    //若要加入新元素必須改變為可變型別
    scores = scores.toMutableMap()
    //scores["小瑛"] = 70
    scores.put("小瑛",70)
    for (entry in scores){
        println("${entry.key}${entry.value}")
    }
    //統計資料
    val stat = scores.entries.stream().mapToInt { e -> e.value }.summaryStatistics()
    println(stat)
    println(stat.sum)

    //可增加元素的集合
    var scores2 = mutableMapOf(Pair("小明",100),"小華" to 80 , "小瑛" to 90)
    scores2.put("大中天",20)
    for (entry in scores2){
        println("${entry.key}${entry.value}")
    }
}