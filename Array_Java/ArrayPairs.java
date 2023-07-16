//printing array pairs in java
public class ArrayPairs {
    
    public static void printPairs(int arr[]) {
        
        int totalPairs = 0; //to count total no. of pairs.
        //outer loop for traversing the array one element at a time
        for(int i=0; i<arr.length; i++) {
            int current = arr[i]; 
            //inner loop for pairing the current i'th element with the next adjacent elements upto n
            for(int j=i+1; j<arr.length; j++) {
                System.out.print("(" + current + " " + arr[j] + ")" + " ");
                totalPairs++;
            }
            //for new line
            System.out.println();
        }

        System.out.print("Total no of pairs former: " + totalPairs);
    }

    /* 
    output
     (2 4) (2 6) (2 8) (2 10) 
    (4 6) (4 8) (4 10)
    (6 8) (6 10)
    (8 10)
     */



    public static void main(String args[]) {
        int list[] = {2,4,6,8,10,12};

        printPairs(list);
    }
}
