import java.util.*;
public class ArrayList2D {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();  //main list

        //Creating the sub ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            list1.add(i*1)
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        //printing the mainArrayList element by element using loops
        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            //traversing the subArraylists
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }

            System.out.println();
        }

        //sub arraylists can be of any size
        list2.remove(2);
        list2.remove(3);

        System.out.println(mainList);
    }



}
