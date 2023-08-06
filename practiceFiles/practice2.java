//Program in java to calculate max and min sum of subarray of an array using prefix array
import java.util.*;
public class practice2 {
    public static int LargestSmallSum(int arr[]) {
        if(arr == null || arr.length<=3) {
            return 0;
        }
        //initialize the variables with extreme values
        int largestEven = Integer.MIN_VALUE;
        int smallestOdd = Integer.MAX_VALUE;
        int secondLargestEven = Integer.MIN_VALUE;
        int secondSmallestOdd = Integer.MAX_VALUE;
    
       for(int i=0; i<arr.length; i++) {
           //check the index, not the element, for even or odd position
           //consider 0th position as even
           if(i%2 != 0) {
               //update the largest even element
               if(arr[i] > largestEven) {
                   largestEven = arr[i];
               }
               //update the second largest even element
               else if(arr[i] > secondLargestEven && arr[i] < largestEven) {
                   secondLargestEven = arr[i];
               }
           }
           else {
               //update the smallest odd element
               if(arr[i] < smallestOdd) {
                   smallestOdd = arr[i];
               }
               //update the second smallest odd element
               else if(arr[i] < secondSmallestOdd && arr[i] > smallestOdd) {
                   secondSmallestOdd = arr[i];
               }
           }
       }
    
       return secondLargestEven + secondSmallestOdd;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(LargestSmallSum(arr));
        sc.close();
    }
    }

   
