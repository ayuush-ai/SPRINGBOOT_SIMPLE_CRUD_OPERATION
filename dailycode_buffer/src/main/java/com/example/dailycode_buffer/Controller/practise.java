package com.example.dailycode_buffer.Controller;




// Online Java Compiler
// Use this editor to write, compile and run your Java code online

interface truck{
    public  void payload();
}
interface car{
    public  void rpm();
}

class pickup_truck implements truck,car{
    public  void payload(){
        System.out.println("hello world1 ");
    }
    public  void rpm(){
        System.out.println("hello world 2");
    }
}



class practise {
    public static void main(String[] args) {
        pickup_truck p=new pickup_truck();
        p.payload();
        System.out.println("Try programiz.pro");
    }
}
