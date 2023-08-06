/*You are required to implement the following Function 

def LargeSmallSum(arr)

The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest  element from the odd positions and second smallest from the even position of given ‘arr’

Assumption:

All array elements are unique
Treat the 0th position as even
NOTE

Return 0 if array is empty
Return 0, if array length is 3 or less than 3
Example

Input

arr:3 2 1 7 5 4

Output

7

Explanation

Second largest among odd position elements(1 3 5) is 3
Second smallest among even position element is 4
Thus output is 3+4 = 7
Sample Input

arr:1 8 0 2 3 5 6

Sample Output

8 */
import java.util.*;
public class problem6 {
    public static int LargestSmallSum(int arr[]) {
        if(arr == null || arr.length<=3) {
            return 0;
        }
       int smallest = arr[0];
       int largest = arr[0];
       int secondLargest = arr[0];
       int secondSmallest = arr[0];

       for(int i=0; i<arr.length; i++) {
        if(i%2!=0) {
            if(arr[i]>largest) {
                largest = arr[i];
            }

            if(arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }

       }

       else {
        if(arr[i]< smallest) {
            smallest = arr[i];

        }

        if(arr[i]<secondSmallest && arr[i] > smallest ){
            secondSmallest = arr[i];
        }
       }
       }

       return secondLargest + secondSmallest;
  


    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        for(int i = 0; i<length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(LargestSmallSum(arr));

        sc.close();
    }
}
