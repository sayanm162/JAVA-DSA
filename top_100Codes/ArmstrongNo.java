//Armstrong No -> Sum of order of the digts of the digits == number
import java.util.*;
public class ArmstrongNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int n = sc.nextInt();
		
		System.out.println("Armstrong No: " + checkArmstrong(n));
		sc.close();
	}
	
	public static int order(int n) {
	    int count = 0;
	    
	    while(n!=0) {
	        n/=10;
	        count++;
	    }
	    
	    return count;
	}
	
	public static boolean checkArmstrong(int n) {
	    int sum = 0;
	    int temp = n;
	    
	    while(temp!=0) {
	        int rem = temp%10;
	        sum = sum + (int)Math.pow(rem,order(n));
	        temp /= 10;
	    }
	    
	    return n == sum;
	}
}
