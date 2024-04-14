import java.util.*;
public class Fibonacci
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Give the nth term: ");
		int n = sc.nextInt();
		System.out.println("The fibonacci series is printed as follows: ");
		printFibo(n);
		sc.close();
		
		
	}
	
	public static void printFibo(int n) {
	    int n1 = 0;
	    int n2 = 1;
	    
	    System.out.print(n1 + " " + n2 + " ");
	    int n3=0;
	    
	    for(int i=3; i<=n; i++) {
	        n3 = n1+n2;
	        System.out.print(n3 + " ");
	        n1=n2;
	        n2=n3;
	    }
	}
}