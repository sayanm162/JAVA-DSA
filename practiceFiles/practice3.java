    printSubArrays(arr);
}


public static void printSubArrays(int arr[]) {
    int totalSubArrays = 0;
    int sum = 0;
    
    // declare variables to store the maximum and minimum sum and their subarray indices
    int maxSum = Integer.MIN_VALUE;
    int minSum = Integer.MAX_VALUE;
    int maxStart = -1;
    int maxEnd = -1;
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
            System.out.println("Sum of elements in the sub-array: " + sum);
            
            // compare the current sum with the maximum and minimum sum and update them accordingly
            if (sum > maxSum) {
                maxSum = sum;
                maxStart = i;
                maxEnd = j;
            }
            
            if (sum < minSum) {
                minSum = sum;
                minStart = i;
                minEnd = j;
            }
            
            sum = 0; // reset the sum for the next subarray
        }
        System.out.println();
    }

    System.out.println("Total no of sub-array: " + totalSubArrays);
    
    // print out the maximum and minimum sum subarrays and their sums
    System.out.println("The subarray with maximum sum is: ");
    for (int k = maxStart; k <= maxEnd; k++) {
        System.out.print(arr[k] + " ");
    }
    System.out.println();
    System.out.println("The maximum sum is: " + maxSum);
    
    System.out.println("The subarray with minimum sum is: ");
    for (int k = minStart; k <= minEnd; k++) {
        System.out.print(arr[k] + " ");
    }
    System.out.println();
    System.out.println("The minimum sum is: " + minSum);
}
