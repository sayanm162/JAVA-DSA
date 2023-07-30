
import java.util.*;
public class Sorting{
    //function to sort the array using bubble sort technique
    static void bubble(int arr[]){
        boolean swapped = false;
        //traversing through the array n-1 times, since n=length i=0;
        for(int i=0; i<arr.length; i++) {
            //for each iteration max item will come at the last respective index
            for(int j=0; j<arr.length-1-i; j++) {
                //if next j+1th item is less than the jth item, swap
                //swap if the next item is smaller than the current item
                //element greater will pushed to the respective end
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                return;
            }
        }
    }


    //selection sort
    static void selection(int arr[]) {
        //traversing through the array/no of turns
        for(int i=0; i<arr.length-1; i++) {
            int smallest=i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[smallest]>arr[j]) {
                    smallest =j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    //insertion sort
    public static void insertion(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int prev = i-1;
            //finding out correct position to insert
            while(prev>=0 && arr[prev]>=current) {
                arr[prev +1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = current;
        }
    }


    public static void main(String args[]) {
        int arr[] = {4,1,5,2,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
