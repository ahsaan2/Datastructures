package Recursion;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int [] ans = mergesort(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] mergesort(int[] arr) {
        // we have to return the array once, we reach to the size of 1
        if (arr.length == 1) {
            return arr;
        }
        // we have an array, we divide it in two parts
        int mid = arr.length / 2;
        int [] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        // now we have to merge the two
        return merge(left, right);
    }

    static int[] merge(int [] left, int [] right){
        // create a new array that takes both array elements
        int [] mix = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            // check the values 
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
                
            }
            else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        // now there is a possibility where we will have one array empty and the other will still have the items in it
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
/**
 * merge sort-->> In merge sort we take an array, divide the array and get both
 * arrays sorted using recursion.
 * -->> Merge the two sorted arrays, and then return the array
 */
