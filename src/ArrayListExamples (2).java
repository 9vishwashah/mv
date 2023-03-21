package OOPS;
import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {
        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // Add elements to ArrayList
        // add() method without the index parameter
        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        System.out.println("ArrayList: " + languages);


        // get the element from the arraylist
        String str = languages.get(1);
        System.out.print("Element at index 1: " + str);

        // change the element of the array list
        languages.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + languages);

        // remove element from index 2
        String removeElement = languages.remove(2);
        System.out.println("Updated ArrayList: " + languages);
        System.out.println("Removed Element: " + removeElement);

        // iterate using for-each loop
        System.out.println("Accessing individual elements:  ");

        for (String forvar : languages) {
            System.out.print(forvar);
            System.out.print(", ");
        }
    }
}
