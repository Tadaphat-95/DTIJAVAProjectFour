package com.sau.aa;
// static ใช้ได้เฉพาะ static เท่านั้น
// data ที่ไม่มี static = instance variable
// data ที่มี static = class variable
// data ที่มี static obj ทุกตัว ใช้ data ร่วมกัน
public class Hey {
    public int a = 10; // instance variable
    public static int b = 20; // class variable

    public void showHi(){ // instance method new
        System.out.println("Hi...");
    }
    public static void showHey(){ //class method new
        System.out.println("Hey...");
    }

    public void metA(){
        a = 11;
        b = 22;
        showHi();
        showHey();

    }
    public static void metB(){
        //a = 11; error
        b = 22;
        //showHi(); error
        showHey();
    }
}
