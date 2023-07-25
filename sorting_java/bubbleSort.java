
import java.util.*;
public class bubbleSort {
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
    public static void main(String args[]) {
        int arr[] = {4,1,5,2,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
