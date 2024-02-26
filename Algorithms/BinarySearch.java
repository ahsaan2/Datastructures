package Algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = { 12, 23, 34, 45, 56, 67, 78, 90, 121, 123, 234, 456 };
        int target = 121;
        int ans = binarySearch(nums, target);
        System.out.println("The index of the target is:" + ans);

    }

    public static int binarySearch(int[] nums, int target) { // create static so that we can call it
        // in the static method.
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // find the mid
            int mid = start + (end - start) / 2;
            // case 1
            if (target == nums[mid]) {
                return mid;
            }
            // search in the right side
            else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

}

/**
 * It is a divide and conquor algorithm.
 * Binary Search is a searching algorithm, where we divide the array into two
 * sub-halves,
 * and according to the mid, we have our searching space
 * It works on the sorted arrays, and reduces the time complexity to O(logn).
 * ------------------Algorithm-------------------------------------------------------------
 * 1. If the array is sorted, use Binary Search.
 * 2. Find the mid of the array, now here we have 3 cases
 * case1: If the target is greater then the mid, then the right side is used for
 * the searching space.
 * case2: If the targer is less then the mid, then the left side is used for the
 * searching space.
 * case2: If the target is equal to the mid, then return the mid,and the other
 * cases get terminated.
 * 
 */