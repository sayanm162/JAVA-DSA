import java.util.*;

public class BinarySearch {


    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length -1;

        while(start<=end) {
            int mid = (start + end)/2;
            if(arr[mid] == key) {
                return mid;
            }
            else if(arr[mid]<key) {
                start = mid +1;
            }
            else if(arr[mid]>key) {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int list[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        System.out.println("Index for the key is: " + binarySearch(list, key));

        sc.close();


    }
}