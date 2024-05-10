package ObjectOrientedProgramming.Interview;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 4;
        arr[1] = 4;
        arr[2] = 5;
        arr[3] = 8;
        arr[4] = 10;
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr)); // toString method converts array into the string and prints them
        // here in this method we do not need to traverse the array
        // Internally toString method uses for loop.

    }

}
/**
 * Basically in most of the programming languages internally memory allocated to
 * array is "continuous" but in java "Array objects are in heap" and "heap objects
 * are not continuous due to dynamic memory allocation." So in java it is not
 * compulsory always that memory allocation is done in continuous sequence it
 * depend on J.V.M.
 */
// primitives are stored in the stack only, and all the other objects are stored in the 
// heap memory.
