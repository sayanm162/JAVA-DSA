import java.util.*;
public class twoDArrayBasics {

    //function to find out largest and smallest no in 2d array
    public static void getLargestSmallestNo(int array[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++) {
            for(int j=00; j<array[0].length; j++) {
                if(largest < array[i][j]) {
                    largest = array[i][j];
                }
                if(smallest > array[i][j]) {
                    smallest = array[i][j];
                }
            }
        }

        System.out.println("Smallest  no: " + smallest + "\n Largest No: " + largest);
    }

    //function to find out key in the 2d array
    public static boolean searchKey(int array[][], int key) {
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[0].length; j++) {
                if(key == array[i][j]) {
                    System.out.println(key + " found at : row= " + i + " column= " + j);
                    return true;
                }
            }
        }
        System.out.println("Element not found!");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //intializing a 2D array;
        int matrix[][] = new int [3][3];
        int n = matrix.length, m = matrix[0].length;  //n = no. of rows and m = now of columns.

        //taking input into the 2d array
        System.out.println("Enter the elements for the 2d array of size " + n + "X" + m + ":");
        //first loop for selecting the rows and traversing through them
        for(int i=0; i<n; i++) {
            //second loop for selecting the columns in a row and traversing through them
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt(); //selecting the cell at i'th row and j'th column in the 2d array
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

        System.out.print("Enter the key you want to find: ");
        int key = sc.nextInt();
        searchKey(matrix, key);
        sc.close();
        getLargestSmallestNo(matrix);

        
    }
}
