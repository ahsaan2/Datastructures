package SlidiingWindowAlgorithm;

public class consecutiveOnes {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println(longestOnes(arr, k));
    }

    static int longestOnes(int[] arr, int k) {
        // If we use the sliding window approach , then we can have two pointers as
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int zeroes = 0;

        // we keep moving the right pointer till it does not excede

        while (right < arr.length) {
            // check if the right is 0 or not
            if (arr[right] == 0)
                zeroes++;
            while (zeroes > k) { // if we have the number of zeroes greater than k, then we reduce the number of
                                 // zeroes and
                // update the left pointer
                if (arr[left] == 0)
                    zeroes -= 1;
                left++;

            }
            int length = right - left + 1;
            maxLength = Math.max(maxLength, length);
            right++;

        }
        return maxLength;

    }
}
