package OOPS;

public class SimpleArray {

    public static void main(String args[]){
        // create an array
        int[] age = {12, 4, 5, 2, 5};

        // access each array elements
       System.out.println("Accessing Elements of Array:");
       System.out.println("First Element: " + age[0]);
       System.out.println("Second Element: " + age[1]);
       System.out.println("Third Element: " + age[2]);
       System.out.println("Fourth Element: " + age[3]);
       System.out.println("Fifth Element: " + age[4]);


        // create an array
        int[] nums = {12, 4, 5};

        // loop through the array
        // using for loop
       System.out.println("Using for-each Loop:");
               for(int a : nums) {
                    System.out.println(a);
                }

        int[] bottles = new int[5];
        // initialize array
        age[0] = 12;
        age[1] = 4;
        age[2] = 5;
        //and so on...

    }
}