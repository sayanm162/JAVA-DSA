import java.util.*;
public class fiboRecur {
    public static void printFibo(int n1, int n2, int count) {
       if(count> 0) {int n3 = n1 + n2;
        System.out.print(" " + n3);
        printFibo(n2, n3, count-1); }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int count = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2);

        printFibo(n1, n2, count-2);
        sc.close();

    }
}
