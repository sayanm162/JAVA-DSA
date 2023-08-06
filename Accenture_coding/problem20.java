import java.util.*;
public class problem20 {
    public static int FindAutoCount(String n){
        if(n ==  null) {
            return 0;
        }
        int sum = 0;
        for(int i=0; i<n.length(); i++) {
            sum = sum + Integer.parseInt(n.charAt(i) + "");
        }
        if(sum == n.length()) {
            
            int arr[] = new int[10];
            for(int i=0; i<n.length(); i++) {
                arr[Integer.parseInt(n.charAt(i) + "")]++;
            }

            //counting distinct digits
            int count = 0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i] != 0) {
                    count++;
                }
            }
            return count;
        }
        return 0;
        

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(FindAutoCount(n));


    }
}
