package com.jtest;

import com.ktest.KHello;

public class JHello {
    public void callMe(){
        System.out.println("0921443423");
    }
    public static void main(String[] args) {
        System.out.println("Hello Java!");
        //呼叫callMe
        JHello j = new JHello();
        j.callMe();
        //呼叫KHello 的 callMe
        KHello k = new KHello();
        k.callMe();
    }
}
