/*Add two functions using Java
 * Concept
 For understanding this in a better way lets suppose an example :

 Suppose, First fraction consist of 1 as numerator and 3 as denominator, and Second fraction consist of 3 as numerator and 9 as denominator.

 (1 / 3) + (3 / 9) = (6 / 9) = (2 / 3)

Find LCM of 3 and 9 and the result will be 9.
Multiply 3 in first fraction : (3 / 9) + (3 / 9)
Add both fractions and then the result will be : (6 / 9)
Now simplify it by finding the HCF of 6 and 9 and the result will be 3.
So divide 6 and 9 by 3 and then the result will be : (2 / 3)
This will be your simplified answer for the given problem.


Algorithm
Initialize variables of numerator and denominator
Take user input of two fraction
Find numerator using this condition (n1*d2) +(d1*n2 ) where n1,n2 are numerator and d1 and d2 are denominator
Find denominator using this condition (d1*d2) for lcm
Calculate GCD of a this new numerator and denominator
Display a two value of this condition x / gcd, y/gcd

 */

 import java.util.*;
 public class FractionAddition{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //for fraction 1
       System.out.println("Numerator1 value: ");
       int num1 = sc.nextInt();
       System.out.println("Denominator 1 value: ");
       int den1 = sc.nextInt();

       //for fraction 2
       System.out.println("Numerator 2 value: ");
       int num2 = sc.nextInt();
       System.out.println("Denominator 2 value: ");
       int den2 = sc.nextInt();

       int result_fraction[] = additionFraction(num1, den1, num2, den2);
       System.out.println("(" + result_fraction[0] + "/" + result_fraction[1] + ")");
       sc.close();
   }

   public static int lcm(int num1, int num2) {
       int temp1 = num1;
       int temp2 = num2;

       while(temp1 != temp2) {
         if(temp1>temp2) {
           temp1 -= temp2;
         }
         else {
           temp2 -= temp1;
         }
       }

       int hcf = temp1;

       int lcm = num1*num2/hcf;

       return lcm;
   }

   public static int[] additionFraction(int num1, int den1, int num2, int den2) {
     int lcm = lcm(den1, den2);
     int fact1 = lcm/den1;
     int fact2 = lcm/den2;

     num1 *= fact1;
     num2 *= fact2;

     int resultNum = num1 + num2;
     //simplifying the numerator and denominator
     int gcd = resultNum*lcm/lcm(resultNum, lcm);
     resultNum /= gcd;
     lcm /= gcd;

     int result[] = {resultNum, lcm};
     return result;
   }
 }