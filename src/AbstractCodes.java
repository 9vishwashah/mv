// Abstract class
abstract class AbsAnimal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void animSound(){
        System.out.println("AbsClassNormalMethod");
    }

    // Regular method
    public void sleep() {
        System.out.println("Zzz from Abs Class");
    }
}

// Subclass (inherit from Animal)
class Bird extends Animal {
    public void animSound() {
        // The body of animalSound() is provided here
        System.out.println("The bird says: kuhu");
    }

    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("From Abstract Method");
    }

    public void sleep(){
        System.out.println("Zzz from Child Class");
    }
}

class AbstractCodes {
    public static void main(String[] args) {
        Bird koyal = new Bird(); // Create a Bird  object
        koyal.animSound();
        koyal.sleep();
        koyal.animalSound();
    }
}
