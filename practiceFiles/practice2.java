//Program in java to calculate max and min sum of subarray of an array using prefix array
public class practice2 {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};
       
        maxMinSubArrays(arr);
    }


    public static void maxMinSubArrays(int arr[]) {
        
        int currSum = 0;
        int prefix[] = new int[arr.length];
        //calculate the prefix array.
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
       
        
        
        //outer loop for traversing the array from start to end --- 
        for(int i=0; i<arr.length; i++){
            int start = i; //marks the starting index for the sub array
            //inner loop for marking the end of sub-array for each iteration.
            for(int j=i; j<arr.length; j++) {
                int end = j; //marks the ending index for the sub array
                
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                
               
                if(currSum<minSum) {
                    minSum = currSum;
                    
                }
                if(currSum>maxSum) {
                    maxSum = currSum;
                   
                }
                currSum = 0; // resetting the sum to 0
            }

            }

            System.out.println("max sum is: " + maxSum);
            System.out.println("min sum is: " + minSum);
        }

      
    }

   
