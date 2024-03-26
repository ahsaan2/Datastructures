package SearchingAlgorithms;

public class linearSearch {
    // In linear search we start from the index 0 and traverse through till the end.
    // Here, every element is considered as the potential match.
    private static int linearsearch(int[] nums, int target) {
        // suppose if the length of the array is 0, return 0
        if (nums.length == 0) {
            return 0;

        }
        // traverse the array
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (element == target) {
                return i; // if we found the potential match, we will return the index of the number.
            }
        }
        return -1;
    }

    // now if we want to search the items in a particular range
    private static int searchRange(int[] nums, int target, int start, int end) {
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (element == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 2, 6, 9, 10, 21, 23, 22 };
        int ans = linearsearch(nums, 22); // 8
        System.out.println(ans);
        int ans2 = searchRange(nums, 10, 2, 5); // search the target in the provided range
        System.out.println(ans2);
    }
}
