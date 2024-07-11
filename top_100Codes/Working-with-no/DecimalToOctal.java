import java.util.*;
public class DecimalToOctal{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();

        System.out.println(decimalToOctal(decimal));

        sc.close();
    }


    public static int decimalToOctal(int decimal) {
        int temp = decimal;
        int octal = 0;
        int power = 0;
        
        while(temp!=0) {
            int rem = temp%8;
            octal += rem * Math.pow(10, power);
            temp /= 8;
            power++;
        }

        return octal;
    }
}