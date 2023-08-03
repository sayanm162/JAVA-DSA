

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

    public static void getIthBit(int n, int i) {
        int bitmask = 1<<i;
        if((n&bitmask)==0) {
            System.out.println(0);

        }
        else {
            System.out.println(1);
        }
    }

    public static int setIthBit(int n, int i) {
        int bitmask=1<<i;
        return n | bitmask;
    }
    public static void main(String args[]) {
        evenOrOdd(1);
        evenOrOdd(4);
        evenOrOdd(11);

        getIthBit(10, 3);
        System.out.println(setIthBit(10, 2));
    }
}
