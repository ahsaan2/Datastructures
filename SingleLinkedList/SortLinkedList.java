package SingleLinkedList;

import java.util.Arrays;


public class SortLinkedList {
    public static void main(String[] args) {
        int[] arr = { 21, 32, 43, 12, 11, 22 };
        int [] arr1 = {22,34,56,67,78,89};
        int[] ans = merge(arr);
        int [] ans1 = merge(arr1);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans1));


    }

    /**
     * Merge sort keeps on dividing the array till we have only one element left and
     * the array of size one is
     * always sorted.
     * Merge sort keeps on divind till we have only size of one and add th elements
     * on the basis of comparisons
     * 
     * 
     */
    static int[] merge(int[] arr) {
        // merge sort return the list or the array so the return type should always be
        // as such
        if (arr.length == 1) { // we have reached till the end of the array
            return arr;
        }
        // now divide the array in two parts
        int mid = arr.length /2;
        // the array will get divided into two parts 
        // One part will start from 0 till mid and another part will start from mid till the end 
        int [] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int [] right = merge(Arrays.copyOfRange(arr, mid, arr.length));
        // now merge the two array in the sorted order
        return merge(left, right);
    }
    private static int[] merge(int[] left, int[] right){
        // we will create a new array of the size twice the size of left and right
        int [] mix = new int[left.length + right.length];
        int i =0;  // will traverse the left sub array
        int j = 0; // will traverse the right sub array
        int k =0;  // will update the mix array
        while (i< left.length && j< right.length) {
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
        // there might be a possibility where one of the list may or may not be empty
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
