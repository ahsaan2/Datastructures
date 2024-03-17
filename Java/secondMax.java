package Java;

public class secondMax {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int secondmax(int[] arr) {
        // let the first and second max be equal to the lowest integer values
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        // now we traverse the array
        for (int i = 0; i < arr.length; i++) {
            // now check if the array at index i is greater then max, yes it is .. update it
            if (arr[i] > max) {
                // now we can have the second max as max and max will be array at index i
                secondmax = max; // if the above if condition becomes true, value of second max
                // will first get updated as the previous max and then the max will update
                max = arr[i];
                // ** Before updating the value of i to the max, we need to update the second
                // max
                // value as the max present previously, in this way the previous max value will
                // point
                // to secondmax value and max will point to new max value.

            }
            // there can be a possibility where second max can be greater then the array at
            // index
            // but it can not be greater or equal the max
            else if (arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];

            }

        }
        return secondmax;
    }

    // given an array of integers we need to return the second maximum value
    public static void main(String[] args) {
        int[] arr = { 12, 21, 65, 34, 54, 56, 66 };
        // 12 is first max and Integer.MIN_vALUE is first second max
        // second max = 12 > 21 > 32 > 34 > 54 > 54 max = 21 > 32 > 34 > 54 > 56 > 66
        // the second max here is 56
        // print(arr);
        int ans = secondmax(arr);
        System.out.println("The second maximum item is:" + ans);
    }
}
