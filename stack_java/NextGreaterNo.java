//finding out the next greater no in an array using stack
import java.util.Stack;
import java.util.Arrays;
public class NextGreaterNo {
    
    public static void main(String args[]) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                nextGreater[i] = -1;
            }
            else {
                nextGreater[i] = arr[s.peek()];
            }

            s.push(i);
        }



        System.out.println(Arrays.toString(nextGreater));
    }
}
