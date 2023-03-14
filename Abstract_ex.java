abstract class A {
    abstract void display();
}

class B extends A {
    public void display() {
        System.out.println("Abstract");
    }
}

public class Abstract_ex {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}