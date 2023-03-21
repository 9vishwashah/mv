package TestPackage;

public class DoWhileLoop {

    /*
       unlike for or while loop, a do-while check for the condition
       after executing the statements of the loop body.
     */

    // Main driver method
    public static void main(String[] args)
    {
        // initial counter variable
        int i = 0;

        do {

            // Body of loop that will execute minimum
            // 1 time for sure no matter what
            System.out.println("Print statement");
            i++;
        }

        // Checking condition
        // Note: It is being checked after
        // minimum 1 iteration
        while (i < 0);
    }
}
