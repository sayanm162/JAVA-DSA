

public class EvenOdd {
    public static void evenOrOdd(int number) {
        int bitmask = 1;
        if((number&bitmask) == 0) {
            //even number
            System.out.println("Even Number");
        }

        else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String args[]) {
        evenOrOdd(1);
        evenOrOdd(4);
        evenOrOdd(11);
    }
}
