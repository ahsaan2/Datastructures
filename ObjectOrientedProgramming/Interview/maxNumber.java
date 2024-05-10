package ObjectOrientedProgramming.Interview;

public class maxNumber {
    // find the maximum number in the array
    public static void main(String[] args) {
        int[] arr = { 53, 22, 34, 43, 12, 33 };
        System.out.println(maxValue(arr, 0, arr.length - 1));

    }

    // find the maximum number in the array
    // let the max number be the number at start index
    static int maxValue(int[] arr, int start, int end) {
        // let the max value be at index 0
        int max = arr[start];
        for (int i = start; i <=end; i++) {
            if (arr[i] > max) {
                // update the max value
                max = arr[i];

            }
        }
        return max;
    }
}
