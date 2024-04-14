//Program to check armstrongg no in a range 
import java.util.*;
public class CheckArmstrongInRange
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Range: ");
		int start = sc.nextInt();
		System.out.println("Enter End Range: ");
		int end = sc.nextInt();
	
		
		for(int i=start; i<=end; i++) {
		    if(checkArmstrong(i)) {
		        System.out.println(i + " ");
		    }
		}
		
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
