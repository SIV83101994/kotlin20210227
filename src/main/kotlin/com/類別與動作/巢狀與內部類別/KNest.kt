package com.類別與動作.巢狀與內部類別
/*
巢狀類別：
Java : static class A (位於某個類別內的定義)
Kotlin : class A (位於某個類別內的定義)

內部類別:
Java class B (位於某個類別內的定義)
Kotlin : inner class B (位於某個類別內的定義)

*/

class KNest {  //一般/外部類別
    companion object {  //類別成員宣告區(相當於Java的static{...})
        val sx = 200  //類別成員變數
    }

    val x = 100  //物件成員變數

    class A {   //巢狀類別
        fun print() {
            println("A ${this}")
            println("A -> Outer.sx ${KNest.sx}")
        }

    }
        inner class B { //內部類別
            fun print() {
                println("B ${this}")
                println("B'x ${this@KNest.x}")
            }
        }
    }

fun main() {
    val a = KNest.A()
    a.print()
    val b = KNest().B()
    b.print()
}