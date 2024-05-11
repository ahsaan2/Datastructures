package ObjectOrientedProgramming.Interview;

public class evendigits2 {
    public static void main(String[] args) {
        int[] nums = { 12, 343, 2, 6, 7896 };
        System.out.println(findEven(nums));
    }

    // we are given the numbers, we traverse the numbers one by one
    // calculate all the digits each number has
    // after calculating the number of digits, we will check whether they are even
    // or not
    // if we get the number as even then we will, add that to the answer
    static int findEven(int[] nums) {
        // traverse the nums
        int count = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            // only check for those indexes where the number is greater than 0

            while (nums[i] > 0) {
                // calculate the total number of digits
                nums[i] /= 10;
                count++;
            }
            // here we have got the number of digits
            if (count % 2 == 0) {
                // we have got our answer
                ans++;
            }

        }
        return ans;

    }

}
