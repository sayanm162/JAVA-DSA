//password Checker
/* 
 You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption:
Input string will not be empty.

Example:

Input 1:
aA1_67
Input 2:
a987 abC012

Output 1:
1
Output 2:
0
 */
import java.util.*;
public class Problem2 {

    public static int CheckPassword(String str, int n) {
        if(n<4) {
            return 0;
        }
        if(str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return 0;
        } 
        int cap = 0;
        int num = 0;
        for(int i = 0; i<n; i++) {
            if(str.charAt(i) == ' ' || str.charAt(i) == '/') {
                return 0;
            }
            if(str.charAt(i) >= 'A' && str.charAt(i) <='Z'){
                cap++;
            }
            if(str.charAt(i) >= '0'  && str.charAt(i) <= '9') {
                num++;
            }

        }

        if(num>0 && cap>0) {
            return 1;
        }

        return 0;
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String password = sc.nextLine();
      int size = password.length();

      CheckPassword(password, size);
      sc.close();
     
    
    }
}
