//swapping two numbers in an ArrayList between to index1 and index2
import java.util.*;
public class swappingNo {
    public static void swapNo(ArrayList<Integer> list, int idx1, int idx2) {
        //swapping the two numbers
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(6);

        //original list.
        System.out.println(list);

        //swapped list
        swapNo(list, 1, 3);
        System.out.println(list);
    }
    
}
