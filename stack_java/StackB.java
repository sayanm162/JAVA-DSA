//implementing stack using arrayList
import java.util.*;
 class Stack{
         ArrayList<Integer> list = new ArrayList<>();
        public  boolean isEmpty() {
            return list.size() == 0; // is list size is 0 -> true or else false
        }

        //push
        public void push(int data) {
            list.add(data); //add to last index = top of the index O(1)
        }

        //pop
        public  int pop() {
            if(isEmpty()) {
                return -1; //represent stack is empty - > corner case
            }
            int top = list.get(list.size()-1);   //single operation O(1) -> constant time operation
            list.remove(list.size()-1);
            return top;  // remove opertion for remove element from top or lost index is also constant time single operation - O(1)
        }

        //peek
        public  int peek() {
             if(isEmpty()) {
                return -1; //represent stack is empty - > corner case
            }
            return list.get(list.size()-1);  //constant single operation O(1)
        }

    }
    

public class StackB {
    

    public static void main(String args[]) {
        Stack S1 = new Stack();
        S1.push(1);
        S1.push(2);
        S1.push(3);

        while(!S1.isEmpty()) {
            System.out.println(S1.peek());
            S1.pop();
        }

         Stack S2 = new Stack();
        S2.push(4);
        S2.push(4);
        S2.push(4);

        while(!S2.isEmpty()) {
            System.out.println(S2.peek());
            S2.pop();
        }
    }
}