import java.util.*;
public class DecimalToBinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Decimal No: ");
        int decNo = sc.nextInt();

        System.out.println("Binary form of " + decNo + " is: " + DecToBin(decNo));

        sc.close();
    }

    public static int DecToBin(int decNo) {
        
        int pow = 0;
        int binNo = 0;
        while(decNo> 0) {
            int rem = decNo % 2;
            decNo = decNo/2;
            binNo = binNo + (rem*(int)Math.pow(10, pow));
            pow++;
        }
        return binNo;
    }
}
