
 class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

class Stack{
    Node head = null;

    public boolean isEmpty() {
        return head == null;
    }

    //push 
    public void push(int data) {
        Node newNode = new Node(data);

        if(isEmpty()) {
            head = newNode;
            return;
        } 

        newNode.next = head;
        head = newNode;

    }

    //pop
    public int pop() {
        if(isEmpty()) {
            return -1; // stack is empty
        }

        int top = head.data;
        head = head.next;
        return top;
    }

    //peek
    public int peek() {
        if(isEmpty()) {
            return -1;
        }

        return head.data;
    }
}
public class Stack_LL {

    public static void main(String args[]) {
        Stack s1 = new Stack();

        s1.push(1);
        s1.push(2);
        s1.push(3);

        while(!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();

        }
    }
  
}
