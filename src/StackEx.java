
import java.util.Stack;
public class StackEx {
    public static void main(String[] args) {
//creating an instance of Stack class  
        Stack<Integer> stk = new Stack<>();

// checking stack is empty or not  
        boolean result = stk.empty();
        System.out.println("Is the stack empty? " + result);
// pushing elements into stack  
        stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);

//prints elements of the stack  
        System.out.println("Elements in Stack: " + stk);

        // Displaying the Stack
        System.out.println("Initial Stack: " + stk);

        // Removing elements using pop() method
        System.out.println("Popped element: " +
                stk.pop());
        System.out.println("Popped element: " +
                stk.pop());

        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation "
                + stk);

    }
}