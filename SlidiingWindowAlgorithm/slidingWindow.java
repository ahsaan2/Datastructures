package SlidiingWindowAlgorithm;

public class slidingWindow {
    // given the previous array again, we will solve the same using the sliding
    // window technique not
    public static void main(String[] args) {

        int[] arr = { 2, 5, 1, 7, 10 };
        int target = 14;
        System.out.println(findLength(arr, target));
    }

    static int findLength(int[] arr, int target) {
        // we fiind the maxlnegth of the subarray that satisfies the condition
        // In sliding window, we have 2 pointers,
        int left = 0;
        int right = 0; // both left and right start from the 0
        int maxLength = 0;
        int sum = 0;
        // now the conditions
        while (right < arr.length - 1) {
            // we have the first window as the first element, whose sum will be the value at
            // index right

            sum += arr[right];
            // when do we shrink the window-->> when the sum gets greater then the target,
            // we try to shrink the window
            // before shrinking we reduce the value at the left pointer from the sum
            while (sum > target) {
                sum -= arr[left];
                // keep shrinking the wiindow till the sum < target
                left++;
            }
            // we will update the window only and only when the sum is less or equal to the
            // target
            if (sum <= target) {
                maxLength = Math.max(maxLength, right - left + 1);  // right is at first value, so the maxlength of the first
                // iteration will be 1, and after that the maxlenght will get updated when right moves.
                right++;
                // the winddow size will be updated as right will move to +1
                right++;
            }

        }
        return maxLength;
    }

}
