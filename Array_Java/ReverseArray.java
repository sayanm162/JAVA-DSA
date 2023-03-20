public class ReverseArray {

    public static void Reverse(int arr[]){
        int start = 0, end = arr.length-1;

        if(start<end) {
            //swapping
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }

    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};

        Reverse(numbers);

        //printing the reversed array
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

    }
}
