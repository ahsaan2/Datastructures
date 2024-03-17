package Java;

public class reverseArray {
    // given an array , print the array in the reverse order
    public void print(int[] arr) {
        // this method is used to traverse the array, and prints the values at each
        // index
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println();
    }

    // now algorithm for reversing the array
    public void reverse(int[] arr) { // we do not have a static method here, so we have to call by the object

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // also increase the start and decrease the end indexes
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 23, 45, 67, 89, 90 };
        reverseArray obj = new reverseArray();
        obj.print(arr);
        obj.reverse(arr); // reverse the array and then the below statement prints the reverses array
        obj.print(arr);
    }
}
