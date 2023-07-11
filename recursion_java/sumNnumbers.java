//sum of first n natural numbers
import java.util.*;
public class sumNnumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Value of no.: ");
        int rangeNum = sc.nextInt();

        System.out.println(sumOfNnum(rangeNum));

        sc.close();
    }

    public static int sumOfNnum(int n) {
        if(n == 1) {
            return 1;
        }

        int sum = 0;
        sum = n + sumOfNnum(n-1); 
        return sum;   
    
    }
}
