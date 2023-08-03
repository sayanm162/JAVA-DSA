//Rat Count House Problem
import java.util.*;
public class Problem1 {
    public static int func(int r, int unit, int arr[]) {
        if(arr == null) {
            return -1;
        }
          int totalFoodReq = r*unit; //total amount of food for all rat
          int totalFoodNow = 0;
          int houseNo = 0;
          for(int house=0; house<arr.length; house++) {
            totalFoodNow += arr[house];
            houseNo = house;

          }

          if(totalFoodNow<=totalFoodReq) {
            return 0;
          }

          return houseNo +1;


    }
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); //no of rats present in an area
        int unit = sc.nextInt(); //amount of food per rat
        
        int n = sc.nextInt(); //array size
        int arr[] = new int[n];
        //filling up the array with elements
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    
        func(r, unit, arr);
        sc.close();
       }

       
}
