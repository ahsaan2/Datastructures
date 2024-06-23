package SlidiingWindowAlgorithm;

public class subArrrays {
    // given an array find the largest subarray that is less or equal to the given
    // target
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 7, 10 };
        int target = 14;
        System.out.println(findLength(arr, target));

    }

    // since we have to find the largest subArray we can have a brute force approach
    // as, generating all the sub-arrays and
    // then checking for the target value
                          // BRUTE-FORCE APPROACH
    static int findLength(int[] arr, int target) {
        // we can have a variable as the maxLength
        // int maxLength = Integer.MIN_VALUE; /// univerrrsal min length
        int maxLength = 0;
        // traverse the array
        for (int i = 0; i < arr.length; i++) {
            // noppw checking for the sum, as provided the condition
            int sum = 0;
            for (int j = i; j < arr.length; j++) { // j will keep adding the sum in the sum variable
                sum = sum + arr[j];
                // now the condition
                if (sum <= target) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
                // IF THE SUM HERE IS ALREADY GREATER THAN THE TARGET, THEN NO NEED TO ADD
                // ELEMENTS FURTHER
                else if (sum > target) {
                    break;
                }
            }
        }
        return maxLength;
    }
}
