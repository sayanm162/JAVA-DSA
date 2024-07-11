import java.util.*;
public class OctalToDecimal{
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int octal = sc.nextInt();

        System.out.println(octalToDecimal(octal));

        sc.close();
    }

    public static int octalToDecimal(int octal) {
        int temp = octal;
        int power = 0;
        int decimal = 0;

        while(temp!=0) {
            int rem = temp%10;
            decimal += rem * Math.pow(8, power);
            temp /= 10;
            power++;
        }

        return decimal;
    }
}