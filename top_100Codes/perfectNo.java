
//A Number that can be represented as the sum of it's factors except the number itself is known as the Perfect Number.
import java.util.*;
public class perfectNo {
    public static void main(String[] args) {
        System.out.println("Enter the no");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(checkPerfect(num)) {
            System.out.println("Perfect NO.");
        }
        else {
            System.out.println("Not a perfect no");
        }

        sc.close();
    }
    

    public static boolean checkPerfect(int num) {
        int sum = 0;

        for(int i=1; i<=Math.sqrt(num); i++) {
            if(num%i==0) {
                if(i==1) {
                    sum = sum + i;  // when i = 1 and other factor is the no itself, we add only i and not the number. 1*100=100
                }

                else if(i == num/i) {
                    sum = sum + i;  // when both the factors are the same. we consider only one. 10*10=100
                }

                else {
                    sum = sum + i + num/i;  //for other factors, we consider both the factors eg. 2*50 = 100, 4*25=100
                }
            }
        }
        if(num == sum) {
            return true;
        }
        return false;
    }

   
}
