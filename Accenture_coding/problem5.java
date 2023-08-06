/*Implement the following Function 

def differenceofSum(n. m)

The function accepts two integers n, m as arguments Find the sum of all numbers in range from 1 to m(both inclusive) that are not divisible by n. Return difference between sum of integers not divisible by n with sum of numbers divisible by n.

Assumption:

n>0 and m>0
Sum lies between integral range
Example

Input
n:4
m:20
Output
90

Explanation

Sum of numbers divisible by 4 are 4 + 8 + 12 + 16 + 20 = 60
Sum of numbers not divisible by 4 are 1 +2 + 3 + 5 + 6 + 7 + 9 + 10 + 11 + 13 + 14 + 15 + 17 + 18 + 19 = 150
Difference 150 – 60 = 90
Sample Input
n:3
m:10
Sample Output
19 */
import java.util.*;
public class problem5 {
    public static int func(int n, int m) {
        //printing no.s from 1 to m (both inclusive) 
        int divisible = 0;
        int non_div=0;
        for(int i=1; i<=m; i++) {
            if(i % n == 0) {
                divisible = divisible + i;
            }

           else if(i%n != 0) {
                non_div = non_div + i;
            }
        }

        int diff=non_div-divisible;
        return diff;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(func(n, m));
    }
}
