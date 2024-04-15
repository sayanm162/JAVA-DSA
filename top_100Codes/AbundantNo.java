//Abundant No -> Sum of factors(except the number itself) of the given no greater than the no itself (exc)
import java.util.*;
public class AbundantNo {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int num = sc.nextInt();

        System.out.print(checkAbundant(num));
        sc.close();
    }

    public static boolean checkAbundant(int num) {
       // int temp = num;

        int sum = 0;

        for(int i=1; i<=Math.sqrt(num); i++) {
            if(num%i == 0) {
                if(i==1) {
                    sum += i;
                }

               else if(num/i == i) {
                    sum += i;
                }

                else {
                    sum = sum + i + num/i;
                }
            }
        }

        
        System.out.println("The abundace is : " + (sum - num));
        return sum>num;
    }
    
}
