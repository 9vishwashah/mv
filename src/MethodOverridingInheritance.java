
class ParentAnimal {

    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits Animal
class ParentDog extends ParentAnimal {

    // overriding the eat() method
    // @Override
    public void eat() {
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}
public class MethodOverridingInheritance {

    public  static void main(String args[]){
        // create an object of the subclass
        ParentDog labrador = new ParentDog();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }

}
