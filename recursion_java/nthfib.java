import java.util.*;
public class nthfib {
    public static void printNth(int count, int n1, int n2) {
        if(count == 1) {
            System.out.print("Nth no is: " + (n2+n1));
            return;
        }
        printNth(count-1, n2, n2+n1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the nth position: ");
        int nPos = sc.nextInt(); //taking nth position to print its value in the sequence
        
        printNth(nPos -2, 0, 1);

        sc.close();
    }
}
