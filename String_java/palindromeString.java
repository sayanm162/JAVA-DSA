import java.util.*;
public class palindromeString {

    public static boolean checkPalindrome(String str) {
        //comparing from both ends upto to middle of the string
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = sc.next();

        System.out.println(checkPalindrome(str));
        sc.close();
    }
    
}
