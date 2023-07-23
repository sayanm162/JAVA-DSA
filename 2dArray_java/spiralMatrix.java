/*Spiral matrix is a matrix that is arranged in a spiral order. It is a 2D array that is printed in spiral form. The elements of the matrix are printed in clockwise order starting from the top left corner of the matrix and moving towards the center of the matrix. */
public class spiralMatrix {
    //method to print get the spiral matrix
    /*This is a Java code that prints a given matrix in spiral form. The method printSpiralMatrix takes a 2D array as input and prints the elements of the matrix in spiral form. The code uses four variables to keep track of the boundaries of the matrix: startRow, endRow, startCol, and endCol. The while loop runs until the startRow is less than or equal to endRow and startCol is less than or equal to endCol.

The code then prints the top boundary of the matrix from left to right, followed by the right boundary from top to bottom, then the bottom boundary from right to left, and finally the left boundary from bottom to top. The code then updates the boundaries and continues until all elements have been printed.
The first four lines initialize the variables that keep track of the boundaries of the matrix. The while loop runs until all elements have been printed.

The first for loop prints the top boundary of the matrix from left to right. The second for loop prints the right boundary of the matrix from top to bottom. The third for loop prints the bottom boundary of the matrix from right to left. The fourth for loop prints the left boundary of the matrix from bottom to top.

The four if statements check if we have reached a single row or column in which case we don’t need to print that row or column again.

Finally, we update our boundaries by incrementing/decrementing our variables. */
    public static void printSpiralMatrix(int arr[][]) {
        int startRow = 0;
        int endRow = arr.length-1;
        int startCol = 0;
        int endCol = arr[0].length-1;

        while(startRow<=endRow && startCol<=endCol) {
            //top boundary
            for(int j=startCol; j<=endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            //left boundary
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            //bottom boundary
            for(int j=endCol-1; j>=startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }

            //left boundary
            for(int i=endRow-1; i>=startRow+1; i--) {
                  if(startCol == endCol) {
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        } 
    }
    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},    
                          {9,10,11,12,},
                          {13,14,15,16}};

        printSpiralMatrix(matrix);
    }
}
