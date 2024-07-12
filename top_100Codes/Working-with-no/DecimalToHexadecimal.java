import java.util.*;
public class DecimalToHexadecimal{
    public static void main(String argss[]) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();

        System.out.println(convertDecToHex(decimal));

        sc.close();
    }


    public static String convertDecToHex(int decimal) {
        int temp = decimal;
        String hex = "";
        String hexDigits = "0123456789ABCDEF";

        while(temp!=0){
            int rem = temp%16;
            hex = hexDigits.charAt(rem) + hex;
            temp /= 16;
        }

        if(hex.equals("")) {
            hex = "0";
        }

        return hex;
    }
}