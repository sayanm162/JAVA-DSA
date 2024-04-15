//GCD or HCF of two numbers using Linear Quest Method
import java.util.*;
public class HCF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print("HCF of " + num1 + " and " + num2 + ": " + findHCF(num1, num2));
        sc.close();
    }

    public static int findHCF(int num1, int num2) {
        int hcf = 0;

        for(int i=1; i<=num1 || i<=num2; i++) {
            if(num1%i==0 && num2%i==0) {
                hcf =i;
            }
        }

        return hcf;

    }
}
