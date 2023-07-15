
import java.util.*;
public class ReverseArray {
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

       reverseArray2(arr);
       sc.close();
    }
 
   

    //implementation two, --optimized-- we will store in the same array by swapping the no's
    //Here space complexity is O(n) since the same array is used.
    //Here the time complexity is O(n/2), since we do not need to traverse the whole array in this process
    public static void reverseArray2(int arr[]) {
        int start=0, end=arr.length-1;

        for(int i=start; i<=end; i++) {
            int temp = arr[start];   //storing the value at index 0 in a temp variable
            arr[start] = arr[end]; // storing the value of last index in index 0
            arr[end] = temp; //storing the starting value at last index.

            start++; // moving on to the next element in the array from the start
            end--; //moving on to the next element in the array from the end
        }

        //loop for printing the array

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }

    
 }

