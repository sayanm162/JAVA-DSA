import java.util.*;
public class HexaDecimalToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.next();

        System.out.println(hexToDecimal(hex));
        sc.close();
    }

    public static int hexToDecimal(String hex) {
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase(); //temp contains the hexadecimal no only
        int decimal = 0;
        int power = hex.length()-1;

        for(int i=0; i<hex.length(); i++, power--) {
            char c = hex.charAt(i);
            int charVal = digits.indexOf(c);

            decimal += charVal * (int)Math.pow(16, power);
        }


        return decimal;
    }
}