//Given Two integer inputs as the numbers, the objective is to check whether the ratio of the sum of the factors of the number except the number itself upon the number, of the both numbers, matches or not
import java.util.*;
public class FriendlyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two no's to check whether Friendly Pair or not: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print(checkFriendlyPair(num1, num2));
        sc.close();
    }

    public static int getFactorSum(int num) {

        int sum = 0;

        for(int i=1; i<=Math.sqrt(num); i++) {
            if(num%i == 0) {
                if(i==1) {
                    sum += i;
                }

                else if(num/i  == i) {
                    sum += i;
                }

                else {
                    sum = sum + i + num/i;
                }

            }
        }

        return sum;
    }

    public static boolean checkFriendlyPair(int num1, int num2) {
        int sum1 = getFactorSum(num1);
        int sum2 = getFactorSum(num2);

        return sum1/num1 == sum2/num2;
    }
}
