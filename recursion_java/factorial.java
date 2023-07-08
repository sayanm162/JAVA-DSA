import java.util.*;
public class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. to find it's factorial: ");
        int num = sc.nextInt();

        System.out.println(calFact(num));       
        sc.close();
    }

    public static int calFact(int n) {
        if(n == 1) {
            return n;
        }
        
        int fact = 1;
        fact = n * calFact(n-1);

        return fact;

    } 
}