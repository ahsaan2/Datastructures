package PractiseQuestion;

public class findDuplicate {
    // [1,3,4,2,2]
    public int findDuplicateNumber(int[] nums) {
        // 1 3 4 2 2  swap1 1 4 3 2 2 i is still 1 swap2 1 2 3 4 2
        // index 0 1 2 3 4
        // val 1 2 2 3 4 // here num at index i != index + 1 at 2, therfore 2 is
        // duplicate
        // we will sort the nums in O(n) time using swap method
        int i = 0;
        // we will swap if the items are not at its place
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correctValue = nums[i] - 1;
                if (nums[i] != nums[correctValue]) {
                    swap(nums, i, correctValue);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;

    }

    void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }

    public static void main(String[] args) {
        findDuplicate duplicate = new findDuplicate();
        int[] arr = { 1, 3, 4 ,2 ,2};
        // int[] arr = { 3,1,3,4,2};

        int ans = duplicate.findDuplicateNumber(arr);
        System.out.println(ans);
    }
}
