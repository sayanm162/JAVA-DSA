public class diagonalSum {

    //optimised approach to calculate diagonalSum
    public static int getdiagonalSumOptimized(int matrix[][]) {
        int sum=0;
        for(int i=0; i<matrix.length; i++) {
            //for primary diagonal
            sum += matrix[i][i];

            //for secondary diagonal
            if( i != matrix.length-1-i)
                sum += matrix[i][matrix.length-1-i];
        }

        return sum;
    }

    //function to calculate the diagonal sum
    public static int getdiagonalSum(int matrix[][]) {
        int Prisum=0;
        int Secsum=0;
        int overlappingEl = 0;
        int check1 = 0;
        int check2 = 0;
        //traversing through the 2d array, for finding the  
        for(int i=0; i<matrix.length; i++) {  //time complexity = 0(n^2)
            for(int j=0; j<matrix[0].length; j++) {
                if(i == j) {
                  check1 = matrix[i][j]; 
                  Prisum += matrix[i][j];  
                }
                if(i + j == matrix.length-1) {
                    check2 = matrix[i][j];
                    Secsum += matrix[i][j];
                }
                if(check1 == check2) {
                    overlappingEl = check1;
                }
            }
        }
        if(matrix.length % 2 != 0) {
            Secsum -= overlappingEl;
        }

        int dSum = Prisum + Secsum;


        return dSum;

    }
    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},    
                          {9,10,11,12,},
                          {13,14,15,16}};
        
        int matrix2[][] = {{1,2,3},
                          {5,6,7},    
                          {9,10,11},
                        };

          System.out.println("Sum of diagonals: " + getdiagonalSum(matrix));
          System.out.println("Sum of diagonals in matrix2:  " + getdiagonalSum(matrix2));

          System.out.println("Optimized apprach for even matrix: "  + getdiagonalSumOptimized(matrix));
          System.out.println("Optimized approach: odd matrix: " + getdiagonalSumOptimized(matrix2));
    }

  
}
