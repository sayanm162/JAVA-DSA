//Harshad No -> Number divided by the sum of it's digits

import java.util.*;
public class harshadNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println(checkHarshad(num));

        sc.close();
    }

    public static boolean checkHarshad(int num) {
        int temp = num;
        int sum = 0;
        while(temp != 0) {
            int rem = temp%10;
            sum += rem;
            temp /= 10;
        }

        return num%sum==0;
    }
}
