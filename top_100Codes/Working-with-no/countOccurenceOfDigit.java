
/*Java program to count the occurence of a digit in a given input number */
import java.util.*;

public class countOccurenceOfDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No: ");
        int num = sc.nextInt();
        System.out.println("Enter the digit to counts its occurence");
        int digit = sc.nextInt();

        System.out.println(countOccurence(num, digit));
        sc.close();
    }

    public static int countOccurence(int num, int digit) {
        int temp = num;
        int count = 0;
        while (temp != 0) {
            int rem = temp % 10;
            if (rem == digit) {
                count++;
            }
            temp /= 10;
        }

        return count;
    }
}