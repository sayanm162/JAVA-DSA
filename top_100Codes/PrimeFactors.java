import java.util.*;
public class PrimeFactors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No: ");
        int num = sc.nextInt();  //no stored to print its prime factors
        System.out.println("The prime factors of " + num + " are: ");
        getPrimeFactors(num);
        sc.close();

    }

    public static boolean isPrime(int num) {
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void getPrimeFactors(int num) {
        for(int i=2; i<=num; i++) {
            if(isPrime(i) && num%i==0) {
                int temp = num;
                while(temp%i==0) {
                    System.out.print(i + " ");
                    temp /= i;
                }
            }
        }
    }
}
