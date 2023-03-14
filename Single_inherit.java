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
public class Single_inherit {
    public static void main(String[] args) {
        B obj = new B();
        obj.display1();
        obj.display2();
    }
}
