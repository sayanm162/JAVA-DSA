import java.util.*;
public class OctalToBinary{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int octal = sc.nextInt();

        System.out.println(convertOctalToBinary(octal));
        sc.close();
    }

    public static int convertOctalToBinary(int octal) {
        //converting octal to decimal
        int temp = octal;
        int power = 0;
        int decimal = 0;

        while(temp!=0) {
            int rem = temp%10;
            decimal += rem * Math.pow(8, power++);
            temp /= 10;
        }

        //converting decimal to binary
        power = 0;
        int binary = 0;

        while(decimal != 0) {
            int rem = decimal%2;
            binary += rem * Math.pow(10, power++);
            decimal /= 2;
        }

        return binary;
    }
}