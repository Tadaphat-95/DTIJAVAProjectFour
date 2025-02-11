package ac.th.sau;
//  Encapsulation (Information Hiding)
 // Inheritance สืบทอดคลาส (คลาสแม่ , ลูก ,หลาน ,เหลน, โหลน)
//  Polymorphism
public class MyClass01 {
    //  Encapsulation (Hiding data member)
    private int dataA;
    private String dataB;

    //ให้ใฃ้งาน Data ผ่าน method Getter/Setter

    public int getDataA() {
        return dataA;
    }

    public void setDataA(int dataA) {
        this.dataA = dataA;
    }

    public String getDataB() {
        return dataB;
    }

    public void setDataB(String dataB) {
        this.dataB = dataB;
    }
}
