//finding maximum no in ArrayList
import java.util.*;
public class MaximumNo {

    public static int findMax(ArrayList<Integer> list) {
        //finding the maximum no in the ArrayList 
        int max = Integer.MIN_VALUE; //initializing maximum value as -ve infinity
        for(int i=0; i<list.size(); i++) {
            // if(list.get(i) > max) {
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }

        return max;
    }
    public static void main(String agrs[]) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(5);
    list.add(9);
    list.add(3);
    list.add(6);

    //printing the maximum element in the ArrayList
    System.out.println(findMax(list));
    
    
  }  
}
