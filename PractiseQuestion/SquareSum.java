package PractiseQuestion;

class SquareSum {
    public static int[] sortedSquare(int[] nums) {
        int[] result = new int[nums.length];
        // we first ge the square of the numbers
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        // now we have gor the squares of the number, we will keep adding these numbers
        // in the
        // result array
        int head = 0;
        int tail = nums.length - 1;
        // traverse the positons and add the numbers in the sorted order
        for (int position = nums.length -1; position >= 0; position--) {
            // now sort
            if (nums[head] > nums[tail]) {
                // add the head at the position as we start from the last of the result array
                result[position] = nums[head];
                head++;

            } else {
                // add the tail
                result[position] = nums[tail];
                tail--;
            }

        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = { -4, -2, -1, 0, 9, 10, 11, 12, 13 };
        // sort the array
        sortedSquare(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(nums[i] + " ");
        // }

    }
}
