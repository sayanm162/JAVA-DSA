import java.util.*;
public class FactorsNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		getFactors(num);
		sc.close();
	}
	
	public static void getFactors(int num) {
	    boolean flag = false;
	    int i;
	    for( i=1; i<=Math.sqrt(num); i++) {
	        if(num%i==0) {
	            System.out.print(i + ", ");
	        }
	        
	        if(num/i == i) {
	            flag = true;
	        }
	    }
	    
	    if(flag) {
	        i -= 2;
	    }
	    
	    for(;i>1; i--) {
	        if(num%i == 0) {
	            System.out.print(num/i + ", ");
	        }
	    }
	}
}
