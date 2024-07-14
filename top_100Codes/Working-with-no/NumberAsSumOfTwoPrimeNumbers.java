/*Java program to represent a number as a sum of two prime numbers. */
import java.util.*;
public class NumberAsSumOfTwoPrimeNumbers{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    calculatePairs(num);
    sc.close();
  }

  public static boolean isPrime(int num) {
    int temp = num;
    
    
    if(temp<=1) {
      return false;
    }

     else if(temp<=3) {
      return true;
    }

     else if(temp%2==0 || temp%3==0) {
      return false;
     }

     else {
      for(int i=5; i*i<=temp; i+=6) {
        if(temp%i==0 || temp%(i+2)==0) {
          return false;
        }
      }
     }


     return true;
  } 



  public static void calculatePairs(int num) {
    if(num<=2) {
      System.out.println("No solution exists");
      return;
    } 

    else if(num%2 != 0) {
      System.out.println("No solution exists");
      return;
    }

    for(int i=2; i<=num/2; i++) {
      int j = num-i;
      if(isPrime(i) && isPrime(j)) {
        System.out.println("Pairs: " + i + ", " + j);
      }
    }

  }

}