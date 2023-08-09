//ArrayList in Java Basics
import java.util.*;
public class ArrayListBasics {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();  //declaring an ArrayList list of type Integer
        
        //Adding elements in the list - O(1)  // 0 based indexing
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    
        // //printing the list 
        // System.out.println(list);

        // //Get operation in ArrayList - O(1)
        // //int num = list.get(2);
        // System.out.println(list.get(2));  //directly getting the element

        // //Remove Operation - removing elements from the array list - O(n) - travelling to the index in the array list.
        // list.remove(3);
        // System.out.println(list);

        // //set operation to set element at index - O(n)
        // list.set(2, 7);
        // System.out.println(list);

        // //Contains operation to checkh the present of the element in the ArrayList  / returns true or false/-- O(n)
        // System.out.println(list.contains(2));

        System.out.println("Size of the ArrayList: " + list.size());

        //printing the elements in the list
        // for(int i=0; i<list.size(); i++) {
        //     System.out.println(list.get(i));
        // }

        //reverse of ArrayList
            for(int i=list.size()-1; i>=0; i--) {
                System.out.print(list.get(i) + " ");
            }
        
    }
}
