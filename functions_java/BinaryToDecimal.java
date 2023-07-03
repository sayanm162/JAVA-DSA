import java.util.*;
public class BinaryToDecimal {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary no: ");
        int binNum = sc.nextInt();

        BinToDec(binNum);

        sc.close();
    }

    public static void BinToDec(int binNum) {
        int myNum = binNum;
        //initializing the power to zero.
        int pow = 0;  
        
        //initializing the decimal value to zero
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            binNum = binNum / 10;
            pow++;

        }

        System.out.println("Decimal of " + myNum + " is: " + decNum);

    }
    
}
