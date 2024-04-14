//Automorphc No ->> A no. when squared ends with the no. itself
import java.util.*;
public class AutomorphicNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();

        boolean res = checkAutomorphic(num);
        if(res) {
            System.out.println("Yes, Automorphic");
        }
        else 
            System.out.println("Not automorphic");
        sc.close();
    }

    public static boolean checkAutomorphic(int num) {
        int sqre = num*num;
        int temp = num;

        while( temp != 0) {
            if(temp%10 != sqre%10) {
                return false;
            }
            temp /= 10;
            sqre /= 10;
        }

        return true;
    }
}
