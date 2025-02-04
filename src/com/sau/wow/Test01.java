package com.sau.wow;

public class Test01 {
    public static void main(String[] args) {
        //สร้าง object/Instace of class
        //วิธีที่ 1 มี 2 ขั้นตอน
        DtiSAU mod;
        mod = new DtiSAU();

        //ิธีที่ 2 มี 1 ขั้นตอน
        DtiSAU med = new DtiSAU();

        //การใช้งาน Object/Instance คือ การใช้งาน data/method
        //การใช้งาน data คือ เปลี่ยนให้มันใหม่ หรือเอาค่ามันมาใช้
        //การใช้งาน method คือ ให้ method ของ Object/Instace นั้นๆ ทำงาน
        mod.name = "นา";
        System.out.println(mod.name + " สูง" + mod.high);

        med.name = "สา";
        med.showhi();


    }
}
