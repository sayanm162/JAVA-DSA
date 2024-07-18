
public class SecondSmallestNoInArrayy {
    public static void main(String args[]) {
        int arr[] = { 12, 13, 1, 10, 34, 10 };
        int n = arr.length;

        System.out.println(secondSmallest1(arr, n));
        System.out.println(secondSmalles2(arr, n));

    }

    // apprach one -> with two loops but not nested
    public static int secondSmallest1(int arr[], int arrayLength) {
        int smallest = arr[0];
        for (int i = 0; i < arrayLength; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }

        int scndSmallest = arr[0];
        for (int i = 0; i < arrayLength; i++) {
            if (arr[i] != smallest && scndSmallest > arr[i]) {
                scndSmallest = arr[i];
            }
        }

        return scndSmallest;
    }

    // approach 2 -> using one loop
    public static int secondSmalles2(int arr[], int arrayLength) {
        int smallest1 = Integer.MAX_VALUE;
        int smalles2 = Integer.MAX_VALUE;
        for (int i = 0; i < arrayLength; i++) {
            if (smallest1 > arr[i]) {
                smalles2 = smallest1;
                smallest1 = arr[i];
            } else if (smalles2 > arr[i]) {
                smalles2 = arr[i];
            }
        }

        return smalles2;
    }
}
