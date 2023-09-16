//reversing a stack without using another stack

public class problem3{
    public static void pushToBottom(java.util.Stack<Integer> s, int data){
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushToBottom(s, data);
        s.push(top);

    }
    public static void reverseStack(java.util.Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushToBottom(s, top);

    }

    public static void printStack(java.util.Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
            
        }
    
    public static void main(String args[]) {
        java.util.Stack<Integer> s1 = new java.util.Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
       
        reverseStack(s1);
        printStack(s1);
       
    }
}
