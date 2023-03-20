public class LargestSmallestNoInArray {
    public static int getLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        
        
        //traversing the array
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>largest) {
                largest = arr[i];
            }

        }

        return largest;
        
    }


    public static int getSmallest(int arr[]) {
        
        int smallest = Integer.MAX_VALUE;
        
        //traversing the array
        for(int i=0; i<arr.length; i++) {
            
            if(arr[i]<smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
        
    }
    public static void main(String args[]) {
        int list[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
       
        int largest = getLargest(list);
        System.out.println("Largest Element in the array is: " + largest);

        int smallest = getSmallest(list);
        System.out.println("Smallest element in the array is " + smallest);

        
    }
}
