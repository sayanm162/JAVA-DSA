import java.util.*;
public class BinaryToOctal{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();

        System.out.println(convertBinaryToOctal(binary));

        sc.close();
    }

    public static int convertBinaryToOctal(int binary) {
        //converting binary to decimal
        int temp = binary;
        int decimal = 0;
        int power = 0;

        while(temp!=0) {
            int rem = temp%10;
            decimal += rem * Math.pow(2, power++);
            temp /= 10;
        }

        //converting decimal to octal
        int octal = 0;
        int O_power = 0;


        while(decimal !=0) {
            int rem = decimal%8;
            octal += rem * Math.pow(10, O_power++);
            decimal /= 10;
        }

        return octal;
    }
}