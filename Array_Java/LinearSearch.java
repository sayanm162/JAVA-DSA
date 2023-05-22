import java.util.*;
public class LinearSearch {

    public static void main(String args[]) {

        int seq[] = {9, 10, 2, 12, 3, 8, 1};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for which you would like to get its index: ");
        int key = sc.nextInt();

        int index = searchNo(seq, key);

        if(index == -1 ) {
            System.out.println("Element not found!");
        }
        else {
        System.out.println("The index of the number is: " + index);
        }


        sc.close();
    }

    public static int searchNo(int arr[], int key) {
        //for loop for searching the key throughout the array
        int idx = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                idx=i;
            }
        }

            return idx;
    }
}
