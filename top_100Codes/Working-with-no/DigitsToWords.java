
/*Java program to convert digits to words */
import java.util.*;

public class DigitsToWords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(convertToWords(num));
        sc.close();

    }

    public static String convertToWords(int num) {
        if (num < 0 || num > 999) {
            return "Not Valid";
        }

        String str = "";

        String onesTens[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        String Tens[] = { "", onesTens[10], "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty",
                "Ninety" };
        String hun = "Hundred";

        if (num == 0) {
            return "Zero";
        } else if (num < 20) {
            return onesTens[num];
        }

        else if (num <= 99) {
            int unitPlace = num % 10;
            int digit = num / 10;
            int tensPlace = digit % 10;

            str = Tens[tensPlace] + " " + onesTens[unitPlace];
            return str;

        }

        else if (num <= 999) {
            int unitPlace = num % 10;
            int digit = num / 10;
            int tensPlace = digit % 10;
            digit /= 10;
            int hundPlace = digit % 10;

            str = onesTens[hundPlace] + " " + hun + " " + Tens[tensPlace] + " " + onesTens[unitPlace];
            return str;
        }
        return "null";
    }

}