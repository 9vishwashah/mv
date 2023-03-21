package TestPackage;

public class ForEachLoop {

    /*
    For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5.
    It’s commonly used to iterate over an array or a Collections class (eg, ArrayList)
     */

    public static void main(String args[]){
        //declaring an array
        int arr[]={12,13,14,44};
        //traversing the array with for-each loop
        for(int i:arr){
            System.out.println(i);
        }
    }
}
