//Java program to calculate the number of permutations of how n people can occupy r seats.
/* Input number of students in n
Input number of seats in r
Use permutation formula { factorial(n) / factorial(n-r) }
Print Output */

/* Problem Statement -> 
 *In a classroom some of the seats are already occupied by students and 
 only a few seats are available in the classroom. 
 The available seats are assumed as r and n number of students are looking for the seat. 
 We need to find in how many different permutations n number of students can sit on r number of chairs.
 */

 import java.util.*;
 public class PersonSeatPermutation{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of person");
        int person_no = sc.nextInt();
        System.out.println("Enter the numbers of available seats:");
        int seats = sc.nextInt();
        
        System.out.println(calculatePermutation(person_no, seats));
        sc.close();
    }

    public static int factorial(int number) {
        int result = 1;
        int i=number;
        while(i>=1){
            result *= i;
            i--;
        }
        return result;
    }

    public static int calculatePermutation(int person_no, int seats) {
        int permutation = factorial(person_no)/factorial(person_no-seats);
        return permutation;
    }
 }