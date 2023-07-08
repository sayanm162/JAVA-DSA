import java.util.*;

public class nTo1_increasing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range to print no from n to 1 in increasing order: ");
        int range = sc.nextInt();
        printInc(range);
        sc.close();
    }

    public static void printInc(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        printInc(n - 1);
        System.out.print(n + " ");
    }
}