
/* Java Program to find the roots of a quadratic equation*/
import java.util.*;

public class QuadraticRoots {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Equation: ax^2 + bx + c");
        System.out.println("Enter the value of a, b and c in order: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        roots(a, b, c);

        sc.close();
    }

    public static void roots(int a, int b, int c) {
        if (a == 0) {
            System.out.println("Invalid quadratic equation");
            return;
        }

        int d = b * b - 4 * a * c;
        double sqrt_val = Math.sqrt(Math.abs(d));

        if (d > 0) {
            System.out.println("Roots are real and different");
            System.out
                    .println("Root1: " + ((double) (-b + sqrt_val) / 2 * a) + " Root2: "
                            + ((double) (-b - sqrt_val / 2 * a)));
        }

        else if (d == 0) {
            System.out.println("Roots are real and same");
            System.out.println("Root1: " + ((double) (-b / 2 * a) + " Root2: " + ((double) (-b / 2 * a))));
        }

        else {
            System.out.println("Roots are imaginary");
            System.out
                    .println("Root1: " + (double) (-b / 2 * a) + "+i" + (sqrt_val) + " Root2: " + (double) (-b / 2 * a)
                            + "-i" + (sqrt_val));

        }
    }
}