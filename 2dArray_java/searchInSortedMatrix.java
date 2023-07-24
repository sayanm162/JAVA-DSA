//Search for a key in row-wise and column-wie sorted matrix.
public class searchInSortedMatrix {
    //stair case approach
    //function to search for key in sorted matrix.
    public static boolean stairCaseSearch(int matrix[][], int key) {
        int row=0, col=matrix[0].length-1;  //taking the top right corner as the starting point
        while(row<=matrix.length-1 && col>=0) {
            if(matrix[row][col] == key) {
                System.out.println("Key found at index:" + row +","+col);
                return true;
            }
            else if(key<matrix[row][col]) {
                col--;
            }
            else if(key>matrix[row][col]) {
                row++;
            }

        }
        System.out.println("Not found!");
        return false;
        
    
    } 
    public static void main(String args[]) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};

        int key = 33;
        stairCaseSearch(matrix, key);
    }
}
