// package prac_4;
import java.util.*;
public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a vowel");
                break;
        
            default:
                System.out.println("It is a consonant");
                // break;
                sc.close();
        }
    }
}
