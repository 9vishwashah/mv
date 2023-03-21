package TestPackage;

public class ForLoop {

    /*
     The for statement consumes the initialization, condition and increment/decrement
     in one line thereby providing a shorter, easy to debug structure of looping.
     */

    public static void main(String args[])
    {
        int sum = 0;

        // for loop begins
        // and runs till x <= 20
        for (int x = 1; x <= 20; x++) {
            sum = sum + x;
        }
        System.out.println("Sum: " + sum);
    }
}
