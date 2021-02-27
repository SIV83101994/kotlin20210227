
fun getPrice(){


}


fun main() {
    //宣告變數
    var x = 10 //可再指派變數 var
    x = 11
    println(x)

    val y = 20 //不可再指派變數 val
    println(y)

    //var or val 變數名稱 : 變數型態 = 初始值

    val pi : Double = 3.14  // val pi = 3.14
    //BMI練習
    val h = 170.0
    val w = 60.0
    val bmi = w / Math.pow(h/100,2.0)
    println(bmi)
    println(1/2)
    println(0.1 + 0.1 == 0.2)
    println(0.1+0.1+0.1 == 0.3)     //與java相同的問題
    println(0.1+0.1+0.1)            //近似值

    //印出資料
    println("bmi : %.2f".format(bmi))
    println("bmi : ${bmi}")
    println("bmi : $bmi")
    println("bmi : ${bmi * 2}")  //${...} 運算式
    var price = 100
    println("cost = ${price / 4}")

}