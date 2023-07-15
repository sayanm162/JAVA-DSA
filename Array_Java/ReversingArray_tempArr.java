//Reversing an array using another temporary array.
import java.util.*;
public class ReversingArray_tempArr{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the size of the array: ");
       int arrSize = sc.nextInt();

       int arr[] = new int[arrSize];

       System.out.print("Enter the elements in the array: ");
       //loop for storing the elements in array
       for(int i=0; i<arrSize; i++) {
            arr[i]=sc.nextInt();
       }

       reverseArray(arr);
       sc.close();
    }
 
    //implementation one using another temporary array; but this requires extra space, 
    //Timne Complexity = O(n), Space Complexity = O(2n); for two arrays

    public static void reverseArray(int arr[]) {
        int rev_arr[] = new int[arr.length]; //new array for reverse of the original copy
        int rev_size = arr.length;

        for(int i=0; i<rev_size; i++) {
            rev_arr[i] = arr[arr.length-1-i]; // arr[0] = arr[5-1-0]  elemnents are stored in a reverse fashion
        }
        
        //printing the array
        for(int i=0; i<rev_size; i++) {
            System.out.print(rev_arr[i] + " ");
        }
        
    }

   

    
 }
