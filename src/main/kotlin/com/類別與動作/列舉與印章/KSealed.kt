package com.類別與動作.列舉與印章

/*
* enum 在意的是數據資料
* sealed(印章/密封)在意的是類型
* */
sealed class Employee {
    abstract fun job()
    class Developer() : Employee() {
        override fun job() {
            println("寫程式")
        }
    }
    class Manager() : Employee() {
        override fun job() {
            println("管人事")
        }
    }
}
class Sealed():Employee(){
    override fun job() {
        println("搶人事")
    }
}
// Employee 類別透過sealed 告知 物件只能透過Developer 與 Manager來建立

fun main() {
    val emp1 = Employee.Developer()
    emp1.job()
    val emp2 = Employee.Manager()
    emp2.job()
}