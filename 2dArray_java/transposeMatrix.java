public class transposeMatrix {

    //function to transpose a matrix/rotate by 90 degrees
    public static void getTranspose(int matrix[][]) {
        //creating a new transpose matrix having dimensions  opposite to that of original matrix.
        int matrix_rows_size = matrix.length;
        int matrix_col_size = matrix[0].length;
        int transpose[][] = new int[matrix_col_size][matrix_rows_size];
        //traversing the main matrix
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];   //transpose[0,1] = matrix[1,0]
            }
        }

        //printing the reverse of the matrix
        for(int i=0; i<transpose.length; i++) {
            for(int j=0; j<transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();   
        }
    }
    public static void main(String args[]) {
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        getTranspose(matrix);
    }
}
