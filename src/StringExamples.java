package OOPS;

public class StringExamples {

    public static void main(String[] args) {
        // create strings
        String first = "Java";
        String second = "Python";
        String third = "JavaScript";

        // print strings
        System.out.println(first);   // print Java
        System.out.println(second);  // print Python
        System.out.println(third);   // print JavaScript

        // create a string
        String greet = "Hello! World";
        System.out.println("String: " + greet);

        // get the length of greet
        int length = greet.length();
        System.out.println("Length: " + length);

        // create a string using new
        String name = new String("Java String");

        System.out.println(name);  // print Java String



        // create first string
        String abc = "Java ";
        System.out.println("First String: " + abc);

        // create second
        String xyz = "Programming";
        System.out.println("Second String: " + xyz);

        // join two strings
        String joinedString = abc.concat(xyz);
        System.out.println("Joined String: " + joinedString);

        // use the escape character
        String example = "This is the \"String\" class.";


    }
}
