class A {
    void display() {

        System.out.println("CLASS A");

    }
}

class B extends A {
    void display() {
        // super.display();
        // super.show();
        System.out.println("CLASS B");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();

        // A obj2 = new B();
        // obj2.show();
        // obj.show();
    }
}