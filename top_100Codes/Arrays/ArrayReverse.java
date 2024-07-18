public class ArrayReverse {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println("Original Array: ");
        printArr(arr);

        int rev1[] = reverse1(arr);
        System.out.println("Reversed by method 1: ");
        printArr(rev1);

        int rev2[] = reverse2(arr);
        System.out.println("Reversed by method 2: ");
        printArr(rev2);

    }

    public static int[] reverse1(int arr[]) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - 1 - i];
        }

        return temp;
    }

    public static int[] reverse2(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
