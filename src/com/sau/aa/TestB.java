package com.sau.aa;

public class TestB {
    public static void main(String[] args) {
        Hi ob1 = new Hi();

        Hi ob2 = new Hi(50);

        //การใช้งาน object/instance คือการใช้งาน data และ method
        //การใช้งาน data คิอกำหนดค่าให้มันใหม่ หรือ เอาค่ามันมาใช้

        ob1.aa = 99;
        System.out.println(ob1.aa + ob2.aa);

        //การใช้งาน method คือ การสั่งให้ method นั้นๆ ทำงาน
        ob1.showA();
        ob2.showA();
        ob2.show();
    }
}
