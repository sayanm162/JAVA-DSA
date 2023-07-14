//finding largest and smallest no in an array another implementation 
//returning index of the array and also without using Integer.MIN_VALUE Or Integer.MAX_VALUE.

import java.util.*;
public class LargestSmallestNoInArray2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arr_len = sc.nextInt();
        int num_arr[] = new int[arr_len]; 
        System.out.print("Enter the elements for the array: ");
        for(int i=0; i<arr_len; i++) {
            num_arr[i] = sc.nextInt();
        }

        printLargestNum(num_arr);
        printSmallestNum(num_arr);
        
        sc.close();
    }

    public static void printLargestNum(int arr[]) {
        int largestNo = arr[0];  //assuming the largest no is present in Oth index of the array
        int idx = 0;  //default index is 0 LET.

        //traversing through the array to find the largest no.
        for(int i=0; i<arr.length; i++) {
            //condition for checking any number larger than the largest no present or not
            if(arr[i] > largestNo) {   

                largestNo = arr[i]; // if presenst, initializing the new largestNo to the var.
                idx = i; //storing the index at which the largest no is present
            }
        }
        System.out.println("Largest no is " + largestNo + " at index " + idx);
    }


        public static void printSmallestNum(int arr[]) {
        int smallestNo = arr[0];  //assuming the smallest no is present in Oth index of the array
        int idx = 0;  //default index is 0 LET.

        //traversing through the array to find the smallest no.
        for(int i=0; i<arr.length; i++) {
            //condition for checking any number smaller than the smallestNo present or not
            if(arr[i] < smallestNo) {   

                smallestNo = arr[i]; // if presenst, initializing the new smallest no  to the var.
                idx = i; //storing the index at which the smallest no is present
            }
        }
        System.out.println("Smallest no is " + smallestNo + " at index " + idx);
    }
}
