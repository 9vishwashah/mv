import java.util.ArrayList;

class ArrayListEx {
    public static void main(String[] args) {

        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // Add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        languages.add("R");
        languages.add("Kotlin");
        System.out.println("ArrayList: " + languages);

        // get the element from the arraylist
        String str = languages.get(1);
        System.out.print("Element at index 1: " + str);

        // change the element of the array list
        languages.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + languages);

        // remove element from index 2
        String afsha = languages.remove(2);
        System.out.println("Updated ArrayList: " + languages);
        System.out.println("Removed Element: " + afsha);

        // iterate using for-each loop
        System.out.println("Accessing individual elements:  ");

        for (String printlanguage : languages) {
            System.out.print(printlanguage);
            System.out.print(", ");
        }
    }
}