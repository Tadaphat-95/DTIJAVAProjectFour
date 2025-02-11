package net.dti.aa;
//public จากที่ไหนก็ได้
//private ภายในคลาสนั้นๆเท่านั้น
//protected ภายใน package เดียวกัน กรณีต่าง package
//ต้องสืบทอด inheritance กัน ***

//default ภายใน package เดียวกัน
public class Test01 {
    public final int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;

    public void met1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
