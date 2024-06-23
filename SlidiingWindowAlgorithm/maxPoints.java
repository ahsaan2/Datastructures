package SlidiingWindowAlgorithm;

public class maxPoints {
    // given an array we have to fidn teh max sum, when we take the cards/points
    // either from the left of the array or from
    // the right of the array and not from in between
    public static void main(String[] args) {
        int[] arr = { 6, 2, 3, 4, 7, 2, 1, 7, 1 };
        int k = 4;
        System.out.println(maxSumPoint(arr, k));
    }

    static int maxSumPoint(int[] arr, int k) {
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;
        // we ccan take all the k elements from the left side first alone and not a
        // single element from the right side
        for (int i = 0; i <= k - 1; i++) {
            // get the sum
            leftSum = leftSum + arr[i];
            // this right sum alone can be the maximum sum, so update max sum
            maxSum = leftSum;
            // now what we can do is that, we can remove one element from the left sum and
            // add one element from the right sum

        }
        int rightIndex = arr.length - 1;
        // keep removing right sum elements one by one
        for (int j = k - 1; j >= 0; j--) {
            leftSum = leftSum - arr[j];
            // once we remove the element from left sum, add the right index value
            rightSum = rightSum + arr[rightIndex];
            // update the right index
            rightIndex--;
            // now we have got leftSum, rightSum and maxSum. we need to get the max sum out
            // of this
            maxSum = Math.max(maxSum, rightSum + leftSum);

        }

        return maxSum;

    }
}
