package Algorithms;

import java.util.Arrays;

class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 5, 8, 6 };
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the last index element
            int last = arr.length - i - 1;
            // now find the max element that will be swapped with the last element
            int maxIndex = findMax(arr, 0, last);
            // now we have last element and the max element .
            // swap the two
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int findMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

}
/**
 * In selection sort we select the max/min number and swap it with the
 * first//last index of the array
 * // simply, we select the smallest/largest element in the array and we swap
 * that element with the first/last index
 */
