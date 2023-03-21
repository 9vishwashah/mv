/*
Why use inheritance?
The most important use of inheritance in Java is code reusability. The code that is present in the parent class can be directly used by the child class.
Method overriding is also known as runtime polymorphism. Hence, we can achieve Polymorphism in Java with the help of inheritance.

 */

class SuperAnimal {

    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits Animal
class SuperDog extends SuperAnimal {

    // overriding the eat() method
    @Override
    public void eat() {

        // call method of superclass
        super.eat();
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

public class SuperKeyword {

    public  static  void main(String args[]){
        // create an object of the subclass
        SuperDog labrador = new SuperDog();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }

}
