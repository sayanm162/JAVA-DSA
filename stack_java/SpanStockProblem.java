//java code to solve span stock problem using stack
import java.util.Stack;
import java.util.Arrays;
public class SpanStockProblem {

    //method to calculate span using a stack
    public static void calculateSpan(int price[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        //calculating span for other prices
        for(int i=1; i<price.length; i++) {
            int currentPrice = price[i];
            while(!s.isEmpty() && (currentPrice>price[s.peek()])) {
                s.pop();
            }

            if(s.isEmpty()) {
                span[i] = i+1;
            }

            else {
                span[i] = i - s.peek();
            }

            s.push(i);
        }
    }
    
    public static void main(String args[]) {
        int price[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[price.length];

        calculateSpan(price, span);

        System.out.println(Arrays.toString(span));
    }
}
