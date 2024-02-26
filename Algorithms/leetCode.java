package Algorithms;

public class leetCode {
    // given the array return the index of the target,if the target is found, if not
    // then return the index where it can be placed.
    public static void main(String[] args) {
        int[] nums = { 12, 23, 34, 56, 78, 89, 90 };
        // int target = 22; // should return the index of 1
        int target = 55;  // 3
        int ans = searchInsert(nums, target);
        System.out.println("The target index is:" + ans);
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // find the mid
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;

            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
            // if the target element is not found, and we have to insert it in the array,we
            // must return the
            // index where that item can be inserted.
            // so to insert the item, it will be at the index greater then the low by 1
            // already incremented by one in the above condition

        }
        return start;
    }

}
