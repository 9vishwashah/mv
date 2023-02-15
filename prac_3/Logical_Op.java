// package manual.prac_3;

public class Logical_Op {
//     && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10	
// || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4	
// !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)
    public static void main(String[] args) {
        int a=5;
        int b= 6;
        System.out.println("This is logical AND : "+(a<5 && b<10));        
        System.out.println("This is logical OR : "+(a<5 || b<10));        
        System.out.println("This is logical NOT : "+(!(a<5 && b<10)));        
    }
}
