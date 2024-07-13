//Java program to determine the quadrant in which the co-oridnate lies
import java.util.*;
public class CheckingQuadrant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of X: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of Y");
        int y = sc.nextInt();

        checkQuadrant(x, y);

        sc.close();
    }

    public static void checkQuadrant(int x, int y) {
        //origin
        if(x==0 && y==0) {
            System.out.println("Origin");
        }
        //on x-axis
        else if(x!=0 && y==0) {
            System.out.println("On X-axis");
        }
        //on y-axis
        else if(x==0 && y!=0) {
            System.out.println("On Y-axis");
        }
        //1st Quad
        else if(x>0 && y>0) {
            System.out.println("1st Quadrant");
        }
        //2nd Quad
        else if(x>0 && y>0) {
            System.out.println("2nd Quadrant");
        }
        //3rd Quad
        else if(x<0 && y<0) {
            System.out.println("3rd Quadrant");
        }
        //4th Quadrant
        else if(x>0 && y<0) {
            System.out.println("4th Quadrant");
        }

    }
}