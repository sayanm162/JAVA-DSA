/*Maximum no. of handshakes that can occur in a room with N persons. Given the fact that any two person can
 * shake hands only once
 */
import java.util.*;
public class MaximumHandshakeProblem{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int noOfPerson = sc.nextInt();

        System.out.println(calculateNoOfHandshakes(noOfPerson));
        sc.close();
    }

    public static int calculateNoOfHandshakes(int noOfPerson) {
        int handshakes = noOfPerson*(noOfPerson-1) / 2;
        return handshakes;
    }
}