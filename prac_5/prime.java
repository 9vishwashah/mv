import java.util.*;
/*Excercise q no 1 */
public class prime {
    public static void main(String[] args) {
        int num, i, count = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        num = s.nextInt();

        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
            s.close();
        }

        if (count == 0)
            System.out.println(num+" is a Prime Number");
        else
            System.out.println(num+" is not a Prime Number");
    }
}