package StringOperationsJava;


/*
1. Using string literal: Java String literal can be created by using double quotes. For example:

        String s="Hello";

2. Using a new keyword: Java String can also be created by using the keyword “new”. For example:

        String s=new String("Hello");
 */
public class StringOperations {

    public static void main(String args[]){

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int len = txt.length();
        System.out.println("The length of the txt string is: " + len);

        String abc = "Hello World";
        System.out.println(abc.toUpperCase());
        System.out.println(abc.toLowerCase());

        String xyz = "Please locate where 'locate' occurs!";
        System.out.println(xyz.indexOf("locate"));

        String firstName = "Raju";
        String lastName = "Raj";
        System.out.println(firstName + " " + lastName);
    }




}
