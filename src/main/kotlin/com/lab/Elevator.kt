package com.lab
//實作一個電梯程式
//B1,Lobby,1,2,3,4,5,6,7,空中花園
//-1,0,1,2,3,4,5,6,7,8
fun main() {
    //電梯位置
    var ePos = 0   //預設為0
    do {
        print("電梯在${ePos}樓, 請輸入樓層(0-8):")
        var floor = readLine()!!.toInt()
        if (floor > ePos){ //電梯上樓
            println("電梯上樓")
            for (i in ePos..floor){
                Thread.sleep(1000)//間隔一秒
                println(i)
            }
        }else if (floor < ePos){ //電梯下樓
            println("電梯下樓")
            for (i in ePos downTo floor){
                Thread.sleep(1000)
                println(i)
            }
        }
        //電梯到達指定樓層
        ePos = floor
    }while (true)

}