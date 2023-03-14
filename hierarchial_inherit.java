class A {
    public void display1() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void display2() {
        System.out.println("Class B");
    }
}

class C extends A {
    public void display3() {
        System.out.println("Class C");
    }
}

class D extends A {
    public void display4() {
        System.out.println("Class D");
    }
}

public class hierarchial_inherit {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.display1();
        obj1.display2();
        
        C obj2 = new C();
        obj2.display1();
        obj2.display3();

        D obj3 = new D();
        obj3.display1();
        obj3.display4();

    }
}
