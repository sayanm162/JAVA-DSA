import java.util.*;

public class ReversingArray_tempArr{

    public static void revArr(int arr[], int size) {
        int arr2[] = new int[size];
        int j = size;

        for(int i=0; i<size; i++) {
            arr2[i] = arr[j-1-i];
        }

        //printing the array
        System.out.println("Reverse of the array stored in temp. array: ");
        for(int i=0; i<size; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

    public static void main(String args[]) {
        int list[] = {2,4,6,8,10};
        int len = list.length;

        //printing the original array
        System.out.println("Original Array: ");
        for(int i=0; i<len; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        revArr(list, len);
    }
}