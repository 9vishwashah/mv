// Java program to illustrate the
// concept of single inheritance
// import java.util.*;

class one {
    public void display() {
        System.out.println("Sunflower");
    }
}

class two extends one {
    public void disp() {
        System.out.println("Pikachu");
    }
}

// Driver class
public class Single_Inherit {
    public static void main(String[] args) {
        two g = new two();
        g.display();
        g.disp();
    }
}
