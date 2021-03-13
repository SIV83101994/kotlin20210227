//Java Code 的調用請參考 com.jtest.CallTopFun.java
@file:JvmName("Calc") //Java可以透過此類別名稱調用
package com.topfun

var count = 0 //頂層變數/頂層屬性

@JvmName("myAdd")//Java可以透過此類別名稱調用
fun add(x:Int,y:Int):Int{  //頂層涵式
    ++count
    return x + y

}