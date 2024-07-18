/*Sort the first half of an array in ascending order and sort the second half of an array in descending order */
public class halfAscHalfDesc {
    public static void main(String args[]) {
        int arr[] = { 3, 2, 4, 1, 10, 30, 40, 20 };

        printOrder(arr);
        System.out.println();

    }

    public static void printOrder(int arr[]) {
        // implementing bubble sort
        boolean flag = true;
        for (int i = 1; i <= arr.length - 1 && flag == true; i++) {
            flag = false;
            for (int j = 1; j <= arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
        }

        // printing half in ascending and half in descending
        // 1st half
        for (int i = 0; i <= (arr.length - 1) / 2; i++) {
            System.out.print(arr[i] + " ");
        }

        // 2nd half
        for (int i = arr.length - 1; i > (arr.length - 1) / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }

}