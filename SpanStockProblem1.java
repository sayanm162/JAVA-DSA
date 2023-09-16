
import java.util.*;
public class SpanStockProblem1 {

    public static void CalculateSpan(int price[], int s[], int n) {
        //Span of the first day is always 1;
        s[0] = 1;

        //calculating the span of the remaining days by linearly checking the previous days
        for(int i=1; i<n; i++) {
            s[i] = 1; //initializing the default span value

            //traversing left while the next element on left (price) is smaller that price[i]
            for(int j=i-1; j>=0 && (price[i] >= price[j]); j--) {
                s[i]++;
            }
        }
    }


    
    public static void main(String args[]) {
        int price[] = {10, 4, 5, 90, 120, 80};
        int n = price.length;
        int s[] = new int[n];

        CalculateSpan(price, s, n);
        System.out.println(Arrays.toString(s));

    }
}
