package ObjectOrientedProgramming.Interview;

import java.util.Arrays;

public class minNumber {
    // find the minimum number in the array
    public static void main(String[] args) {
        int[] arr = { 12, 21, 23, 44, 11, 10, 55, 9, 0, 1, -1 };
        System.out.println(min(arr));
        // search in 2D array
        int[][] arr2 = { { 12, 21, 34, 56 },
                { 33, 32, 55, 33 },
                { 12, 22, 11 }
        };
        int[] ans = search2D(arr2, 56);

        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr2));

    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        // suppose the item at the index 0 is the minimum number
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;

    }

    // given a 2D array find the element
    static int[] search2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            // columns go till the length of the row in array
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    // since the array has not been inititalized
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    // find the maximum number in the 2D array
    static int max(int[][] arr) {
        // suppose we keep the minimum value as the max
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    // update the max value
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
