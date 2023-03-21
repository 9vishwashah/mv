/*
    The Scanner class is used to get user input, and it is found in the java.util package.

    To use the Scanner class, create an object of the class
    and use any of the available methods found in the Scanner class documentation.
 */
// Import the Scanner class

import java.util.Scanner;

public class TakeUserInput {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input


        Scanner newObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // String input
        String name = newObj.nextLine();

        // Numerical input
        int age = newObj.nextInt();
        double salary = newObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }


}
