//Java program for converting Binary number to decimal no.
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary no: ");

        int binary = sc.nextInt();

        //declaring the decimal no
        int decimal = 0;
        //declaring the power to which value of 2 is to be raised
        int n = 0;

        while(binary>0) {
            int temp = binary%10;
            decimal += temp*Math.pow(2, n);
            binary /= 10;
            n++;
        }

        System.out.print("The decimal value of " + binary + " is: " + decimal);

        sc.close();
    }
}
