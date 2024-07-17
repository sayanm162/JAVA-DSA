
/*Find Number of integers which has exactly x divisors using java
Our Aim is to find the Number of integers which has exactly X divisors using Java programming language.

In This program the user gives  a range and the number of divisors(say N), and divisors of every number in between the range are counted and compared with N. */
import java.util.*;

public class NoOfIntegersWithXDivisors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of No from 1 to : ");
        int range = sc.nextInt();
        System.out.print("Enter the no of divisors you seek: ");
        int divisors = sc.nextInt();
        System.out.println("No of such numbers is: " + count(range, divisors));

        sc.close();
    }

    public static int count(int range, int divisors) {
        int count = 0;
        for (int i = 1; i <= range; i++) {
            int countFactors = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    countFactors++;
                }
            }
            if (countFactors == divisors) {
                count++;
            }

        }
        return count;
    }

}