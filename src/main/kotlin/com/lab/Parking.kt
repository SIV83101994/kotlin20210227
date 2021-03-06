package com.lab

import kotlin.math.log2
import kotlin.math.pow

fun Int.toBinary(len:Int):String{
    return String.format("%" + len +"s",this.toString(2)).replace(" ","0")
}

var num = 8  //停車位數量
var p = 18 //停車狀態

fun main() {
    println("目前停車狀態:${p.toBinary(num)}")
    print("請選擇車位(0-7): ")
    var n = readLine()!!.toInt()
    n = 2.toDouble().pow(n).toInt()
    val isPass:Boolean = (p.and(n) == 0) // p & n
    if (isPass){
        p += n
        println("最新車位狀態: ${p.toBinary(num)},p=${p}")
    }else{
        n = log2(n.toDouble()).toInt()
        println("${n}號車位無法停車")
    }

}