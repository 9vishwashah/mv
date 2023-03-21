interface Interface_Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
    public void eat();  // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Sheep implements Interface_Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("SheepSound - The child class Sheep");
        }

        public void sleep() {
            // The body of sleep() is provided here
            System.out.println("Zzz");
        }

        public void eat() {
            // The body of sleep() is provided here
            System.out.println("Yum Yum");
        }
}

public class InterfaceEx {

    public static void main(String[] args) {
        Sheep mySheep = new Sheep();  // Create a Sheep object
        mySheep.animalSound();
        mySheep.sleep();
        mySheep.eat();
    }
}
