package Java;

public class moveZeroes {
    public static void movezeroes(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                // we swap the items
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
            // this loop will make sure that the j points to 0
            if (arr[j] != 0) {
                j++;
            }
        }

    }

    // given an array move the zeroes to the end of the array
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 0, 32, 0, 1, 6, 0, 4, 0, 2, 0 };
        movezeroes(arr);
        print(arr);

    }
}
