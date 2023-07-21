// import java.util.*;
public class Practice {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int num[] = new int[5];
    // System.out.println("Enter 5 numbers to store in array: ");
    // for(int i=0; i<num.length; i++) {
    //     num[i] = sc.nextInt();
    // }
    // System.out.print("Enter no to find its position: ");
    // int noFind = sc.nextInt();

    // System.out.print("Position of " + noFind + " is: " + linearSearch(num, noFind));
    // System.out.println("Largest no in the array is: " + largestNo(num));
    // System.out.print("smallest no in the array is: " + smallestNo(num));
    // System.out.print("Enter key: ");
    // int key = sc.nextInt();
    //System.out.println("The key in the arr is at index: " + iterativeBinarySearch(num, key));
  //   System.out.println("The key in the arr is at index: " + recursiveBinarSearch(num, 0, num.length-1, key));
  //  sc.close();
      int a=10;
      String s = String.valueOf(a);
      System.out.println(s+10);
  }

  public static int recursiveBinarSearch(int arr[], int low, int high, int key) {
    if(high>=low) {
      int mid = low + ((high-low)/2);

      if(key == arr[mid]) {
        return mid;
      }

      else if(key > arr[mid]) {
        return recursiveBinarSearch(arr, mid+1, high, key);
      }

      else if(key < arr[mid]) {
        return recursiveBinarSearch(arr, low, mid-1, key);
      }
    }
    return -1;
  }
  
  public static int iterativeBinarySearch(int arr[], int key) {
    int low = 0;
    int high = arr.length -1;
    int mid;

    while(low<=high ) {
       mid = low + ((high-low)/2);
       if(arr[mid] == key) {
        return mid;
       }
      else if(arr[mid] > key) {
        high = mid-1;
       }
       else if(arr[mid] < key) {
        low = mid +1;
       }
        
    }
     return -1;  
  }

  public static int linearSearch(int arr[], int key) {
    for(int i = 0; i<arr.length; i++) {
        if(arr[i] == key) {
            return i;
        }
        
    }
    return -1;
  }

  public static int largestNo(int arr[]) {
    
    int largest = arr[0];
    int idx = 0;

    for(int i=0; i<arr.length; i++) {
        if(arr[i]>largest) {
            largest = arr[i];
            idx = i;
        }
    }
    return idx;
  }

  public static int smallestNo(int arr[]) {
    int smallest = arr[0];
    int idx = 0;

    for(int i=0; i<arr.length; i++) {
      if(arr[i] < smallest) {
        smallest = arr[i];
        idx = i;
      }
    }
    return idx;
  }


}