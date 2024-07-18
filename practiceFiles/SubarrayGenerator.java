public class SubarrayGenerator {
    public static void printSubarrays(int[] arr) {
        int n = arr.length; // Get the length of the input array
        int[] prefixSum = new int[n + 1]; // Create a prefix sum array of size n+1
        int maxSum = Integer.MIN_VALUE; // Initialize the maximum sum to the smallest possible value
        int minSum = Integer.MAX_VALUE; // Initialize the minimum sum to the largest possible value
        int maxSumIndex = -1; // Initialize the index of the subarray with maximum sum to -1
        int minSumIndex = -1; // Initialize the index of the subarray with minimum sum to -1
        int totalSubarrays = 0; // Initialize the total number of subarrays to 0

        // Calculate the prefix sum array
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + arr[i]; // Calculate the cumulative sum up to each index
        }

        // Iterate through the prefix sum array to find the subarrays
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                int sum = prefixSum[i] - prefixSum[j]; // Calculate the sum of the current subarray using prefix sum
                System.out.print("["); // Print the start of the subarray
                for (int k = j; k < i; k++) {
                    System.out.print(arr[k] + " "); // Print the elements of the current subarray
                }
                System.out.println("]"); // Print the end of the subarray
                totalSubarrays++; // Increment the total number of subarrays
                if (sum > maxSum) { // Check if the current sum is greater than the maximum sum
                    maxSum = sum; // Update the maximum sum
                    maxSumIndex = totalSubarrays - 1; // Update the index of the subarray with maximum sum
                }
                if (sum < minSum) { // Check if the current sum is less than the minimum sum
                    minSum = sum; // Update the minimum sum
                    minSumIndex = totalSubarrays - 1; // Update the index of the subarray with minimum sum
                }
            }
        }

        // Print the total number of subarrays
        System.out.println("Total number of subarrays: " + totalSubarrays);
        // Print the index of the subarray with maximum sum
        System.out.println("Subarray with maximum sum: " + maxSumIndex);
        // Print the index of the subarray with minimum sum
        System.out.println("Subarray with minimum sum: " + minSumIndex);
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Create an example input array
        printSubarrays(arr); // Call the printSubarrays method with the input array
    }
}