import java.util.*;
public class twoDArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //intializing a 2D array;
        int matrix[][] = new int [3][3];
        int n = matrix.length, m = matrix[0].length;  //n = no. of rows and m = now of columns.

        //taking input into the 2d array
        System.out.println("Enter the elements for the 2d array of size " + n + "X" + m + ":");
        //first loop for selecting the row and traversing through it
        for(int i=0; i<n; i++) {
            //second loop for selecting the column and traversing through it
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements in the 2d array are as follows: ");
        //for printing the elements in the 2d array
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        sc.close();
    }
}
