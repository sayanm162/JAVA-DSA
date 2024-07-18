
/*Java program to calculate frequency of an element in an arry */
import java.util.*;

public class FrequenceOfElement {
    public static void main(String args[]) {
        int arr[] = { 10, 30, 10, 20, 10, 20, 30, 10 };
        countFrequency(arr);

    }

    public static void countFrequency(int arr[]) {
        if (arr.length == 0) {
            return;
        }
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }

        // iterating
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Freq: " + entry.getValue());
        }

    }
}
