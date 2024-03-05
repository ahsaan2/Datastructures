package PractiseQuestion;

public class SingleNumber {
    /*
     * we are given an integer array, all the numbers are repeating with one one
     * number in the array
     * that occurs once.
     * Get the single number, that is get the number from the array that occurs only
     * once.
     */
    public static int singleNumber(int[] nums) {
        // we will keep the tract of the nums through i loop that will get the length
        // and also the
        // number at i index
        for (int i = 0; i < nums.length; i++) {
            // get the number at index i
            int num = nums[i];
            // keeping the count
            int count = 0;
            // if the count > 1 not a sFFingle number
            for (int j = 0; j < nums.length; j++) {
                // here in this loop we will check for the count of each number in the array
                if (nums[j] == num) {
                    // then update the count
                    count++;

                }
            }

            // after getting the count of all the number, there is a number that appears
            // only once, and
            // we have to return that number
            if (count == 1) {
                return num;
            }
        }
        // else if the number is not present only once return 0
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 3, 4, 4 }; // 1
        int[] num1 = { 1, 1, 2, 3, 5, 3, 4, 3,4 }; // 2
        int[] num2 = { 1, 1, 5, 3, 5, 3, 4, 3,7,4 }; // 2


        System.out.println(singleNumber(nums));
        System.out.println(singleNumber(num1)); // 2
        System.out.println(singleNumber(num2)); // 2


    }

}
