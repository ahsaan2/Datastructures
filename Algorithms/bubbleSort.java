package Algorithms;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 12,11,21,7 };
        // 1 
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void BubbleSort(int[] arr) {
        boolean swapped;
        int n = arr.length;
        swapped = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) { // at each iteration an element will be at its sorted place
                // now swap if the first item is greater then the second item
                // the element at the index of j will only and only be swapped with the element at index + 1 when
                // the jth element is greater
                
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;

                }
            } // if no swapping is done for i, then the array is sorted.
            if (!swapped) {
                break;
            }
        }
    }

}

/**
 * In bubble sort, we start at the beginning of the array and swap the first two
 * elements if the first element is greater than
 * the second element.Here at each iteration the smaller element bubble's up to
 * the beginning of the list each time.
 * (OR) through the first pass, we will have the largest element of the array at
 * the end of the list
 */
// -----------------------------
/**
 * Complexity of the bubble sort
 * 1. Space Complexity -->> is constant, we are not using extra space(In-Place
 * sorting algorithms)
 * 2. Best case = O(n) , worst case = O(n2)
 * 
 */
