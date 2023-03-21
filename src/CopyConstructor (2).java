package OOPS;
class A {
    int a;
    String b;

    A() {
       a = 10;
       b = "Welcome Session!";
       System.out.println(a + " " + b);
    }

    A(A refvar){
        a= refvar.a;
        b= refvar.b;
        System.out.println(a + " " + b);
    }
}
public class CopyConstructor {
    public static void main(String args[]){
        A r = new A();
        A r2 = new A(r);
    }
}
