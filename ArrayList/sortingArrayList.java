import java.util.*;
public class sortingArrayList {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        //original list
        System.out.println(list);

        //sorting the list(ascending order by default) 
        Collections.sort(list);
        System.out.println(list);

        //sorting the list is descending order using comparator
        Collections.sort(list, Collections.reverseOrder(null));
        System.out.println(list);
    }
}
