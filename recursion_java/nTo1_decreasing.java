
import java.util.*;
public class nTo1_decreasing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range to print n to 1 in decreasing order: ");
        int range =  sc.nextInt();

        printDec(range);

        sc.close();
    }

    public static void printDec(int n) {

        if(n == 1) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        printDec(n-1);
    }
}
