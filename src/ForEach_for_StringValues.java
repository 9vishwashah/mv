package TestPackage;
import java.util.*;

public class ForEach_for_StringValues {

    public static void main(String args[]) {
        //Creating a list of elements
        ArrayList<String> list = new ArrayList<String>();
        list.add("vimal");
        list.add("sonoo");
        list.add("ratan");
        //traversing the list of elements using for-each loop
        for (String s : list) {
            System.out.println(s);
        }
    }
}
