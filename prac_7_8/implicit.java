// package prac_7_8;

public class implicit {
    public static void main(String[] args) {
        /* Widneing Typecasting */
        int num = 10;
        System.out.println("Integer value is:" + num);
        float a = num;
        System.out.println("Float value is: " + a);
        /* Narrowing Typecasting */
        
        
        /* Type conversion from int to string */
        String data = String.valueOf(num);
        System.out.println("value converted from int to string: " + data);
        /* Type conversion from string to int */
        num = Integer.parseInt(data);
        System.out.println("Value converted from String to Int: " + num);
    }
}
