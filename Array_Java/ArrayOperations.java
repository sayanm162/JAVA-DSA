import java.util.*;
public class ArrayOperations {

    //function to insert element in the array at the end;
    public static int insertAtEnd(int arr[], int n, int key) {
        int capacity = arr.length;

        if(n>=capacity) {
            System.out.println("Array reached full capacity");
            return n;
        }

        arr[n] = key;

        return n+1;
    }

    //function to insert element at any position in an array
    public static void insertAtAny(int arr[], int n, int key) {
        int capacity = arr.length;

        if(n>=capacity) {
            System.out.println("Array reached its end.");
        }

        for
    }

    //function to print the array
    public static String printArray(int arr[], int n) {

        return Arrays.toString(arr);


    }

    public static void main(String args[]) {
        //declaring an array of size 20
        int arr[] = new int[20];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        arr[10] = 11;

        int n = 11;

        System.out.println(printArray(arr, n));

        n = insertAtEnd(arr, n, 26);

        System.out.println(printArray(arr, n));




    }
}
