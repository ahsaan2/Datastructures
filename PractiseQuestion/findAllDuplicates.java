package PractiseQuestion;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class findAllDuplicates {
    public List<Integer> findAllDuplicate(int[] arr) {
        // [4,3,2,7,8,2,3,1]
        // 4 should be at index 3
        // for sorting the array
        int i = 0;
        List<Integer> result = new ArrayList<>();
        while (i < arr.length) {
            // value at index should be 1 plust the index

            // find the correct index for that value
            // correct index is value -1
            int correctIndex = arr[i] - 1;
            // now find the correct value, that can be swapped with the current index value
            // if it is not equal to index +1
            if (arr[i] != arr[correctIndex]) {
                // we swap the items
                swap(arr, i, correctIndex);

            } else {
                i++;
            }
        }
        // after sorting the elements in the order of correct index, we will
        // check for the duplicates
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                result.add(arr[index]);

            }
        }
        return result;
    }

    // swap
    void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
    public static void main(String[] args) {
        findAllDuplicates duplicates = new findAllDuplicates();
        int [] nums = {4,3,2,7,8,2,3,1};
        // 1,2,3,4,3,2,7,8
        System.out.println(duplicates.findAllDuplicate(nums));
    }
}
