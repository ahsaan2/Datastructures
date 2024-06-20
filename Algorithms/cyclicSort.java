package Algorithms;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1, 2 };
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    // step 1: start looping from i,put it in the correct place
    // step 2: only move i, when i is at the correct index.
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // get the correct index
            // if the array is given from 0 to n then the correctIndex will be= arr[i]
            // int CorrectIndex = arr[i];
            int correct = arr[i] - 1; // correct index is value at i -1 (correct = 3)
            // now check if the value at index i is correct
            if (arr[i] < arr.length && arr[i] != arr[correct]) { // 3 4 2 1
                // if array at index 0 that is 3 is not equal to the correct index that is 2,
                // swap the i and the correct index
                // 2 4 3 1-->> 4 2 3 1 -->> 1 2 3 4
                swap(arr, i, correct);

            } else { // we will move only and only i when we have the first item at the correct
                     // index, and after that we
                     // will check for the 2nd item
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
/**
 * Given that the numbers in the array are from 1 to n , in the sorted array all
 * the numbers will be at their correct indexes.(index = value -1)
 * Approach__>> If we are given an unsorted array we will check from the first
 * index
 * first, if the element is not at the correct index(value -1) then we will swap
 * that item
 * with the value, that is at the correct index of that number.
 * Now, we will check for that number , that we swapped if it is at the correct
 * index, if the item is
 * not at the correct index, apply the same approach and move forward, till the
 * array becomes sorted.
 * 
 * To place the number at the correct index, we first need to find that number
 * ##when given numbers from range 1 to n use Cyclic-sort##
 * 
 */