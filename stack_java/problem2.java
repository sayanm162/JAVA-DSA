//reversing a string using a stack
import java.util.*;
public class problem2 {
    public static void main(String args[]) {
        java.util.Stack<Character> s = new java.util.Stack<>();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int idx = 0;
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder newStr = new StringBuilder("");
        while(!s.isEmpty()) {
            newStr.append(s.pop());
        }

        
        System.out.println(newStr.toString());

        sc.close();
    }
    
}
