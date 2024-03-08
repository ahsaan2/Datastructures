package PractiseQuestion;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 3, 1, 12, 0 };
        movezeroes(nums);
        // System.out.println(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

    public static void movezeroes(int[] nums) {
        // creating a variable left, that will hold the non zero numbers
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            // now check for the non-zero numbers and add then at the index of left
            if (nums[right] != 0) { // check if the number at index right != 0
                // move that to the left
                nums[left] = nums[right];  // nums at index 0(left) will have 3, nums at index 1 will have 1 .....
                // update the left
                left++;
            }

        }
        // now we have all the items other than zero present till left, and after that
        // till the size of the nums, we have to add the zeroes
        while (left < nums.length) { // start from the left, and add at the index of left 0
            // left is 3 here and it will go till 6 adding 0 zeroes
            nums[left++] = 0;
            // left++;

        }
    }
}