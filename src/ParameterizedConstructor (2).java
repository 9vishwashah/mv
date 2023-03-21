package OOPS;

class Student{

    String stdname;
    int stdstandard;

    Student(String name, int standard) {
        this.stdname = name;
        this.stdstandard= standard;
        //constructor doesn't have any return type.
        //It does'nt return any value, it only creates the Object.
    }

    public void dummyMethod(){
        System.out.println("I'm not called from the constructor.");
        System.out.println("The name of this student is " + this.stdname);
        System.out.println("The standard of this student is " + this.stdstandard);
    }
}
public class ParameterizedConstructor {

    public static void main(String args[]) {

        //Non parameterized constructor
        Student s1 = new Student("Komal", 10);
        s1.dummyMethod();

    }
}
