package ObjectOrientedProgramming.Interview;

import java.util.Arrays;

public class firstAndLastPosition {
    // find the first and the last position of the target element in the sorted
    // array
    // If the positions are not found then returrn -1, -1
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
     
    }

    public static  int[] searchRange(int[] nums, int target) {
        // let the answer be -1, and -1
        int[] ans = { -1, -1 };
        // now for the first index of the element
        int start = search(nums, target, true);
        // Now we are not trying to find the start vale

        int end = search(nums, target, false);
        // update the index of the ans
        ans[0] = start;
        ans[1] = end;
        return ans;

    }

    // lets make a function first for searchiing the first occcurance of the target
    // element
    static int search(int [] arr, int target, boolean firstIndexElement){
        // lets take the first index as -1
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start) /2;
            if (target > arr[mid]) {
                start = mid +1;
            }
             else if (target < arr[mid]) {
                end = mid -1;
                
             }
             else {
                // instead of returning mid, we can say that we have a potential answer at the mid
                // but there is a possibility of that the potential first index can be on the left side of the mid
                ans = mid;  // 3 
                // checking on the left side
                if (firstIndexElement == true) {
                    // answer might lie on the left hand side of the mid element
                    end = mid -1; 
                  
                }
                else {
                    start = mid +1;
                }
             }
        }
        return ans;
    }

}
