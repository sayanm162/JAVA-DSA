
//Java program to print sub-arrays from an array and also print the total no of arrays
//and the sub-arrays with maximum sum and minimum sum
public class subArray {
    public static void main(String args[]) {
        int arr[] = {2,4,6,8,10};
        // printPairs(arr);
        printSubArrays(arr);
    }


    public static void printSubArrays(int arr[]) {

/*The reason for initializing int maxSum and minSum with Integer.MIN_VALUE and Integer.MAX_VALUE is to ensure that the first subarray sum that is compared with them will always update them. Integer.MIN_VALUE is the smallest possible value that an int variable can hold, and Integer.MAX_VALUE is the largest possible value that an int variable can hold. Therefore, any subarray sum will be greater than Integer.MIN_VALUE and less than Integer.MAX_VALUE. This way, the maxSum and minSum variables will always store the maximum and minimum sum of any subarray seen so far. */

/*The reason for initializing maxStart, maxEnd, minStart and minEnd with -1 is to indicate that they have not been assigned any valid index value yet. Since the array indices start from 0, any negative value can be used to represent an invalid index. This way, if the array is empty or has only one element, the maxStart, maxEnd, minStart and minEnd variables will remain -1 and not point to any subarray. */
        int totalSubArrays = 0;
        int sum = 0;

        int maxSum = Integer.MIN_VALUE;
        int maxStart = -1;
        int maxEnd = -1;

        int minSum = Integer.MAX_VALUE;
        int minStart = -1;
        int minEnd = -1;
        
        
        //outer loop for traversing the array from start to end --- 
        for(int i=0; i<arr.length; i++){
            //inner loop for marking the end of sub-array for each iteration.
            for(int j=i; j<arr.length; j++) {
                //inner loop printing all one sub-array at a time from start to end index
                for(int k=i; k<=j; k++) {
                     sum = sum + arr[k];
                    System.out.print(arr[k] + " ");
                    

                }
                
                totalSubArrays++;
                System.out.println();
                //System.out.println("Sum of elements in the sub-array: " + sum);
                if(sum<minSum) {
                    minSum = sum;
                    minStart = i;
                    minEnd = j;
                }
                if(sum>maxSum) {
                    maxSum = sum;
                    maxStart=i;
                    maxEnd = j;
                }
                sum = 0; // resetting the sum to 0
            }
            System.out.println();
        }

        System.out.println("Total no of sub-array: " + totalSubArrays);

        System.out.println("Sub array with maximum sum is: " + maxSum);
        //printing the sub array with maximum sum
        for(int i=maxStart; i<=maxEnd; i++) {
                System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.println("Sub array with minumum sum is: " + minSum);
        //printing the sub array with minimum sum
        for(int i=minStart; i<=minEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }

   
}
