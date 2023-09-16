//pushing element at the bottom of the stack
import java.util.*;
public class problem1 {

    public static void pushToBottom(java.util.Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        //storing the top value of the stack
        int top = s.pop();
        pushToBottom(s, data);
        s.push(top);

    }
    public static void main(String args[]) {
        java.util.Stack<Integer> stack1 = new java.util.Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

     pushToBottom(stack1, 4);

        while(!stack1.isEmpty()) {
            System.out.println(stack1.peek());
            stack1.pop();
        }

    }
    
}
