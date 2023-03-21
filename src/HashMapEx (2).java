package OOPS;
import java.util.*;
public class HashMapEx {

    //It is denoted as HashMap<K,V>, where K stands for key and V for value.
    //It inherits the AbstractMap class and implements the Map interface.
    /*
    Points to remember
        Java HashMap contains values based on the key.
        Java HashMap contains only unique keys.
        Java HashMap may have one null key and multiple null values.
        Java HashMap is non synchronized.
        Java HashMap maintains no order.
        The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
     */

    public static void main() {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        System.out.println("Initial list of elements: " + hm);
        //Put elements in Map
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        hm.put(103, "Gaurav");

        System.out.println("After invoking put() method ");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //replace the value
        hm.replace(101, "Vijay", "Ravi");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated list of elements:");

        //key-based removal
        hm.remove(100);
        System.out.println("Updated list of elements: "+hm);

        //value-based removal
        hm.remove(101);
        System.out.println("Updated list of elements: "+hm);
        //key-value pair based removal

        //key-value pair based removal
        hm.remove(102, "Rahul");
        System.out.println("Updated list of elements: "+hm);

        //key-based removal
        hm.remove(100);
        System.out.println("Updated list of elements: "+hm);

        //value-based removal
        hm.remove(101);
        System.out.println("Updated list of elements: "+hm);

        //key-value pair based removal
        hm.remove(102, "Rahul");
        System.out.println("Updated list of elements: "+hm);


        //No Duplicate Key allowed on HashMap
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(1,"Grapes"); //trying duplicate key

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}