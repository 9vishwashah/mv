class A{
    public void display1() {
        System.out.println("Class A");
    }
}

class B extends A{
    public void display2() {
        System.out.println("Class B");
    }
}

class C extends B{
    public void display3(){
        System.out.println("Class C");
    }
}
public class Multi_Level {
    public static void main(String[] args) {
        C obj = new C();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
