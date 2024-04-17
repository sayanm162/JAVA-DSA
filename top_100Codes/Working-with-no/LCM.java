//LCM of two no is the least common multiple which can divisible by both the numbers
import java.util.*;
public class LCM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print("The LCM of " + num1 + ", " + num2 + " is: " + calLCM(num1, num2));

        sc.close();
    }

    public static int calLCM(int num1, int num2) {
        //finding the larger no. here
        int max = (num1>num2) ? num1 : num2;
        int lcm = 0;

        //LCM will always be >= max(num1, num2) 
        //Largest possible lcm will be num1*num2

        for(int i=max; i<=num1*num2; i++) {
            if(i%num1==0 && i%num2==0) {
                lcm = i;
                break;
            }
        }
            return lcm;
    }
}
