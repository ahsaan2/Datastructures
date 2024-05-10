package ObjectOrientedProgramming.Interview;

import java.util.Arrays;

public class reverseAndSwap {
    // given an array, reverse the numbers and print the array
    public static void main(String[] args) {
        // given an array, swap the given indexes
        int[] arr = { 21, 23, 45, 11, 22, 25 };

        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
        int a = 10;
        int b = 20;
        System.out.println("Before swapping:" + a + " " + b);
        // swap2(a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping:" + a + " " + b);

        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    // now swap the two items without using the temp varaible
    // static void swap2(int a, int b) {
    // // 2 , 4
    // a = a + b; // a = 6
    // b = a - b; // b = 2
    // a = a - b; // 4
    // }

    // reverse the array
    static void reverse(int[] arr, int start, int end) {
        // taking start pointer at index 0 and end pointer at index end
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

}
