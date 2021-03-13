package com.基礎語法

data class Account(val name:String) {
    var balance:Int = 0
        get() = field //field:欄位-->balance(變數名稱)
        set(value){
            if (value>=0) {
                field = value
            }
        }
}

fun main() {
    val act = Account("John")
    println(act.balance)
    act.balance=100
    println(act.balance)
}