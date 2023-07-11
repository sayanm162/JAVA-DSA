
import java.util.*;
public class fibo_loop {
    public static void printFibo(int count) {
    int num1 = 0, num2 = 1, num3;
    System.out.print(num1 + " " + num2);
    for(int i=3; i<=count; i++) {
        num3 = num1 + num2;
        System.out.print(" " + num3);
        num1 = num2;
        num2 = num3;
    }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count:"); // for printing fibonacci series till the count
        int range = sc.nextInt();

        printFibo(range);
        sc.close();
    }
}
