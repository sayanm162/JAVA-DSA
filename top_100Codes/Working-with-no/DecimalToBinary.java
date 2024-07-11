import java.util.*;
public class DecimalToBinary {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();

        System.out.println(decimalToBinary(dec));

        sc.close();
    }

    public static int decimalToBinary(int dec) {
        int temp = dec;
        int power = 0;
        int binary = 0;
        while(temp!=0) {
            int rem = temp%2;
            binary += rem * Math.pow(10, power);
            temp /= 2;
            power++;
        }

        return binary;

    }
}
